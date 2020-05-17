package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Unregistered
  - typingsSlinky.awsSdk.awsSdkStrings.Registered_
  - typingsSlinky.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
trait RegistrationStatus extends js.Object

object RegistrationStatus {
  @scala.inline
  def Unregistered: typingsSlinky.awsSdk.awsSdkStrings.Unregistered = "Unregistered".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Unregistered]
  @scala.inline
  def Registered_ : typingsSlinky.awsSdk.awsSdkStrings.Registered_ = "Registered".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Registered_]
  @scala.inline
  def Suspended_ : typingsSlinky.awsSdk.awsSdkStrings.Suspended_ = "Suspended".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Suspended_]
  @scala.inline
  implicit def apply(value: java.lang.String): RegistrationStatus = value.asInstanceOf[RegistrationStatus]
}

