package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.DisplayOutside
  - typingsSlinky.csstype.mod.DisplayInside
  - typingsSlinky.csstype.mod.DisplayInternal
  - typingsSlinky.csstype.mod.DisplayLegacy
  - typingsSlinky.csstype.csstypeStrings.contents
  - typingsSlinky.csstype.csstypeStrings.`list-item`
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait DisplayProperty extends js.Object

object DisplayProperty {
  @scala.inline
  def contents: typingsSlinky.csstype.csstypeStrings.contents = "contents".asInstanceOf[typingsSlinky.csstype.csstypeStrings.contents]
  @scala.inline
  def `list-item`: typingsSlinky.csstype.csstypeStrings.`list-item` = "list-item".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`list-item`]
  @scala.inline
  def none: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply(value: DisplayInside): DisplayProperty = value.asInstanceOf[DisplayProperty]
  @scala.inline
  implicit def apply(value: DisplayInternal): DisplayProperty = value.asInstanceOf[DisplayProperty]
  @scala.inline
  implicit def apply(value: DisplayLegacy): DisplayProperty = value.asInstanceOf[DisplayProperty]
  @scala.inline
  implicit def apply(value: DisplayOutside): DisplayProperty = value.asInstanceOf[DisplayProperty]
  @scala.inline
  implicit def apply(value: Globals): DisplayProperty = value.asInstanceOf[DisplayProperty]
  @scala.inline
  implicit def apply(value: String): DisplayProperty = value.asInstanceOf[DisplayProperty]
}

