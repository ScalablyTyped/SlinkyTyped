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
trait BorderRightProperty[TLength] extends js.Object

object BorderRightProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderRightProperty[TLength] = value.asInstanceOf[BorderRightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderRightProperty[TLength] = value.asInstanceOf[BorderRightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderRightProperty[TLength] = value.asInstanceOf[BorderRightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderRightProperty[TLength] = value.asInstanceOf[BorderRightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderRightProperty[TLength] = value.asInstanceOf[BorderRightProperty[TLength]]
}

