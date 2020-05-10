package typingsSlinky.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFailIfMajorPerformanceCaveat extends js.Object {
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native
}

object AnonFailIfMajorPerformanceCaveat {
  @scala.inline
  def apply(): AnonFailIfMajorPerformanceCaveat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFailIfMajorPerformanceCaveat]
  }
  @scala.inline
  implicit class AnonFailIfMajorPerformanceCaveatOps[Self <: AnonFailIfMajorPerformanceCaveat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailIfMajorPerformanceCaveat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failIfMajorPerformanceCaveat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailIfMajorPerformanceCaveat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failIfMajorPerformanceCaveat")(js.undefined)
        ret
    }
  }
  
}

