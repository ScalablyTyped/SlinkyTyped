package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayerViewGL2DRenderRenderParameters extends Object {
  
  /**
    * The WebGL or WebGL 2 context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var context: WebGLRenderingContext | js.Any = js.native
  
  /**
    * The object that describes view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var state: ViewState = js.native
  
  /**
    * The stationary state of the `MapView`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var stationary: Boolean = js.native
}
object BaseLayerViewGL2DRenderRenderParameters {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    context: WebGLRenderingContext | js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    state: ViewState,
    stationary: Boolean
  ): BaseLayerViewGL2DRenderRenderParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), state = state.asInstanceOf[js.Any], stationary = stationary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerViewGL2DRenderRenderParameters]
  }
  
  @scala.inline
  implicit class BaseLayerViewGL2DRenderRenderParametersMutableBuilder[Self <: BaseLayerViewGL2DRenderRenderParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: WebGLRenderingContext | js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextWebGLRenderingContext(value: WebGLRenderingContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ViewState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStationary(value: Boolean): Self = StObject.set(x, "stationary", value.asInstanceOf[js.Any])
  }
}
