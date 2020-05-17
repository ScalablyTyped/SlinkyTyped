package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SSO
  - typingsSlinky.awsSdk.awsSdkStrings.IAM
  - java.lang.String
*/
trait AuthMode extends js.Object

object AuthMode {
  @scala.inline
  def SSO: typingsSlinky.awsSdk.awsSdkStrings.SSO = "SSO".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SSO]
  @scala.inline
  def IAM: typingsSlinky.awsSdk.awsSdkStrings.IAM = "IAM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IAM]
  @scala.inline
  implicit def apply(value: java.lang.String): AuthMode = value.asInstanceOf[AuthMode]
}

