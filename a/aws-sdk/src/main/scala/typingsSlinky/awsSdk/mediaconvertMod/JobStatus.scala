package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
  - typingsSlinky.awsSdk.awsSdkStrings.PROGRESSING
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def SUBMITTED: typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED]
  @scala.inline
  def PROGRESSING: typingsSlinky.awsSdk.awsSdkStrings.PROGRESSING = "PROGRESSING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROGRESSING]
  @scala.inline
  def COMPLETE: typingsSlinky.awsSdk.awsSdkStrings.COMPLETE = "COMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETE]
  @scala.inline
  def CANCELED: typingsSlinky.awsSdk.awsSdkStrings.CANCELED = "CANCELED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELED]
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  implicit def apply(value: String): JobStatus = value.asInstanceOf[JobStatus]
}

