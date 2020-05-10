package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofrr extends js.Object {
  def add_rr_param(sparam: String): Double = js.native
  def check_route_param(sre: String): Double = js.native
  def is_direction(dir: String): Double = js.native
  def loose_route(): Double = js.native
  def record_route(): Double = js.native
  def record_route_params(params: String): Double = js.native
  def remove_record_route(): Double = js.native
}

object Typeofrr {
  @scala.inline
  def apply(
    add_rr_param: String => Double,
    check_route_param: String => Double,
    is_direction: String => Double,
    loose_route: () => Double,
    record_route: () => Double,
    record_route_params: String => Double,
    remove_record_route: () => Double
  ): Typeofrr = {
    val __obj = js.Dynamic.literal(add_rr_param = js.Any.fromFunction1(add_rr_param), check_route_param = js.Any.fromFunction1(check_route_param), is_direction = js.Any.fromFunction1(is_direction), loose_route = js.Any.fromFunction0(loose_route), record_route = js.Any.fromFunction0(record_route), record_route_params = js.Any.fromFunction1(record_route_params), remove_record_route = js.Any.fromFunction0(remove_record_route))
    __obj.asInstanceOf[Typeofrr]
  }
  @scala.inline
  implicit class TypeofrrOps[Self <: Typeofrr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd_rr_param(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_rr_param")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCheck_route_param(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_route_param")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_direction(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_direction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoose_route(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loose_route")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecord_route(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record_route")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecord_route_params(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record_route_params")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove_record_route(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_record_route")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

