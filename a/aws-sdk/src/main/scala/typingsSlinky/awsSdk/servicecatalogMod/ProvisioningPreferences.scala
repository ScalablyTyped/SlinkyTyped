package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningPreferences extends StObject {
  
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
  implicit class ProvisioningPreferencesMutableBuilder[Self <: ProvisioningPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackSetAccounts(value: StackSetAccounts): Self = StObject.set(x, "StackSetAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetAccountsUndefined: Self = StObject.set(x, "StackSetAccounts", js.undefined)
    
    @scala.inline
    def setStackSetAccountsVarargs(value: AccountId*): Self = StObject.set(x, "StackSetAccounts", js.Array(value :_*))
    
    @scala.inline
    def setStackSetFailureToleranceCount(value: StackSetFailureToleranceCount): Self = StObject.set(x, "StackSetFailureToleranceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetFailureToleranceCountUndefined: Self = StObject.set(x, "StackSetFailureToleranceCount", js.undefined)
    
    @scala.inline
    def setStackSetFailureTolerancePercentage(value: StackSetFailureTolerancePercentage): Self = StObject.set(x, "StackSetFailureTolerancePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetFailureTolerancePercentageUndefined: Self = StObject.set(x, "StackSetFailureTolerancePercentage", js.undefined)
    
    @scala.inline
    def setStackSetMaxConcurrencyCount(value: StackSetMaxConcurrencyCount): Self = StObject.set(x, "StackSetMaxConcurrencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetMaxConcurrencyCountUndefined: Self = StObject.set(x, "StackSetMaxConcurrencyCount", js.undefined)
    
    @scala.inline
    def setStackSetMaxConcurrencyPercentage(value: StackSetMaxConcurrencyPercentage): Self = StObject.set(x, "StackSetMaxConcurrencyPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetMaxConcurrencyPercentageUndefined: Self = StObject.set(x, "StackSetMaxConcurrencyPercentage", js.undefined)
    
    @scala.inline
    def setStackSetRegions(value: StackSetRegions): Self = StObject.set(x, "StackSetRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetRegionsUndefined: Self = StObject.set(x, "StackSetRegions", js.undefined)
    
    @scala.inline
    def setStackSetRegionsVarargs(value: Region*): Self = StObject.set(x, "StackSetRegions", js.Array(value :_*))
  }
}
