package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apigatewayMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HEADER
    - typingsSlinky.awsSdk.awsSdkStrings.AUTHORIZER
    - java.lang.String
  */
  type ApiKeySourceType = typingsSlinky.awsSdk.apigatewayMod._ApiKeySourceType | java.lang.String
  
  type ApiKeysFormat = typingsSlinky.awsSdk.awsSdkStrings.csv__ | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TOKEN
    - typingsSlinky.awsSdk.awsSdkStrings.REQUEST
    - typingsSlinky.awsSdk.awsSdkStrings.COGNITO_USER_POOLS
    - java.lang.String
  */
  type AuthorizerType = typingsSlinky.awsSdk.apigatewayMod._AuthorizerType | java.lang.String
  
  type Boolean = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`0Dot5`
    - typingsSlinky.awsSdk.awsSdkStrings.`1Dot6`
    - typingsSlinky.awsSdk.awsSdkStrings.`6Dot1`
    - typingsSlinky.awsSdk.awsSdkStrings.`13Dot5`
    - typingsSlinky.awsSdk.awsSdkStrings.`28Dot4`
    - typingsSlinky.awsSdk.awsSdkStrings.`58Dot2`
    - typingsSlinky.awsSdk.awsSdkStrings.`118`
    - typingsSlinky.awsSdk.awsSdkStrings.`237`
    - java.lang.String
  */
  type CacheClusterSize = typingsSlinky.awsSdk.apigatewayMod._CacheClusterSize | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.FLUSH_IN_PROGRESS
    - java.lang.String
  */
  type CacheClusterStatus = typingsSlinky.awsSdk.apigatewayMod._CacheClusterStatus | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.apigatewayMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNET
    - typingsSlinky.awsSdk.awsSdkStrings.VPC_LINK
    - java.lang.String
  */
  type ConnectionType = typingsSlinky.awsSdk.apigatewayMod._ConnectionType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONVERT_TO_BINARY
    - typingsSlinky.awsSdk.awsSdkStrings.CONVERT_TO_TEXT
    - java.lang.String
  */
  type ContentHandlingStrategy = typingsSlinky.awsSdk.apigatewayMod._ContentHandlingStrategy | java.lang.String
  
  type DocumentationPartLocationStatusCode = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.API
    - typingsSlinky.awsSdk.awsSdkStrings.AUTHORIZER
    - typingsSlinky.awsSdk.awsSdkStrings.MODEL
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE
    - typingsSlinky.awsSdk.awsSdkStrings.METHOD
    - typingsSlinky.awsSdk.awsSdkStrings.PATH_PARAMETER
    - typingsSlinky.awsSdk.awsSdkStrings.QUERY_PARAMETER
    - typingsSlinky.awsSdk.awsSdkStrings.REQUEST_HEADER
    - typingsSlinky.awsSdk.awsSdkStrings.REQUEST_BODY
    - typingsSlinky.awsSdk.awsSdkStrings.RESPONSE
    - typingsSlinky.awsSdk.awsSdkStrings.RESPONSE_HEADER
    - typingsSlinky.awsSdk.awsSdkStrings.RESPONSE_BODY
    - java.lang.String
  */
  type DocumentationPartType = typingsSlinky.awsSdk.apigatewayMod._DocumentationPartType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type DomainNameStatus = typingsSlinky.awsSdk.apigatewayMod._DomainNameStatus | java.lang.String
  
  type Double = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REGIONAL
    - typingsSlinky.awsSdk.awsSdkStrings.EDGE
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type EndpointType = typingsSlinky.awsSdk.apigatewayMod._EndpointType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_4XX
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_5XX
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.UNAUTHORIZED
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_API_KEY
    - typingsSlinky.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.AUTHORIZER_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.AUTHORIZER_CONFIGURATION_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_SIGNATURE
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED_TOKEN
    - typingsSlinky.awsSdk.awsSdkStrings.MISSING_AUTHENTICATION_TOKEN
    - typingsSlinky.awsSdk.awsSdkStrings.INTEGRATION_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.INTEGRATION_TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.API_CONFIGURATION_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.UNSUPPORTED_MEDIA_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.BAD_REQUEST_PARAMETERS
    - typingsSlinky.awsSdk.awsSdkStrings.BAD_REQUEST_BODY
    - typingsSlinky.awsSdk.awsSdkStrings.REQUEST_TOO_LARGE
    - typingsSlinky.awsSdk.awsSdkStrings.THROTTLED
    - typingsSlinky.awsSdk.awsSdkStrings.QUOTA_EXCEEDED
    - java.lang.String
  */
  type GatewayResponseType = typingsSlinky.awsSdk.apigatewayMod._GatewayResponseType | java.lang.String
  
  type Integer = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - typingsSlinky.awsSdk.awsSdkStrings.AWS
    - typingsSlinky.awsSdk.awsSdkStrings.MOCK
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP_PROXY
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_PROXY
    - java.lang.String
  */
  type IntegrationType = typingsSlinky.awsSdk.apigatewayMod._IntegrationType | java.lang.String
  
  type ListOfARNs = js.Array[typingsSlinky.awsSdk.apigatewayMod.ProviderARN]
  
  type ListOfApiKey = js.Array[typingsSlinky.awsSdk.apigatewayMod.ApiKey]
  
  type ListOfApiStage = js.Array[typingsSlinky.awsSdk.apigatewayMod.ApiStage]
  
  type ListOfAuthorizer = js.Array[typingsSlinky.awsSdk.apigatewayMod.Authorizer]
  
  type ListOfBasePathMapping = js.Array[typingsSlinky.awsSdk.apigatewayMod.BasePathMapping]
  
  type ListOfClientCertificate = js.Array[typingsSlinky.awsSdk.apigatewayMod.ClientCertificate]
  
  type ListOfDeployment = js.Array[typingsSlinky.awsSdk.apigatewayMod.Deployment]
  
  type ListOfDocumentationPart = js.Array[typingsSlinky.awsSdk.apigatewayMod.DocumentationPart]
  
  type ListOfDocumentationVersion = js.Array[typingsSlinky.awsSdk.apigatewayMod.DocumentationVersion]
  
  type ListOfDomainName = js.Array[typingsSlinky.awsSdk.apigatewayMod.DomainName]
  
  type ListOfEndpointType = js.Array[typingsSlinky.awsSdk.apigatewayMod.EndpointType]
  
  type ListOfGatewayResponse = js.Array[typingsSlinky.awsSdk.apigatewayMod.GatewayResponse]
  
  type ListOfLong = js.Array[typingsSlinky.awsSdk.apigatewayMod.Long]
  
  type ListOfModel = js.Array[typingsSlinky.awsSdk.apigatewayMod.Model]
  
  type ListOfPatchOperation = js.Array[typingsSlinky.awsSdk.apigatewayMod.PatchOperation]
  
  type ListOfRequestValidator = js.Array[typingsSlinky.awsSdk.apigatewayMod.RequestValidator]
  
  type ListOfResource = js.Array[typingsSlinky.awsSdk.apigatewayMod.Resource]
  
  type ListOfRestApi = js.Array[typingsSlinky.awsSdk.apigatewayMod.RestApi]
  
  type ListOfSdkConfigurationProperty = js.Array[typingsSlinky.awsSdk.apigatewayMod.SdkConfigurationProperty]
  
  type ListOfSdkType = js.Array[typingsSlinky.awsSdk.apigatewayMod.SdkType]
  
  type ListOfStage = js.Array[typingsSlinky.awsSdk.apigatewayMod.Stage]
  
  type ListOfStageKeys = js.Array[typingsSlinky.awsSdk.apigatewayMod.StageKey]
  
  type ListOfString = js.Array[typingsSlinky.awsSdk.apigatewayMod.String]
  
  type ListOfUsage = js.Array[typingsSlinky.awsSdk.apigatewayMod.ListOfLong]
  
  type ListOfUsagePlan = js.Array[typingsSlinky.awsSdk.apigatewayMod.UsagePlan]
  
  type ListOfUsagePlanKey = js.Array[typingsSlinky.awsSdk.apigatewayMod.UsagePlanKey]
  
  type ListOfVpcLink = js.Array[typingsSlinky.awsSdk.apigatewayMod.VpcLink]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENTED
    - typingsSlinky.awsSdk.awsSdkStrings.UNDOCUMENTED
    - java.lang.String
  */
  type LocationStatusType = typingsSlinky.awsSdk.apigatewayMod._LocationStatusType | java.lang.String
  
  type Long = scala.Double
  
  type MapOfApiStageThrottleSettings = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.ThrottleSettings]
  
  type MapOfIntegrationResponse = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.IntegrationResponse]
  
  type MapOfKeyUsages = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.ListOfUsage]
  
  type MapOfMethod = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.Method]
  
  type MapOfMethodResponse = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.MethodResponse]
  
  type MapOfMethodSettings = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.MethodSetting]
  
  type MapOfMethodSnapshot = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.MethodSnapshot]
  
  type MapOfStringToBoolean = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.NullableBoolean]
  
  type MapOfStringToList = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.ListOfString]
  
  type MapOfStringToString = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.String]
  
  type NullableBoolean = scala.Boolean
  
  type NullableInteger = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.add__
    - typingsSlinky.awsSdk.awsSdkStrings.remove__
    - typingsSlinky.awsSdk.awsSdkStrings.replace_
    - typingsSlinky.awsSdk.awsSdkStrings.move
    - typingsSlinky.awsSdk.awsSdkStrings.copy_
    - typingsSlinky.awsSdk.awsSdkStrings.test__
    - java.lang.String
  */
  type Op = typingsSlinky.awsSdk.apigatewayMod._Op | java.lang.String
  
  type PathToMapOfMethodSnapshot = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayMod.MapOfMethodSnapshot]
  
  type ProviderARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.merge_
    - typingsSlinky.awsSdk.awsSdkStrings.overwrite_
    - java.lang.String
  */
  type PutMode = typingsSlinky.awsSdk.apigatewayMod._PutMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DAY
    - typingsSlinky.awsSdk.awsSdkStrings.WEEK
    - typingsSlinky.awsSdk.awsSdkStrings.MONTH
    - java.lang.String
  */
  type QuotaPeriodType = typingsSlinky.awsSdk.apigatewayMod._QuotaPeriodType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TLS_1_0
    - typingsSlinky.awsSdk.awsSdkStrings.TLS_1_2
    - java.lang.String
  */
  type SecurityPolicy = typingsSlinky.awsSdk.apigatewayMod._SecurityPolicy | java.lang.String
  
  type StatusCode = java.lang.String
  
  type String = java.lang.String
  
  type Timestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FAIL_WITH_403
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEED_WITH_RESPONSE_HEADER
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEED_WITHOUT_RESPONSE_HEADER
    - java.lang.String
  */
  type UnauthorizedCacheControlHeaderStrategy = typingsSlinky.awsSdk.apigatewayMod._UnauthorizedCacheControlHeaderStrategy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type VpcLinkStatus = typingsSlinky.awsSdk.apigatewayMod._VpcLinkStatus | java.lang.String
  
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.apigatewayMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-07-09`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.apigatewayMod._apiVersion | java.lang.String
}
