package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ClientSpecified
  - typingsSlinky.awsSdk.awsSdkStrings.MandatorySigning
  - typingsSlinky.awsSdk.awsSdkStrings.MandatoryEncryption
  - java.lang.String
*/
trait SMBSecurityStrategy extends js.Object

object SMBSecurityStrategy {
  @scala.inline
  def ClientSpecified: typingsSlinky.awsSdk.awsSdkStrings.ClientSpecified = "ClientSpecified".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ClientSpecified]
  @scala.inline
  def MandatorySigning: typingsSlinky.awsSdk.awsSdkStrings.MandatorySigning = "MandatorySigning".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MandatorySigning]
  @scala.inline
  def MandatoryEncryption: typingsSlinky.awsSdk.awsSdkStrings.MandatoryEncryption = "MandatoryEncryption".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MandatoryEncryption]
  @scala.inline
  implicit def apply(value: String): SMBSecurityStrategy = value.asInstanceOf[SMBSecurityStrategy]
}

