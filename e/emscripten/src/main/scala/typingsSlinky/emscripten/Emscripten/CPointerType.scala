package typingsSlinky.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emscripten.emscriptenStrings.i8Asterisk
  - typingsSlinky.emscripten.emscriptenStrings.i16Asterisk
  - typingsSlinky.emscripten.emscriptenStrings.i32Asterisk
  - typingsSlinky.emscripten.emscriptenStrings.i64Asterisk
  - typingsSlinky.emscripten.emscriptenStrings.floatAsterisk
  - typingsSlinky.emscripten.emscriptenStrings.doubleAsterisk
  - typingsSlinky.emscripten.emscriptenStrings.Asterisk
*/
trait CPointerType extends js.Object

object CPointerType {
  @scala.inline
  def Asterisk: typingsSlinky.emscripten.emscriptenStrings.Asterisk = this.cast("*")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def doubleAsterisk: typingsSlinky.emscripten.emscriptenStrings.doubleAsterisk = this.cast("double*")
  @scala.inline
  def floatAsterisk: typingsSlinky.emscripten.emscriptenStrings.floatAsterisk = this.cast("float*")
  @scala.inline
  def i16Asterisk: typingsSlinky.emscripten.emscriptenStrings.i16Asterisk = this.cast("i16*")
  @scala.inline
  def i32Asterisk: typingsSlinky.emscripten.emscriptenStrings.i32Asterisk = this.cast("i32*")
  @scala.inline
  def i64Asterisk: typingsSlinky.emscripten.emscriptenStrings.i64Asterisk = this.cast("i64*")
  @scala.inline
  def i8Asterisk: typingsSlinky.emscripten.emscriptenStrings.i8Asterisk = this.cast("i8*")
}

