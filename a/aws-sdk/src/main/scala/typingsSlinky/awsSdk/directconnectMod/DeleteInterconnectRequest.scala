package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInterconnectRequest extends js.Object {
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId = js.native
}

object DeleteInterconnectRequest {
  @scala.inline
  def apply(interconnectId: InterconnectId): DeleteInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInterconnectRequest]
  }
  @scala.inline
  implicit class DeleteInterconnectRequestOps[Self <: DeleteInterconnectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterconnectId(value: InterconnectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

