package typingsSlinky.ipfsCore.wantlistForPeerMod

import typingsSlinky.ipfsCore.anon.Bitswap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/bitswap/wantlist-for-peer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBitswap: Bitswap): js.Function2[
    /* peerId */ String | typingsSlinky.cids.mod.^  | js.typedarray.Uint8Array | typingsSlinky.peerId.mod.^ , 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[js.Array[typingsSlinky.cids.mod.^]]
  ] = js.native
}
