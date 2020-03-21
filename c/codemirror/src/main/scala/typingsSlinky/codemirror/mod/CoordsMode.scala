package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.codemirror.codemirrorStrings.window
  - typingsSlinky.codemirror.codemirrorStrings.page
  - typingsSlinky.codemirror.codemirrorStrings.local
  - typingsSlinky.codemirror.codemirrorStrings.div
*/
trait CoordsMode extends js.Object

object CoordsMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def div: typingsSlinky.codemirror.codemirrorStrings.div = this.cast("div")
  @scala.inline
  def local: typingsSlinky.codemirror.codemirrorStrings.local = this.cast("local")
  @scala.inline
  def page: typingsSlinky.codemirror.codemirrorStrings.page = this.cast("page")
  @scala.inline
  def window: typingsSlinky.codemirror.codemirrorStrings.window = this.cast("window")
}

