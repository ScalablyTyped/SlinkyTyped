package typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core-utils/dist/src/files/normalise-input/normalise-input", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */](
    input: Source,
    normaliseContent: js.Function1[/* content */ ToContent, Content | js.Promise[Content]]
  ): AsyncIterable[Directory | File[Content]] = js.native
}
