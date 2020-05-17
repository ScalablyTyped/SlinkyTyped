package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_STATUS
  - typingsSlinky.awsSdk.awsSdkStrings.DEVICE_STATUS
  - java.lang.String
*/
trait DeviceEventType extends js.Object

object DeviceEventType {
  @scala.inline
  def CONNECTION_STATUS: typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_STATUS = "CONNECTION_STATUS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_STATUS]
  @scala.inline
  def DEVICE_STATUS: typingsSlinky.awsSdk.awsSdkStrings.DEVICE_STATUS = "DEVICE_STATUS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEVICE_STATUS]
  @scala.inline
  implicit def apply(value: String): DeviceEventType = value.asInstanceOf[DeviceEventType]
}

