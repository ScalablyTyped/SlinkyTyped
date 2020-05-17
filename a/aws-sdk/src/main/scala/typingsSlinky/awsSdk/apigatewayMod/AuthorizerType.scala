package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TOKEN
  - typingsSlinky.awsSdk.awsSdkStrings.REQUEST
  - typingsSlinky.awsSdk.awsSdkStrings.COGNITO_USER_POOLS
  - java.lang.String
*/
trait AuthorizerType extends js.Object

object AuthorizerType {
  @scala.inline
  def TOKEN: typingsSlinky.awsSdk.awsSdkStrings.TOKEN = "TOKEN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TOKEN]
  @scala.inline
  def REQUEST: typingsSlinky.awsSdk.awsSdkStrings.REQUEST = "REQUEST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REQUEST]
  @scala.inline
  def COGNITO_USER_POOLS: typingsSlinky.awsSdk.awsSdkStrings.COGNITO_USER_POOLS = "COGNITO_USER_POOLS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COGNITO_USER_POOLS]
  @scala.inline
  implicit def apply(value: java.lang.String): AuthorizerType = value.asInstanceOf[AuthorizerType]
}

