package typingsSlinky.rrule.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryMethods extends js.Object {
  def after(date: js.Date, inc: Boolean): js.Date = js.native
  def all(): js.Array[js.Date] = js.native
  def before(date: js.Date, inc: Boolean): js.Date = js.native
  def between(after: js.Date, before: js.Date, inc: Boolean): js.Array[js.Date] = js.native
}

object QueryMethods {
  @scala.inline
  def apply(
    after: (js.Date, Boolean) => js.Date,
    all: () => js.Array[js.Date],
    before: (js.Date, Boolean) => js.Date,
    between: (js.Date, js.Date, Boolean) => js.Array[js.Date]
  ): QueryMethods = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction2(after), all = js.Any.fromFunction0(all), before = js.Any.fromFunction2(before), between = js.Any.fromFunction3(between))
    __obj.asInstanceOf[QueryMethods]
  }
  @scala.inline
  implicit class QueryMethodsOps[Self <: QueryMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: (js.Date, Boolean) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAll(value: () => js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBefore(value: (js.Date, Boolean) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBetween(value: (js.Date, js.Date, Boolean) => js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

