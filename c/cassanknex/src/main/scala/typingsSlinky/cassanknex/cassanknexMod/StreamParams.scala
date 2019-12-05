package typingsSlinky.cassanknex.cassanknexMod

import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamParams extends js.Object {
  def end(`this`: Readable): js.Any
  def error(err: js.Error): js.Any
  def readable(`this`: Readable): js.Any
}

object StreamParams {
  @scala.inline
  def apply(end: Readable => js.Any, error: js.Error => js.Any, readable: Readable => js.Any): StreamParams = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction1(readable))
  
    __obj.asInstanceOf[StreamParams]
  }
}

