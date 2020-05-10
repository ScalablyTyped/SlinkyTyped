package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpvx extends js.Object {
  def evalx(dst: String, fmt: String): Double = js.native
  def pv_var_to_xavp(varname: String, xname: String): Double = js.native
  def pv_xavp_print(): Double = js.native
  def pv_xavp_to_var(xname: String): Double = js.native
  def sbranch_append(): Double = js.native
  def sbranch_reset(): Double = js.native
  def sbranch_set_ruri(): Double = js.native
  def xavp_params_explode(sparams: String, sxname: String): Double = js.native
  def xavp_params_implode(sxname: String, svname: String): Double = js.native
}

object Typeofpvx {
  @scala.inline
  def apply(
    evalx: (String, String) => Double,
    pv_var_to_xavp: (String, String) => Double,
    pv_xavp_print: () => Double,
    pv_xavp_to_var: String => Double,
    sbranch_append: () => Double,
    sbranch_reset: () => Double,
    sbranch_set_ruri: () => Double,
    xavp_params_explode: (String, String) => Double,
    xavp_params_implode: (String, String) => Double
  ): Typeofpvx = {
    val __obj = js.Dynamic.literal(evalx = js.Any.fromFunction2(evalx), pv_var_to_xavp = js.Any.fromFunction2(pv_var_to_xavp), pv_xavp_print = js.Any.fromFunction0(pv_xavp_print), pv_xavp_to_var = js.Any.fromFunction1(pv_xavp_to_var), sbranch_append = js.Any.fromFunction0(sbranch_append), sbranch_reset = js.Any.fromFunction0(sbranch_reset), sbranch_set_ruri = js.Any.fromFunction0(sbranch_set_ruri), xavp_params_explode = js.Any.fromFunction2(xavp_params_explode), xavp_params_implode = js.Any.fromFunction2(xavp_params_implode))
    __obj.asInstanceOf[Typeofpvx]
  }
  @scala.inline
  implicit class TypeofpvxOps[Self <: Typeofpvx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvalx(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalx")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPv_var_to_xavp(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pv_var_to_xavp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPv_xavp_print(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pv_xavp_print")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPv_xavp_to_var(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pv_xavp_to_var")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSbranch_append(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sbranch_append")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSbranch_reset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sbranch_reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSbranch_set_ruri(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sbranch_set_ruri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withXavp_params_explode(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xavp_params_explode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withXavp_params_implode(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xavp_params_implode")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

