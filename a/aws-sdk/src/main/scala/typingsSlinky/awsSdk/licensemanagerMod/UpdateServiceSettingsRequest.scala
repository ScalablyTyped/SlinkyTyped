package typingsSlinky.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServiceSettingsRequest extends StObject {
  
  /**
    * Activates cross-account discovery.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.native
  
  /**
    * Enables integration with AWS Organizations for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.OrganizationConfiguration] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the Amazon S3 bucket where the License Manager information is stored.
    */
  var S3BucketArn: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the Amazon SNS topic used for License Manager alerts.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
}
object UpdateServiceSettingsRequest {
  
  @scala.inline
  def apply(): UpdateServiceSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateServiceSettingsRequestMutableBuilder[Self <: UpdateServiceSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableCrossAccountsDiscovery(value: BoxBoolean): Self = StObject.set(x, "EnableCrossAccountsDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCrossAccountsDiscoveryUndefined: Self = StObject.set(x, "EnableCrossAccountsDiscovery", js.undefined)
    
    @scala.inline
    def setOrganizationConfiguration(value: OrganizationConfiguration): Self = StObject.set(x, "OrganizationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConfigurationUndefined: Self = StObject.set(x, "OrganizationConfiguration", js.undefined)
    
    @scala.inline
    def setS3BucketArn(value: String): Self = StObject.set(x, "S3BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketArnUndefined: Self = StObject.set(x, "S3BucketArn", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
  }
}
