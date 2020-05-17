package typingsSlinky.actionsOnGoogle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ack extends js.Object {
  var ack: js.UndefOr[Boolean] = js.native
  var pin: js.UndefOr[String] = js.native
}

object Ack {
  @scala.inline
  def apply(): Ack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ack]
  }
  @scala.inline
  implicit class AckOps[Self <: Ack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ack")(js.undefined)
        ret
    }
    @scala.inline
    def withPin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin")(js.undefined)
        ret
    }
  }
  
}

