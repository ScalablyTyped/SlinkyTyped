package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Position[TLength]
  - typingsSlinky.csstype.mod.GeometryBox
  - typingsSlinky.csstype.csstypeStrings.auto
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait OffsetProperty[TLength] extends js.Object

object OffsetProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply[TLength](value: GeometryBox): OffsetProperty[TLength] = value.asInstanceOf[OffsetProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): OffsetProperty[TLength] = value.asInstanceOf[OffsetProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Position[TLength]): OffsetProperty[TLength] = value.asInstanceOf[OffsetProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): OffsetProperty[TLength] = value.asInstanceOf[OffsetProperty[TLength]]
}

