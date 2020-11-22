package typingsSlinky.ipfsCore.cancelMod

import typingsSlinky.ipfsCore.anon.Canceled
import typingsSlinky.ipfsCore.anon.Ipns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/name/pubsub/cancel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpnsOptions: Ipns): js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Canceled]
  ] = js.native
}
