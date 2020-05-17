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
trait BorderInlineEndProperty[TLength] extends js.Object

object BorderInlineEndProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderInlineEndProperty[TLength] = value.asInstanceOf[BorderInlineEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderInlineEndProperty[TLength] = value.asInstanceOf[BorderInlineEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderInlineEndProperty[TLength] = value.asInstanceOf[BorderInlineEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderInlineEndProperty[TLength] = value.asInstanceOf[BorderInlineEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderInlineEndProperty[TLength] = value.asInstanceOf[BorderInlineEndProperty[TLength]]
}

