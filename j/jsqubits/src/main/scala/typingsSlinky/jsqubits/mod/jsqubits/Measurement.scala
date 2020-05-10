package typingsSlinky.jsqubits.mod.jsqubits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Measurement extends js.Object {
  var newState: QState = js.native
  var numBits: Double = js.native
  var result: Double = js.native
  def asBitString(): String = js.native
}

object Measurement {
  @scala.inline
  def apply(asBitString: () => String, newState: QState, numBits: Double, result: Double): Measurement = {
    val __obj = js.Dynamic.literal(asBitString = js.Any.fromFunction0(asBitString), newState = newState.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measurement]
  }
  @scala.inline
  implicit class MeasurementOps[Self <: Measurement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsBitString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBitString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewState(value: QState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

