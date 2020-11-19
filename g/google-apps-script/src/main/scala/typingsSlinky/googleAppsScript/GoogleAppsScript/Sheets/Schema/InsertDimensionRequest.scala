package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertDimensionRequest extends js.Object {
  
  var inheritFromBefore: js.UndefOr[Boolean] = js.native
  
  var range: js.UndefOr[DimensionRange] = js.native
}
object InsertDimensionRequest {
  
  @scala.inline
  def apply(): InsertDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertDimensionRequest]
  }
  
  @scala.inline
  implicit class InsertDimensionRequestOps[Self <: InsertDimensionRequest] (val x: Self) extends AnyVal {
    
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
    def setInheritFromBefore(value: Boolean): Self = this.set("inheritFromBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritFromBefore: Self = this.set("inheritFromBefore", js.undefined)
    
    @scala.inline
    def setRange(value: DimensionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
