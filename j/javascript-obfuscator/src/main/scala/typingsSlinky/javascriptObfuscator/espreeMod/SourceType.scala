package typingsSlinky.javascriptObfuscator.espreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.javascriptObfuscator.javascriptObfuscatorStrings.script
  - typingsSlinky.javascriptObfuscator.javascriptObfuscatorStrings.module
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def module: typingsSlinky.javascriptObfuscator.javascriptObfuscatorStrings.module = this.cast("module")
  @scala.inline
  def script: typingsSlinky.javascriptObfuscator.javascriptObfuscatorStrings.script = this.cast("script")
}

