package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkteamResponse extends js.Object {
  /**
    * Returns true if the work team was successfully deleted; otherwise, returns false.
    */
  var Success: typingsSlinky.awsSdk.sagemakerMod.Success = js.native
}

object DeleteWorkteamResponse {
  @scala.inline
  def apply(Success: Success): DeleteWorkteamResponse = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkteamResponse]
  }
  @scala.inline
  implicit class DeleteWorkteamResponseOps[Self <: DeleteWorkteamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: Success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

