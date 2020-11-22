package typingsSlinky.ipfsCore.anon

import typingsSlinky.cids.mod.^
import typingsSlinky.ipfsCore.filesStatMod.StatOptions
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.statMod.BitswapStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasRepo extends js.Object {
  
  def apply(context: IpldIPLD): js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[StatOptions with AbortOptions], 
    js.Promise[typingsSlinky.ipfsCore.filesStatMod.Stat]
  ] = js.native
  def apply(hasBitswap: Bitswap): js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[BitswapStats]] = js.native
  def apply(hasBlockServicePreload: BlockService): js.Function2[
    /* cid */ ^, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.blockStatMod.StatOptions with AbortOptions], 
    js.Promise[typingsSlinky.ipfsCore.blockStatMod.Stat]
  ] = js.native
  def apply(hasIpldPreload: IpldAny): js.Function2[
    /* multihash */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[BlockSize]
  ] = js.native
  def apply(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[NumObjects]] = js.native
}
