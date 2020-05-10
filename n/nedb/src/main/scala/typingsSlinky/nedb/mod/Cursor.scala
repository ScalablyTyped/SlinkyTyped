package typingsSlinky.nedb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor[T] extends js.Object {
  def exec(callback: js.Function2[/* err */ js.Error, /* documents */ js.Array[T], Unit]): Unit = js.native
  def limit(n: Double): Cursor[T] = js.native
  def projection(query: js.Any): Cursor[T] = js.native
  def skip(n: Double): Cursor[T] = js.native
  def sort(query: js.Any): Cursor[T] = js.native
}

object Cursor {
  @scala.inline
  def apply[T](
    exec: js.Function2[/* err */ js.Error, /* documents */ js.Array[T], Unit] => Unit,
    limit: Double => Cursor[T],
    projection: js.Any => Cursor[T],
    skip: Double => Cursor[T],
    sort: js.Any => Cursor[T]
  ): Cursor[T] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), limit = js.Any.fromFunction1(limit), projection = js.Any.fromFunction1(projection), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[Cursor[T]]
  }
  @scala.inline
  implicit class CursorOps[Self[t] <: Cursor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExec(value: js.Function2[/* err */ js.Error, /* documents */ js.Array[T], Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLimit(value: Double => Cursor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProjection(value: js.Any => Cursor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkip(value: Double => Cursor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: js.Any => Cursor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

