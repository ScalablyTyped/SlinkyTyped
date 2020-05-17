package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ALLOWED
  - typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_DENY
  - typingsSlinky.awsSdk.awsSdkStrings.IMPLICIT_DENY
  - java.lang.String
*/
trait AuthDecision extends js.Object

object AuthDecision {
  @scala.inline
  def ALLOWED: typingsSlinky.awsSdk.awsSdkStrings.ALLOWED = "ALLOWED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALLOWED]
  @scala.inline
  def EXPLICIT_DENY: typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_DENY = "EXPLICIT_DENY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_DENY]
  @scala.inline
  def IMPLICIT_DENY: typingsSlinky.awsSdk.awsSdkStrings.IMPLICIT_DENY = "IMPLICIT_DENY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IMPLICIT_DENY]
  @scala.inline
  implicit def apply(value: java.lang.String): AuthDecision = value.asInstanceOf[AuthDecision]
}

