package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosCustomBatchRequest extends js.Object {
  
  var entries: js.UndefOr[js.Array[PosCustomBatchRequestEntry]] = js.native
}
object PosCustomBatchRequest {
  
  @scala.inline
  def apply(): PosCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosCustomBatchRequest]
  }
  
  @scala.inline
  implicit class PosCustomBatchRequestOps[Self <: PosCustomBatchRequest] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: PosCustomBatchRequestEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[PosCustomBatchRequestEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
}
