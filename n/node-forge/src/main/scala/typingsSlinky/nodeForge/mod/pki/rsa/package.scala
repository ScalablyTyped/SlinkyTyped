package typingsSlinky.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsa {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeForge.nodeForgeStrings.`RSAES-PKCS1-V1_5`
    - typingsSlinky.nodeForge.nodeForgeStrings.`RSA-OAEP`
    - typingsSlinky.nodeForge.nodeForgeStrings.RAW
    - typingsSlinky.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type EncryptionScheme = typingsSlinky.nodeForge.mod.pki.rsa._EncryptionScheme | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeForge.nodeForgeStrings.`RSASSA-PKCS1-V1_5`
    - typingsSlinky.nodeForge.mod.pss.PSS
    - typingsSlinky.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type SignatureScheme = typingsSlinky.nodeForge.mod.pki.rsa._SignatureScheme | typingsSlinky.nodeForge.mod.pss.PSS | scala.Null
}
