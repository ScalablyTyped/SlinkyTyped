package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.DRAINING
  - typingsSlinky.awsSdk.awsSdkStrings.REGISTERING
  - typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERING
  - typingsSlinky.awsSdk.awsSdkStrings.REGISTRATION_FAILED
  - java.lang.String
*/
trait ContainerInstanceStatus extends js.Object

object ContainerInstanceStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def DRAINING: typingsSlinky.awsSdk.awsSdkStrings.DRAINING = "DRAINING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DRAINING]
  @scala.inline
  def REGISTERING: typingsSlinky.awsSdk.awsSdkStrings.REGISTERING = "REGISTERING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGISTERING]
  @scala.inline
  def DEREGISTERING: typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERING = "DEREGISTERING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERING]
  @scala.inline
  def REGISTRATION_FAILED: typingsSlinky.awsSdk.awsSdkStrings.REGISTRATION_FAILED = "REGISTRATION_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGISTRATION_FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): ContainerInstanceStatus = value.asInstanceOf[ContainerInstanceStatus]
}

