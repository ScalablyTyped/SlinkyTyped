package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Connected_
  - typingsSlinky.awsSdk.awsSdkStrings.Connecting_
  - typingsSlinky.awsSdk.awsSdkStrings.Disconnected_
  - typingsSlinky.awsSdk.awsSdkStrings.Terminated_
  - typingsSlinky.awsSdk.awsSdkStrings.Terminating_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
trait SessionStatus extends js.Object

object SessionStatus {
  @scala.inline
  def Connected_ : typingsSlinky.awsSdk.awsSdkStrings.Connected_ = "Connected".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Connected_]
  @scala.inline
  def Connecting_ : typingsSlinky.awsSdk.awsSdkStrings.Connecting_ = "Connecting".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Connecting_]
  @scala.inline
  def Disconnected_ : typingsSlinky.awsSdk.awsSdkStrings.Disconnected_ = "Disconnected".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Disconnected_]
  @scala.inline
  def Terminated_ : typingsSlinky.awsSdk.awsSdkStrings.Terminated_ = "Terminated".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Terminated_]
  @scala.inline
  def Terminating_ : typingsSlinky.awsSdk.awsSdkStrings.Terminating_ = "Terminating".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Terminating_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  implicit def apply(value: java.lang.String): SessionStatus = value.asInstanceOf[SessionStatus]
}

