package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workteam extends StObject {
  
  /**
    * The date and time that the work team was created (timestamp).
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A description of the work team.
    */
  var Description: String200 = js.native
  
  /**
    * The date and time that the work team was last updated (timestamp).
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A list of MemberDefinition objects that contains objects that identify the workers that make up the work team.  Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use CognitoMemberDefinition. For workforces created using your own OIDC identity provider (IdP) use OidcMemberDefinition.
    */
  var MemberDefinitions: typingsSlinky.awsSdk.sagemakerMod.MemberDefinitions = js.native
  
  /**
    * Configures SNS notifications of available or expiring work items for work teams.
    */
  var NotificationConfiguration: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotificationConfiguration] = js.native
  
  /**
    * The Amazon Marketplace identifier for a vendor's work team.
    */
  var ProductListingIds: js.UndefOr[ProductListings] = js.native
  
  /**
    * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
    */
  var SubDomain: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the workforce.
    */
  var WorkforceArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.WorkforceArn] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that identifies the work team.
    */
  var WorkteamArn: typingsSlinky.awsSdk.sagemakerMod.WorkteamArn = js.native
  
  /**
    * The name of the work team.
    */
  var WorkteamName: typingsSlinky.awsSdk.sagemakerMod.WorkteamName = js.native
}
object Workteam {
  
  @scala.inline
  def apply(
    Description: String200,
    MemberDefinitions: MemberDefinitions,
    WorkteamArn: WorkteamArn,
    WorkteamName: WorkteamName
  ): Workteam = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], MemberDefinitions = MemberDefinitions.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any], WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workteam]
  }
  
  @scala.inline
  implicit class WorkteamMutableBuilder[Self <: Workteam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String200): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    @scala.inline
    def setMemberDefinitions(value: MemberDefinitions): Self = StObject.set(x, "MemberDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberDefinitionsVarargs(value: MemberDefinition*): Self = StObject.set(x, "MemberDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigurationUndefined: Self = StObject.set(x, "NotificationConfiguration", js.undefined)
    
    @scala.inline
    def setProductListingIds(value: ProductListings): Self = StObject.set(x, "ProductListingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductListingIdsUndefined: Self = StObject.set(x, "ProductListingIds", js.undefined)
    
    @scala.inline
    def setProductListingIdsVarargs(value: String*): Self = StObject.set(x, "ProductListingIds", js.Array(value :_*))
    
    @scala.inline
    def setSubDomain(value: String): Self = StObject.set(x, "SubDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDomainUndefined: Self = StObject.set(x, "SubDomain", js.undefined)
    
    @scala.inline
    def setWorkforceArn(value: WorkforceArn): Self = StObject.set(x, "WorkforceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkforceArnUndefined: Self = StObject.set(x, "WorkforceArn", js.undefined)
    
    @scala.inline
    def setWorkteamArn(value: WorkteamArn): Self = StObject.set(x, "WorkteamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkteamName(value: WorkteamName): Self = StObject.set(x, "WorkteamName", value.asInstanceOf[js.Any])
  }
}
