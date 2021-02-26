package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.renderEventMod.default
import typingsSlinky.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("ol/render", "getRenderPixel")
  @js.native
  def getRenderPixel(event: default, pixel: Pixel): Pixel = js.native
  
  @JSImport("ol/render", "getVectorContext")
  @js.native
  def getVectorContext(event: default): typingsSlinky.ol.immediateMod.default = js.native
  
  @JSImport("ol/render", "renderDeclutterItems")
  @js.native
  def renderDeclutterItems(frameState: FrameState, declutterTree: js.Any): js.Any = js.native
  
  @JSImport("ol/render", "toContext")
  @js.native
  def toContext(context: CanvasRenderingContext2D): typingsSlinky.ol.immediateMod.default = js.native
  @JSImport("ol/render", "toContext")
  @js.native
  def toContext(context: CanvasRenderingContext2D, opt_options: ToContextOptions): typingsSlinky.ol.immediateMod.default = js.native
  
  type OrderFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ FeatureLike, Double]
  
  @js.native
  trait State extends StObject {
    
    var context: CanvasRenderingContext2D = js.native
    
    var feature: FeatureLike = js.native
    
    var geometry: typingsSlinky.ol.simpleGeometryMod.default = js.native
    
    var pixelRatio: Double = js.native
    
    var resolution: Double = js.native
    
    var rotation: Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      context: CanvasRenderingContext2D,
      feature: FeatureLike,
      geometry: typingsSlinky.ol.simpleGeometryMod.default,
      pixelRatio: Double,
      resolution: Double,
      rotation: Double
    ): State = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeature(value: FeatureLike): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometry(value: typingsSlinky.ol.simpleGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToContextOptions extends StObject {
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Size] = js.native
  }
  object ToContextOptions {
    
    @scala.inline
    def apply(): ToContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToContextOptions]
    }
    
    @scala.inline
    implicit class ToContextOptionsMutableBuilder[Self <: ToContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
