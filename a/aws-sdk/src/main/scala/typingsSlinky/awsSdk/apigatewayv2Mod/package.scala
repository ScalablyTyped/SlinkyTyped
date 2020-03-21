package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apigatewayv2Mod {
  type Arn = java.lang.String
  type AuthorizationScopes = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And64]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_IAM
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM
    - typingsSlinky.awsSdk.awsSdkStrings.JWT
    - java.lang.String
  */
  type AuthorizationType = typingsSlinky.awsSdk.apigatewayv2Mod._AuthorizationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REQUEST
    - typingsSlinky.awsSdk.awsSdkStrings.JWT
    - java.lang.String
  */
  type AuthorizerType = typingsSlinky.awsSdk.apigatewayv2Mod._AuthorizerType | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.apigatewayv2Mod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNET
    - typingsSlinky.awsSdk.awsSdkStrings.VPC_LINK
    - java.lang.String
  */
  type ConnectionType = typingsSlinky.awsSdk.apigatewayv2Mod._ConnectionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONVERT_TO_BINARY
    - typingsSlinky.awsSdk.awsSdkStrings.CONVERT_TO_TEXT
    - java.lang.String
  */
  type ContentHandlingStrategy = typingsSlinky.awsSdk.apigatewayv2Mod._ContentHandlingStrategy | java.lang.String
  type CorsHeaderList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.string]
  type CorsMethodList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And64]
  type CorsOriginList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.string]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYED
    - java.lang.String
  */
  type DeploymentStatus = typingsSlinky.awsSdk.apigatewayv2Mod._DeploymentStatus | java.lang.String
  type DomainNameConfigurations = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.DomainNameConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type DomainNameStatus = typingsSlinky.awsSdk.apigatewayv2Mod._DomainNameStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REGIONAL
    - typingsSlinky.awsSdk.awsSdkStrings.EDGE
    - java.lang.String
  */
  type EndpointType = typingsSlinky.awsSdk.apigatewayv2Mod._EndpointType | java.lang.String
  type Id = java.lang.String
  type IdentitySourceList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.string]
  type IntegerWithLengthBetween0And3600 = scala.Double
  type IntegerWithLengthBetween50And29000 = scala.Double
  type IntegerWithLengthBetweenMinus1And86400 = scala.Double
  type IntegrationParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And512]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - typingsSlinky.awsSdk.awsSdkStrings.MOCK
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP_PROXY
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_PROXY
    - java.lang.String
  */
  type IntegrationType = typingsSlinky.awsSdk.apigatewayv2Mod._IntegrationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - typingsSlinky.awsSdk.awsSdkStrings.false__
    - java.lang.String
  */
  type LoggingLevel = typingsSlinky.awsSdk.apigatewayv2Mod._LoggingLevel | java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WHEN_NO_MATCH
    - typingsSlinky.awsSdk.awsSdkStrings.NEVER
    - typingsSlinky.awsSdk.awsSdkStrings.WHEN_NO_TEMPLATES
    - java.lang.String
  */
  type PassthroughBehavior = typingsSlinky.awsSdk.apigatewayv2Mod._PassthroughBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WEBSOCKET
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type ProtocolType = typingsSlinky.awsSdk.apigatewayv2Mod._ProtocolType | java.lang.String
  type RouteModels = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And128]
  type RouteParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.ParameterConstraints]
  type RouteSettingsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.RouteSettings]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TLS_1_0
    - typingsSlinky.awsSdk.awsSdkStrings.TLS_1_2
    - java.lang.String
  */
  type SecurityPolicy = typingsSlinky.awsSdk.apigatewayv2Mod._SecurityPolicy | java.lang.String
  type SelectionExpression = java.lang.String
  type SelectionKey = java.lang.String
  type StageVariablesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween0And2048]
  type StringWithLengthBetween0And1024 = java.lang.String
  type StringWithLengthBetween0And2048 = java.lang.String
  type StringWithLengthBetween0And32K = java.lang.String
  type StringWithLengthBetween1And1024 = java.lang.String
  type StringWithLengthBetween1And128 = java.lang.String
  type StringWithLengthBetween1And1600 = java.lang.String
  type StringWithLengthBetween1And256 = java.lang.String
  type StringWithLengthBetween1And512 = java.lang.String
  type StringWithLengthBetween1And64 = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And1600]
  type TemplateMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween0And32K]
  type UriWithLengthBetween1And2048 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-29`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.apigatewayv2Mod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type double = scala.Double
  type integer = scala.Double
  type listOfApi = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.Api]
  type listOfApiMapping = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.ApiMapping]
  type listOfAuthorizer = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.Authorizer]
  type listOfDeployment = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.Deployment]
  type listOfDomainName = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.DomainName]
  type listOfIntegration = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.Integration]
  type listOfIntegrationResponse = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.IntegrationResponse]
  type listOfModel = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.Model]
  type listOfRoute = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.Route]
  type listOfRouteResponse = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.RouteResponse]
  type listOfStage = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.Stage]
  type listOfString = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.string]
  type string = java.lang.String
  type timestampIso8601 = js.Date
}
