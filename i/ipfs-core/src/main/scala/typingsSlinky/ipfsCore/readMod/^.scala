package typingsSlinky.ipfsCore.readMod

import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/files/read", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(context: js.Any): js.Function2[
    /* path */ String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[ReadOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[js.typedarray.Uint8Array]
  ] = js.native
}
