package typingsSlinky.libp2pGossipsub.mod

import typingsSlinky.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import typingsSlinky.libp2pGossipsub.peerScoreThresholdsMod.PeerScoreThresholds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GossipOptions extends GossipInputOptions {
  
  @JSName("scoreParams")
  var scoreParams_GossipOptions: PeerScoreParams = js.native
  
  @JSName("scoreThresholds")
  var scoreThresholds_GossipOptions: PeerScoreThresholds = js.native
}
