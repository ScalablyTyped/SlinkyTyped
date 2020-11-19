package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateValuesRequest extends js.Object {
  
  var data: js.UndefOr[js.Array[ValueRange]] = js.native
  
  var includeValuesInResponse: js.UndefOr[Boolean] = js.native
  
  var responseDateTimeRenderOption: js.UndefOr[String] = js.native
  
  var responseValueRenderOption: js.UndefOr[String] = js.native
  
  var valueInputOption: js.UndefOr[String] = js.native
}
object BatchUpdateValuesRequest {
  
  @scala.inline
  def apply(): BatchUpdateValuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateValuesRequestOps[Self <: BatchUpdateValuesRequest] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: ValueRange*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ValueRange]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setIncludeValuesInResponse(value: Boolean): Self = this.set("includeValuesInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeValuesInResponse: Self = this.set("includeValuesInResponse", js.undefined)
    
    @scala.inline
    def setResponseDateTimeRenderOption(value: String): Self = this.set("responseDateTimeRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseDateTimeRenderOption: Self = this.set("responseDateTimeRenderOption", js.undefined)
    
    @scala.inline
    def setResponseValueRenderOption(value: String): Self = this.set("responseValueRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseValueRenderOption: Self = this.set("responseValueRenderOption", js.undefined)
    
    @scala.inline
    def setValueInputOption(value: String): Self = this.set("valueInputOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueInputOption: Self = this.set("valueInputOption", js.undefined)
  }
}
