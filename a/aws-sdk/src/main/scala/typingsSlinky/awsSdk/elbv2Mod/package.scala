package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elbv2Mod {
  type ActionOrder = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.forward__
    - typingsSlinky.awsSdk.awsSdkStrings.`authenticate-oidc`
    - typingsSlinky.awsSdk.awsSdkStrings.`authenticate-cognito`
    - typingsSlinky.awsSdk.awsSdkStrings.redirect
    - typingsSlinky.awsSdk.awsSdkStrings.`fixed-response`
    - java.lang.String
  */
  type ActionTypeEnum = typingsSlinky.awsSdk.elbv2Mod._ActionTypeEnum | java.lang.String
  type Actions = js.Array[typingsSlinky.awsSdk.elbv2Mod.Action]
  type AllocationId = java.lang.String
  type AlpnPolicyName = js.Array[typingsSlinky.awsSdk.elbv2Mod.AlpnPolicyValue]
  type AlpnPolicyValue = java.lang.String
  type AuthenticateCognitoActionAuthenticationRequestExtraParams = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.awsSdk.elbv2Mod.AuthenticateCognitoActionAuthenticationRequestParamValue
  ]
  type AuthenticateCognitoActionAuthenticationRequestParamName = java.lang.String
  type AuthenticateCognitoActionAuthenticationRequestParamValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.deny__
    - typingsSlinky.awsSdk.awsSdkStrings.allow__
    - typingsSlinky.awsSdk.awsSdkStrings.authenticate
    - java.lang.String
  */
  type AuthenticateCognitoActionConditionalBehaviorEnum = typingsSlinky.awsSdk.elbv2Mod._AuthenticateCognitoActionConditionalBehaviorEnum | java.lang.String
  type AuthenticateCognitoActionScope = java.lang.String
  type AuthenticateCognitoActionSessionCookieName = java.lang.String
  type AuthenticateCognitoActionSessionTimeout = scala.Double
  type AuthenticateCognitoActionUserPoolArn = java.lang.String
  type AuthenticateCognitoActionUserPoolClientId = java.lang.String
  type AuthenticateCognitoActionUserPoolDomain = java.lang.String
  type AuthenticateOidcActionAuthenticationRequestExtraParams = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.awsSdk.elbv2Mod.AuthenticateOidcActionAuthenticationRequestParamValue
  ]
  type AuthenticateOidcActionAuthenticationRequestParamName = java.lang.String
  type AuthenticateOidcActionAuthenticationRequestParamValue = java.lang.String
  type AuthenticateOidcActionAuthorizationEndpoint = java.lang.String
  type AuthenticateOidcActionClientId = java.lang.String
  type AuthenticateOidcActionClientSecret = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.deny__
    - typingsSlinky.awsSdk.awsSdkStrings.allow__
    - typingsSlinky.awsSdk.awsSdkStrings.authenticate
    - java.lang.String
  */
  type AuthenticateOidcActionConditionalBehaviorEnum = typingsSlinky.awsSdk.elbv2Mod._AuthenticateOidcActionConditionalBehaviorEnum | java.lang.String
  type AuthenticateOidcActionIssuer = java.lang.String
  type AuthenticateOidcActionScope = java.lang.String
  type AuthenticateOidcActionSessionCookieName = java.lang.String
  type AuthenticateOidcActionSessionTimeout = scala.Double
  type AuthenticateOidcActionTokenEndpoint = java.lang.String
  type AuthenticateOidcActionUseExistingClientSecret = scala.Boolean
  type AuthenticateOidcActionUserInfoEndpoint = java.lang.String
  type AvailabilityZones = js.Array[typingsSlinky.awsSdk.elbv2Mod.AvailabilityZone]
  type CanonicalHostedZoneId = java.lang.String
  type CertificateArn = java.lang.String
  type CertificateList = js.Array[typingsSlinky.awsSdk.elbv2Mod.Certificate]
  type CipherName = java.lang.String
  type CipherPriority = scala.Double
  type Ciphers = js.Array[typingsSlinky.awsSdk.elbv2Mod.Cipher]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.elbv2Mod.ClientApiVersions
  type ConditionFieldName = java.lang.String
  type CreatedTime = js.Date
  type DNSName = java.lang.String
  type Default = scala.Boolean
  type Description = java.lang.String
  type FixedResponseActionContentType = java.lang.String
  type FixedResponseActionMessage = java.lang.String
  type FixedResponseActionStatusCode = java.lang.String
  type HealthCheckEnabled = scala.Boolean
  type HealthCheckIntervalSeconds = scala.Double
  type HealthCheckPort = java.lang.String
  type HealthCheckThresholdCount = scala.Double
  type HealthCheckTimeoutSeconds = scala.Double
  type HttpCode = java.lang.String
  type HttpHeaderConditionName = java.lang.String
  type IpAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ipv4_
    - typingsSlinky.awsSdk.awsSdkStrings.dualstack
    - java.lang.String
  */
  type IpAddressType = typingsSlinky.awsSdk.elbv2Mod._IpAddressType | java.lang.String
  type IsDefault = scala.Boolean
  type Limits = js.Array[typingsSlinky.awsSdk.elbv2Mod.Limit]
  type ListOfString = js.Array[typingsSlinky.awsSdk.elbv2Mod.StringValue]
  type ListenerArn = java.lang.String
  type ListenerArns = js.Array[typingsSlinky.awsSdk.elbv2Mod.ListenerArn]
  type Listeners = js.Array[typingsSlinky.awsSdk.elbv2Mod.Listener]
  type LoadBalancerAddresses = js.Array[typingsSlinky.awsSdk.elbv2Mod.LoadBalancerAddress]
  type LoadBalancerArn = java.lang.String
  type LoadBalancerArns = js.Array[typingsSlinky.awsSdk.elbv2Mod.LoadBalancerArn]
  type LoadBalancerAttributeKey = java.lang.String
  type LoadBalancerAttributeValue = java.lang.String
  type LoadBalancerAttributes = js.Array[typingsSlinky.awsSdk.elbv2Mod.LoadBalancerAttribute]
  type LoadBalancerName = java.lang.String
  type LoadBalancerNames = js.Array[typingsSlinky.awsSdk.elbv2Mod.LoadBalancerName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`internet-facing`
    - typingsSlinky.awsSdk.awsSdkStrings.internal_
    - java.lang.String
  */
  type LoadBalancerSchemeEnum = typingsSlinky.awsSdk.elbv2Mod._LoadBalancerSchemeEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.provisioning_
    - typingsSlinky.awsSdk.awsSdkStrings.active_impaired
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type LoadBalancerStateEnum = typingsSlinky.awsSdk.elbv2Mod._LoadBalancerStateEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.application_
    - typingsSlinky.awsSdk.awsSdkStrings.network_
    - java.lang.String
  */
  type LoadBalancerTypeEnum = typingsSlinky.awsSdk.elbv2Mod._LoadBalancerTypeEnum | java.lang.String
  type LoadBalancers = js.Array[typingsSlinky.awsSdk.elbv2Mod.LoadBalancer]
  type Marker = java.lang.String
  type Max = java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type Path = java.lang.String
  type Port = scala.Double
  type PrivateIPv4Address = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
    - typingsSlinky.awsSdk.awsSdkStrings.TCP
    - typingsSlinky.awsSdk.awsSdkStrings.TLS
    - typingsSlinky.awsSdk.awsSdkStrings.UDP
    - typingsSlinky.awsSdk.awsSdkStrings.TCP_UDP
    - java.lang.String
  */
  type ProtocolEnum = typingsSlinky.awsSdk.elbv2Mod._ProtocolEnum | java.lang.String
  type QueryStringKeyValuePairList = js.Array[typingsSlinky.awsSdk.elbv2Mod.QueryStringKeyValuePair]
  type RedirectActionHost = java.lang.String
  type RedirectActionPath = java.lang.String
  type RedirectActionPort = java.lang.String
  type RedirectActionProtocol = java.lang.String
  type RedirectActionQuery = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP_301
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP_302
    - java.lang.String
  */
  type RedirectActionStatusCodeEnum = typingsSlinky.awsSdk.elbv2Mod._RedirectActionStatusCodeEnum | java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArns = js.Array[typingsSlinky.awsSdk.elbv2Mod.ResourceArn]
  type RuleArn = java.lang.String
  type RuleArns = js.Array[typingsSlinky.awsSdk.elbv2Mod.RuleArn]
  type RuleConditionList = js.Array[typingsSlinky.awsSdk.elbv2Mod.RuleCondition]
  type RulePriority = scala.Double
  type RulePriorityList = js.Array[typingsSlinky.awsSdk.elbv2Mod.RulePriorityPair]
  type Rules = js.Array[typingsSlinky.awsSdk.elbv2Mod.Rule]
  type SecurityGroupId = java.lang.String
  type SecurityGroups = js.Array[typingsSlinky.awsSdk.elbv2Mod.SecurityGroupId]
  type SslPolicies = js.Array[typingsSlinky.awsSdk.elbv2Mod.SslPolicy]
  type SslPolicyName = java.lang.String
  type SslPolicyNames = js.Array[typingsSlinky.awsSdk.elbv2Mod.SslPolicyName]
  type SslProtocol = java.lang.String
  type SslProtocols = js.Array[typingsSlinky.awsSdk.elbv2Mod.SslProtocol]
  type StateReason = java.lang.String
  type String = java.lang.String
  type StringValue = java.lang.String
  type SubnetId = java.lang.String
  type SubnetMappings = js.Array[typingsSlinky.awsSdk.elbv2Mod.SubnetMapping]
  type Subnets = js.Array[typingsSlinky.awsSdk.elbv2Mod.SubnetId]
  type TagDescriptions = js.Array[typingsSlinky.awsSdk.elbv2Mod.TagDescription]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsSlinky.awsSdk.elbv2Mod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.elbv2Mod.Tag]
  type TagValue = java.lang.String
  type TargetDescriptions = js.Array[typingsSlinky.awsSdk.elbv2Mod.TargetDescription]
  type TargetGroupArn = java.lang.String
  type TargetGroupArns = js.Array[typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn]
  type TargetGroupAttributeKey = java.lang.String
  type TargetGroupAttributeValue = java.lang.String
  type TargetGroupAttributes = js.Array[typingsSlinky.awsSdk.elbv2Mod.TargetGroupAttribute]
  type TargetGroupList = js.Array[typingsSlinky.awsSdk.elbv2Mod.TargetGroupTuple]
  type TargetGroupName = java.lang.String
  type TargetGroupNames = js.Array[typingsSlinky.awsSdk.elbv2Mod.TargetGroupName]
  type TargetGroupStickinessDurationSeconds = scala.Double
  type TargetGroupStickinessEnabled = scala.Boolean
  type TargetGroupWeight = scala.Double
  type TargetGroups = js.Array[typingsSlinky.awsSdk.elbv2Mod.TargetGroup]
  type TargetHealthDescriptions = js.Array[typingsSlinky.awsSdk.elbv2Mod.TargetHealthDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ElbDotRegistrationInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.ElbDotInitialHealthChecking
    - typingsSlinky.awsSdk.awsSdkStrings.TargetDotResponseCodeMismatch
    - typingsSlinky.awsSdk.awsSdkStrings.TargetDotTimeout
    - typingsSlinky.awsSdk.awsSdkStrings.TargetDotFailedHealthChecks
    - typingsSlinky.awsSdk.awsSdkStrings.TargetDotNotRegistered
    - typingsSlinky.awsSdk.awsSdkStrings.TargetDotNotInUse
    - typingsSlinky.awsSdk.awsSdkStrings.TargetDotDeregistrationInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.TargetDotInvalidState
    - typingsSlinky.awsSdk.awsSdkStrings.TargetDotIpUnusable
    - typingsSlinky.awsSdk.awsSdkStrings.TargetDotHealthCheckDisabled
    - typingsSlinky.awsSdk.awsSdkStrings.ElbDotInternalError
    - java.lang.String
  */
  type TargetHealthReasonEnum = typingsSlinky.awsSdk.elbv2Mod._TargetHealthReasonEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.initial_
    - typingsSlinky.awsSdk.awsSdkStrings.healthy__
    - typingsSlinky.awsSdk.awsSdkStrings.unhealthy__
    - typingsSlinky.awsSdk.awsSdkStrings.unused
    - typingsSlinky.awsSdk.awsSdkStrings.draining_
    - typingsSlinky.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type TargetHealthStateEnum = typingsSlinky.awsSdk.elbv2Mod._TargetHealthStateEnum | java.lang.String
  type TargetId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.instance__
    - typingsSlinky.awsSdk.awsSdkStrings.ip_
    - typingsSlinky.awsSdk.awsSdkStrings.lambda__
    - java.lang.String
  */
  type TargetTypeEnum = typingsSlinky.awsSdk.elbv2Mod._TargetTypeEnum | java.lang.String
  type VpcId = java.lang.String
  type ZoneName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-12-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.elbv2Mod._apiVersion | java.lang.String
}
