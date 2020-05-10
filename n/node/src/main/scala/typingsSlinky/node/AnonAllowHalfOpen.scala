package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowHalfOpen extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  var pauseOnConnect: js.UndefOr[Boolean] = js.native
}

object AnonAllowHalfOpen {
  @scala.inline
  def apply(): AnonAllowHalfOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowHalfOpen]
  }
  @scala.inline
  implicit class AnonAllowHalfOpenOps[Self <: AnonAllowHalfOpen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHalfOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHalfOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHalfOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHalfOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnConnect")(js.undefined)
        ret
    }
  }
  
}

