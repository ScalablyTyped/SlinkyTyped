package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReservationRequest extends js.Object {
  
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: string = js.native
}
object DeleteReservationRequest {
  
  @scala.inline
  def apply(ReservationId: string): DeleteReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReservationRequest]
  }
  
  @scala.inline
  implicit class DeleteReservationRequestOps[Self <: DeleteReservationRequest] (val x: Self) extends AnyVal {
    
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
    def setReservationId(value: string): Self = this.set("ReservationId", value.asInstanceOf[js.Any])
  }
}
