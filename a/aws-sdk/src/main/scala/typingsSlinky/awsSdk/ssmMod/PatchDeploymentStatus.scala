package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.APPROVED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_APPROVAL
  - typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_APPROVED
  - typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_REJECTED
  - java.lang.String
*/
trait PatchDeploymentStatus extends js.Object

object PatchDeploymentStatus {
  @scala.inline
  def APPROVED: typingsSlinky.awsSdk.awsSdkStrings.APPROVED = "APPROVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.APPROVED]
  @scala.inline
  def PENDING_APPROVAL: typingsSlinky.awsSdk.awsSdkStrings.PENDING_APPROVAL = "PENDING_APPROVAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_APPROVAL]
  @scala.inline
  def EXPLICIT_APPROVED: typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_APPROVED = "EXPLICIT_APPROVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_APPROVED]
  @scala.inline
  def EXPLICIT_REJECTED: typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_REJECTED = "EXPLICIT_REJECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_REJECTED]
  @scala.inline
  implicit def apply(value: java.lang.String): PatchDeploymentStatus = value.asInstanceOf[PatchDeploymentStatus]
}

