package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPercpuusage extends js.Object {
  var percpu_usage: js.Array[Double] = js.native
  var total_usage: Double = js.native
  var usage_in_kernelmode: Double = js.native
  var usage_in_usermode: Double = js.native
}

object AnonPercpuusage {
  @scala.inline
  def apply(
    percpu_usage: js.Array[Double],
    total_usage: Double,
    usage_in_kernelmode: Double,
    usage_in_usermode: Double
  ): AnonPercpuusage = {
    val __obj = js.Dynamic.literal(percpu_usage = percpu_usage.asInstanceOf[js.Any], total_usage = total_usage.asInstanceOf[js.Any], usage_in_kernelmode = usage_in_kernelmode.asInstanceOf[js.Any], usage_in_usermode = usage_in_usermode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPercpuusage]
  }
  @scala.inline
  implicit class AnonPercpuusageOps[Self <: AnonPercpuusage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercpu_usage(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percpu_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_usage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage_in_kernelmode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage_in_kernelmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage_in_usermode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage_in_usermode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

