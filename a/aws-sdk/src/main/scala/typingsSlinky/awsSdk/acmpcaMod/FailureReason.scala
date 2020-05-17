package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.REQUEST_TIMED_OUT
  - typingsSlinky.awsSdk.awsSdkStrings.UNSUPPORTED_ALGORITHM
  - typingsSlinky.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
trait FailureReason extends js.Object

object FailureReason {
  @scala.inline
  def REQUEST_TIMED_OUT: typingsSlinky.awsSdk.awsSdkStrings.REQUEST_TIMED_OUT = "REQUEST_TIMED_OUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REQUEST_TIMED_OUT]
  @scala.inline
  def UNSUPPORTED_ALGORITHM: typingsSlinky.awsSdk.awsSdkStrings.UNSUPPORTED_ALGORITHM = "UNSUPPORTED_ALGORITHM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNSUPPORTED_ALGORITHM]
  @scala.inline
  def OTHER: typingsSlinky.awsSdk.awsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OTHER]
  @scala.inline
  implicit def apply(value: java.lang.String): FailureReason = value.asInstanceOf[FailureReason]
}

