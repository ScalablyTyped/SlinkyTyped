package typingsSlinky.libp2pGossipsub

import typingsSlinky.libp2pGossipsub.mod.^
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/get-gossip-peers", JSImport.Namespace)
@js.native
object getGossipPeersMod extends js.Object {
  
  def getGossipPeers(router: ^, topic: String, count: Double): Set[String] = js.native
  def getGossipPeers(router: ^, topic: String, count: Double, filter: js.Function1[/* id */ String, Boolean]): Set[String] = js.native
}
