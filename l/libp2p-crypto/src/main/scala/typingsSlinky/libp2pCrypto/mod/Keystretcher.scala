package typingsSlinky.libp2pCrypto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keystretcher extends js.Object {
  
  def apply(res: js.typedarray.Uint8Array): Keystretcher = js.native
  
  var cipherKey: js.typedarray.Uint8Array = js.native
  
  var iv: js.typedarray.Uint8Array = js.native
  
  var macKey: js.typedarray.Uint8Array = js.native
}
