package typingsSlinky.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeletePhotosResponse extends js.Object {
  
  /**
    * The status for the operation to delete a single
    * Photo in the batch request.
    */
  var status: js.UndefOr[js.Array[Status]] = js.native
}
object BatchDeletePhotosResponse {
  
  @scala.inline
  def apply(): BatchDeletePhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeletePhotosResponse]
  }
  
  @scala.inline
  implicit class BatchDeletePhotosResponseOps[Self <: BatchDeletePhotosResponse] (val x: Self) extends AnyVal {
    
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
    def setStatusVarargs(value: Status*): Self = this.set("status", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: js.Array[Status]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
