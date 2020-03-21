package typingsSlinky.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parse5.parse5Strings.`no-quirks`
  - typingsSlinky.parse5.parse5Strings.quirks
  - typingsSlinky.parse5.parse5Strings.`limited-quirks`
*/
trait DocumentMode extends js.Object

object DocumentMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `limited-quirks`: typingsSlinky.parse5.parse5Strings.`limited-quirks` = this.cast("limited-quirks")
  @scala.inline
  def `no-quirks`: typingsSlinky.parse5.parse5Strings.`no-quirks` = this.cast("no-quirks")
  @scala.inline
  def quirks: typingsSlinky.parse5.parse5Strings.quirks = this.cast("quirks")
}

