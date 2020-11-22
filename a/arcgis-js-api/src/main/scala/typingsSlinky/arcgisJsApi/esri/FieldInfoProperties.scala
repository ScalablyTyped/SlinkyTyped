package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`rich-text`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`text-box`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`var`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.avg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.count
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.stddev
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldInfoProperties extends js.Object {
  
  /**
    * The field name as defined by  the service or the `name` of an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#fieldName)
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /**
    * Class which provides formatting options for numerical or date fields and how they should display within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#format)
    */
  var format: js.UndefOr[FieldInfoFormatProperties] = js.native
  
  /**
    * A Boolean determining whether users can edit this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#isEditable)
    */
  var isEditable: js.UndefOr[Boolean] = js.native
  
  /**
    * A string containing the field alias.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#label)
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Used in a `one:many` or `many:many` relationship to compute the statistics on the field to show in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#statisticType)
    */
  var statisticType: js.UndefOr[count | sum | min | max | avg | stddev | `var`] = js.native
  
  /**
    * A string determining what type of input box editors see when editing the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#stringFieldOption)
    */
  var stringFieldOption: js.UndefOr[`rich-text` | `text-area` | `text-box`] = js.native
  
  /**
    * A string providing an editing hint for editors of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#tooltip)
    */
  var tooltip: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the field is visible in the popup window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object FieldInfoProperties {
  
  @scala.inline
  def apply(): FieldInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldInfoProperties]
  }
  
  @scala.inline
  implicit class FieldInfoPropertiesOps[Self <: FieldInfoProperties] (val x: Self) extends AnyVal {
    
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setFormat(value: FieldInfoFormatProperties): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIsEditable(value: Boolean): Self = this.set("isEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEditable: Self = this.set("isEditable", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setStatisticType(value: count | sum | min | max | avg | stddev | `var`): Self = this.set("statisticType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatisticType: Self = this.set("statisticType", js.undefined)
    
    @scala.inline
    def setStringFieldOption(value: `rich-text` | `text-area` | `text-box`): Self = this.set("stringFieldOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringFieldOption: Self = this.set("stringFieldOption", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
