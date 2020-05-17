package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseLogicCommand extends js.Object {
  var fieldName: String | InternalSymbol = js.native
  var operands: Array[_] = js.native
  var operator: LOGIC_COMMANDS_LITERAL | String = js.native
  def _setFieldName(fieldName: String): DatabaseLogicCommand = js.native
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
}

object DatabaseLogicCommand {
  @scala.inline
  def apply(
    _setFieldName: String => DatabaseLogicCommand,
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    fieldName: String | InternalSymbol,
    operands: Array[_],
    operator: LOGIC_COMMANDS_LITERAL | String,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand
  ): DatabaseLogicCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), and = js.Any.fromFunction1(and), fieldName = fieldName.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[DatabaseLogicCommand]
  }
  @scala.inline
  implicit class DatabaseLogicCommandOps[Self <: DatabaseLogicCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_setFieldName(value: String => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setFieldName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnd(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFieldName(value: String | InternalSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperands(value: Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: LOGIC_COMMANDS_LITERAL | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOr(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

