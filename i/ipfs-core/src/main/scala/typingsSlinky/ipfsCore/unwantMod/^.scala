package typingsSlinky.ipfsCore.unwantMod

import typingsSlinky.ipfsCore.anon.Bitswap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/bitswap/unwant", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBitswap: Bitswap): js.Function2[
    /* cids */ typingsSlinky.cids.mod.^  | js.Array[typingsSlinky.cids.mod.^], 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Unit]
  ] = js.native
}
