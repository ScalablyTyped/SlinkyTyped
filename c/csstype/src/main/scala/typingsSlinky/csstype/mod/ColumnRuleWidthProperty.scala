package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.LineWidth[TLength]
  - java.lang.String
*/
trait ColumnRuleWidthProperty[TLength] extends js.Object

object ColumnRuleWidthProperty {
  @scala.inline
  implicit def apply[TLength](value: Globals): ColumnRuleWidthProperty[TLength] = value.asInstanceOf[ColumnRuleWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: LineWidth[TLength]): ColumnRuleWidthProperty[TLength] = value.asInstanceOf[ColumnRuleWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): ColumnRuleWidthProperty[TLength] = value.asInstanceOf[ColumnRuleWidthProperty[TLength]]
}

