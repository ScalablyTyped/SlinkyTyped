package typingsSlinky.peerId.mod

import typingsSlinky.libp2pCrypto.mod.PrivateKey
import typingsSlinky.libp2pCrypto.mod.PublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PeerId is an object representation of a peer identifier.
  */
@JSImport("peer-id", JSImport.Namespace)
@js.native
class ^ protected () extends PeerId {
  def this(id: js.typedarray.Uint8Array) = this()
  def this(id: js.typedarray.Uint8Array, privKey: PrivateKey) = this()
  def this(id: js.typedarray.Uint8Array, privKey: js.UndefOr[scala.Nothing], pubKey: PublicKey) = this()
  def this(id: js.typedarray.Uint8Array, privKey: PrivateKey, pubKey: PublicKey) = this()
}
