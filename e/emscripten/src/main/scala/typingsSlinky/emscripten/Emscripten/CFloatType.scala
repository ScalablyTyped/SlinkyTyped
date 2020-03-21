package typingsSlinky.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emscripten.emscriptenStrings.float
  - typingsSlinky.emscripten.emscriptenStrings.double
*/
trait CFloatType extends js.Object

object CFloatType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def double: typingsSlinky.emscripten.emscriptenStrings.double = this.cast("double")
  @scala.inline
  def float: typingsSlinky.emscripten.emscriptenStrings.float = this.cast("float")
}

