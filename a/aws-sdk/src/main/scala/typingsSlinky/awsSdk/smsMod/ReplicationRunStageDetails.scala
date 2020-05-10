package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRunStageDetails extends js.Object {
  /**
    * String describing the current stage of a replication run.
    */
  var stage: js.UndefOr[ReplicationRunStage] = js.native
  /**
    * String describing the progress of the current stage of a replication run.
    */
  var stageProgress: js.UndefOr[ReplicationRunStageProgress] = js.native
}

object ReplicationRunStageDetails {
  @scala.inline
  def apply(): ReplicationRunStageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRunStageDetails]
  }
  @scala.inline
  implicit class ReplicationRunStageDetailsOps[Self <: ReplicationRunStageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStage(value: ReplicationRunStage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(js.undefined)
        ret
    }
    @scala.inline
    def withStageProgress(value: ReplicationRunStageProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageProgress")(js.undefined)
        ret
    }
  }
  
}

