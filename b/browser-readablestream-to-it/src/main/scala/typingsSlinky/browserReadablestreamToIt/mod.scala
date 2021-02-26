package typingsSlinky.browserReadablestreamToIt

import org.scalajs.dom.experimental.ReadableStream
import typingsSlinky.browserReadablestreamToIt.anon.PreventCancel
import typingsSlinky.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Turns a browser readable stream into an async iterable. Async iteration over
    * returned iterable will lock give stream, preventing any other consumer from
    * acquiring a reader. The lock will be released if iteration loop is broken. To
    * prevent stream cancelling optional `{ preventCancel: true }` could be passed
    * as a second argument.
    * @template T
    * @param {ReadableStream<T>} stream
    * @param {Object} [options]
    * @param {boolean} [options.preventCancel=boolean]
    * @returns {AsyncIterable<T>}
    */
  @JSImport("browser-readablestream-to-it/dist", JSImport.Namespace)
  @js.native
  def apply[T](stream: ReadableStream[T]): AsyncIterable[T] = js.native
  @JSImport("browser-readablestream-to-it/dist", JSImport.Namespace)
  @js.native
  def apply[T](stream: ReadableStream[T], options: PreventCancel): AsyncIterable[T] = js.native
}
