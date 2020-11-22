package typingsSlinky.ipfsCore.anon

import typingsSlinky.cids.mod.^
import typingsSlinky.ipfsCore.dagGetMod.DagEntry
import typingsSlinky.ipfsCore.getMod.GetOptions
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(hasBlockServicePreload: BlockService): js.Function2[
    /* cid */ String | ^  | js.typedarray.Uint8Array, 
    /* options */ js.UndefOr[GetOptions with AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ ^, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.dagGetMod.GetOptions with AbortOptions], 
    js.Promise[DagEntry]
  ] = js.native
  def apply(hasIpldPreload: IpldAny): js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
}
