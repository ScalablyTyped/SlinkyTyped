package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledActionType extends js.Object {
  /**
    * An action that runs a PauseCluster API operation. 
    */
  var PauseCluster: js.UndefOr[PauseClusterMessage] = js.native
  /**
    * An action that runs a ResizeCluster API operation. 
    */
  var ResizeCluster: js.UndefOr[ResizeClusterMessage] = js.native
  /**
    * An action that runs a ResumeCluster API operation. 
    */
  var ResumeCluster: js.UndefOr[ResumeClusterMessage] = js.native
}

object ScheduledActionType {
  @scala.inline
  def apply(): ScheduledActionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionType]
  }
  @scala.inline
  implicit class ScheduledActionTypeOps[Self <: ScheduledActionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPauseCluster(value: PauseClusterMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PauseCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PauseCluster")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeCluster(value: ResizeClusterMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResizeCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResizeCluster")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeCluster(value: ResumeClusterMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResumeCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResumeCluster")(js.undefined)
        ret
    }
  }
  
}

