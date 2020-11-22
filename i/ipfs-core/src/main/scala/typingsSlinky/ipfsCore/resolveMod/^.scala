package typingsSlinky.ipfsCore.resolveMod

import typingsSlinky.ipfsCore.anon.Ipld
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/dag/resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[ResolveOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[ResolveResult]
  ] = js.native
}
