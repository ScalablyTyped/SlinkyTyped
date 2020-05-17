package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - typingsSlinky.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
trait EncryptionType extends js.Object

object EncryptionType {
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  def KMS: typingsSlinky.awsSdk.awsSdkStrings.KMS = "KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.KMS]
  @scala.inline
  implicit def apply(value: java.lang.String): EncryptionType = value.asInstanceOf[EncryptionType]
}

