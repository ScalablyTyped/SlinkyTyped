package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AES_CTR
  - typingsSlinky.awsSdk.awsSdkStrings.AES_CBC
  - typingsSlinky.awsSdk.awsSdkStrings.AES_GCM
  - java.lang.String
*/
trait DecryptionMode extends js.Object

object DecryptionMode {
  @scala.inline
  def AES_CTR: typingsSlinky.awsSdk.awsSdkStrings.AES_CTR = "AES_CTR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AES_CTR]
  @scala.inline
  def AES_CBC: typingsSlinky.awsSdk.awsSdkStrings.AES_CBC = "AES_CBC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AES_CBC]
  @scala.inline
  def AES_GCM: typingsSlinky.awsSdk.awsSdkStrings.AES_GCM = "AES_GCM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AES_GCM]
  @scala.inline
  implicit def apply(value: String): DecryptionMode = value.asInstanceOf[DecryptionMode]
}

