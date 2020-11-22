package typingsSlinky.libp2pGossipsub

import typingsSlinky.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import typingsSlinky.libp2pGossipsub.peerStatsMod.PeerStats
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/score/compute-score", JSImport.Namespace)
@js.native
object computeScoreMod extends js.Object {
  
  def computeScore(peer: String, pstats: PeerStats, params: PeerScoreParams, peerIPs: Map[String, Set[String]]): Double = js.native
}
