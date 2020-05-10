package typingsSlinky.jsqubits.mod.jsqubits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateWithAmplitude extends js.Object {
  var amplitude: Complex = js.native
  var index: Double = js.native
  var numBits: Double = js.native
  def asBitString(): String = js.native
  def asNumber(): Double = js.native
}

object StateWithAmplitude {
  @scala.inline
  def apply(
    amplitude: Complex,
    asBitString: () => String,
    asNumber: () => Double,
    index: Double,
    numBits: Double
  ): StateWithAmplitude = {
    val __obj = js.Dynamic.literal(amplitude = amplitude.asInstanceOf[js.Any], asBitString = js.Any.fromFunction0(asBitString), asNumber = js.Any.fromFunction0(asNumber), index = index.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateWithAmplitude]
  }
  @scala.inline
  implicit class StateWithAmplitudeOps[Self <: StateWithAmplitude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmplitude(value: Complex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amplitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsBitString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBitString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

