package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintOptions extends js.Object {
  var collideConnected: js.UndefOr[Boolean] = js.native
  var wakeUpBodies: js.UndefOr[Boolean] = js.native
}

object ConstraintOptions {
  @scala.inline
  def apply(): ConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintOptions]
  }
  @scala.inline
  implicit class ConstraintOptionsOps[Self <: ConstraintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollideConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollideConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideConnected")(js.undefined)
        ret
    }
    @scala.inline
    def withWakeUpBodies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wakeUpBodies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWakeUpBodies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wakeUpBodies")(js.undefined)
        ret
    }
  }
  
}

