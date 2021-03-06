package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.click
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.freehand
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hybrid
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchViewModelDefaultCreateOptions extends Object {
  
  /**
    * The default z-value of the newly created geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var defaultZ: js.UndefOr[Double] = js.native
  
  /**
    * Controls whether the created geometry has z-values or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var hasZ: js.UndefOr[Boolean] = js.native
  
  /**
    * Create operation mode how the graphic can be created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.native
}
object SketchViewModelDefaultCreateOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SketchViewModelDefaultCreateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SketchViewModelDefaultCreateOptions]
  }
  
  @scala.inline
  implicit class SketchViewModelDefaultCreateOptionsMutableBuilder[Self <: SketchViewModelDefaultCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultZ(value: Double): Self = StObject.set(x, "defaultZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultZUndefined: Self = StObject.set(x, "defaultZ", js.undefined)
    
    @scala.inline
    def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    @scala.inline
    def setMode(value: hybrid | freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
