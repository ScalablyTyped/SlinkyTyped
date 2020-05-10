package typingsSlinky.pulumiAws.getServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServerArgs extends js.Object {
  /**
    * ID for an SFTP server.
    */
  val serverId: String = js.native
}

object GetServerArgs {
  @scala.inline
  def apply(serverId: String): GetServerArgs = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerArgs]
  }
  @scala.inline
  implicit class GetServerArgsOps[Self <: GetServerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

