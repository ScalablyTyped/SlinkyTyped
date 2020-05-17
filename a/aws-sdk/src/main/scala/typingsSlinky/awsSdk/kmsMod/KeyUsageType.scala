package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SIGN_VERIFY
  - typingsSlinky.awsSdk.awsSdkStrings.ENCRYPT_DECRYPT
  - java.lang.String
*/
trait KeyUsageType extends js.Object

object KeyUsageType {
  @scala.inline
  def SIGN_VERIFY: typingsSlinky.awsSdk.awsSdkStrings.SIGN_VERIFY = "SIGN_VERIFY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SIGN_VERIFY]
  @scala.inline
  def ENCRYPT_DECRYPT: typingsSlinky.awsSdk.awsSdkStrings.ENCRYPT_DECRYPT = "ENCRYPT_DECRYPT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENCRYPT_DECRYPT]
  @scala.inline
  implicit def apply(value: String): KeyUsageType = value.asInstanceOf[KeyUsageType]
}

