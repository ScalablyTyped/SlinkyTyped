package typingsSlinky.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/master/lib/firmata.js#L429-L451
@js.native
trait Options extends js.Object {
  var analogPins: js.UndefOr[js.Array[Double]] = js.native
  var pins: js.UndefOr[js.Array[Pins]] = js.native
  var reportVersionTimeout: js.UndefOr[Double] = js.native
  var samplingInterval: js.UndefOr[Double] = js.native
  var serialport: js.UndefOr[Options] = js.native
  var skipCapabilities: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalogPins(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analogPins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalogPins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analogPins")(js.undefined)
        ret
    }
    @scala.inline
    def withPins(value: js.Array[Pins]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pins")(js.undefined)
        ret
    }
    @scala.inline
    def withReportVersionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportVersionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportVersionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportVersionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialport(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialport")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipCapabilities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCapabilities")(js.undefined)
        ret
    }
  }
  
}

