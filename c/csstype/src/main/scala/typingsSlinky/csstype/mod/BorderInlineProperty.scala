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
trait BorderInlineProperty[TLength] extends js.Object

object BorderInlineProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderInlineProperty[TLength] = value.asInstanceOf[BorderInlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderInlineProperty[TLength] = value.asInstanceOf[BorderInlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderInlineProperty[TLength] = value.asInstanceOf[BorderInlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderInlineProperty[TLength] = value.asInstanceOf[BorderInlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderInlineProperty[TLength] = value.asInstanceOf[BorderInlineProperty[TLength]]
}

