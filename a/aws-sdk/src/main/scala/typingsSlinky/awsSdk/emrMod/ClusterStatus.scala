package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStatus extends js.Object {
  /**
    * The current state of the cluster.
    */
  var State: js.UndefOr[ClusterState] = js.native
  /**
    * The reason for the cluster status change.
    */
  var StateChangeReason: js.UndefOr[ClusterStateChangeReason] = js.native
  /**
    * A timeline that represents the status of a cluster over the lifetime of the cluster.
    */
  var Timeline: js.UndefOr[ClusterTimeline] = js.native
}

object ClusterStatus {
  @scala.inline
  def apply(): ClusterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterStatus]
  }
  @scala.inline
  implicit class ClusterStatusOps[Self <: ClusterStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: ClusterState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangeReason(value: ClusterStateChangeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeline(value: ClusterTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(js.undefined)
        ret
    }
  }
  
}

