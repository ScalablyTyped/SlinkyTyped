package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeFilterPair extends js.Object {
  var Progress: Double = js.native
  var Time: Double = js.native
}

object TimeFilterPair {
  @scala.inline
  def apply(Progress: Double, Time: Double): TimeFilterPair = {
    val __obj = js.Dynamic.literal(Progress = Progress.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeFilterPair]
  }
  @scala.inline
  implicit class TimeFilterPairOps[Self <: TimeFilterPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

