package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsst extends js.Object {
  def sst_check_min(flag: Double): Double = js.native
}

object Typeofsst {
  @scala.inline
  def apply(sst_check_min: Double => Double): Typeofsst = {
    val __obj = js.Dynamic.literal(sst_check_min = js.Any.fromFunction1(sst_check_min))
    __obj.asInstanceOf[Typeofsst]
  }
  @scala.inline
  implicit class TypeofsstOps[Self <: Typeofsst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSst_check_min(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sst_check_min")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

