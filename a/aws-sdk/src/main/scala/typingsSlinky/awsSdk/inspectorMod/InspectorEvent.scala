package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STARTED
  - typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STATE_CHANGED
  - typingsSlinky.awsSdk.awsSdkStrings.FINDING_REPORTED
  - typingsSlinky.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
trait InspectorEvent extends js.Object

object InspectorEvent {
  @scala.inline
  def ASSESSMENT_RUN_STARTED: typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STARTED = "ASSESSMENT_RUN_STARTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STARTED]
  @scala.inline
  def ASSESSMENT_RUN_COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_COMPLETED = "ASSESSMENT_RUN_COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_COMPLETED]
  @scala.inline
  def ASSESSMENT_RUN_STATE_CHANGED: typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STATE_CHANGED = "ASSESSMENT_RUN_STATE_CHANGED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STATE_CHANGED]
  @scala.inline
  def FINDING_REPORTED: typingsSlinky.awsSdk.awsSdkStrings.FINDING_REPORTED = "FINDING_REPORTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FINDING_REPORTED]
  @scala.inline
  def OTHER: typingsSlinky.awsSdk.awsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OTHER]
  @scala.inline
  implicit def apply(value: String): InspectorEvent = value.asInstanceOf[InspectorEvent]
}

