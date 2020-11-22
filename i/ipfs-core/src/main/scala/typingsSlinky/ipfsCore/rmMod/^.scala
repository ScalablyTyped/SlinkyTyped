package typingsSlinky.ipfsCore.rmMod

import typingsSlinky.ipfsCore.anon.PinManager
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/block/rm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBlockServiceGcLockPinManager: PinManager): js.Function2[
    /* cids */ typingsSlinky.cids.mod.^  | js.Array[typingsSlinky.cids.mod.^], 
    /* options */ js.UndefOr[RmOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[RmSucceess | RmFailure]
  ] = js.native
}
