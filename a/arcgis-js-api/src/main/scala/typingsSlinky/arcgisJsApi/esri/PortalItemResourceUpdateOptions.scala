package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`private`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inherit
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalItemResourceUpdateOptions extends Object {
  
  /**
    * Indicates the level of access to the resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#update)
    */
  var access: js.UndefOr[inherit | `private`] = js.native
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#update)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
}
object PortalItemResourceUpdateOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PortalItemResourceUpdateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PortalItemResourceUpdateOptions]
  }
  
  @scala.inline
  implicit class PortalItemResourceUpdateOptionsOps[Self <: PortalItemResourceUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccess(value: inherit | `private`): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
}
