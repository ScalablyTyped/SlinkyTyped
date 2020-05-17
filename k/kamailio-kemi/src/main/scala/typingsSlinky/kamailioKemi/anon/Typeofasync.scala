package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofasync extends js.Object {
  def route(rn: String, s: Double): Double = js.native
  def task_route(rn: String): Double = js.native
}

object Typeofasync {
  @scala.inline
  def apply(route: (String, Double) => Double, task_route: String => Double): Typeofasync = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2(route), task_route = js.Any.fromFunction1(task_route))
    __obj.asInstanceOf[Typeofasync]
  }
  @scala.inline
  implicit class TypeofasyncOps[Self <: Typeofasync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoute(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTask_route(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task_route")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

