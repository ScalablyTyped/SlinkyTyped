package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OPEN
  - typingsSlinky.awsSdk.awsSdkStrings.WEP
  - typingsSlinky.awsSdk.awsSdkStrings.WPA_PSK
  - typingsSlinky.awsSdk.awsSdkStrings.WPA2_PSK
  - typingsSlinky.awsSdk.awsSdkStrings.WPA2_ENTERPRISE
  - java.lang.String
*/
trait NetworkSecurityType extends js.Object

object NetworkSecurityType {
  @scala.inline
  def OPEN: typingsSlinky.awsSdk.awsSdkStrings.OPEN = "OPEN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OPEN]
  @scala.inline
  def WEP: typingsSlinky.awsSdk.awsSdkStrings.WEP = "WEP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WEP]
  @scala.inline
  def WPA_PSK: typingsSlinky.awsSdk.awsSdkStrings.WPA_PSK = "WPA_PSK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WPA_PSK]
  @scala.inline
  def WPA2_PSK: typingsSlinky.awsSdk.awsSdkStrings.WPA2_PSK = "WPA2_PSK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WPA2_PSK]
  @scala.inline
  def WPA2_ENTERPRISE: typingsSlinky.awsSdk.awsSdkStrings.WPA2_ENTERPRISE = "WPA2_ENTERPRISE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WPA2_ENTERPRISE]
  @scala.inline
  implicit def apply(value: String): NetworkSecurityType = value.asInstanceOf[NetworkSecurityType]
}

