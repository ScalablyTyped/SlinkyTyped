package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePopupTemplateOptions extends Object {
  
  /**
    * An array of field types to ignore when creating the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#CreatePopupTemplateOptions)
    */
  var ignoreFieldTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of field names set to be visible within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#CreatePopupTemplateOptions)
    */
  var visibleFieldNames: js.UndefOr[Set[String]] = js.native
}
object CreatePopupTemplateOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CreatePopupTemplateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[CreatePopupTemplateOptions]
  }
  
  @scala.inline
  implicit class CreatePopupTemplateOptionsOps[Self <: CreatePopupTemplateOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreFieldTypesVarargs(value: String*): Self = this.set("ignoreFieldTypes", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreFieldTypes(value: js.Array[String]): Self = this.set("ignoreFieldTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFieldTypes: Self = this.set("ignoreFieldTypes", js.undefined)
    
    @scala.inline
    def setVisibleFieldNames(value: Set[String]): Self = this.set("visibleFieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleFieldNames: Self = this.set("visibleFieldNames", js.undefined)
  }
}
