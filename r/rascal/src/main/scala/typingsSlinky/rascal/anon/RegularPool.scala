package typingsSlinky.rascal.anon

import typingsSlinky.rascal.mod.ChannelPoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegularPool extends js.Object {
  var confirmPool: js.UndefOr[ChannelPoolConfig] = js.native
  var regularPool: js.UndefOr[ChannelPoolConfig] = js.native
}

object RegularPool {
  @scala.inline
  def apply(): RegularPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegularPool]
  }
  @scala.inline
  implicit class RegularPoolOps[Self <: RegularPool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmPool(value: ChannelPoolConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmPool")(js.undefined)
        ret
    }
    @scala.inline
    def withRegularPool(value: ChannelPoolConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regularPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegularPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regularPool")(js.undefined)
        ret
    }
  }
  
}

