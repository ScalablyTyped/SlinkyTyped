package typingsSlinky.milkcocoa.milkcocoa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  def done(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def limit(number: Double): Query = js.native
  def skip(index: Double): Query = js.native
  // mode  asc, desc
  def sort(mode: String): Query = js.native
}

object Query {
  @scala.inline
  def apply(
    done: js.Function1[/* data */ js.Any, Unit] => Unit,
    limit: Double => Query,
    skip: Double => Query,
    sort: String => Query
  ): Query = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), limit = js.Any.fromFunction1(limit), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(value: js.Function1[/* data */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLimit(value: Double => Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkip(value: Double => Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: String => Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

