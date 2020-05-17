package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Pending_
  - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
  - typingsSlinky.awsSdk.awsSdkStrings.Success_
  - typingsSlinky.awsSdk.awsSdkStrings.TimedOut_
  - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
trait CommandPluginStatus extends js.Object

object CommandPluginStatus {
  @scala.inline
  def Pending_ : typingsSlinky.awsSdk.awsSdkStrings.Pending_ = "Pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Pending_]
  @scala.inline
  def InProgress_ : typingsSlinky.awsSdk.awsSdkStrings.InProgress_ = "InProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InProgress_]
  @scala.inline
  def Success_ : typingsSlinky.awsSdk.awsSdkStrings.Success_ = "Success".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Success_]
  @scala.inline
  def TimedOut_ : typingsSlinky.awsSdk.awsSdkStrings.TimedOut_ = "TimedOut".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TimedOut_]
  @scala.inline
  def Cancelled_ : typingsSlinky.awsSdk.awsSdkStrings.Cancelled_ = "Cancelled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Cancelled_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  implicit def apply(value: java.lang.String): CommandPluginStatus = value.asInstanceOf[CommandPluginStatus]
}

