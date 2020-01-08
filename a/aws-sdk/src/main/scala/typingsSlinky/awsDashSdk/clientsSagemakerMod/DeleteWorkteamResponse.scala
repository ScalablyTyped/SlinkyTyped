package typingsSlinky.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkteamResponse extends js.Object {
  /**
    * Returns true if the work team was successfully deleted; otherwise, returns false.
    */
  var Success: typingsSlinky.awsDashSdk.clientsSagemakerMod.Success = js.native
}

object DeleteWorkteamResponse {
  @scala.inline
  def apply(Success: Success): DeleteWorkteamResponse = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteWorkteamResponse]
  }
}

