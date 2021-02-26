package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-leading`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-trailing`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-leading`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-trailing`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.manual
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIMoveComponent extends Object {
  
  /**
    * The component to move.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var component: Widget_ | HTMLElement | String = js.native
  
  /**
    * The placement index of the component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * The destination position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var position: js.UndefOr[
    `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
  ] = js.native
}
object UIMoveComponent {
  
  @scala.inline
  def apply(
    component: Widget_ | HTMLElement | String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): UIMoveComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[UIMoveComponent]
  }
  
  @scala.inline
  implicit class UIMoveComponentMutableBuilder[Self <: UIMoveComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: Widget_ | HTMLElement | String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentHTMLElement(value: HTMLElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPosition(
      value: `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
