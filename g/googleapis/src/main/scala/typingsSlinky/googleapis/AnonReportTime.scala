package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReportTime extends js.Object {
  var reportTime: js.UndefOr[String] = js.native
  var systemRamFreeInfo: js.UndefOr[js.Array[String]] = js.native
}

object AnonReportTime {
  @scala.inline
  def apply(): AnonReportTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonReportTime]
  }
  @scala.inline
  implicit class AnonReportTimeOps[Self <: AnonReportTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemRamFreeInfo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemRamFreeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemRamFreeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemRamFreeInfo")(js.undefined)
        ret
    }
  }
  
}

