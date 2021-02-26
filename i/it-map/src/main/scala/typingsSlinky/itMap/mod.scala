package typingsSlinky.itMap

import typingsSlinky.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-map/dist", JSImport.Namespace)
  @js.native
  def apply[I, O](source: js.Iterable[I], func: js.Function1[/* arg0 */ I, O | js.Promise[O]]): AsyncIterable[O] = js.native
  /**
    * Takes an (async) iterable and returns one with each item mapped by the passed
    * function.
    *
    * @template I,O
    * @param {AsyncIterable<I>|Iterable<I>} source
    * @param {function(I):O|Promise<O>} func
    * @returns {AsyncIterable<O>}
    */
  @JSImport("it-map/dist", JSImport.Namespace)
  @js.native
  def apply[I, O](source: AsyncIterable[I], func: js.Function1[/* arg0 */ I, O | js.Promise[O]]): AsyncIterable[O] = js.native
}
