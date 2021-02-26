package typingsSlinky.novncCore

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayMod {
  
  @JSImport("novnc-core/lib/display", JSImport.Default)
  @js.native
  class default () extends Display {
    def this(defaults: NvDisplayDefaults) = this()
  }
  
  @js.native
  trait Display extends StObject {
    
    def absX(x: Double): Double = js.native
    
    def absY(y: Double): Double = js.native
    
    def autoscale(containerWidth: Double, containerHeight: Double, downscaleOnly: Boolean): Unit = js.native
    
    def blitImage(x: Double, y: Double, width: Double, height: Double, arr: js.Array[Double], offset: Double): Unit = js.native
    def blitImage(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      arr: js.Array[Double],
      offset: Double,
      from_queue: Boolean
    ): Unit = js.native
    
    def blitRgbImage(x: Double, y: Double, width: Double, height: Double, arr: js.Array[Double], offset: Double): Unit = js.native
    def blitRgbImage(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      arr: js.Array[Double],
      offset: Double,
      from_queue: Boolean
    ): Unit = js.native
    
    def blitRgbxImage(x: Double, y: Double, width: Double, height: Double, arr: js.Array[Double], offset: Double): Unit = js.native
    def blitRgbxImage(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      arr: js.Array[Double],
      offset: Double,
      from_queue: Boolean
    ): Unit = js.native
    
    def changeCursor(
      pixels: js.Array[Double],
      mask: js.Array[Double],
      hotx: Double,
      hoty: Double,
      width: Double,
      height: Double
    ): Unit = js.native
    
    def clear(): Unit = js.native
    
    def clippingDisplay(): Boolean = js.native
    
    def copyImage(old_x: Double, old_y: Double, new_x: Double, new_y: Double, width: Double, height: Double): Unit = js.native
    def copyImage(
      old_x: Double,
      old_y: Double,
      new_x: Double,
      new_y: Double,
      width: Double,
      height: Double,
      from_queue: Boolean
    ): Unit = js.native
    
    def defaultCursor(): Unit = js.native
    
    def disableLocalCursor(): Unit = js.native
    
    def drawImage(img: HTMLImageElement, x: Double, y: Double): Unit = js.native
    
    def fillRect(x: Double, y: Double, width: Double, height: Double, color: NvColor): Unit = js.native
    def fillRect(x: Double, y: Double, width: Double, height: Double, color: NvColor, from_queue: Boolean): Unit = js.native
    
    def finishTile(): Unit = js.native
    
    def flip(): Unit = js.native
    def flip(from_queue: Boolean): Unit = js.native
    
    def flush(): Unit = js.native
    
    def get_context(): CanvasRenderingContext2D = js.native
    
    def get_cursor_uri(): js.Any = js.native
    
    def get_height(): Double = js.native
    
    def get_logo(): NvLogo = js.native
    
    def get_onFlush(): js.Function0[Unit] = js.native
    
    def get_prefer_js(): String | Boolean = js.native
    
    def get_render_mode(): String = js.native
    
    def get_scale(): Double = js.native
    
    def get_target(): HTMLCanvasElement = js.native
    
    def get_viewport(): Boolean = js.native
    
    def get_width(): Double = js.native
    
    def imageRect(x: Double, y: Double, mime: String, arr: js.Array[Double]): Unit = js.native
    
    def pending(): Boolean = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    def set_cursor_uri(cursorUri: js.Any): Unit = js.native
    
    def set_logo(logo: NvLogo): Unit = js.native
    
    def set_onFlush(handler: js.Function0[Unit]): Unit = js.native
    
    def set_prefer_js(preferJs: String): Unit = js.native
    
    def set_scale(scale: Double): Unit = js.native
    
    def set_target(target: HTMLCanvasElement): Unit = js.native
    
    def set_viewport(viewport: Boolean): Unit = js.native
    
    def startTile(x: Double, y: Double, width: Double, height: Double, color: NvColor): Unit = js.native
    
    def subTile(x: Double, y: Double, width: Double, height: Double, color: NvColor): Unit = js.native
    
    def viewportChangePos(deltaX: Double, deltaY: Double): Unit = js.native
    
    def viewportChangeSize(): Unit = js.native
    def viewportChangeSize(width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
    def viewportChangeSize(width: Double): Unit = js.native
    def viewportChangeSize(width: Double, height: Double): Unit = js.native
  }
  
  type NvColor = js.Tuple3[Double, Double, Double]
  
  @js.native
  trait NvDisplayDefaults extends StObject {
    
    var context: js.UndefOr[CanvasRenderingContext2D] = js.native
    
    var cursor_uri: js.UndefOr[js.Any] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var logo: js.UndefOr[NvLogo] = js.native
    
    var onFlush: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefer_js: js.UndefOr[String] = js.native
    
    var render_mode: js.UndefOr[String] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[HTMLCanvasElement] = js.native
    
    var viewport: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object NvDisplayDefaults {
    
    @scala.inline
    def apply(): NvDisplayDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NvDisplayDefaults]
    }
    
    @scala.inline
    implicit class NvDisplayDefaultsMutableBuilder[Self <: NvDisplayDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setCursor_uri(value: js.Any): Self = StObject.set(x, "cursor_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursor_uriUndefined: Self = StObject.set(x, "cursor_uri", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLogo(value: NvLogo): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      @scala.inline
      def setOnFlush(value: () => Unit): Self = StObject.set(x, "onFlush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFlushUndefined: Self = StObject.set(x, "onFlush", js.undefined)
      
      @scala.inline
      def setPrefer_js(value: String): Self = StObject.set(x, "prefer_js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefer_jsUndefined: Self = StObject.set(x, "prefer_js", js.undefined)
      
      @scala.inline
      def setRender_mode(value: String): Self = StObject.set(x, "render_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender_modeUndefined: Self = StObject.set(x, "render_mode", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLCanvasElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setViewport(value: Boolean): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait NvLogo extends StObject {
    
    var data: js.Array[Double] = js.native
    
    var height: Double = js.native
    
    var `type`: String = js.native
    
    var width: Double = js.native
  }
  object NvLogo {
    
    @scala.inline
    def apply(data: js.Array[Double], height: Double, `type`: String, width: Double): NvLogo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NvLogo]
    }
    
    @scala.inline
    implicit class NvLogoMutableBuilder[Self <: NvLogo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
