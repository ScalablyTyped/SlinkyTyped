package typingsSlinky.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInterpolation extends js.Object {
  var interpolation: js.UndefOr[AnonType] = js.native
}

object AnonInterpolation {
  @scala.inline
  def apply(): AnonInterpolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInterpolation]
  }
  @scala.inline
  implicit class AnonInterpolationOps[Self <: AnonInterpolation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterpolation(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
  }
  
}

