package typingsSlinky.pulumiAws.transferSshKeyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SshKeyArgs extends js.Object {
  /**
    * The public key portion of an SSH key pair.
    */
  val body: Input[String] = js.native
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: Input[String] = js.native
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  val userName: Input[String] = js.native
}

object SshKeyArgs {
  @scala.inline
  def apply(body: Input[String], serverId: Input[String], userName: Input[String]): SshKeyArgs = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshKeyArgs]
  }
  @scala.inline
  implicit class SshKeyArgsOps[Self <: SshKeyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

