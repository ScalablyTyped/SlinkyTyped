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
trait BorderProperty[TLength] extends js.Object

object BorderProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderProperty[TLength] = value.asInstanceOf[BorderProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderProperty[TLength] = value.asInstanceOf[BorderProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderProperty[TLength] = value.asInstanceOf[BorderProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderProperty[TLength] = value.asInstanceOf[BorderProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderProperty[TLength] = value.asInstanceOf[BorderProperty[TLength]]
}

