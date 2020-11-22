package typingsSlinky.ipfsCore.pingMod

import typingsSlinky.ipfsCore.anon.Libp2pAny
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/ping", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasLibp2p: Libp2pAny): js.Function2[
    /* peerId */ typingsSlinky.peerId.mod.^, 
    /* options */ js.UndefOr[PingSettings with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[Pong | PingFailure | StatusUpdate]
  ] = js.native
}
