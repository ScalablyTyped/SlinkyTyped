package typingsSlinky.mtaH5Analysis

import typingsSlinky.mtaH5Analysis.mtaH5AnalysisNumbers.`0`
import typingsSlinky.mtaH5Analysis.mtaH5AnalysisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoReport extends js.Object {
   // 如果开启自定义事件，此项目为必填，否则不填
  var autoReport: js.UndefOr[`0` | `1`] = js.native
   // 必填，统计用的appid
  var cid: js.UndefOr[String] = js.native
   // 是否开启性能监控
  var ignoreParams: js.UndefOr[String] = js.native
   // url参数是否进入url统计
  var performanceMonitor: js.UndefOr[`0` | `1`] = js.native
   // 是否开启自动上报(1:init完成则上报一次,0:使用pgv方法才上报)
  var senseHash: js.UndefOr[`0` | `1`] = js.native
   // hash锚点是否进入url统计
  var senseQuery: js.UndefOr[`0` | `1`] = js.native
  var sid: String = js.native
}

object AnonAutoReport {
  @scala.inline
  def apply(sid: String): AnonAutoReport = {
    val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoReport]
  }
  @scala.inline
  implicit class AnonAutoReportOps[Self <: AnonAutoReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoReport(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReport")(js.undefined)
        ret
    }
    @scala.inline
    def withCid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreParams")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceMonitor(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceMonitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceMonitor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceMonitor")(js.undefined)
        ret
    }
    @scala.inline
    def withSenseHash(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senseHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenseHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senseHash")(js.undefined)
        ret
    }
    @scala.inline
    def withSenseQuery(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senseQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenseQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senseQuery")(js.undefined)
        ret
    }
  }
  
}

