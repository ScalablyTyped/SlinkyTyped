package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cognitoidentityMod {
  type ARNString = java.lang.String
  type AccessKeyString = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AuthenticatedRole
    - typingsSlinky.awsSdk.awsSdkStrings.Deny_
    - java.lang.String
  */
  type AmbiguousRoleResolutionType = typingsSlinky.awsSdk.cognitoidentityMod._AmbiguousRoleResolutionType | java.lang.String
  type ClaimName = java.lang.String
  type ClaimValue = java.lang.String
  type ClassicFlow = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cognitoidentityMod.ClientApiVersions
  type CognitoIdentityProviderClientId = java.lang.String
  type CognitoIdentityProviderList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.CognitoIdentityProvider]
  type CognitoIdentityProviderName = java.lang.String
  type CognitoIdentityProviderTokenCheck = scala.Boolean
  type DateType = js.Date
  type DeveloperProviderName = java.lang.String
  type DeveloperUserIdentifier = java.lang.String
  type DeveloperUserIdentifierList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.DeveloperUserIdentifier]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AccessDenied
    - typingsSlinky.awsSdk.awsSdkStrings.InternalServerError
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.cognitoidentityMod._ErrorCode | java.lang.String
  type HideDisabled = scala.Boolean
  type IdentitiesList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.IdentityDescription]
  type IdentityId = java.lang.String
  type IdentityIdList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.IdentityId]
  type IdentityPoolId = java.lang.String
  type IdentityPoolName = java.lang.String
  type IdentityPoolTagsListType = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.TagKeysType]
  type IdentityPoolTagsType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityMod.TagValueType]
  type IdentityPoolUnauthenticated = scala.Boolean
  type IdentityPoolsList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolShortDescription]
  type IdentityProviderId = java.lang.String
  type IdentityProviderName = java.lang.String
  type IdentityProviderToken = java.lang.String
  type IdentityProviders = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityMod.IdentityProviderId]
  type LoginsList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.IdentityProviderName]
  type LoginsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityMod.IdentityProviderToken]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Equals_
    - typingsSlinky.awsSdk.awsSdkStrings.Contains_
    - typingsSlinky.awsSdk.awsSdkStrings.StartsWith
    - typingsSlinky.awsSdk.awsSdkStrings.NotEqual
    - java.lang.String
  */
  type MappingRuleMatchType = typingsSlinky.awsSdk.cognitoidentityMod._MappingRuleMatchType | java.lang.String
  type MappingRulesList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.MappingRule]
  type OIDCProviderList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.ARNString]
  type OIDCToken = java.lang.String
  type PaginationKey = java.lang.String
  type QueryLimit = scala.Double
  type RoleMappingMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityMod.RoleMapping]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Token_
    - typingsSlinky.awsSdk.awsSdkStrings.Rules
    - java.lang.String
  */
  type RoleMappingType = typingsSlinky.awsSdk.cognitoidentityMod._RoleMappingType | java.lang.String
  type RoleType = java.lang.String
  type RolesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityMod.ARNString]
  type SAMLProviderList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.ARNString]
  type SecretKeyString = java.lang.String
  type SessionTokenString = java.lang.String
  type TagKeysType = java.lang.String
  type TagValueType = java.lang.String
  type TokenDuration = scala.Double
  type UnprocessedIdentityIdList = js.Array[typingsSlinky.awsSdk.cognitoidentityMod.UnprocessedIdentityId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-06-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cognitoidentityMod._apiVersion | java.lang.String
}
