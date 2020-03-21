package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type which describes the type of cell.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.code
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.markdown
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.raw
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.code = this.cast("code")
  @scala.inline
  def markdown: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.markdown = this.cast("markdown")
  @scala.inline
  def raw: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.raw = this.cast("raw")
}

