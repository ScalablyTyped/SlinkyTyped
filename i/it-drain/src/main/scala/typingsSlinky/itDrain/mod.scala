package typingsSlinky.itDrain

import typingsSlinky.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-drain/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: js.Iterable[T]): js.Promise[Unit] = js.native
  /**
    * Drains an (async) iterable discarding its' content and does not return
    * anything.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @returns {Promise<void>}
    */
  @JSImport("it-drain/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: AsyncIterable[T]): js.Promise[Unit] = js.native
}
