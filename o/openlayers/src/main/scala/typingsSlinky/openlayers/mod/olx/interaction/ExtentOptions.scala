package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Extent_
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.StyleFunction
import typingsSlinky.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtentOptions extends StObject {
  
  var boxStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  
  var extent: js.UndefOr[Extent_] = js.native
  
  var pixelTolerance: js.UndefOr[Double] = js.native
  
  var pointerStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object ExtentOptions {
  
  @scala.inline
  def apply(): ExtentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentOptions]
  }
  
  @scala.inline
  implicit class ExtentOptionsMutableBuilder[Self <: ExtentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "boxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxStyleFunction2(
      value: (/* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "boxStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBoxStyleUndefined: Self = StObject.set(x, "boxStyle", js.undefined)
    
    @scala.inline
    def setBoxStyleVarargs(value: Style*): Self = StObject.set(x, "boxStyle", js.Array(value :_*))
    
    @scala.inline
    def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
    
    @scala.inline
    def setPointerStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "pointerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerStyleFunction2(
      value: (/* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "pointerStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPointerStyleUndefined: Self = StObject.set(x, "pointerStyle", js.undefined)
    
    @scala.inline
    def setPointerStyleVarargs(value: Style*): Self = StObject.set(x, "pointerStyle", js.Array(value :_*))
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
