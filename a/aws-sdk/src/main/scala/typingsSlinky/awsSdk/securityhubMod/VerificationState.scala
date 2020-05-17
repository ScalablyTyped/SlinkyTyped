package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
  - typingsSlinky.awsSdk.awsSdkStrings.TRUE_POSITIVE
  - typingsSlinky.awsSdk.awsSdkStrings.FALSE_POSITIVE
  - typingsSlinky.awsSdk.awsSdkStrings.BENIGN_POSITIVE
  - java.lang.String
*/
trait VerificationState extends js.Object

object VerificationState {
  @scala.inline
  def UNKNOWN: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN]
  @scala.inline
  def TRUE_POSITIVE: typingsSlinky.awsSdk.awsSdkStrings.TRUE_POSITIVE = "TRUE_POSITIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRUE_POSITIVE]
  @scala.inline
  def FALSE_POSITIVE: typingsSlinky.awsSdk.awsSdkStrings.FALSE_POSITIVE = "FALSE_POSITIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FALSE_POSITIVE]
  @scala.inline
  def BENIGN_POSITIVE: typingsSlinky.awsSdk.awsSdkStrings.BENIGN_POSITIVE = "BENIGN_POSITIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BENIGN_POSITIVE]
  @scala.inline
  implicit def apply(value: String): VerificationState = value.asInstanceOf[VerificationState]
}

