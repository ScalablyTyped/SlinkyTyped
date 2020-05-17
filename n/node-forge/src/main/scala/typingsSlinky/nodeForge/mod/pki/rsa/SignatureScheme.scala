package typingsSlinky.nodeForge.mod.pki.rsa

import typingsSlinky.nodeForge.mod.pss.PSS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeForge.nodeForgeStrings.`RSASSA-PKCS1-V1_5`
  - typingsSlinky.nodeForge.mod.pss.PSS
  - typingsSlinky.nodeForge.nodeForgeStrings.NONE
  - scala.Null
*/
trait SignatureScheme extends js.Object

object SignatureScheme {
  @scala.inline
  def `RSASSA-PKCS1-V1_5`: typingsSlinky.nodeForge.nodeForgeStrings.`RSASSA-PKCS1-V1_5` = "RSASSA-PKCS1-V1_5".asInstanceOf[typingsSlinky.nodeForge.nodeForgeStrings.`RSASSA-PKCS1-V1_5`]
  @scala.inline
  def NONE: typingsSlinky.nodeForge.nodeForgeStrings.NONE = "NONE".asInstanceOf[typingsSlinky.nodeForge.nodeForgeStrings.NONE]
  @scala.inline
  implicit def apply(value: Null): SignatureScheme = value.asInstanceOf[SignatureScheme]
  @scala.inline
  implicit def apply(value: PSS): SignatureScheme = value.asInstanceOf[SignatureScheme]
}

