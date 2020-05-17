package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Pending_
  - typingsSlinky.awsSdk.awsSdkStrings.Available_
  - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
  - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
trait ServiceState extends js.Object

object ServiceState {
  @scala.inline
  def Pending_ : typingsSlinky.awsSdk.awsSdkStrings.Pending_ = "Pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Pending_]
  @scala.inline
  def Available_ : typingsSlinky.awsSdk.awsSdkStrings.Available_ = "Available".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Available_]
  @scala.inline
  def Deleting_ : typingsSlinky.awsSdk.awsSdkStrings.Deleting_ = "Deleting".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Deleting_]
  @scala.inline
  def Deleted_ : typingsSlinky.awsSdk.awsSdkStrings.Deleted_ = "Deleted".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Deleted_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  implicit def apply(value: java.lang.String): ServiceState = value.asInstanceOf[ServiceState]
}

