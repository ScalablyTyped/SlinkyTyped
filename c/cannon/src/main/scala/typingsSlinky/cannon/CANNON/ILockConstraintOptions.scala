package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockConstraintOptions extends js.Object {
  var maxForce: js.UndefOr[Double] = js.native
}

object ILockConstraintOptions {
  @scala.inline
  def apply(): ILockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockConstraintOptions]
  }
  @scala.inline
  implicit class ILockConstraintOptionsOps[Self <: ILockConstraintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxForce")(js.undefined)
        ret
    }
  }
  
}

