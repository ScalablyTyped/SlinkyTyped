package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStackSetAccountsVarargs(value: AccountId*): Self = this.set("StackSetAccounts", js.Array(value :_*))
    
    @scala.inline
    def setStackSetAccounts(value: StackSetAccounts): Self = this.set("StackSetAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetAccounts: Self = this.set("StackSetAccounts", js.undefined)
    
    @scala.inline
    def setStackSetFailureToleranceCount(value: StackSetFailureToleranceCount): Self = this.set("StackSetFailureToleranceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetFailureToleranceCount: Self = this.set("StackSetFailureToleranceCount", js.undefined)
    
    @scala.inline
    def setStackSetFailureTolerancePercentage(value: StackSetFailureTolerancePercentage): Self = this.set("StackSetFailureTolerancePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetFailureTolerancePercentage: Self = this.set("StackSetFailureTolerancePercentage", js.undefined)
    
    @scala.inline
    def setStackSetMaxConcurrencyCount(value: StackSetMaxConcurrencyCount): Self = this.set("StackSetMaxConcurrencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetMaxConcurrencyCount: Self = this.set("StackSetMaxConcurrencyCount", js.undefined)
    
    @scala.inline
    def setStackSetMaxConcurrencyPercentage(value: StackSetMaxConcurrencyPercentage): Self = this.set("StackSetMaxConcurrencyPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetMaxConcurrencyPercentage: Self = this.set("StackSetMaxConcurrencyPercentage", js.undefined)
    
    @scala.inline
    def setStackSetRegionsVarargs(value: Region*): Self = this.set("StackSetRegions", js.Array(value :_*))
    
    @scala.inline
    def setStackSetRegions(value: StackSetRegions): Self = this.set("StackSetRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetRegions: Self = this.set("StackSetRegions", js.undefined)
  }
}
