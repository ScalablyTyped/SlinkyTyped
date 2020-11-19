package typingsSlinky.bitcoinjsLib.ecpairMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signer extends js.Object {
  
  var getPublicKey: js.UndefOr[js.Function0[Buffer]] = js.native
  
  var network: js.UndefOr[js.Any] = js.native
  
  var publicKey: Buffer = js.native
  
  def sign(hash: Buffer): Buffer = js.native
  def sign(hash: Buffer, lowR: Boolean): Buffer = js.native
}
