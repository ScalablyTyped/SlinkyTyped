package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apigatewayv2Mod {
  type Arn = java.lang.String
  type AuthorizationScopes = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And64]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.apigatewayv2Mod.ClientApiVersions
  type CorsHeaderList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.string]
  type CorsMethodList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And64]
  type CorsOriginList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.string]
  type DomainNameConfigurations = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.DomainNameConfiguration]
  type Id = java.lang.String
  type IdentitySourceList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.string]
  type IntegerWithLengthBetween0And3600 = scala.Double
  type IntegerWithLengthBetween50And29000 = scala.Double
  type IntegerWithLengthBetweenMinus1And86400 = scala.Double
  type IntegrationParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And512]
  type NextToken = java.lang.String
  type RouteModels = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And128]
  type RouteParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.ParameterConstraints]
  type RouteSettingsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.RouteSettings]
  type SecurityGroupIdList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.string]
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
  type SubnetIdList = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.string]
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And1600]
  type TemplateMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.apigatewayv2Mod.StringWithLengthBetween0And32K]
  type UriWithLengthBetween1And2048 = java.lang.String
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
  type listOfVpcLink = js.Array[typingsSlinky.awsSdk.apigatewayv2Mod.VpcLink]
  type string = java.lang.String
  type timestampIso8601 = js.Date
}
