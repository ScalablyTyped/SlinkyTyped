package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.LineWidth[TLength]
  - typingsSlinky.csstype.mod.LineStyle
  - typingsSlinky.csstype.mod.Color
  - java.lang.String
*/
trait ColumnRuleProperty[TLength] extends js.Object

object ColumnRuleProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): ColumnRuleProperty[TLength] = value.asInstanceOf[ColumnRuleProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): ColumnRuleProperty[TLength] = value.asInstanceOf[ColumnRuleProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineStyle): ColumnRuleProperty[TLength] = value.asInstanceOf[ColumnRuleProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): ColumnRuleProperty[TLength] = value.asInstanceOf[ColumnRuleProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): ColumnRuleProperty[TLength] = value.asInstanceOf[ColumnRuleProperty[TLength]]
}

