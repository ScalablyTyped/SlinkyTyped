package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningPreferences extends js.Object {
  /**
    * One or more AWS accounts that will have access to the provisioned product. Applicable only to a CFN_STACKSET provisioned product type. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all accounts from the STACKSET constraint.
    */
  var StackSetAccounts: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackSetAccounts] = js.native
  /**
    * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both. The default value is 0 if no value is specified.
    */
  var StackSetFailureToleranceCount: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackSetFailureToleranceCount] = js.native
  /**
    * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both.
    */
  var StackSetFailureTolerancePercentage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackSetFailureTolerancePercentage] = js.native
  /**
    * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of StackSetFailureToleranceCount. StackSetMaxConcurrentCount is at most one more than the StackSetFailureToleranceCount. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
    */
  var StackSetMaxConcurrencyCount: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackSetMaxConcurrencyCount] = js.native
  /**
    * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
    */
  var StackSetMaxConcurrencyPercentage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackSetMaxConcurrencyPercentage] = js.native
  /**
    * One or more AWS Regions where the provisioned product will be available. Applicable only to a CFN_STACKSET provisioned product type. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all regions from the STACKSET constraint.
    */
  var StackSetRegions: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackSetRegions] = js.native
}

object ProvisioningPreferences {
  @scala.inline
  def apply(): ProvisioningPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningPreferences]
  }
  @scala.inline
  implicit class ProvisioningPreferencesOps[Self <: ProvisioningPreferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackSetAccounts(value: StackSetAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetFailureToleranceCount(value: StackSetFailureToleranceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetFailureToleranceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetFailureToleranceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetFailureToleranceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetFailureTolerancePercentage(value: StackSetFailureTolerancePercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetFailureTolerancePercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetFailureTolerancePercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetFailureTolerancePercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetMaxConcurrencyCount(value: StackSetMaxConcurrencyCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetMaxConcurrencyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetMaxConcurrencyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetMaxConcurrencyCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetMaxConcurrencyPercentage(value: StackSetMaxConcurrencyPercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetMaxConcurrencyPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetMaxConcurrencyPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetMaxConcurrencyPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetRegions(value: StackSetRegions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetRegions")(js.undefined)
        ret
    }
  }
  
}

