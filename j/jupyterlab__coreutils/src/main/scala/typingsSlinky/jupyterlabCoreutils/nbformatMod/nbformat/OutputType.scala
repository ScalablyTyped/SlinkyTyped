package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid output types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.execute_result
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.display_data
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stream
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.error
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.update_display_data
*/
trait OutputType extends js.Object

object OutputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def display_data: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.error = this.cast("error")
  @scala.inline
  def execute_result: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def stream: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.update_display_data = this.cast("update_display_data")
}

