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
trait BorderBlockEndProperty[TLength] extends js.Object

object BorderBlockEndProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderBlockEndProperty[TLength] = value.asInstanceOf[BorderBlockEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderBlockEndProperty[TLength] = value.asInstanceOf[BorderBlockEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderBlockEndProperty[TLength] = value.asInstanceOf[BorderBlockEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderBlockEndProperty[TLength] = value.asInstanceOf[BorderBlockEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderBlockEndProperty[TLength] = value.asInstanceOf[BorderBlockEndProperty[TLength]]
}

