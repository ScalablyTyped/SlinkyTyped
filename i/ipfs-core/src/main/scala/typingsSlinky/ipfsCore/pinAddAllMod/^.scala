package typingsSlinky.ipfsCore.pinAddAllMod

import typingsSlinky.ipfsCore.anon.DagDAG
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/pin/add-all", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasPinManagerGcLockDag: DagDAG): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddSettings with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[typingsSlinky.cids.mod.^]
  ] = js.native
}
