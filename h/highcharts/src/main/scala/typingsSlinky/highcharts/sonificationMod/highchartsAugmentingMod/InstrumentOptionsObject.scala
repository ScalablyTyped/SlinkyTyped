package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of options for the Instrument class.
  */
@js.native
trait InstrumentOptionsObject extends js.Object {
  /**
    * A list of allowed frequencies for this instrument. If trying to play
    * a frequency not on this list, the closest frequency will be used. Set
    * to `null` to allow all frequencies to be used. Defaults to `null`.
    */
  var allowedFrequencies: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The unique ID of the instrument. Generated if not supplied.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Options specific to oscillator instruments.
    */
  var oscillator: js.UndefOr[OscillatorOptionsObject] = js.native
  /**
    * When using functions to determine frequency or other parameters
    * during playback, this options specifies how often to call the
    * callback functions. Number given in milliseconds. Defaults to 20.
    */
  var playCallbackInterval: js.UndefOr[Double] = js.native
  /**
    * The type of instrument. Currently only `oscillator` is supported.
    * Defaults to `oscillator`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object InstrumentOptionsObject {
  @scala.inline
  def apply(): InstrumentOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstrumentOptionsObject]
  }
  @scala.inline
  implicit class InstrumentOptionsObjectOps[Self <: InstrumentOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedFrequencies(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFrequencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedFrequencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFrequencies")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOscillator(value: OscillatorOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oscillator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOscillator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oscillator")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayCallbackInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playCallbackInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayCallbackInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playCallbackInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

