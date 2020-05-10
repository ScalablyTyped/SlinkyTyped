package typingsSlinky.nes.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSubscribeFlags extends js.Object {
  var revoked: js.UndefOr[Boolean] = js.native
}

object ClientSubscribeFlags {
  @scala.inline
  def apply(): ClientSubscribeFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSubscribeFlags]
  }
  @scala.inline
  implicit class ClientSubscribeFlagsOps[Self <: ClientSubscribeFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRevoked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevoked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoked")(js.undefined)
        ret
    }
  }
  
}

