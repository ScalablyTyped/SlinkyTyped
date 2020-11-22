package typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.File[Content]
  - typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.Directory
*/
trait Entry[Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */] extends js.Object
object Entry {
  
  @scala.inline
  def File[Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */](path: String): Entry[Content] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[Content]]
  }
  
  @scala.inline
  def Directory[Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */](path: String): Entry[Content] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[Content]]
  }
}
