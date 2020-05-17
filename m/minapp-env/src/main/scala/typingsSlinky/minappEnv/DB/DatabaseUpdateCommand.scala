package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseUpdateCommand extends js.Object {
  var fieldName: String | InternalSymbol = js.native
  var operands: Array[_] = js.native
  var operator: UPDATE_COMMANDS_LITERAL = js.native
  def _setFieldName(fieldName: String): DatabaseUpdateCommand = js.native
}

object DatabaseUpdateCommand {
  @scala.inline
  def apply(
    _setFieldName: String => DatabaseUpdateCommand,
    fieldName: String | InternalSymbol,
    operands: Array[_],
    operator: UPDATE_COMMANDS_LITERAL
  ): DatabaseUpdateCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), fieldName = fieldName.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUpdateCommand]
  }
  @scala.inline
  implicit class DatabaseUpdateCommandOps[Self <: DatabaseUpdateCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_setFieldName(value: String => DatabaseUpdateCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setFieldName")(js.Any.fromFunction1(value))
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
    def withOperator(value: UPDATE_COMMANDS_LITERAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

