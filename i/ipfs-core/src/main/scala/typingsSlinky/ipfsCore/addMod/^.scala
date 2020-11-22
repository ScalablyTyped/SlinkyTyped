package typingsSlinky.ipfsCore.addMod

import typingsSlinky.ipfsCore.anon.AddAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/add", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasAddAll: AddAll): js.Function2[
    /* source */ Source, 
    /* options */ js.UndefOr[AddOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typingsSlinky.ipfsCore.addAllMod.UnixFSEntry]
  ] = js.native
}
