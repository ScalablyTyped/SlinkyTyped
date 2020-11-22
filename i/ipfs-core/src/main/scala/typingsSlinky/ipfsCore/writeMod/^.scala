package typingsSlinky.ipfsCore.writeMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/files/write", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(context: js.Any): js.Function3[
    /* path */ String, 
    /* content */ String | js.typedarray.Uint8Array | AsyncIterable[js.typedarray.Uint8Array] | Blob, 
    /* options */ js.UndefOr[WriteOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Unit]
  ] = js.native
}
