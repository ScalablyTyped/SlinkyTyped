package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ANDROID
  - typingsSlinky.awsSdk.awsSdkStrings.IOS
  - java.lang.String
*/
trait DevicePlatform extends js.Object

object DevicePlatform {
  @scala.inline
  def ANDROID: typingsSlinky.awsSdk.awsSdkStrings.ANDROID = "ANDROID".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ANDROID]
  @scala.inline
  def IOS: typingsSlinky.awsSdk.awsSdkStrings.IOS = "IOS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IOS]
  @scala.inline
  implicit def apply(value: java.lang.String): DevicePlatform = value.asInstanceOf[DevicePlatform]
}

