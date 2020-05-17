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
trait ColumnsProperty[TLength] extends js.Object

object ColumnsProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Double): ColumnsProperty[TLength] = value.asInstanceOf[ColumnsProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): ColumnsProperty[TLength] = value.asInstanceOf[ColumnsProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): ColumnsProperty[TLength] = value.asInstanceOf[ColumnsProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): ColumnsProperty[TLength] = value.asInstanceOf[ColumnsProperty[TLength]]
}

