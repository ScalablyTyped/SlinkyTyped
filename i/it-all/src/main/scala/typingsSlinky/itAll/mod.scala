package typingsSlinky.itAll

import typingsSlinky.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-all/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: js.Iterable[T]): js.Promise[js.Array[T]] = js.native
  /**
    * Collects all values from an (async) iterable into an array and returns it.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @returns {Promise<T[]>}
    */
  @JSImport("it-all/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: AsyncIterable[T]): js.Promise[js.Array[T]] = js.native
}
