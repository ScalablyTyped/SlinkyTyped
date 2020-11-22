package typingsSlinky.ipfsCore

import typingsSlinky.ipfsCore.anon.Addr
import typingsSlinky.ipfsCore.anon.Libp2pAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/swarm/peers", JSImport.Namespace)
@js.native
object peersMod extends js.Object {
  
  def apply(hasLibp2p: Libp2pAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[Addr]]] = js.native
}
