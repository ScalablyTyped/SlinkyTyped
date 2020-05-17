package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Position[TLength]
  - typingsSlinky.csstype.csstypeStrings.auto
*/
trait OffsetAnchorProperty[TLength] extends js.Object

object OffsetAnchorProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): OffsetAnchorProperty[TLength] = value.asInstanceOf[OffsetAnchorProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Position[TLength]): OffsetAnchorProperty[TLength] = value.asInstanceOf[OffsetAnchorProperty[TLength]]
}

