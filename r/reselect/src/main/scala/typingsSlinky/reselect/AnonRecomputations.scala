package typingsSlinky.reselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRecomputations[C] extends js.Object {
  var resultFunc: C = js.native
  def recomputations(): Double = js.native
  def resetRecomputations(): Double = js.native
}

object AnonRecomputations {
  @scala.inline
  def apply[C](recomputations: () => Double, resetRecomputations: () => Double, resultFunc: C): AnonRecomputations[C] = {
    val __obj = js.Dynamic.literal(recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecomputations[C]]
  }
  @scala.inline
  implicit class AnonRecomputationsOps[Self[c] <: AnonRecomputations[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withRecomputations(value: () => Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recomputations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetRecomputations(value: () => Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetRecomputations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResultFunc(value: C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultFunc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

