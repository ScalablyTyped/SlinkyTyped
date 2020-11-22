package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.anon.BitswapAny
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.statMod.BitswapStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "bitswap")
@js.native
object bitswap extends js.Object {
  
  @JSName("stat_1")
  def stat1(hasBitswap: BitswapAny): js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[BitswapStats]] = js.native
  
  def unwant(hasBitswap: BitswapAny): js.Function2[
    /* cids */ typingsSlinky.cids.mod.^  | js.Array[typingsSlinky.cids.mod.^], 
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[Unit]
  ] = js.native
  
  def wantlist(hasBitswap: BitswapAny): js.Function1[
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[js.Array[typingsSlinky.cids.mod.^]]
  ] = js.native
  
  def wantlistForPeer(hasBitswap: BitswapAny): js.Function2[
    /* peerId */ String | typingsSlinky.cids.mod.^  | js.typedarray.Uint8Array | typingsSlinky.peerId.mod.^ , 
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[js.Array[typingsSlinky.cids.mod.^]]
  ] = js.native
}
