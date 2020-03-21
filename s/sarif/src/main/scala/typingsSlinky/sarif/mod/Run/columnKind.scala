package typingsSlinky.sarif.mod.Run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sarif.sarifStrings.utf16CodeUnits
  - typingsSlinky.sarif.sarifStrings.unicodeCodePoints
*/
trait columnKind extends js.Object

object columnKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unicodeCodePoints: typingsSlinky.sarif.sarifStrings.unicodeCodePoints = this.cast("unicodeCodePoints")
  @scala.inline
  def utf16CodeUnits: typingsSlinky.sarif.sarifStrings.utf16CodeUnits = this.cast("utf16CodeUnits")
}

