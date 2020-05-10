package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofblst extends js.Object {
  def blst_add(t: Double): Double = js.native
  def blst_add_default(): Double = js.native
  def blst_add_retry_after(t_min: Double, t_max: Double): Double = js.native
  def blst_clear_ignore(mask: Double): Double = js.native
  def blst_clear_ignore_all(): Double = js.native
  def blst_del(): Double = js.native
  def blst_is_blacklisted(): Double = js.native
  def blst_rpl_clear_ignore(mask: Double): Double = js.native
  def blst_rpl_clear_ignore_all(): Double = js.native
  def blst_rpl_set_ignore(mask: Double): Double = js.native
  def blst_rpl_set_ignore_all(): Double = js.native
  def blst_set_ignore(mask: Double): Double = js.native
  def blst_set_ignore_all(): Double = js.native
}

object Typeofblst {
  @scala.inline
  def apply(
    blst_add: Double => Double,
    blst_add_default: () => Double,
    blst_add_retry_after: (Double, Double) => Double,
    blst_clear_ignore: Double => Double,
    blst_clear_ignore_all: () => Double,
    blst_del: () => Double,
    blst_is_blacklisted: () => Double,
    blst_rpl_clear_ignore: Double => Double,
    blst_rpl_clear_ignore_all: () => Double,
    blst_rpl_set_ignore: Double => Double,
    blst_rpl_set_ignore_all: () => Double,
    blst_set_ignore: Double => Double,
    blst_set_ignore_all: () => Double
  ): Typeofblst = {
    val __obj = js.Dynamic.literal(blst_add = js.Any.fromFunction1(blst_add), blst_add_default = js.Any.fromFunction0(blst_add_default), blst_add_retry_after = js.Any.fromFunction2(blst_add_retry_after), blst_clear_ignore = js.Any.fromFunction1(blst_clear_ignore), blst_clear_ignore_all = js.Any.fromFunction0(blst_clear_ignore_all), blst_del = js.Any.fromFunction0(blst_del), blst_is_blacklisted = js.Any.fromFunction0(blst_is_blacklisted), blst_rpl_clear_ignore = js.Any.fromFunction1(blst_rpl_clear_ignore), blst_rpl_clear_ignore_all = js.Any.fromFunction0(blst_rpl_clear_ignore_all), blst_rpl_set_ignore = js.Any.fromFunction1(blst_rpl_set_ignore), blst_rpl_set_ignore_all = js.Any.fromFunction0(blst_rpl_set_ignore_all), blst_set_ignore = js.Any.fromFunction1(blst_set_ignore), blst_set_ignore_all = js.Any.fromFunction0(blst_set_ignore_all))
    __obj.asInstanceOf[Typeofblst]
  }
  @scala.inline
  implicit class TypeofblstOps[Self <: Typeofblst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlst_add(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlst_add_default(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_add_default")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlst_add_retry_after(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_add_retry_after")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBlst_clear_ignore(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_clear_ignore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlst_clear_ignore_all(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_clear_ignore_all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlst_del(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_del")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlst_is_blacklisted(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_is_blacklisted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlst_rpl_clear_ignore(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_rpl_clear_ignore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlst_rpl_clear_ignore_all(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_rpl_clear_ignore_all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlst_rpl_set_ignore(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_rpl_set_ignore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlst_rpl_set_ignore_all(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_rpl_set_ignore_all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlst_set_ignore(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_set_ignore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlst_set_ignore_all(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blst_set_ignore_all")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

