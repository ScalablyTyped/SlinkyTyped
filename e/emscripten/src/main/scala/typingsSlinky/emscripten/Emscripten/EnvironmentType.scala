package typingsSlinky.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emscripten.emscriptenStrings.WEB
  - typingsSlinky.emscripten.emscriptenStrings.NODE
  - typingsSlinky.emscripten.emscriptenStrings.SHELL
  - typingsSlinky.emscripten.emscriptenStrings.WORKER
*/
trait EnvironmentType extends js.Object

object EnvironmentType {
  @scala.inline
  def NODE: typingsSlinky.emscripten.emscriptenStrings.NODE = this.cast("NODE")
  @scala.inline
  def SHELL: typingsSlinky.emscripten.emscriptenStrings.SHELL = this.cast("SHELL")
  @scala.inline
  def WEB: typingsSlinky.emscripten.emscriptenStrings.WEB = this.cast("WEB")
  @scala.inline
  def WORKER: typingsSlinky.emscripten.emscriptenStrings.WORKER = this.cast("WORKER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

