package typingsSlinky.ipfsCore.lsMod

import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/files/ls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(context: js.Any): js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[UnixFSEntry]
  ] = js.native
}
