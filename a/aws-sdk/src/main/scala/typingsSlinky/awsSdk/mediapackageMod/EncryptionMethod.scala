package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AES_128
  - typingsSlinky.awsSdk.awsSdkStrings.SAMPLE_AES
  - java.lang.String
*/
trait EncryptionMethod extends js.Object

object EncryptionMethod {
  @scala.inline
  def AES_128: typingsSlinky.awsSdk.awsSdkStrings.AES_128 = "AES_128".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AES_128]
  @scala.inline
  def SAMPLE_AES: typingsSlinky.awsSdk.awsSdkStrings.SAMPLE_AES = "SAMPLE_AES".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SAMPLE_AES]
  @scala.inline
  implicit def apply(value: String): EncryptionMethod = value.asInstanceOf[EncryptionMethod]
}

