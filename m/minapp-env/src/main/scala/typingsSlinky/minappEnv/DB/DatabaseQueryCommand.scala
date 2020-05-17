package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseQueryCommand extends DatabaseLogicCommand {
  @JSName("operator")
  var operator_DatabaseQueryCommand: QUERY_COMMANDS_LITERAL | String = js.native
  def eq(`val`: js.Any): DatabaseLogicCommand = js.native
  def gt(`val`: js.Any): DatabaseLogicCommand = js.native
  def gte(`val`: js.Any): DatabaseLogicCommand = js.native
  def in(`val`: Array[_]): DatabaseLogicCommand = js.native
  def lt(`val`: js.Any): DatabaseLogicCommand = js.native
  def lte(`val`: js.Any): DatabaseLogicCommand = js.native
  def neq(`val`: js.Any): DatabaseLogicCommand = js.native
  def nin(`val`: Array[_]): DatabaseLogicCommand = js.native
}

object DatabaseQueryCommand {
  @scala.inline
  def apply(
    _setFieldName: String => DatabaseLogicCommand,
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    eq: js.Any => DatabaseLogicCommand,
    fieldName: String | InternalSymbol,
    gt: js.Any => DatabaseLogicCommand,
    gte: js.Any => DatabaseLogicCommand,
    in: Array[_] => DatabaseLogicCommand,
    lt: js.Any => DatabaseLogicCommand,
    lte: js.Any => DatabaseLogicCommand,
    neq: js.Any => DatabaseLogicCommand,
    nin: Array[_] => DatabaseLogicCommand,
    operands: Array[_],
    operator: QUERY_COMMANDS_LITERAL | String,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand
  ): DatabaseQueryCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), and = js.Any.fromFunction1(and), eq = js.Any.fromFunction1(eq), fieldName = fieldName.asInstanceOf[js.Any], gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[DatabaseQueryCommand]
  }
  @scala.inline
  implicit class DatabaseQueryCommandOps[Self <: DatabaseQueryCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEq(value: js.Any => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGt(value: js.Any => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGte(value: js.Any => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIn(value: Array[_] => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLt(value: js.Any => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLte(value: js.Any => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNeq(value: js.Any => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNin(value: Array[_] => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOperator(value: QUERY_COMMANDS_LITERAL | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

