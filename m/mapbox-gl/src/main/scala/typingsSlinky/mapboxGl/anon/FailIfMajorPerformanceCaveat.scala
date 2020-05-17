package typingsSlinky.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailIfMajorPerformanceCaveat extends js.Object {
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native
}

object FailIfMajorPerformanceCaveat {
  @scala.inline
  def apply(): FailIfMajorPerformanceCaveat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailIfMajorPerformanceCaveat]
  }
  @scala.inline
  implicit class FailIfMajorPerformanceCaveatOps[Self <: FailIfMajorPerformanceCaveat] (val x: Self) extends AnyVal {
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

