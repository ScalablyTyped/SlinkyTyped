package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS_IN_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait RecordStatus extends js.Object

object RecordStatus {
  @scala.inline
  def CREATED: typingsSlinky.awsSdk.awsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATED]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def IN_PROGRESS_IN_ERROR: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS_IN_ERROR = "IN_PROGRESS_IN_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS_IN_ERROR]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: String): RecordStatus = value.asInstanceOf[RecordStatus]
}

