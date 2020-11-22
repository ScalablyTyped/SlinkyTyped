package typingsSlinky.ipfsCore.gcMod

import typingsSlinky.ipfsCore.anon.GcLockPin
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/repo/gc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasGcLockPinRefsRepo: GcLockPin): js.Function1[
    /* _options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[Err | BlockID]
  ] = js.native
}
