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
trait BorderLeftProperty[TLength] extends js.Object

object BorderLeftProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderLeftProperty[TLength] = value.asInstanceOf[BorderLeftProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderLeftProperty[TLength] = value.asInstanceOf[BorderLeftProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderLeftProperty[TLength] = value.asInstanceOf[BorderLeftProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderLeftProperty[TLength] = value.asInstanceOf[BorderLeftProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderLeftProperty[TLength] = value.asInstanceOf[BorderLeftProperty[TLength]]
}

