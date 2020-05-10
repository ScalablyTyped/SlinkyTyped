package typingsSlinky.msgpack5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsgPackOptions extends js.Object {
  var compatibilityMode: js.UndefOr[Boolean] = js.native
  var forceFloat64: js.UndefOr[Boolean] = js.native
}

object MsgPackOptions {
  @scala.inline
  def apply(): MsgPackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsgPackOptions]
  }
  @scala.inline
  implicit class MsgPackOptionsOps[Self <: MsgPackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibilityMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibilityMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibilityMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibilityMode")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFloat64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFloat64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFloat64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFloat64")(js.undefined)
        ret
    }
  }
  
}

