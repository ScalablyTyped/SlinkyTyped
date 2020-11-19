package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends DirectoryObject {
  
  /**
    * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications
    * that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services
    * like Microsoft 365 call the application in the context of a document the user is working on.
    */
  var addIns: js.UndefOr[js.Array[AddIn]] = js.native
  
  // Specifies settings for an application that implements a web API.
  var api: js.UndefOr[ApiApplication] = js.native
  
  // The unique identifier for the application that is assigned to an application by Azure AD. Not nullable. Read-only.
  var appId: js.UndefOr[String] = js.native
  
  /**
    * The collection of roles the application declares. With app role assignments, these roles can be assigned to users,
    * groups, or other applications' service principals. Not nullable.
    */
  var appRoles: js.UndefOr[js.Array[AppRole]] = js.native
  
  var applicationTemplateId: js.UndefOr[String] = js.native
  
  // The date and time the application was registered. Read-only.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Read-only.
  var createdOnBehalfOf: js.UndefOr[DirectoryObject] = js.native
  
  // The display name for the application.
  var displayName: js.UndefOr[String] = js.native
  
  // Read-only. Nullable.
  var extensionProperties: js.UndefOr[js.Array[ExtensionProperty]] = js.native
  
  /**
    * Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this
    * attribute, use one of the following valid string values:NoneSecurityGroup: For security groups and Azure AD rolesAll:
    * This will get all of the security groups, distribution groups, and Azure AD directory roles that the signed-in user is
    * a member of
    */
  var groupMembershipClaims: js.UndefOr[String] = js.native
  
  var homeRealmDiscoveryPolicies: js.UndefOr[js.Array[HomeRealmDiscoveryPolicy]] = js.native
  
  /**
    * The URIs that identify the application within its Azure AD tenant, or within a verified custom domain if the
    * application is multi-tenant. For more information see Application Objects and Service Principal Objects. The any
    * operator is required for filter expressions on multi-valued properties. Not nullable.
    */
  var identifierUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Basic profile information of the application such as app's marketing, support, terms of service and privacy statement
    * URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more
    * info, see How to: Add Terms of service and privacy statement for registered Azure AD apps.
    */
  var info: js.UndefOr[InformationalUrl] = js.native
  
  var isDeviceOnlyAuthSupported: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the fallback application type as public client, such as an installed application running on a mobile device.
    * The default value is false which means the fallback application type is confidential client such as web app. There are
    * certain scenarios where Azure AD cannot determine the client application type (e.g. ROPC flow where it is configured
    * without specifying a redirect URI). In those cases Azure AD will interpret the application type based on the value of
    * this property.
    */
  var isFallbackPublicClient: js.UndefOr[Boolean] = js.native
  
  // The collection of key credentials associated with the application Not nullable.
  var keyCredentials: js.UndefOr[js.Array[KeyCredential]] = js.native
  
  // The main logo for the application. Not nullable.
  var logo: js.UndefOr[js.Any] = js.native
  
  var oauth2RequirePostResponse: js.UndefOr[Boolean] = js.native
  
  /**
    * Application developers can configure optional claims in their Azure AD apps to specify which claims they want in tokens
    * sent to their application by the Microsoft security token service. See provide optional claims to your Azure AD app for
    * more information.
    */
  var optionalClaims: js.UndefOr[OptionalClaims] = js.native
  
  /**
    * Directory objects that are owners of the application. The owners are a set of non-admin users who are allowed to modify
    * this object. Requires version 2013-11-08 or newer. Read-only. Nullable.
    */
  var owners: js.UndefOr[js.Array[DirectoryObject]] = js.native
  
  // Specifies parental control settings for an application.
  var parentalControlSettings: js.UndefOr[ParentalControlSettings] = js.native
  
  // The collection of password credentials associated with the application. Not nullable.
  var passwordCredentials: js.UndefOr[js.Array[PasswordCredential]] = js.native
  
  // Specifies settings for installed clients such as desktop or mobile devices.
  var publicClient: js.UndefOr[PublicClientApplication] = js.native
  
  // The verified publisher domain for the application. Read-only.
  var publisherDomain: js.UndefOr[String] = js.native
  
  /**
    * Specifies resources that this application requires access to and the set of OAuth permission scopes and application
    * roles that it needs under each of those resources. This pre-configuration of required resource access drives the
    * consent experience. Not nullable.
    */
  var requiredResourceAccess: js.UndefOr[js.Array[RequiredResourceAccess]] = js.native
  
  /**
    * Specifies what Microsoft accounts are supported for the current application. Supported values are:AzureADMyOrg: Users
    * with a Microsoft work or school account in my organization’s Azure AD tenant (i.e. single tenant)AzureADMultipleOrgs:
    * Users with a Microsoft work or school account in any organization’s Azure AD tenant (i.e. multi-tenant)
    * AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any
    * organization’s Azure AD tenant
    */
  var signInAudience: js.UndefOr[String] = js.native
  
  // Custom strings that can be used to categorize and identify the application. Not nullable.
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the
    * tokens it emits by using the key this property points to. The application code that receives the encrypted token must
    * use the matching private key to decrypt the token before it can be used for the signed-in user.
    */
  var tokenEncryptionKeyId: js.UndefOr[String] = js.native
  
  var tokenIssuancePolicies: js.UndefOr[js.Array[TokenIssuancePolicy]] = js.native
  
  var tokenLifetimePolicies: js.UndefOr[js.Array[TokenLifetimePolicy]] = js.native
  
  // Specifies settings for a web application.
  var web: js.UndefOr[WebApplication] = js.native
}
object Application {
  
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    
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
    def setAddInsVarargs(value: AddIn*): Self = this.set("addIns", js.Array(value :_*))
    
