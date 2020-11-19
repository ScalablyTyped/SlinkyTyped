package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProtectedRangeRequest extends js.Object {
  
  /** The ID of the protected range to delete. */
  var protectedRangeId: js.UndefOr[Double] = js.native
}
object DeleteProtectedRangeRequest {
  
  @scala.inline
  def apply(): DeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProtectedRangeRequest]
  }
  
  @scala.inline
  implicit class DeleteProtectedRangeRequestOps[Self <: DeleteProtectedRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setProtectedRangeId(value: Double): Self = this.set("protectedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedRangeId: Self = this.set("protectedRangeId", js.undefined)
  }
}
