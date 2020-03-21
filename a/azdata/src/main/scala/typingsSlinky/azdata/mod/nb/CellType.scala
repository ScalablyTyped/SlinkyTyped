package typingsSlinky.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.azdata.azdataStrings.code
  - typingsSlinky.azdata.azdataStrings.markdown
  - typingsSlinky.azdata.azdataStrings.raw
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typingsSlinky.azdata.azdataStrings.code = this.cast("code")
  @scala.inline
  def markdown: typingsSlinky.azdata.azdataStrings.markdown = this.cast("markdown")
  @scala.inline
  def raw: typingsSlinky.azdata.azdataStrings.raw = this.cast("raw")
}

