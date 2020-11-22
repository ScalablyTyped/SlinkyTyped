package typingsSlinky.broadcastChannel

import typingsSlinky.broadcastChannel.broadcastChannelBooleans.`false`
import typingsSlinky.broadcastChannel.broadcastChannelMod.BroadcastChannelOptions
import typingsSlinky.broadcastChannel.leaderElectionMod.CreateFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("broadcast-channel", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clearNodeFolder(): js.Promise[Boolean] = js.native
  def clearNodeFolder(opts: BroadcastChannelOptions): js.Promise[Boolean] = js.native
  
  val createLeaderElection: CreateFunction = js.native
  
  def enforceOptions(): Unit = js.native
  def enforceOptions(opts: BroadcastChannelOptions): Unit = js.native
  @JSName("enforceOptions")
  def enforceOptions_false(opts: `false`): Unit = js.native
  
  @js.native
  class BroadcastChannel[T] protected ()
    extends typingsSlinky.broadcastChannel.broadcastChannelMod.BroadcastChannel[T] {
    def this(name: String) = this()
    def this(name: String, opts: BroadcastChannelOptions) = this()
  }
  
  @js.native
  class LeaderElector ()
    extends typingsSlinky.broadcastChannel.leaderElectionMod.LeaderElector
}
