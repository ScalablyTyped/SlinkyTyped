package typingsSlinky.johnnyFive.mod.IR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayOption extends js.Object {
  var emitter: Double | String = js.native
  var freq: js.UndefOr[Double] = js.native
  var pins: js.Array[Double | String] = js.native
}

object ArrayOption {
  @scala.inline
  def apply(emitter: Double | String, pins: js.Array[Double | String]): ArrayOption = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOption]
  }
  @scala.inline
  implicit class ArrayOptionOps[Self <: ArrayOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmitter(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPins(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freq")(js.undefined)
        ret
    }
  }
  
}

