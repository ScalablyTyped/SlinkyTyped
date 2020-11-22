package typingsSlinky.ipfsCore.getMod

import typingsSlinky.ipfsCore.anon.BlockService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/block/get", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBlockServicePreload: BlockService): js.Function2[
    /* cid */ String | typingsSlinky.cids.mod.^  | js.typedarray.Uint8Array, 
    /* options */ js.UndefOr[GetOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
}
