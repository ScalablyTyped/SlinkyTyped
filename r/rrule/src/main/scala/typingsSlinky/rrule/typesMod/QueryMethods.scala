package typingsSlinky.rrule.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMethods extends js.Object {
  def after(date: js.Date, inc: Boolean): js.Date
  def all(): js.Array[js.Date]
  def before(date: js.Date, inc: Boolean): js.Date
  def between(after: js.Date, before: js.Date, inc: Boolean): js.Array[js.Date]
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
}

