package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Color
  - typingsSlinky.csstype.csstypeStrings.auto
  - typingsSlinky.csstype.csstypeStrings.dark
  - typingsSlinky.csstype.csstypeStrings.light
*/
trait ScrollbarColorProperty extends js.Object

object ScrollbarColorProperty {
  @scala.inline
  def auto: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  def dark: typingsSlinky.csstype.csstypeStrings.dark = "dark".asInstanceOf[typingsSlinky.csstype.csstypeStrings.dark]
  @scala.inline
  def light: typingsSlinky.csstype.csstypeStrings.light = "light".asInstanceOf[typingsSlinky.csstype.csstypeStrings.light]
  @scala.inline
  implicit def apply(value: Color): ScrollbarColorProperty = value.asInstanceOf[ScrollbarColorProperty]
  @scala.inline
  implicit def apply(value: Globals): ScrollbarColorProperty = value.asInstanceOf[ScrollbarColorProperty]
}

