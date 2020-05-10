package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemStatus extends js.Object {
  /**
    * CPU utilization metrics for the instance.
    */
  var CPUUtilization: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.CPUUtilization] = js.native
  /**
    * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see Operating System Metrics.
    */
  var LoadAverage: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.LoadAverage] = js.native
}

object SystemStatus {
  @scala.inline
  def apply(): SystemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemStatus]
  }
  @scala.inline
  implicit class SystemStatusOps[Self <: SystemStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCPUUtilization(value: CPUUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CPUUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCPUUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CPUUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadAverage(value: LoadAverage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadAverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadAverage")(js.undefined)
        ret
    }
  }
  
}

