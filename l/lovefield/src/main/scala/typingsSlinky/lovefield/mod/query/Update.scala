package typingsSlinky.lovefield.mod.query

import typingsSlinky.lovefield.mod.Predicate
import typingsSlinky.lovefield.mod.schema.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends Builder {
  def set(column: Column, value: js.Any): Update = js.native
  def where(predicate: Predicate): Update = js.native
}

object Update {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => Builder,
    exec: () => js.Promise[js.Array[js.Object]],
    explain: () => String,
    set: (Column, js.Any) => Update,
    toSql: () => String,
    where: Predicate => Update
  ): Update = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), set = js.Any.fromFunction2(set), toSql = js.Any.fromFunction0(toSql), where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[Update]
  }
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSet(value: (Column, js.Any) => Update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWhere(value: Predicate => Update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

