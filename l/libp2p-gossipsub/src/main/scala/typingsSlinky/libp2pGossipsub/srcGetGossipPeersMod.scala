package typingsSlinky.libp2pGossipsub

import typingsSlinky.libp2pGossipsub.mod.^
import typingsSlinky.libp2pGossipsub.peerMod.Peer
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGetGossipPeersMod {
  
  @JSImport("libp2p-gossipsub/src/getGossipPeers", "getGossipPeers")
  @js.native
  def getGossipPeers(router: ^, topic: String, count: Double): Set[Peer] = js.native
}
