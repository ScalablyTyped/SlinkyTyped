package typingsSlinky.highcharts.dataMod.highchartsAugmentingMod

import typingsSlinky.highcharts.highchartsStrings.json
import typingsSlinky.highcharts.highchartsStrings.octet
import typingsSlinky.highcharts.highchartsStrings.text
import typingsSlinky.highcharts.highchartsStrings.xml
import typingsSlinky.highcharts.mod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxSettingsObject extends js.Object {
  
  /**
    * The payload to send.
    */
  var data: String | Dictionary[_] = js.native
  
  /**
    * The data type expected.
    */
  var dataType: json | octet | text | xml = js.native
  
  /**
    * Function to call on error.
    */
  var error: js.Function = js.native
  
  /**
    * The headers; keyed on header name.
    */
  var headers: Dictionary[String] = js.native
  
  /**
    * Function to call on success.
    */
  var success: js.Function = js.native
  
  /**
    * The HTTP method to use. For example GET or POST.
    */
  var `type`: String = js.native
  
  /**
    * The URL to call.
    */
  var url: String = js.native
}
object AjaxSettingsObject {
  
  @scala.inline
  def apply(
    data: String | Dictionary[_],
    dataType: json | octet | text | xml,
    error: js.Function,
    headers: Dictionary[String],
    success: js.Function,
    `type`: String,
    url: String
  ): AjaxSettingsObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSettingsObject]
  }
  
  @scala.inline
  implicit class AjaxSettingsObjectOps[Self <: AjaxSettingsObject] (val x: Self) extends AnyVal {
    
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
    def setData(value: String | Dictionary[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: json | octet | text | xml): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Function): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Dictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: js.Function): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
