package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseCommand extends js.Object {
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  def eq(`val`: js.Any): DatabaseQueryCommand = js.native
  def gt(`val`: js.Any): DatabaseQueryCommand = js.native
  def gte(`val`: js.Any): DatabaseQueryCommand = js.native
  def in(`val`: Array[_]): DatabaseQueryCommand = js.native
  def inc(`val`: Double): DatabaseUpdateCommand = js.native
  def lt(`val`: js.Any): DatabaseQueryCommand = js.native
  def lte(`val`: js.Any): DatabaseQueryCommand = js.native
  def mul(`val`: Double): DatabaseUpdateCommand = js.native
  def neq(`val`: js.Any): DatabaseQueryCommand = js.native
  def nin(`val`: Array[_]): DatabaseQueryCommand = js.native
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  def pop(): DatabaseUpdateCommand = js.native
  def push(values: js.Any*): DatabaseUpdateCommand = js.native
  def remove(): DatabaseUpdateCommand = js.native
  def set(`val`: js.Any): DatabaseUpdateCommand = js.native
  def shift(): DatabaseUpdateCommand = js.native
  def unshift(values: js.Any*): DatabaseUpdateCommand = js.native
}

object DatabaseCommand {
  @scala.inline
  def apply(
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    eq: js.Any => DatabaseQueryCommand,
    gt: js.Any => DatabaseQueryCommand,
    gte: js.Any => DatabaseQueryCommand,
    in: Array[_] => DatabaseQueryCommand,
    inc: Double => DatabaseUpdateCommand,
    lt: js.Any => DatabaseQueryCommand,
    lte: js.Any => DatabaseQueryCommand,
    mul: Double => DatabaseUpdateCommand,
    neq: js.Any => DatabaseQueryCommand,
    nin: Array[_] => DatabaseQueryCommand,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    pop: () => DatabaseUpdateCommand,
    push: /* repeated */ js.Any => DatabaseUpdateCommand,
    remove: () => DatabaseUpdateCommand,
    set: js.Any => DatabaseUpdateCommand,
    shift: () => DatabaseUpdateCommand,
    unshift: /* repeated */ js.Any => DatabaseUpdateCommand
  ): DatabaseCommand = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), eq = js.Any.fromFunction1(eq), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), inc = js.Any.fromFunction1(inc), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), mul = js.Any.fromFunction1(mul), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), or = js.Any.fromFunction1(or), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set), shift = js.Any.fromFunction0(shift), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[DatabaseCommand]
  }
  @scala.inline
  implicit class DatabaseCommandOps[Self <: DatabaseCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEq(value: js.Any => DatabaseQueryCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGt(value: js.Any => DatabaseQueryCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGte(value: js.Any => DatabaseQueryCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIn(value: Array[_] => DatabaseQueryCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInc(value: Double => DatabaseUpdateCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLt(value: js.Any => DatabaseQueryCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLte(value: js.Any => DatabaseQueryCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMul(value: Double => DatabaseUpdateCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mul")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNeq(value: js.Any => DatabaseQueryCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNin(value: Array[_] => DatabaseQueryCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOr(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPop(value: () => DatabaseUpdateCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: /* repeated */ js.Any => DatabaseUpdateCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => DatabaseUpdateCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: js.Any => DatabaseUpdateCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShift(value: () => DatabaseUpdateCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnshift(value: /* repeated */ js.Any => DatabaseUpdateCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

