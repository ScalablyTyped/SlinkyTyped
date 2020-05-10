package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeStats extends js.Object {
  /** TimeStats realNsDelta */
  var realNsDelta: js.UndefOr[Double | Null] = js.native
  /** TimeStats sysNsDelta */
  var sysNsDelta: js.UndefOr[Double | Null] = js.native
  /** TimeStats uptimeNs */
  var uptimeNs: js.UndefOr[Double | Null] = js.native
  /** TimeStats userNsDelta */
  var userNsDelta: js.UndefOr[Double | Null] = js.native
}

object ITimeStats {
  @scala.inline
  def apply(): ITimeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeStats]
  }
  @scala.inline
  implicit class ITimeStatsOps[Self <: ITimeStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRealNsDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realNsDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealNsDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realNsDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withRealNsDeltaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realNsDelta")(null)
        ret
    }
    @scala.inline
    def withSysNsDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysNsDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSysNsDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysNsDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withSysNsDeltaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysNsDelta")(null)
        ret
    }
    @scala.inline
    def withUptimeNs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptimeNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUptimeNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptimeNs")(js.undefined)
        ret
    }
    @scala.inline
    def withUptimeNsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptimeNs")(null)
        ret
    }
    @scala.inline
    def withUserNsDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNsDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserNsDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNsDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNsDeltaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNsDelta")(null)
        ret
    }
  }
  
}

