package typingsSlinky.divaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIntersectionTolerance extends js.Object {
  var intersectionTolerance: Double = js.native
}

object AnonIntersectionTolerance {
  @scala.inline
  def apply(intersectionTolerance: Double): AnonIntersectionTolerance = {
    val __obj = js.Dynamic.literal(intersectionTolerance = intersectionTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntersectionTolerance]
  }
  @scala.inline
  implicit class AnonIntersectionToleranceOps[Self <: AnonIntersectionTolerance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntersectionTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionTolerance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

