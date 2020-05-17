package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.auto
  - java.lang.String
  - scala.Double
*/
trait MaskBorderWidthProperty[TLength] extends js.Object

object MaskBorderWidthProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Double): MaskBorderWidthProperty[TLength] = value.asInstanceOf[MaskBorderWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): MaskBorderWidthProperty[TLength] = value.asInstanceOf[MaskBorderWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MaskBorderWidthProperty[TLength] = value.asInstanceOf[MaskBorderWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): MaskBorderWidthProperty[TLength] = value.asInstanceOf[MaskBorderWidthProperty[TLength]]
}

