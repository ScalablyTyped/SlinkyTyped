package typingsSlinky.libp2pGossipsub.peerStatsMod

import typingsSlinky.libp2pGossipsub.anon.PartialTopicStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/score/peer-stats", "createTopicStats")
@js.native
object createTopicStats extends js.Object {
  
  def apply(): TopicStats = js.native
  def apply(ts: PartialTopicStats): TopicStats = js.native
}
