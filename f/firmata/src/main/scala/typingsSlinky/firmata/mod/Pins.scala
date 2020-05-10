package typingsSlinky.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pins extends js.Object {
  var analogChannel: Double = js.native
  var mode: PIN_MODE = js.native
  var report: REPORTING = js.native
  var state: PIN_STATE | PULLUP_STATE = js.native
  var supportedModes: js.Array[PIN_MODE] = js.native
  var value: PIN_STATE | Double = js.native
}

object Pins {
  @scala.inline
  def apply(
    analogChannel: Double,
    mode: PIN_MODE,
    report: REPORTING,
    state: PIN_STATE | PULLUP_STATE,
    supportedModes: js.Array[PIN_MODE],
    value: PIN_STATE | Double
  ): Pins = {
    val __obj = js.Dynamic.literal(analogChannel = analogChannel.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pins]
  }
  @scala.inline
  implicit class PinsOps[Self <: Pins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalogChannel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analogChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: REPORTING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: PIN_STATE | PULLUP_STATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedModes(value: js.Array[PIN_MODE]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: PIN_STATE | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

