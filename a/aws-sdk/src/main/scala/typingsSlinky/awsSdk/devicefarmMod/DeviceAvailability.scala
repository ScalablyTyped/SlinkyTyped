package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_NOT_AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.BUSY
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.HIGHLY_AVAILABLE
  - java.lang.String
*/
trait DeviceAvailability extends js.Object

object DeviceAvailability {
  @scala.inline
  def TEMPORARY_NOT_AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_NOT_AVAILABLE = "TEMPORARY_NOT_AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_NOT_AVAILABLE]
  @scala.inline
  def BUSY: typingsSlinky.awsSdk.awsSdkStrings.BUSY = "BUSY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BUSY]
  @scala.inline
  def AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE = "AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE]
  @scala.inline
  def HIGHLY_AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.HIGHLY_AVAILABLE = "HIGHLY_AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HIGHLY_AVAILABLE]
  @scala.inline
  implicit def apply(value: java.lang.String): DeviceAvailability = value.asInstanceOf[DeviceAvailability]
}

