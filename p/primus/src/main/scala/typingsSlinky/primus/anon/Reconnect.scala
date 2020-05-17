package typingsSlinky.primus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reconnect extends js.Object {
  var reconnect: js.UndefOr[Boolean] = js.native
}

object Reconnect {
  @scala.inline
  def apply(): Reconnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reconnect]
  }
  @scala.inline
  implicit class ReconnectOps[Self <: Reconnect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(js.undefined)
        ret
    }
  }
  
}

