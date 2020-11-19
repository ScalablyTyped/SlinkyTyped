package typingsSlinky.elliptic.mod.eddsa

import typingsSlinky.elliptic.ellipticStrings.hex
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "eddsa.KeyPair")
@js.native
class KeyPair protected () extends js.Object {
  def this(eddsa: typingsSlinky.elliptic.mod.eddsa, params: KeyPairOptions) = this()
  
  def getPublic(): Buffer = js.native
  @JSName("getPublic")
  def getPublic_hex(enc: hex): String = js.native
  
  def getSecret(): Buffer = js.native
  @JSName("getSecret")
  def getSecret_hex(enc: hex): String = js.native
  
  def secret(): Buffer = js.native
  
  def sign(message: Bytes): Signature = js.native
  
  def verify(message: Bytes, sig: Bytes): Boolean = js.native
  def verify(message: Bytes, sig: Signature): Boolean = js.native
}
/* static members */
@JSImport("elliptic", "eddsa.KeyPair")
@js.native
object KeyPair extends js.Object {
  
  def fromPublic(eddsa: typingsSlinky.elliptic.mod.eddsa, pub: Bytes): KeyPair = js.native
  
  def fromSecret(eddsa: typingsSlinky.elliptic.mod.eddsa, secret: Bytes): KeyPair = js.native
}
