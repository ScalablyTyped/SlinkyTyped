package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
trait ApplicationStatus extends js.Object

object ApplicationStatus {
  @scala.inline
  def NOT_STARTED: typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED = "NOT_STARTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  implicit def apply(value: String): ApplicationStatus = value.asInstanceOf[ApplicationStatus]
}

