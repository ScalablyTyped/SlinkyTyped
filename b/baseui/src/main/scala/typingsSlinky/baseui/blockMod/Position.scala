package typingsSlinky.baseui.blockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.baseui.baseuiStrings.static
  - typings.baseui.baseuiStrings.absolute
  - typings.baseui.baseuiStrings.relative
  - typings.baseui.baseuiStrings.fixed
  - typings.baseui.baseuiStrings.sticky
*/
trait Position extends js.Object

object Position {
  @scala.inline
  def absolute: typingsSlinky.baseui.baseuiStrings.absolute = this.cast("absolute")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fixed: typingsSlinky.baseui.baseuiStrings.fixed = this.cast("fixed")
  @scala.inline
  def relative: typingsSlinky.baseui.baseuiStrings.relative = this.cast("relative")
  @scala.inline
  def static: typingsSlinky.baseui.baseuiStrings.static = this.cast("static")
  @scala.inline
  def sticky: typingsSlinky.baseui.baseuiStrings.sticky = this.cast("sticky")
}

