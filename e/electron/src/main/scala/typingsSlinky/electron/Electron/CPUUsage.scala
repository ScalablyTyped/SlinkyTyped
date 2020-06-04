package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUUsage extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/cpu-usage
  /**
    * The number of average idle cpu wakeups per second since the last call to
    * getCPUUsage. First call returns 0. Will always return 0 on Windows.
    */
  var idleWakeupsPerSecond: Double
  /**
    * Percentage of CPU used since the last call to getCPUUsage. First call returns 0.
    */
  var percentCPUUsage: Double
}

object CPUUsage {
  @scala.inline
  def apply(idleWakeupsPerSecond: Double, percentCPUUsage: Double): CPUUsage = {
    val __obj = js.Dynamic.literal(idleWakeupsPerSecond = idleWakeupsPerSecond.asInstanceOf[js.Any], percentCPUUsage = percentCPUUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUUsage]
  }
  @scala.inline
  implicit class CPUUsageOps[Self <: CPUUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdleWakeupsPerSecond(value: Double): Self = this.set("idleWakeupsPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentCPUUsage(value: Double): Self = this.set("percentCPUUsage", value.asInstanceOf[js.Any])
  }
  
}

