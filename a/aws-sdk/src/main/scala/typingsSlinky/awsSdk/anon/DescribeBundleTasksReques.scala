package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.ec2Mod.Boolean
import typingsSlinky.awsSdk.ec2Mod.BundleIdStringList
import typingsSlinky.awsSdk.ec2Mod.FilterList
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeBundleTasksRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeBundleTasksReques extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The bundle task IDs. Default: Describes all your bundle tasks.
    */
  var BundleIds: js.UndefOr[BundleIdStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    bundle-id - The ID of the bundle task.    error-code - If the task failed, the error code returned.    error-message - If the task failed, the error message returned.    instance-id - The ID of the instance.    progress - The level of task completion, as a percentage (for example, 20%).    s3-bucket - The Amazon S3 bucket to store the AMI.    s3-prefix - The beginning of the AMI name.    start-time - The time the task started (for example, 2013-09-15T17:15:20.000Z).    state - The state of the task (pending | waiting-for-shutdown | bundling | storing | cancelling | complete | failed).    update-time - The time of the most recent update for the task.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
}

object DescribeBundleTasksReques {
  @scala.inline
  def apply(): DescribeBundleTasksReques = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBundleTasksReques]
  }
  @scala.inline
  implicit class DescribeBundleTasksRequesOps[Self <: DescribeBundleTasksReques] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleIds(value: BundleIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
  }
  
}

