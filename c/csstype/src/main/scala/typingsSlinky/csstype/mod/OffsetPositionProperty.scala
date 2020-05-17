package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Position[TLength]
  - typingsSlinky.csstype.csstypeStrings.auto
*/
trait OffsetPositionProperty[TLength] extends js.Object

object OffsetPositionProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): OffsetPositionProperty[TLength] = value.asInstanceOf[OffsetPositionProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Position[TLength]): OffsetPositionProperty[TLength] = value.asInstanceOf[OffsetPositionProperty[TLength]]
}

