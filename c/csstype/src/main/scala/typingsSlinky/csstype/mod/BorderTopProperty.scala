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
trait BorderTopProperty[TLength] extends js.Object

object BorderTopProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderTopProperty[TLength] = value.asInstanceOf[BorderTopProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderTopProperty[TLength] = value.asInstanceOf[BorderTopProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderTopProperty[TLength] = value.asInstanceOf[BorderTopProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderTopProperty[TLength] = value.asInstanceOf[BorderTopProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderTopProperty[TLength] = value.asInstanceOf[BorderTopProperty[TLength]]
}

