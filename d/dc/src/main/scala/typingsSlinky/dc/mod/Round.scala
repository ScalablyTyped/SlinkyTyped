package typingsSlinky.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Round extends js.Object {
  def ceil(n: Double): Double = js.native
  def floor(n: Double): Double = js.native
  def round(n: Double): Double = js.native
}

object Round {
  @scala.inline
  def apply(ceil: Double => Double, floor: Double => Double, round: Double => Double): Round = {
    val __obj = js.Dynamic.literal(ceil = js.Any.fromFunction1(ceil), floor = js.Any.fromFunction1(floor), round = js.Any.fromFunction1(round))
    __obj.asInstanceOf[Round]
  }
  @scala.inline
  implicit class RoundOps[Self <: Round] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCeil(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceil")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFloor(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRound(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

