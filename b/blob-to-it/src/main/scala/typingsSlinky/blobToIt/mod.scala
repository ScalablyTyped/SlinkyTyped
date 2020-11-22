package typingsSlinky.blobToIt

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blob-to-it/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * @param {Blob} blob
    * @returns {AsyncIterable<Uint8Array>}
    */
  def apply(blob: Blob): AsyncIterable[js.typedarray.Uint8Array] = js.native
}
