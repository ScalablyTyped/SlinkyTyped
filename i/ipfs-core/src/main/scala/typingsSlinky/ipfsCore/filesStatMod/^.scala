package typingsSlinky.ipfsCore.filesStatMod

import typingsSlinky.ipfsCore.anon.IpldIPLD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/files/stat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(context: IpldIPLD): js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[StatOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Stat]
  ] = js.native
}
