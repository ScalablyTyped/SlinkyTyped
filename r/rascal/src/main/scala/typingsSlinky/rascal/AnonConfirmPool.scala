package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfirmPool extends js.Object {
  var confirmPool: AnonAutostart = js.native
  var regularPool: AnonAutostart = js.native
}

object AnonConfirmPool {
  @scala.inline
  def apply(confirmPool: AnonAutostart, regularPool: AnonAutostart): AnonConfirmPool = {
    val __obj = js.Dynamic.literal(confirmPool = confirmPool.asInstanceOf[js.Any], regularPool = regularPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirmPool]
  }
  @scala.inline
  implicit class AnonConfirmPoolOps[Self <: AnonConfirmPool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmPool(value: AnonAutostart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegularPool(value: AnonAutostart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regularPool")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

