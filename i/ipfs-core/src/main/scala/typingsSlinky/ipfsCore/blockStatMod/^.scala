package typingsSlinky.ipfsCore.blockStatMod

import typingsSlinky.ipfsCore.anon.BlockService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/block/stat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBlockServicePreload: BlockService): js.Function2[
    /* cid */ typingsSlinky.cids.mod.^, 
    /* options */ js.UndefOr[StatOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Stat]
  ] = js.native
}
