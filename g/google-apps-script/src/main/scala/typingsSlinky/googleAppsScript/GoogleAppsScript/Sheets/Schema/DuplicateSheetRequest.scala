package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplicateSheetRequest extends js.Object {
  
  var insertSheetIndex: js.UndefOr[Double] = js.native
  
  var newSheetId: js.UndefOr[Double] = js.native
  
  var newSheetName: js.UndefOr[String] = js.native
  
  var sourceSheetId: js.UndefOr[Double] = js.native
}
object DuplicateSheetRequest {
  
  @scala.inline
  def apply(): DuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateSheetRequest]
  }
  
  @scala.inline
  implicit class DuplicateSheetRequestOps[Self <: DuplicateSheetRequest] (val x: Self) extends AnyVal {
    
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
    def setInsertSheetIndex(value: Double): Self = this.set("insertSheetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSheetIndex: Self = this.set("insertSheetIndex", js.undefined)
    
    @scala.inline
    def setNewSheetId(value: Double): Self = this.set("newSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewSheetId: Self = this.set("newSheetId", js.undefined)
    
    @scala.inline
    def setNewSheetName(value: String): Self = this.set("newSheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewSheetName: Self = this.set("newSheetName", js.undefined)
    
    @scala.inline
    def setSourceSheetId(value: Double): Self = this.set("sourceSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSheetId: Self = this.set("sourceSheetId", js.undefined)
  }
}
