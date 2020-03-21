package typingsSlinky.idyllCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.idyllCompiler.idyllCompilerStrings.variable
  - typingsSlinky.idyllCompiler.idyllCompilerStrings.value
  - typingsSlinky.idyllCompiler.idyllCompilerStrings.expression
*/
trait PropType extends js.Object

object PropType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expression: typingsSlinky.idyllCompiler.idyllCompilerStrings.expression = this.cast("expression")
  @scala.inline
  def value: typingsSlinky.idyllCompiler.idyllCompilerStrings.value = this.cast("value")
  @scala.inline
  def variable: typingsSlinky.idyllCompiler.idyllCompilerStrings.variable = this.cast("variable")
}

