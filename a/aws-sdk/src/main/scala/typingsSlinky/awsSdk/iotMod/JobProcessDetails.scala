package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobProcessDetails extends js.Object {
  /**
    * The number of things that cancelled the job.
    */
  var numberOfCanceledThings: js.UndefOr[CanceledThings] = js.native
  /**
    * The number of things that failed executing the job.
    */
  var numberOfFailedThings: js.UndefOr[FailedThings] = js.native
  /**
    * The number of things currently executing the job.
    */
  var numberOfInProgressThings: js.UndefOr[InProgressThings] = js.native
  /**
    * The number of things that are awaiting execution of the job.
    */
  var numberOfQueuedThings: js.UndefOr[QueuedThings] = js.native
  /**
    * The number of things that rejected the job.
    */
  var numberOfRejectedThings: js.UndefOr[RejectedThings] = js.native
  /**
    * The number of things that are no longer scheduled to execute the job because they have been deleted or have been removed from the group that was a target of the job.
    */
  var numberOfRemovedThings: js.UndefOr[RemovedThings] = js.native
  /**
    * The number of things which successfully completed the job.
    */
  var numberOfSucceededThings: js.UndefOr[SucceededThings] = js.native
  /**
    * The number of things whose job execution status is TIMED_OUT.
    */
  var numberOfTimedOutThings: js.UndefOr[TimedOutThings] = js.native
  /**
    * The target devices to which the job execution is being rolled out. This value will be null after the job execution has finished rolling out to all the target devices.
    */
  var processingTargets: js.UndefOr[ProcessingTargetNameList] = js.native
}

object JobProcessDetails {
  @scala.inline
  def apply(): JobProcessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobProcessDetails]
  }
  @scala.inline
  implicit class JobProcessDetailsOps[Self <: JobProcessDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfCanceledThings(value: CanceledThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfCanceledThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfCanceledThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfCanceledThings")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfFailedThings(value: FailedThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfFailedThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfFailedThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfFailedThings")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfInProgressThings(value: InProgressThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfInProgressThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfInProgressThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfInProgressThings")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfQueuedThings(value: QueuedThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfQueuedThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfQueuedThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfQueuedThings")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfRejectedThings(value: RejectedThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRejectedThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfRejectedThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRejectedThings")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfRemovedThings(value: RemovedThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRemovedThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfRemovedThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRemovedThings")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfSucceededThings(value: SucceededThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSucceededThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfSucceededThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSucceededThings")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfTimedOutThings(value: TimedOutThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfTimedOutThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfTimedOutThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfTimedOutThings")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingTargets(value: ProcessingTargetNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingTargets")(js.undefined)
        ret
    }
  }
  
}

