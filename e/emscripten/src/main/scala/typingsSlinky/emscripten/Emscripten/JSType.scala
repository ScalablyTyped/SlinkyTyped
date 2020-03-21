package typingsSlinky.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emscripten.emscriptenStrings.number
  - typingsSlinky.emscripten.emscriptenStrings.string
  - typingsSlinky.emscripten.emscriptenStrings.array
  - typingsSlinky.emscripten.emscriptenStrings.boolean
*/
trait JSType extends js.Object

object JSType {
  @scala.inline
  def array: typingsSlinky.emscripten.emscriptenStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsSlinky.emscripten.emscriptenStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typingsSlinky.emscripten.emscriptenStrings.number = this.cast("number")
  @scala.inline
  def string: typingsSlinky.emscripten.emscriptenStrings.string = this.cast("string")
}

