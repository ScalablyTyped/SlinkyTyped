package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofmiscRadius extends js.Object {
  def does_uri_exist(): Double = js.native
  def does_uri_exist_uval(suri: String): Double = js.native
  def does_uri_user_exist(): Double = js.native
  def does_uri_user_exist_uval(user: String): Double = js.native
  def is_user_in(user: String, group: String): Double = js.native
  def load_callee_avps(user: String): Double = js.native
  def load_caller_avps(user: String): Double = js.native
}

object TypeofmiscRadius {
  @scala.inline
  def apply(
    does_uri_exist: () => Double,
    does_uri_exist_uval: String => Double,
    does_uri_user_exist: () => Double,
    does_uri_user_exist_uval: String => Double,
    is_user_in: (String, String) => Double,
    load_callee_avps: String => Double,
    load_caller_avps: String => Double
  ): TypeofmiscRadius = {
    val __obj = js.Dynamic.literal(does_uri_exist = js.Any.fromFunction0(does_uri_exist), does_uri_exist_uval = js.Any.fromFunction1(does_uri_exist_uval), does_uri_user_exist = js.Any.fromFunction0(does_uri_user_exist), does_uri_user_exist_uval = js.Any.fromFunction1(does_uri_user_exist_uval), is_user_in = js.Any.fromFunction2(is_user_in), load_callee_avps = js.Any.fromFunction1(load_callee_avps), load_caller_avps = js.Any.fromFunction1(load_caller_avps))
    __obj.asInstanceOf[TypeofmiscRadius]
  }
  @scala.inline
  implicit class TypeofmiscRadiusOps[Self <: TypeofmiscRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoes_uri_exist(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("does_uri_exist")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDoes_uri_exist_uval(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("does_uri_exist_uval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDoes_uri_user_exist(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("does_uri_user_exist")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDoes_uri_user_exist_uval(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("does_uri_user_exist_uval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_user_in(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_user_in")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoad_callee_avps(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load_callee_avps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoad_caller_avps(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load_caller_avps")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

