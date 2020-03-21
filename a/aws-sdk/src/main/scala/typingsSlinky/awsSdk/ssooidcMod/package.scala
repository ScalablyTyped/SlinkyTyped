package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ssooidcMod {
  type AccessToken = java.lang.String
  type AuthCode = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ssooidcMod.ClientApiVersions
  type ClientId = java.lang.String
  type ClientName = java.lang.String
  type ClientSecret = java.lang.String
  type ClientType = java.lang.String
  type DeviceCode = java.lang.String
  type ExpirationInSeconds = scala.Double
  type GrantType = java.lang.String
  type IdToken = java.lang.String
  type IntervalInSeconds = scala.Double
  type LongTimeStampType = scala.Double
  type RefreshToken = java.lang.String
  type Scope = java.lang.String
  type Scopes = js.Array[typingsSlinky.awsSdk.ssooidcMod.Scope]
  type TokenType = java.lang.String
  type URI = java.lang.String
  type UserCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-06-10`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ssooidcMod._apiVersion | java.lang.String
}
