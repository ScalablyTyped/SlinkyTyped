package typingsSlinky.nodeForge.mod.pki.rsa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeForge.nodeForgeStrings.`RSAES-PKCS1-V1_5`
  - typingsSlinky.nodeForge.nodeForgeStrings.`RSA-OAEP`
  - typingsSlinky.nodeForge.nodeForgeStrings.RAW
  - typingsSlinky.nodeForge.nodeForgeStrings.NONE
  - scala.Null
*/
trait EncryptionScheme extends js.Object

object EncryptionScheme {
  @scala.inline
  def `RSAES-PKCS1-V1_5`: typingsSlinky.nodeForge.nodeForgeStrings.`RSAES-PKCS1-V1_5` = "RSAES-PKCS1-V1_5".asInstanceOf[typingsSlinky.nodeForge.nodeForgeStrings.`RSAES-PKCS1-V1_5`]
  @scala.inline
  def `RSA-OAEP`: typingsSlinky.nodeForge.nodeForgeStrings.`RSA-OAEP` = "RSA-OAEP".asInstanceOf[typingsSlinky.nodeForge.nodeForgeStrings.`RSA-OAEP`]
  @scala.inline
  def RAW: typingsSlinky.nodeForge.nodeForgeStrings.RAW = "RAW".asInstanceOf[typingsSlinky.nodeForge.nodeForgeStrings.RAW]
  @scala.inline
  def NONE: typingsSlinky.nodeForge.nodeForgeStrings.NONE = "NONE".asInstanceOf[typingsSlinky.nodeForge.nodeForgeStrings.NONE]
  @scala.inline
  implicit def apply(value: Null): EncryptionScheme = value.asInstanceOf[EncryptionScheme]
}

