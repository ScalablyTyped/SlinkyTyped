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
trait BorderBlockStartProperty[TLength] extends js.Object

object BorderBlockStartProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderBlockStartProperty[TLength] = value.asInstanceOf[BorderBlockStartProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderBlockStartProperty[TLength] = value.asInstanceOf[BorderBlockStartProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderBlockStartProperty[TLength] = value.asInstanceOf[BorderBlockStartProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderBlockStartProperty[TLength] = value.asInstanceOf[BorderBlockStartProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderBlockStartProperty[TLength] = value.asInstanceOf[BorderBlockStartProperty[TLength]]
}

