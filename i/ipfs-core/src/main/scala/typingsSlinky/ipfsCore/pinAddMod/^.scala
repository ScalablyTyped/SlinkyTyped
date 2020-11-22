package typingsSlinky.ipfsCore.pinAddMod

import typingsSlinky.ipfsCore.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/pin/add", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasAddAll: `2`): js.Function2[
    /* path */ CID | String, 
    /* options */ js.UndefOr[AddOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[CID]
  ] = js.native
}
