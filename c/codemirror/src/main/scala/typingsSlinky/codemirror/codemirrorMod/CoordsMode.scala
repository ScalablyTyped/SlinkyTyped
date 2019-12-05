package typingsSlinky.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.codemirror.codemirrorStrings.window
  - typings.codemirror.codemirrorStrings.page
  - typings.codemirror.codemirrorStrings.local
  - typings.codemirror.codemirrorStrings.div
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

