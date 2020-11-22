package typingsSlinky.libp2pGossipsub

import typingsSlinky.libp2pGossipsub.mod.^
import typingsSlinky.libp2pGossipsub.peerMod.Peer
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/getGossipPeers", JSImport.Namespace)
@js.native
object srcGetGossipPeersMod extends js.Object {
  
  def getGossipPeers(router: ^, topic: String, count: Double): Set[Peer] = js.native
}
