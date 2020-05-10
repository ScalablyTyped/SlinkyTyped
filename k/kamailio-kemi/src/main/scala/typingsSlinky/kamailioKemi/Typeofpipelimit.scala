package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpipelimit extends js.Object {
  def pl_check(pipeid: String): Double = js.native
  def pl_check_limit(pipeid: String, alg: String, limit: Double): Double = js.native
  def pl_drop(): Double = js.native
  def pl_drop_range(rmin: Double, rmax: Double): Double = js.native
  def pl_drop_retry(rafter: Double): Double = js.native
}

object Typeofpipelimit {
  @scala.inline
  def apply(
    pl_check: String => Double,
    pl_check_limit: (String, String, Double) => Double,
    pl_drop: () => Double,
    pl_drop_range: (Double, Double) => Double,
    pl_drop_retry: Double => Double
  ): Typeofpipelimit = {
    val __obj = js.Dynamic.literal(pl_check = js.Any.fromFunction1(pl_check), pl_check_limit = js.Any.fromFunction3(pl_check_limit), pl_drop = js.Any.fromFunction0(pl_drop), pl_drop_range = js.Any.fromFunction2(pl_drop_range), pl_drop_retry = js.Any.fromFunction1(pl_drop_retry))
    __obj.asInstanceOf[Typeofpipelimit]
  }
  @scala.inline
  implicit class TypeofpipelimitOps[Self <: Typeofpipelimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPl_check(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl_check")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPl_check_limit(value: (String, String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl_check_limit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPl_drop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl_drop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPl_drop_range(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl_drop_range")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPl_drop_retry(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl_drop_retry")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

