package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNamedRangeRequest extends js.Object {
  
  var namedRangeId: js.UndefOr[String] = js.native
}
object DeleteNamedRangeRequest {
  
  @scala.inline
  def apply(): DeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNamedRangeRequest]
  }
  
  @scala.inline
  implicit class DeleteNamedRangeRequestOps[Self <: DeleteNamedRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setNamedRangeId(value: String): Self = this.set("namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRangeId: Self = this.set("namedRangeId", js.undefined)
  }
}
