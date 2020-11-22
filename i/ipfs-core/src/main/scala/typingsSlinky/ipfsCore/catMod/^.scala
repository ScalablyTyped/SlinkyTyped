package typingsSlinky.ipfsCore.catMod

import typingsSlinky.ipfsCore.anon.Ipld
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/cat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[CatOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[js.typedarray.Uint8Array]
  ] = js.native
}
