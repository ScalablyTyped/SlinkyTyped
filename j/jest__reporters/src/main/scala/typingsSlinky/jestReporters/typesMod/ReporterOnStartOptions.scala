package typingsSlinky.jestReporters.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReporterOnStartOptions extends js.Object {
  var estimatedTime: Double = js.native
  var showStatus: Boolean = js.native
}

object ReporterOnStartOptions {
  @scala.inline
  def apply(estimatedTime: Double, showStatus: Boolean): ReporterOnStartOptions = {
    val __obj = js.Dynamic.literal(estimatedTime = estimatedTime.asInstanceOf[js.Any], showStatus = showStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReporterOnStartOptions]
  }
  @scala.inline
  implicit class ReporterOnStartOptionsOps[Self <: ReporterOnStartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

