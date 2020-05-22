package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHandshakeResponse extends js.Object {
  /**
    * A structure that contains information about the specified handshake.
    */
  var Handshake: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Handshake] = js.native
}

object DescribeHandshakeResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): DescribeHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHandshakeResponse]
  }
}

