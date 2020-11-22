package typingsSlinky.broadcastChannel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object leaderElectionMod {
  
  type CreateFunction = js.Function2[
    /* channel */ typingsSlinky.broadcastChannel.broadcastChannelMod.BroadcastChannel[js.Any], 
    /* options */ js.UndefOr[typingsSlinky.broadcastChannel.leaderElectionMod.LeaderElectionOptions], 
    typingsSlinky.broadcastChannel.leaderElectionMod.LeaderElector
  ]
}
