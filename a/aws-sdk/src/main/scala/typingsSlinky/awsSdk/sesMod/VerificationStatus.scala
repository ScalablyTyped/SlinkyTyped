package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Pending_
  - typingsSlinky.awsSdk.awsSdkStrings.Success_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - typingsSlinky.awsSdk.awsSdkStrings.TemporaryFailure
  - typingsSlinky.awsSdk.awsSdkStrings.NotStarted
  - java.lang.String
*/
trait VerificationStatus extends js.Object

object VerificationStatus {
  @scala.inline
  def Pending_ : typingsSlinky.awsSdk.awsSdkStrings.Pending_ = "Pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Pending_]
  @scala.inline
  def Success_ : typingsSlinky.awsSdk.awsSdkStrings.Success_ = "Success".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Success_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  def TemporaryFailure: typingsSlinky.awsSdk.awsSdkStrings.TemporaryFailure = "TemporaryFailure".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TemporaryFailure]
  @scala.inline
  def NotStarted: typingsSlinky.awsSdk.awsSdkStrings.NotStarted = "NotStarted".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NotStarted]
  @scala.inline
  implicit def apply(value: String): VerificationStatus = value.asInstanceOf[VerificationStatus]
}

