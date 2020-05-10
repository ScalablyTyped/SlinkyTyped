package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupManagerActionsSummary extends js.Object {
  /**
    * [Output Only] The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from
    * the managed instance group without deleting it.
    */
  var abandoning: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails
    * to create any of these instances, it tries again until it creates the instance successfully.
    *
    * If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
    */
  var creating: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If
    * the group fails to create any of these instances, it decreases the group's targetSize value accordingly.
    */
  var creatingWithoutRetries: js.UndefOr[Double] = js.native
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted. */
  var deleting: js.UndefOr[Double] = js.native
  /** [Output Only] The number of instances in the managed instance group that are running and have no scheduled actions. */
  var none: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated.
    * Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
    */
  var recreating: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a
    * recreate action. For example, setting or removing target pools for the instance.
    */
  var refreshing: js.UndefOr[Double] = js.native
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted. */
  var restarting: js.UndefOr[Double] = js.native
}

object InstanceGroupManagerActionsSummary {
  @scala.inline
  def apply(): InstanceGroupManagerActionsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerActionsSummary]
  }
  @scala.inline
  implicit class InstanceGroupManagerActionsSummaryOps[Self <: InstanceGroupManagerActionsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbandoning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandoning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbandoning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandoning")(js.undefined)
        ret
    }
    @scala.inline
    def withCreating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creating")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatingWithoutRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatingWithoutRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatingWithoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatingWithoutRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleting")(js.undefined)
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(js.undefined)
        ret
    }
    @scala.inline
    def withRecreating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recreating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecreating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recreating")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(js.undefined)
        ret
    }
    @scala.inline
    def withRestarting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restarting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestarting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restarting")(js.undefined)
        ret
    }
  }
  
}

