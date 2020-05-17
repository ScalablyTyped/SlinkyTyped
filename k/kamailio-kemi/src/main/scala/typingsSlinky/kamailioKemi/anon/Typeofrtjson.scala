package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofrtjson extends js.Object {
  def init_routes(rdoc: String): Double = js.native
  def next_route(): Double = js.native
  def push_routes(): Double = js.native
  def update_branch(): Double = js.native
}

object Typeofrtjson {
  @scala.inline
  def apply(
    init_routes: String => Double,
    next_route: () => Double,
    push_routes: () => Double,
    update_branch: () => Double
  ): Typeofrtjson = {
    val __obj = js.Dynamic.literal(init_routes = js.Any.fromFunction1(init_routes), next_route = js.Any.fromFunction0(next_route), push_routes = js.Any.fromFunction0(push_routes), update_branch = js.Any.fromFunction0(update_branch))
    __obj.asInstanceOf[Typeofrtjson]
  }
  @scala.inline
  implicit class TypeofrtjsonOps[Self <: Typeofrtjson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit_routes(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init_routes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNext_route(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_route")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush_routes(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push_routes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate_branch(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_branch")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

