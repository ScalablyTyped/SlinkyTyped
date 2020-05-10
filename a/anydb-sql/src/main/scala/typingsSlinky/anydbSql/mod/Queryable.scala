package typingsSlinky.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queryable[T] extends js.Object {
  def delete(): ModifyingQuery = js.native
  def select[U](nodes: js.Any*): Query[U] = js.native
  def selectDeep[U](nodesOrTables: js.Any*): Query[U] = js.native
  def where(nodes: js.Any*): Query[T] = js.native
}

object Queryable {
  @scala.inline
  def apply[T](
    delete: () => ModifyingQuery,
    select: /* repeated */ js.Any => Query[js.Any],
    selectDeep: /* repeated */ js.Any => Query[js.Any],
    where: /* repeated */ js.Any => Query[T]
  ): Queryable[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), select = js.Any.fromFunction1(select), selectDeep = js.Any.fromFunction1(selectDeep), where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[Queryable[T]]
  }
  @scala.inline
  implicit class QueryableOps[Self[t] <: Queryable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDelete(value: () => ModifyingQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelect(value: /* repeated */ js.Any => Query[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectDeep(value: /* repeated */ js.Any => Query[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectDeep")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhere(value: /* repeated */ js.Any => Query[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

