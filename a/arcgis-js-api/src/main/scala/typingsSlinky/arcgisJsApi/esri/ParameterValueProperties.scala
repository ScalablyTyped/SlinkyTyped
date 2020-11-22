package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`data-file`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`feature-record-set-layer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`linear-unit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`multi-value`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`raster-data-layer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`raster-data`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`record-set`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.boolean
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.date
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.double
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.field
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.long
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterValueProperties extends js.Object {
  
  /**
    * Specifies the parameter's data type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#dataType)
    */
  var dataType: js.UndefOr[
    boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string | `multi-value`
  ] = js.native
  
  /**
    * The value of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#value)
    */
  var value: js.UndefOr[js.Any] = js.native
}
object ParameterValueProperties {
  
  @scala.inline
  def apply(): ParameterValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterValueProperties]
  }
  
  @scala.inline
  implicit class ParameterValuePropertiesOps[Self <: ParameterValueProperties] (val x: Self) extends AnyVal {
    
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
    def setDataType(
      value: boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string | `multi-value`
    ): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
