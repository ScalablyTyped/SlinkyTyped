package typingsSlinky.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseConfiguration extends StObject {
  
  /**
    * Automated discovery information.
    */
  var AutomatedDiscoveryInformation: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.AutomatedDiscoveryInformation] = js.native
  
  /**
    * Summaries for licenses consumed by various resources.
    */
  var ConsumedLicenseSummaryList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ConsumedLicenseSummaryList] = js.native
  
  /**
    * Number of licenses consumed. 
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.native
  
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.native
  
  /**
    * Unique ID of the license configuration.
    */
  var LicenseConfigurationId: js.UndefOr[String] = js.native
  
  /**
    * Number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  
  /**
    * Number of available licenses as a hard limit.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  
  /**
    * Dimension to use to track the license inventory.
    */
  var LicenseCountingType: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.LicenseCountingType] = js.native
  
  /**
    * License rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  
  /**
    * Summaries for managed resources.
    */
  var ManagedResourceSummaryList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ManagedResourceSummaryList] = js.native
  
  /**
    * Name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * Account ID of the license configuration's owner.
    */
  var OwnerAccountId: js.UndefOr[String] = js.native
  
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ProductInformationList] = js.native
  
  /**
    * Status of the license configuration.
    */
  var Status: js.UndefOr[String] = js.native
}
object LicenseConfiguration {
  
  @scala.inline
  def apply(): LicenseConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfiguration]
  }
  
  @scala.inline
  implicit class LicenseConfigurationMutableBuilder[Self <: LicenseConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatedDiscoveryInformation(value: AutomatedDiscoveryInformation): Self = StObject.set(x, "AutomatedDiscoveryInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedDiscoveryInformationUndefined: Self = StObject.set(x, "AutomatedDiscoveryInformation", js.undefined)
    
    @scala.inline
    def setConsumedLicenseSummaryList(value: ConsumedLicenseSummaryList): Self = StObject.set(x, "ConsumedLicenseSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedLicenseSummaryListUndefined: Self = StObject.set(x, "ConsumedLicenseSummaryList", js.undefined)
    
    @scala.inline
    def setConsumedLicenseSummaryListVarargs(value: ConsumedLicenseSummary*): Self = StObject.set(x, "ConsumedLicenseSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setConsumedLicenses(value: BoxLong): Self = StObject.set(x, "ConsumedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedLicensesUndefined: Self = StObject.set(x, "ConsumedLicenses", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "LicenseConfigurationArn", js.undefined)
    
    @scala.inline
    def setLicenseConfigurationId(value: String): Self = StObject.set(x, "LicenseConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationIdUndefined: Self = StObject.set(x, "LicenseConfigurationId", js.undefined)
    
    @scala.inline
    def setLicenseCount(value: BoxLong): Self = StObject.set(x, "LicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseCountHardLimit(value: BoxBoolean): Self = StObject.set(x, "LicenseCountHardLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseCountHardLimitUndefined: Self = StObject.set(x, "LicenseCountHardLimit", js.undefined)
    
    @scala.inline
    def setLicenseCountUndefined: Self = StObject.set(x, "LicenseCount", js.undefined)
    
    @scala.inline
    def setLicenseCountingType(value: LicenseCountingType): Self = StObject.set(x, "LicenseCountingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseCountingTypeUndefined: Self = StObject.set(x, "LicenseCountingType", js.undefined)
    
    @scala.inline
    def setLicenseRules(value: StringList): Self = StObject.set(x, "LicenseRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseRulesUndefined: Self = StObject.set(x, "LicenseRules", js.undefined)
    
    @scala.inline
    def setLicenseRulesVarargs(value: String*): Self = StObject.set(x, "LicenseRules", js.Array(value :_*))
    
    @scala.inline
    def setManagedResourceSummaryList(value: ManagedResourceSummaryList): Self = StObject.set(x, "ManagedResourceSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedResourceSummaryListUndefined: Self = StObject.set(x, "ManagedResourceSummaryList", js.undefined)
    
    @scala.inline
    def setManagedResourceSummaryListVarargs(value: ManagedResourceSummary*): Self = StObject.set(x, "ManagedResourceSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: String): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    @scala.inline
    def setProductInformationList(value: ProductInformationList): Self = StObject.set(x, "ProductInformationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductInformationListUndefined: Self = StObject.set(x, "ProductInformationList", js.undefined)
    
    @scala.inline
    def setProductInformationListVarargs(value: ProductInformation*): Self = StObject.set(x, "ProductInformationList", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
