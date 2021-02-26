package typingsSlinky.ed2curve

import typingsSlinky.tweetnacl.mod.BoxKeyPair
import typingsSlinky.tweetnacl.mod.SignKeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ed2curve", "convertKeyPair")
  @js.native
  def convertKeyPair(keyPair: SignKeyPair): BoxKeyPair | Null = js.native
  
  @JSImport("ed2curve", "convertPublicKey")
  @js.native
  def convertPublicKey(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
  
  @JSImport("ed2curve", "convertSecretKey")
  @js.native
  def convertSecretKey(secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}
