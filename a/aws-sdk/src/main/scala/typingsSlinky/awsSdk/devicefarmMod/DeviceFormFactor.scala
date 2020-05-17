package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PHONE
  - typingsSlinky.awsSdk.awsSdkStrings.TABLET
  - java.lang.String
*/
trait DeviceFormFactor extends js.Object

object DeviceFormFactor {
  @scala.inline
  def PHONE: typingsSlinky.awsSdk.awsSdkStrings.PHONE = "PHONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PHONE]
  @scala.inline
  def TABLET: typingsSlinky.awsSdk.awsSdkStrings.TABLET = "TABLET".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TABLET]
  @scala.inline
  implicit def apply(value: java.lang.String): DeviceFormFactor = value.asInstanceOf[DeviceFormFactor]
}

