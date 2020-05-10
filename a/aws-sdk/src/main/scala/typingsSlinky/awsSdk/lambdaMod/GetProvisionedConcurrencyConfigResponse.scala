package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProvisionedConcurrencyConfigResponse extends js.Object {
  /**
    * The amount of provisioned concurrency allocated.
    */
  var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The amount of provisioned concurrency available.
    */
  var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The date and time that a user last updated the configuration, in ISO 8601 format.
    */
  var LastModified: js.UndefOr[Timestamp] = js.native
  /**
    * The amount of provisioned concurrency requested.
    */
  var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger] = js.native
  /**
    * The status of the allocation process.
    */
  var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum] = js.native
  /**
    * For failed allocations, the reason that provisioned concurrency could not be allocated.
    */
  var StatusReason: js.UndefOr[String] = js.native
}

object GetProvisionedConcurrencyConfigResponse {
  @scala.inline
  def apply(): GetProvisionedConcurrencyConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProvisionedConcurrencyConfigResponse]
  }
  @scala.inline
  implicit class GetProvisionedConcurrencyConfigResponseOps[Self <: GetProvisionedConcurrencyConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocatedProvisionedConcurrentExecutions(value: NonNegativeInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedProvisionedConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocatedProvisionedConcurrentExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedProvisionedConcurrentExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableProvisionedConcurrentExecutions(value: NonNegativeInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableProvisionedConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableProvisionedConcurrentExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableProvisionedConcurrentExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedProvisionedConcurrentExecutions(value: PositiveInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedProvisionedConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedProvisionedConcurrentExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedProvisionedConcurrentExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ProvisionedConcurrencyStatusEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(js.undefined)
        ret
    }
  }
  
}

