package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_UPDATE
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_ELIGIBLE
  - typingsSlinky.awsSdk.awsSdkStrings.ELIGIBLE
  - java.lang.String
*/
trait DeploymentStatus extends js.Object

object DeploymentStatus {
  @scala.inline
  def PENDING_UPDATE: typingsSlinky.awsSdk.awsSdkStrings.PENDING_UPDATE = "PENDING_UPDATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_UPDATE]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def NOT_ELIGIBLE: typingsSlinky.awsSdk.awsSdkStrings.NOT_ELIGIBLE = "NOT_ELIGIBLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_ELIGIBLE]
  @scala.inline
  def ELIGIBLE: typingsSlinky.awsSdk.awsSdkStrings.ELIGIBLE = "ELIGIBLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ELIGIBLE]
  @scala.inline
  implicit def apply(value: java.lang.String): DeploymentStatus = value.asInstanceOf[DeploymentStatus]
}

