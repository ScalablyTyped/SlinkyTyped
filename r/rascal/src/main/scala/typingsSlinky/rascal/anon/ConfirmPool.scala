package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPool extends js.Object {
  var confirmPool: Autostart = js.native
  var regularPool: Autostart = js.native
}

object ConfirmPool {
  @scala.inline
  def apply(confirmPool: Autostart, regularPool: Autostart): ConfirmPool = {
    val __obj = js.Dynamic.literal(confirmPool = confirmPool.asInstanceOf[js.Any], regularPool = regularPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPool]
  }
  @scala.inline
  implicit class ConfirmPoolOps[Self <: ConfirmPool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmPool(value: Autostart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegularPool(value: Autostart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regularPool")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

