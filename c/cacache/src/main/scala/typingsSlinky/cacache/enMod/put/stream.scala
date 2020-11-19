package typingsSlinky.cacache.enMod.put

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cacache/en", "put.stream")
@js.native
object stream extends js.Object {
  
  /**
    * Returns a Writable Stream that inserts data written to it into the cache.
    * Emits an `integrity` event with the digest of written contents when it
    * succeeds.
    */
  def apply(cachePath: String, key: String): WritableStream = js.native
  def apply(cachePath: String, key: String, opts: Options): WritableStream = js.native
}
