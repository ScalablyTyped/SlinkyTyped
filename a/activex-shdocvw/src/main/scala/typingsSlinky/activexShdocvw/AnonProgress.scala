package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProgress extends js.Object {
  val Progress: Double = js.native
  val ProgressMax: Double = js.native
}

object AnonProgress {
  @scala.inline
  def apply(Progress: Double, ProgressMax: Double): AnonProgress = {
    val __obj = js.Dynamic.literal(Progress = Progress.asInstanceOf[js.Any], ProgressMax = ProgressMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProgress]
  }
  @scala.inline
  implicit class AnonProgressOps[Self <: AnonProgress] (val x: Self) extends AnyVal {
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
    def withProgressMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressMax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

