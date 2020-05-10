package typingsSlinky.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArg1 extends js.Object {
  val Arg1: Double = js.native
  val Arg2: Double = js.native
  var Cancel: Boolean = js.native
  val ElementID: Double = js.native
}

object AnonArg1 {
  @scala.inline
  def apply(Arg1: Double, Arg2: Double, Cancel: Boolean, ElementID: Double): AnonArg1 = {
    val __obj = js.Dynamic.literal(Arg1 = Arg1.asInstanceOf[js.Any], Arg2 = Arg2.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], ElementID = ElementID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArg1]
  }
  @scala.inline
  implicit class AnonArg1Ops[Self <: AnonArg1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArg1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arg1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArg2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arg2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElementID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

