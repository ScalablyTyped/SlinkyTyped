package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.normal
  - java.lang.String
  - scala.Double
*/
trait LineHeightProperty[TLength] extends js.Object

object LineHeightProperty {
  @scala.inline
  def normal[TLength]: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  implicit def apply[TLength](value: Double): LineHeightProperty[TLength] = value.asInstanceOf[LineHeightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): LineHeightProperty[TLength] = value.asInstanceOf[LineHeightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): LineHeightProperty[TLength] = value.asInstanceOf[LineHeightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): LineHeightProperty[TLength] = value.asInstanceOf[LineHeightProperty[TLength]]
}

