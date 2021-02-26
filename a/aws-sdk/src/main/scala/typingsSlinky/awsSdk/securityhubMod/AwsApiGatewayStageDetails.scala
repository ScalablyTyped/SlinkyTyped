package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayStageDetails extends StObject {
  
  /**
    * Settings for logging access for the stage.
    */
  var AccessLogSettings: js.UndefOr[AwsApiGatewayAccessLogSettings] = js.native
  
  /**
    * Indicates whether a cache cluster is enabled for the stage.
    */
  var CacheClusterEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If a cache cluster is enabled, the size of the cache cluster.
    */
  var CacheClusterSize: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * If a cache cluster is enabled, the status of the cache cluster.
    */
  var CacheClusterStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about settings for canary deployment in the stage.
    */
  var CanarySettings: js.UndefOr[AwsApiGatewayCanarySettings] = js.native
  
  /**
    * The identifier of the client certificate for the stage.
    */
  var ClientCertificateId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the stage was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the deployment that the stage points to.
    */
  var DeploymentId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A description of the stage.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version of the API documentation that is associated with the stage.
    */
  var DocumentationVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the stage was most recently updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastUpdatedDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Defines the method settings for the stage.
    */
  var MethodSettings: js.UndefOr[AwsApiGatewayMethodSettingsList] = js.native
  
  /**
    * The name of the stage.
    */
  var StageName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether active tracing with AWS X-Ray is enabled for the stage.
    */
  var TracingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A map that defines the stage variables for the stage. Variable names can have alphanumeric and underscore characters. Variable values can contain the following characters:   Uppercase and lowercase letters   Numbers   Special characters -._~:/?#&amp;=,  
    */
  var Variables: js.UndefOr[FieldMap] = js.native
  
  /**
    * The ARN of the web ACL associated with the stage.
    */
  var WebAclArn: js.UndefOr[NonEmptyString] = js.native
}
object AwsApiGatewayStageDetails {
  
  @scala.inline
  def apply(): AwsApiGatewayStageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayStageDetails]
  }
  
  @scala.inline
  implicit class AwsApiGatewayStageDetailsMutableBuilder[Self <: AwsApiGatewayStageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLogSettings(value: AwsApiGatewayAccessLogSettings): Self = StObject.set(x, "AccessLogSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLogSettingsUndefined: Self = StObject.set(x, "AccessLogSettings", js.undefined)
    
    @scala.inline
    def setCacheClusterEnabled(value: Boolean): Self = StObject.set(x, "CacheClusterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterEnabledUndefined: Self = StObject.set(x, "CacheClusterEnabled", js.undefined)
    
    @scala.inline
    def setCacheClusterSize(value: NonEmptyString): Self = StObject.set(x, "CacheClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterSizeUndefined: Self = StObject.set(x, "CacheClusterSize", js.undefined)
    
    @scala.inline
    def setCacheClusterStatus(value: NonEmptyString): Self = StObject.set(x, "CacheClusterStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterStatusUndefined: Self = StObject.set(x, "CacheClusterStatus", js.undefined)
    
    @scala.inline
    def setCanarySettings(value: AwsApiGatewayCanarySettings): Self = StObject.set(x, "CanarySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanarySettingsUndefined: Self = StObject.set(x, "CanarySettings", js.undefined)
    
    @scala.inline
    def setClientCertificateId(value: NonEmptyString): Self = StObject.set(x, "ClientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateIdUndefined: Self = StObject.set(x, "ClientCertificateId", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: NonEmptyString): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDocumentationVersion(value: NonEmptyString): Self = StObject.set(x, "DocumentationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationVersionUndefined: Self = StObject.set(x, "DocumentationVersion", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: NonEmptyString): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    @scala.inline
    def setMethodSettings(value: AwsApiGatewayMethodSettingsList): Self = StObject.set(x, "MethodSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodSettingsUndefined: Self = StObject.set(x, "MethodSettings", js.undefined)
    
    @scala.inline
    def setMethodSettingsVarargs(value: AwsApiGatewayMethodSettings*): Self = StObject.set(x, "MethodSettings", js.Array(value :_*))
    
    @scala.inline
    def setStageName(value: NonEmptyString): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "StageName", js.undefined)
    
    @scala.inline
    def setTracingEnabled(value: Boolean): Self = StObject.set(x, "TracingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingEnabledUndefined: Self = StObject.set(x, "TracingEnabled", js.undefined)
    
    @scala.inline
    def setVariables(value: FieldMap): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    
    @scala.inline
    def setWebAclArn(value: NonEmptyString): Self = StObject.set(x, "WebAclArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAclArnUndefined: Self = StObject.set(x, "WebAclArn", js.undefined)
  }
}
