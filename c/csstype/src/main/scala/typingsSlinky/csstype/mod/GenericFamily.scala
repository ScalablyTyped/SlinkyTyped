package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.csstypeStrings.cursive
  - typingsSlinky.csstype.csstypeStrings.fantasy
  - typingsSlinky.csstype.csstypeStrings.monospace
  - typingsSlinky.csstype.csstypeStrings.`sans-serif`
  - typingsSlinky.csstype.csstypeStrings.serif
*/
trait GenericFamily extends _FontFamilyProperty

object GenericFamily {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cursive: typingsSlinky.csstype.csstypeStrings.cursive = this.cast("cursive")
  @scala.inline
  def fantasy: typingsSlinky.csstype.csstypeStrings.fantasy = this.cast("fantasy")
  @scala.inline
  def monospace: typingsSlinky.csstype.csstypeStrings.monospace = this.cast("monospace")
  @scala.inline
  def `sans-serif`: typingsSlinky.csstype.csstypeStrings.`sans-serif` = this.cast("sans-serif")
  @scala.inline
  def serif: typingsSlinky.csstype.csstypeStrings.serif = this.cast("serif")
}

