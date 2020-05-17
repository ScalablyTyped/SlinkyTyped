package typingsSlinky.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerId extends js.Object {
  var serverId: String = js.native
}

object ServerId {
  @scala.inline
  def apply(serverId: String): ServerId = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerId]
  }
  @scala.inline
  implicit class ServerIdOps[Self <: ServerId] (val x: Self) extends AnyVal {
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

