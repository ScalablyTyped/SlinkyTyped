package typingsSlinky.blobToIt

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param {Blob} blob
    * @returns {AsyncIterable<Uint8Array>}
    */
  @JSImport("blob-to-it/dist", JSImport.Namespace)
  @js.native
  def apply(blob: Blob): AsyncIterable[js.typedarray.Uint8Array] = js.native
}