    @scala.inline
    def setAddIns(value: js.Array[AddIn]): Self = this.set("addIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddIns: Self = this.set("addIns", js.undefined)
    
    @scala.inline
    def setApi(value: ApiApplication): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppRolesVarargs(value: AppRole*): Self = this.set("appRoles", js.Array(value :_*))
    
    @scala.inline
    def setAppRoles(value: js.Array[AppRole]): Self = this.set("appRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppRoles: Self = this.set("appRoles", js.undefined)
    
    @scala.inline
    def setApplicationTemplateId(value: String): Self = this.set("applicationTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationTemplateId: Self = this.set("applicationTemplateId", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedOnBehalfOf(value: DirectoryObject): Self = this.set("createdOnBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedOnBehalfOf: Self = this.set("createdOnBehalfOf", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExtensionPropertiesVarargs(value: ExtensionProperty*): Self = this.set("extensionProperties", js.Array(value :_*))
    
    @scala.inline
    def setExtensionProperties(value: js.Array[ExtensionProperty]): Self = this.set("extensionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionProperties: Self = this.set("extensionProperties", js.undefined)
    
    @scala.inline
    def setGroupMembershipClaims(value: String): Self = this.set("groupMembershipClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupMembershipClaims: Self = this.set("groupMembershipClaims", js.undefined)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = this.set("homeRealmDiscoveryPolicies", js.Array(value :_*))
    
    @scala.inline
    def setHomeRealmDiscoveryPolicies(value: js.Array[HomeRealmDiscoveryPolicy]): Self = this.set("homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeRealmDiscoveryPolicies: Self = this.set("homeRealmDiscoveryPolicies", js.undefined)
    
    @scala.inline
    def setIdentifierUrisVarargs(value: String*): Self = this.set("identifierUris", js.Array(value :_*))
    
    @scala.inline
    def setIdentifierUris(value: js.Array[String]): Self = this.set("identifierUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifierUris: Self = this.set("identifierUris", js.undefined)
    
    @scala.inline
    def setInfo(value: InformationalUrl): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setIsDeviceOnlyAuthSupported(value: Boolean): Self = this.set("isDeviceOnlyAuthSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDeviceOnlyAuthSupported: Self = this.set("isDeviceOnlyAuthSupported", js.undefined)
    
    @scala.inline
    def setIsFallbackPublicClient(value: Boolean): Self = this.set("isFallbackPublicClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFallbackPublicClient: Self = this.set("isFallbackPublicClient", js.undefined)
    
    @scala.inline
    def setKeyCredentialsVarargs(value: KeyCredential*): Self = this.set("keyCredentials", js.Array(value :_*))
    
    @scala.inline
    def setKeyCredentials(value: js.Array[KeyCredential]): Self = this.set("keyCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCredentials: Self = this.set("keyCredentials", js.undefined)
    
    @scala.inline
    def setLogo(value: js.Any): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setOauth2RequirePostResponse(value: Boolean): Self = this.set("oauth2RequirePostResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth2RequirePostResponse: Self = this.set("oauth2RequirePostResponse", js.undefined)
    
    @scala.inline
    def setOptionalClaims(value: OptionalClaims): Self = this.set("optionalClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalClaims: Self = this.set("optionalClaims", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: DirectoryObject*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: js.Array[DirectoryObject]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    
    @scala.inline
    def setParentalControlSettings(value: ParentalControlSettings): Self = this.set("parentalControlSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentalControlSettings: Self = this.set("parentalControlSettings", js.undefined)
    
    @scala.inline
    def setPasswordCredentialsVarargs(value: PasswordCredential*): Self = this.set("passwordCredentials", js.Array(value :_*))
    
    @scala.inline
    def setPasswordCredentials(value: js.Array[PasswordCredential]): Self = this.set("passwordCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordCredentials: Self = this.set("passwordCredentials", js.undefined)
    
    @scala.inline
    def setPublicClient(value: PublicClientApplication): Self = this.set("publicClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicClient: Self = this.set("publicClient", js.undefined)
    
    @scala.inline
    def setPublisherDomain(value: String): Self = this.set("publisherDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherDomain: Self = this.set("publisherDomain", js.undefined)
    
    @scala.inline
    def setRequiredResourceAccessVarargs(value: RequiredResourceAccess*): Self = this.set("requiredResourceAccess", js.Array(value :_*))
    
    @scala.inline
    def setRequiredResourceAccess(value: js.Array[RequiredResourceAccess]): Self = this.set("requiredResourceAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredResourceAccess: Self = this.set("requiredResourceAccess", js.undefined)
    
    @scala.inline
    def setSignInAudience(value: String): Self = this.set("signInAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignInAudience: Self = this.set("signInAudience", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTokenEncryptionKeyId(value: String): Self = this.set("tokenEncryptionKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenEncryptionKeyId: Self = this.set("tokenEncryptionKeyId", js.undefined)
    
    @scala.inline
    def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = this.set("tokenIssuancePolicies", js.Array(value :_*))
    
    @scala.inline
    def setTokenIssuancePolicies(value: js.Array[TokenIssuancePolicy]): Self = this.set("tokenIssuancePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenIssuancePolicies: Self = this.set("tokenIssuancePolicies", js.undefined)
    
    @scala.inline
    def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = this.set("tokenLifetimePolicies", js.Array(value :_*))
    
    @scala.inline
    def setTokenLifetimePolicies(value: js.Array[TokenLifetimePolicy]): Self = this.set("tokenLifetimePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenLifetimePolicies: Self = this.set("tokenLifetimePolicies", js.undefined)
    
    @scala.inline
    def setWeb(value: WebApplication): Self = this.set("web", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
  }
}
