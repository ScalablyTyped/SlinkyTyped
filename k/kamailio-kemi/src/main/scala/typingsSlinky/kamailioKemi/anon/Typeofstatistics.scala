package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofstatistics extends js.Object {
  def reset_stat(sname: String): Double = js.native
  def update_stat(sname: String, sval: Double): Double = js.native
}

object Typeofstatistics {
  @scala.inline
  def apply(reset_stat: String => Double, update_stat: (String, Double) => Double): Typeofstatistics = {
    val __obj = js.Dynamic.literal(reset_stat = js.Any.fromFunction1(reset_stat), update_stat = js.Any.fromFunction2(update_stat))
    __obj.asInstanceOf[Typeofstatistics]
  }
  @scala.inline
  implicit class TypeofstatisticsOps[Self <: Typeofstatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset_stat(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset_stat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate_stat(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_stat")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

