package typingsSlinky.ipfsCore.treeMod

import typingsSlinky.ipfsCore.anon.Ipld
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/dag/tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ typingsSlinky.cids.mod.^, 
    /* options */ js.UndefOr[TreeOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[String]
  ] = js.native
}
