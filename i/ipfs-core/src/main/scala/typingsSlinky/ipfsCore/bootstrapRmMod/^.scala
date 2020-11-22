package typingsSlinky.ipfsCore.bootstrapRmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/bootstrap/rm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasRepo: js.Any): js.Function2[
    /* multiaddr */ typingsSlinky.multiaddr.mod.^, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Peers]
  ] = js.native
}
