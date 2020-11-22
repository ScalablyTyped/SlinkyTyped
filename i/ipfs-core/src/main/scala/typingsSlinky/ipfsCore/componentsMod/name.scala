package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.anon.Canceled
import typingsSlinky.ipfsCore.anon.Dag
import typingsSlinky.ipfsCore.anon.Dns
import typingsSlinky.ipfsCore.anon.Enabled
import typingsSlinky.ipfsCore.anon.Ipns
import typingsSlinky.ipfsCore.anon.IpnsOptions
import typingsSlinky.ipfsCore.nameResolveMod.ResolveSettings
import typingsSlinky.ipfsCore.publishMod.PublishResult
import typingsSlinky.ipfsCore.publishMod.PublishSettings
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "name")
@js.native
object name extends js.Object {
  
  def publish(hasIpnsDagPeerIdIsOnlineKeychain: Dag): js.Function2[
    /* value */ String, 
    /* options */ js.UndefOr[PublishSettings with AbortOptions], 
    js.Promise[PublishResult]
  ] = js.native
  
  @JSName("resolve_1")
  def resolve1(hasDnsIpnsPeerIdIsOnlineOptions: Dns): js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[ResolveSettings with AbortOptions], 
    AsyncIterable[String]
  ] = js.native
  
  @js.native
  object pubsub extends js.Object {
    
    def cancel(hasIpnsOptions: Ipns): js.Function2[/* name */ String, /* options */ js.UndefOr[AbortOptions], js.Promise[Canceled]] = js.native
    
    def state(hasIpnsOptions: IpnsOptions): js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[Enabled]] = js.native
    
    def subs(hasIpnsOptions: IpnsOptions): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[String]]] = js.native
  }
}
