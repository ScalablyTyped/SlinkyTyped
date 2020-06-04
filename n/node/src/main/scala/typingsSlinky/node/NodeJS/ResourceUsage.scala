package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceUsage extends js.Object {
  var fsRead: Double
  var fsWrite: Double
  var involuntaryContextSwitches: Double
  var ipcReceived: Double
  var ipcSent: Double
  var majorPageFault: Double
  var maxRSS: Double
  var minorPageFault: Double
  var sharedMemorySize: Double
  var signalsCount: Double
  var swappedOut: Double
  var systemCPUTime: Double
  var unsharedDataSize: Double
  var unsharedStackSize: Double
  var userCPUTime: Double
  var voluntaryContextSwitches: Double
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFsRead(value: Double): Self = this.set("fsRead", value.asInstanceOf[js.Any])
    @scala.inline
    def setFsWrite(value: Double): Self = this.set("fsWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoluntaryContextSwitches(value: Double): Self = this.set("involuntaryContextSwitches", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpcReceived(value: Double): Self = this.set("ipcReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpcSent(value: Double): Self = this.set("ipcSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorPageFault(value: Double): Self = this.set("majorPageFault", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxRSS(value: Double): Self = this.set("maxRSS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorPageFault(value: Double): Self = this.set("minorPageFault", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedMemorySize(value: Double): Self = this.set("sharedMemorySize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignalsCount(value: Double): Self = this.set("signalsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwappedOut(value: Double): Self = this.set("swappedOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemCPUTime(value: Double): Self = this.set("systemCPUTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsharedDataSize(value: Double): Self = this.set("unsharedDataSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsharedStackSize(value: Double): Self = this.set("unsharedStackSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserCPUTime(value: Double): Self = this.set("userCPUTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoluntaryContextSwitches(value: Double): Self = this.set("voluntaryContextSwitches", value.asInstanceOf[js.Any])
  }
  
}

