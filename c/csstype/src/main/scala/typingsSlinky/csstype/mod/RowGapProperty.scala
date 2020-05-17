package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.normal
  - java.lang.String
*/
trait RowGapProperty[TLength] extends js.Object

object RowGapProperty {
  @scala.inline
  def normal[TLength]: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  implicit def apply[TLength](value: Globals): RowGapProperty[TLength] = value.asInstanceOf[RowGapProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): RowGapProperty[TLength] = value.asInstanceOf[RowGapProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): RowGapProperty[TLength] = value.asInstanceOf[RowGapProperty[TLength]]
}

