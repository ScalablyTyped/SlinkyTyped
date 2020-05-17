package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.LineWidth[TLength]
  - java.lang.String
*/
trait BorderWidthProperty[TLength] extends js.Object

object BorderWidthProperty {
  @scala.inline
  implicit def apply[TLength](value: Globals): BorderWidthProperty[TLength] = value.asInstanceOf[BorderWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): BorderWidthProperty[TLength] = value.asInstanceOf[BorderWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BorderWidthProperty[TLength] = value.asInstanceOf[BorderWidthProperty[TLength]]
}

