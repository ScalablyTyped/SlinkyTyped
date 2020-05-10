package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceUsage extends js.Object {
  var fsRead: Double = js.native
  var fsWrite: Double = js.native
  var involuntaryContextSwitches: Double = js.native
  var ipcReceived: Double = js.native
  var ipcSent: Double = js.native
  var majorPageFault: Double = js.native
  var maxRSS: Double = js.native
  var minorPageFault: Double = js.native
  var sharedMemorySize: Double = js.native
  var signalsCount: Double = js.native
  var swappedOut: Double = js.native
  var systemCPUTime: Double = js.native
  var unsharedDataSize: Double = js.native
  var unsharedStackSize: Double = js.native
  var userCPUTime: Double = js.native
  var voluntaryContextSwitches: Double = js.native
}

object ResourceUsage {
  @scala.inline
  def apply(
    fsRead: Double,
    fsWrite: Double,
    involuntaryContextSwitches: Double,
    ipcReceived: Double,
    ipcSent: Double,
    majorPageFault: Double,
    maxRSS: Double,
    minorPageFault: Double,
    sharedMemorySize: Double,
    signalsCount: Double,
    swappedOut: Double,
    systemCPUTime: Double,
    unsharedDataSize: Double,
    unsharedStackSize: Double,
    userCPUTime: Double,
    voluntaryContextSwitches: Double
  ): ResourceUsage = {
    val __obj = js.Dynamic.literal(fsRead = fsRead.asInstanceOf[js.Any], fsWrite = fsWrite.asInstanceOf[js.Any], involuntaryContextSwitches = involuntaryContextSwitches.asInstanceOf[js.Any], ipcReceived = ipcReceived.asInstanceOf[js.Any], ipcSent = ipcSent.asInstanceOf[js.Any], majorPageFault = majorPageFault.asInstanceOf[js.Any], maxRSS = maxRSS.asInstanceOf[js.Any], minorPageFault = minorPageFault.asInstanceOf[js.Any], sharedMemorySize = sharedMemorySize.asInstanceOf[js.Any], signalsCount = signalsCount.asInstanceOf[js.Any], swappedOut = swappedOut.asInstanceOf[js.Any], systemCPUTime = systemCPUTime.asInstanceOf[js.Any], unsharedDataSize = unsharedDataSize.asInstanceOf[js.Any], unsharedStackSize = unsharedStackSize.asInstanceOf[js.Any], userCPUTime = userCPUTime.asInstanceOf[js.Any], voluntaryContextSwitches = voluntaryContextSwitches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceUsage]
  }
  @scala.inline
  implicit class ResourceUsageOps[Self <: ResourceUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFsRead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsWrite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoluntaryContextSwitches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("involuntaryContextSwitches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpcReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpcSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorPageFault(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorPageFault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRSS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorPageFault(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorPageFault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedMemorySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedMemorySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignalsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwappedOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swappedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemCPUTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemCPUTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsharedDataSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsharedDataSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsharedStackSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsharedStackSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserCPUTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCPUTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoluntaryContextSwitches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voluntaryContextSwitches")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

