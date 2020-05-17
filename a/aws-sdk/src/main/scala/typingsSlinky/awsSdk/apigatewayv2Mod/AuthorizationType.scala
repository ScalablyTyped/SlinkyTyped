package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - typingsSlinky.awsSdk.awsSdkStrings.AWS_IAM
  - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM
  - typingsSlinky.awsSdk.awsSdkStrings.JWT
  - java.lang.String
*/
trait AuthorizationType extends js.Object

object AuthorizationType {
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  def AWS_IAM: typingsSlinky.awsSdk.awsSdkStrings.AWS_IAM = "AWS_IAM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWS_IAM]
  @scala.inline
  def CUSTOM: typingsSlinky.awsSdk.awsSdkStrings.CUSTOM = "CUSTOM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CUSTOM]
  @scala.inline
  def JWT: typingsSlinky.awsSdk.awsSdkStrings.JWT = "JWT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.JWT]
  @scala.inline
  implicit def apply(value: String): AuthorizationType = value.asInstanceOf[AuthorizationType]
}

