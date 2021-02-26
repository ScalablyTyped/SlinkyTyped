package typingsSlinky.pixiJs.anon

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColor extends StObject {
  
  var antialias: js.UndefOr[Boolean] = js.native
  
  var autoDensity: js.UndefOr[Boolean] = js.native
  
  var backgroundColor: js.UndefOr[Double] = js.native
  
  var clearBeforeRender: js.UndefOr[Boolean] = js.native
  
  var context: js.UndefOr[js.Any] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var powerPreference: js.UndefOr[String] = js.native
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var view: js.UndefOr[HTMLCanvasElement] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object BackgroundColor {
  
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    @scala.inline
    def setAutoDensity(value: Boolean): Self = StObject.set(x, "autoDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDensityUndefined: Self = StObject.set(x, "autoDensity", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearBeforeRenderUndefined: Self = StObject.set(x, "clearBeforeRender", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setView(value: HTMLCanvasElement): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
