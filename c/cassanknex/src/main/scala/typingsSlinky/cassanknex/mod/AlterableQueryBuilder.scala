package typingsSlinky.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterableQueryBuilder[T] extends js.Object {
  def alter[K /* <: /* keyof T */ String */](column: K, newType: String): this.type = js.native
  def drop[K /* <: /* keyof T */ String */](columns: K*): this.type = js.native
  def rename[K /* <: /* keyof T */ String */](column: K, newColumn: K): this.type = js.native
}

object AlterableQueryBuilder {
  @scala.inline
  def apply[T](
    alter: (js.Any, String) => AlterableQueryBuilder[T],
    drop: /* repeated */ js.Any => AlterableQueryBuilder[T],
    rename: (js.Any, js.Any) => AlterableQueryBuilder[T]
  ): AlterableQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(alter = js.Any.fromFunction2(alter), drop = js.Any.fromFunction1(drop), rename = js.Any.fromFunction2(rename))
    __obj.asInstanceOf[AlterableQueryBuilder[T]]
  }
  @scala.inline
  implicit class AlterableQueryBuilderOps[Self[t] <: AlterableQueryBuilder[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAlter(value: (js.Any, String) => AlterableQueryBuilder[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrop(value: /* repeated */ js.Any => AlterableQueryBuilder[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRename(value: (js.Any, js.Any) => AlterableQueryBuilder[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

