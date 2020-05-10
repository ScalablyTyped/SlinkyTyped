package typingsSlinky.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeInfo extends js.Object {
  var appName: String = js.native
  var appVersion: String = js.native
  var duration: Double = js.native
  var jreAvailableProcessors: Double = js.native
  var jreFreeMemory: Double = js.native
  var jreMaxMemory: Double = js.native
  var jreTotalMemory: Double = js.native
  var jreVersion: String = js.native
  var latestMilestone: String = js.native
  var latestMilestoneIndex: Double = js.native
  var latestSolidSubtangleMilestone: String = js.native
  var latestSolidSubtangleMilestoneIndex: Double = js.native
  var neighbors: Double = js.native
  var packetsQueueSize: Double = js.native
  var time: Double = js.native
  var tips: Double = js.native
  var transactionsToRequest: Double = js.native
}

object NodeInfo {
  @scala.inline
  def apply(
    appName: String,
    appVersion: String,
    duration: Double,
    jreAvailableProcessors: Double,
    jreFreeMemory: Double,
    jreMaxMemory: Double,
    jreTotalMemory: Double,
    jreVersion: String,
    latestMilestone: String,
    latestMilestoneIndex: Double,
    latestSolidSubtangleMilestone: String,
    latestSolidSubtangleMilestoneIndex: Double,
    neighbors: Double,
    packetsQueueSize: Double,
    time: Double,
    tips: Double,
    transactionsToRequest: Double
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], jreAvailableProcessors = jreAvailableProcessors.asInstanceOf[js.Any], jreFreeMemory = jreFreeMemory.asInstanceOf[js.Any], jreMaxMemory = jreMaxMemory.asInstanceOf[js.Any], jreTotalMemory = jreTotalMemory.asInstanceOf[js.Any], jreVersion = jreVersion.asInstanceOf[js.Any], latestMilestone = latestMilestone.asInstanceOf[js.Any], latestMilestoneIndex = latestMilestoneIndex.asInstanceOf[js.Any], latestSolidSubtangleMilestone = latestSolidSubtangleMilestone.asInstanceOf[js.Any], latestSolidSubtangleMilestoneIndex = latestSolidSubtangleMilestoneIndex.asInstanceOf[js.Any], neighbors = neighbors.asInstanceOf[js.Any], packetsQueueSize = packetsQueueSize.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any], transactionsToRequest = transactionsToRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
  @scala.inline
  implicit class NodeInfoOps[Self <: NodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJreAvailableProcessors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jreAvailableProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJreFreeMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jreFreeMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJreMaxMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jreMaxMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJreTotalMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jreTotalMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJreVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jreVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestMilestone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestMilestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestMilestoneIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestMilestoneIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestSolidSubtangleMilestone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestSolidSubtangleMilestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestSolidSubtangleMilestoneIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestSolidSubtangleMilestoneIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeighbors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighbors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacketsQueueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsQueueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTips(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionsToRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionsToRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

