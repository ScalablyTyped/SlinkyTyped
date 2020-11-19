package typingsSlinky.bunnymq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Producer extends js.Object {
  
  /**
    * Send messages to a named queue.
    *
    * @param queue A named queue.
    * @param message A message.
    * @return The consumer response.
    */
  def produce[T](queue: String, message: js.Any): js.Promise[T] = js.native
  def produce[T](queue: String, message: js.Any, options: ProducerOptions): js.Promise[T] = js.native
}
