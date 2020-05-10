package typingsSlinky.overlayscrollbars

import typingsSlinky.overlayscrollbars.mod.OverflowBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXOverflowBehavior extends js.Object {
  var x: js.UndefOr[OverflowBehavior] = js.native
  var y: js.UndefOr[OverflowBehavior] = js.native
}

object AnonXOverflowBehavior {
  @scala.inline
  def apply(): AnonXOverflowBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonXOverflowBehavior]
  }
  @scala.inline
  implicit class AnonXOverflowBehaviorOps[Self <: AnonXOverflowBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: OverflowBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: OverflowBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

