package typingsSlinky.ethereumCryptography.pureHdkeyMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.ethereumCryptography.anon.Xpriv
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereum-cryptography/pure/hdkey", "HDKey")
@js.native
class HDKey () extends HDKeyT
@JSImport("ethereum-cryptography/pure/hdkey", "HDKey")
@js.native
object HDKey extends Instantiable0[HDKeyT] {
  
  var HARDENED_OFFSET: Double = js.native
  
  def fromExtendedKey(base58key: String): HDKeyT = js.native
  def fromExtendedKey(base58key: String, versions: Versions): HDKeyT = js.native
  
  def fromJSON(json: Xpriv): HDKeyT = js.native
  
  def fromMasterSeed(seed: Buffer): HDKeyT = js.native
  def fromMasterSeed(seed: Buffer, versions: Versions): HDKeyT = js.native
}
