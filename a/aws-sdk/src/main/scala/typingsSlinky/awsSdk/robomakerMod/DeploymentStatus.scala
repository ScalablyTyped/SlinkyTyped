package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Pending_
  - typingsSlinky.awsSdk.awsSdkStrings.Preparing_
  - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
  - typingsSlinky.awsSdk.awsSdkStrings.Canceled_
  - java.lang.String
*/
trait DeploymentStatus extends js.Object

object DeploymentStatus {
  @scala.inline
  def Pending_ : typingsSlinky.awsSdk.awsSdkStrings.Pending_ = "Pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Pending_]
  @scala.inline
  def Preparing_ : typingsSlinky.awsSdk.awsSdkStrings.Preparing_ = "Preparing".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Preparing_]
  @scala.inline
  def InProgress_ : typingsSlinky.awsSdk.awsSdkStrings.InProgress_ = "InProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InProgress_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  def Succeeded_ : typingsSlinky.awsSdk.awsSdkStrings.Succeeded_ = "Succeeded".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Succeeded_]
  @scala.inline
  def Canceled_ : typingsSlinky.awsSdk.awsSdkStrings.Canceled_ = "Canceled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Canceled_]
  @scala.inline
  implicit def apply(value: String): DeploymentStatus = value.asInstanceOf[DeploymentStatus]
}

