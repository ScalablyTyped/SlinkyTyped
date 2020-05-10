package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.Browser
import typingsSlinky.electron.electronStrings.GPU
import typingsSlinky.electron.electronStrings.Tab
import typingsSlinky.electron.electronStrings.Unknown
import typingsSlinky.electron.electronStrings.Utility
import typingsSlinky.electron.electronStrings.Zygote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessMetric extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/process-metric
  /**
    * CPU usage of the process.
    */
  var cpu: CPUUsage = js.native
  /**
    * Process id of the process.
    */
  var pid: Double = js.native
  /**
    * Process type. One of the following values:
    */
  var `type`: Browser | Tab | Utility | Zygote | GPU | Unknown = js.native
}

object ProcessMetric {
  @scala.inline
  def apply(cpu: CPUUsage, pid: Double, `type`: Browser | Tab | Utility | Zygote | GPU | Unknown): ProcessMetric = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMetric]
  }
  @scala.inline
  implicit class ProcessMetricOps[Self <: ProcessMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpu(value: CPUUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Browser | Tab | Utility | Zygote | GPU | Unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

