package typingsSlinky.looksSame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTolerance extends js.Object {
  var tolerance: Double = js.native
}

object AnonTolerance {
  @scala.inline
  def apply(tolerance: Double): AnonTolerance = {
    val __obj = js.Dynamic.literal(tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTolerance]
  }
  @scala.inline
  implicit class AnonToleranceOps[Self <: AnonTolerance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

