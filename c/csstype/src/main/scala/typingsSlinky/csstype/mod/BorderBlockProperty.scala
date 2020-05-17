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
trait BorderBlockProperty[TLength] extends js.Object

object BorderBlockProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderBlockProperty[TLength] = value.asInstanceOf[BorderBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderBlockProperty[TLength] = value.asInstanceOf[BorderBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderBlockProperty[TLength] = value.asInstanceOf[BorderBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderBlockProperty[TLength] = value.asInstanceOf[BorderBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderBlockProperty[TLength] = value.asInstanceOf[BorderBlockProperty[TLength]]
}

