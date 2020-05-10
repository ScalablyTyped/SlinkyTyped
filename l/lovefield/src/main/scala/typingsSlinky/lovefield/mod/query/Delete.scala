package typingsSlinky.lovefield.mod.query

import typingsSlinky.lovefield.mod.Predicate
import typingsSlinky.lovefield.mod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends Builder {
  def from(table: Table): Delete = js.native
  def where(predicate: Predicate): Delete = js.native
}

object Delete {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => Builder,
    exec: () => js.Promise[js.Array[js.Object]],
    explain: () => String,
    from: Table => Delete,
    toSql: () => String,
    where: Predicate => Delete
  ): Delete = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), from = js.Any.fromFunction1(from), toSql = js.Any.fromFunction0(toSql), where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[Delete]
  }
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Table => Delete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhere(value: Predicate => Delete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

