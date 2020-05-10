package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedColumn extends js.Object {
  /**
    * A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated column matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated column.
    */
  var ColumnId: typingsSlinky.awsSdk.quicksightMod.ColumnId = js.native
  /**
    * Column name.
    */
  var ColumnName: typingsSlinky.awsSdk.quicksightMod.ColumnName = js.native
  /**
    * An expression that defines the calculated column.
    */
  var Expression: typingsSlinky.awsSdk.quicksightMod.Expression = js.native
}

object CalculatedColumn {
  @scala.inline
  def apply(ColumnId: ColumnId, ColumnName: ColumnName, Expression: Expression): CalculatedColumn = {
    val __obj = js.Dynamic.literal(ColumnId = ColumnId.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedColumn]
  }
  @scala.inline
  implicit class CalculatedColumnOps[Self <: CalculatedColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnId(value: ColumnId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnName(value: ColumnName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

