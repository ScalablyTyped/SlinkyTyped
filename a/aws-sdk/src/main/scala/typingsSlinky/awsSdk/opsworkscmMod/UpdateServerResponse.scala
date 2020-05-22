package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerResponse extends js.Object {
  /**
    * Contains the response to a UpdateServer request. 
    */
  var Server: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.Server] = js.native
}

object UpdateServerResponse {
  @scala.inline
  def apply(Server: Server = null): UpdateServerResponse = {
    val __obj = js.Dynamic.literal()
    if (Server != null) __obj.updateDynamic("Server")(Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerResponse]
  }
}

