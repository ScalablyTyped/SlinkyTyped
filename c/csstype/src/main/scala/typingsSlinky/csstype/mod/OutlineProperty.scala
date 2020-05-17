package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Color
  - typingsSlinky.csstype.mod.LineStyle
  - typingsSlinky.csstype.mod.LineWidth[TLength]
  - typingsSlinky.csstype.csstypeStrings.auto
  - typingsSlinky.csstype.csstypeStrings.invert
  - java.lang.String
*/
trait OutlineProperty[TLength] extends js.Object

object OutlineProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  def invert[TLength]: typingsSlinky.csstype.csstypeStrings.invert = "invert".asInstanceOf[typingsSlinky.csstype.csstypeStrings.invert]
  @scala.inline
  implicit def apply[TLength](value: Color): OutlineProperty[TLength] = value.asInstanceOf[OutlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): OutlineProperty[TLength] = value.asInstanceOf[OutlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): OutlineProperty[TLength] = value.asInstanceOf[OutlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): OutlineProperty[TLength] = value.asInstanceOf[OutlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): OutlineProperty[TLength] = value.asInstanceOf[OutlineProperty[TLength]]
}

