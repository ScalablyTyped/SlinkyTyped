package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.LineWidth[TLength]
  - typingsSlinky.csstype.mod.LineStyle
  - typingsSlinky.csstype.mod.Color
  - java.lang.String
*/
trait BorderInlineStartProperty[TLength] extends js.Object

object BorderInlineStartProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderInlineStartProperty[TLength] = value.asInstanceOf[BorderInlineStartProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderInlineStartProperty[TLength] = value.asInstanceOf[BorderInlineStartProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderInlineStartProperty[TLength] = value.asInstanceOf[BorderInlineStartProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderInlineStartProperty[TLength] = value.asInstanceOf[BorderInlineStartProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderInlineStartProperty[TLength] = value.asInstanceOf[BorderInlineStartProperty[TLength]]
}

