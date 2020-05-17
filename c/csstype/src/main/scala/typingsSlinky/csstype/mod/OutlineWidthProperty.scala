package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.LineWidth[TLength]
*/
trait OutlineWidthProperty[TLength] extends js.Object

object OutlineWidthProperty {
  @scala.inline
  implicit def apply[TLength](value: Globals): OutlineWidthProperty[TLength] = value.asInstanceOf[OutlineWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): OutlineWidthProperty[TLength] = value.asInstanceOf[OutlineWidthProperty[TLength]]
}

