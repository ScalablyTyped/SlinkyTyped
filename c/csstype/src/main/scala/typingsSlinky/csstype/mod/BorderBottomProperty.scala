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
trait BorderBottomProperty[TLength] extends js.Object

object BorderBottomProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): BorderBottomProperty[TLength] = value.asInstanceOf[BorderBottomProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderBottomProperty[TLength] = value.asInstanceOf[BorderBottomProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): BorderBottomProperty[TLength] = value.asInstanceOf[BorderBottomProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderBottomProperty[TLength] = value.asInstanceOf[BorderBottomProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderBottomProperty[TLength] = value.asInstanceOf[BorderBottomProperty[TLength]]
}

