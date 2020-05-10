package typingsSlinky.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNearestTo extends js.Object {
  var nearestTo: js.UndefOr[Double] = js.native
}

object AnonNearestTo {
  @scala.inline
  def apply(): AnonNearestTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNearestTo]
  }
  @scala.inline
  implicit class AnonNearestToOps[Self <: AnonNearestTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNearestTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearestTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNearestTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearestTo")(js.undefined)
        ret
    }
  }
  
}

