package typingsSlinky.bip174.interfacesMod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bip32Derivation extends StObject {
  
  var masterFingerprint: Buffer = js.native
  
  var path: String = js.native
  
  var pubkey: Buffer = js.native
}
object Bip32Derivation {
  
  @scala.inline
  def apply(masterFingerprint: Buffer, path: String, pubkey: Buffer): Bip32Derivation = {
    val __obj = js.Dynamic.literal(masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bip32Derivation]
  }
  
  @scala.inline
  implicit class Bip32DerivationMutableBuilder[Self <: Bip32Derivation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasterFingerprint(value: Buffer): Self = StObject.set(x, "masterFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubkey(value: Buffer): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
  }
}
