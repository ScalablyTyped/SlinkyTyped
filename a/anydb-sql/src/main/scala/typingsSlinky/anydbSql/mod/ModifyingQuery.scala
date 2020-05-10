package typingsSlinky.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyingQuery extends Executable[Unit] {
  def returning[U](nodes: js.Any*): Query[U] = js.native
  def where(nodes: js.Any*): ModifyingQuery = js.native
}

object ModifyingQuery {
  @scala.inline
  def apply(
    all: () => typingsSlinky.bluebird.mod.^[js.Array[Unit]],
    allWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[js.Array[Unit]],
    exec: () => typingsSlinky.bluebird.mod.^[Unit],
    execWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit],
    get: () => typingsSlinky.bluebird.mod.^[Unit],
    getWithin: DatabaseConnection => typingsSlinky.bluebird.mod.^[Unit],
    returning: /* repeated */ js.Any => Query[js.Any],
    toQuery: () => QueryLike,
    where: /* repeated */ js.Any => ModifyingQuery
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), returning = js.Any.fromFunction1(returning), toQuery = js.Any.fromFunction0(toQuery), where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[ModifyingQuery]
  }
  @scala.inline
  implicit class ModifyingQueryOps[Self <: ModifyingQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturning(value: /* repeated */ js.Any => Query[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returning")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhere(value: /* repeated */ js.Any => ModifyingQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

