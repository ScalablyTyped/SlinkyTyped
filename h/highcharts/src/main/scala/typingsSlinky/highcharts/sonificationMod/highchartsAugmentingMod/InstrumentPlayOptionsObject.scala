package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for playing an instrument.
  */
@js.native
trait InstrumentPlayOptionsObject extends js.Object {
  /**
    * The duration of the note in milliseconds.
    */
  var duration: Double = js.native
  /**
    * The frequency of the note to play. Can be a fixed number, or a
    * function. The function receives one argument: the relative time of
    * the note playing (0 being the start, and 1 being the end of the
    * note). It should return the frequency number for each point in time.
    * The poll interval of this function is specified by the
    * Instrument.playCallbackInterval option.
    */
  var frequency: Double | js.Function = js.native
  /**
    * The maximum frequency to allow. If the instrument has a set of
    * allowed frequencies, the closest frequency is used by default. Use
    * this option to stop too high frequencies from being used.
    */
  var maxFrequency: js.UndefOr[Double] = js.native
  /**
    * The minimum frequency to allow. If the instrument has a set of
    * allowed frequencies, the closest frequency is used by default. Use
    * this option to stop too low frequencies from being used.
    */
  var minFrequency: js.UndefOr[Double] = js.native
  /**
    * Callback function to be called when the play is completed.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
  /**
    * The panning of the instrument. Can be a fixed number between -1 and
    * 1, or a function. The function receives one argument: the relative
    * time of the note playing (0 being the start, and 1 being the end of
    * the note). It should return the panning value for each point in time.
    * The poll interval of this function is specified by the
    * Instrument.playCallbackInterval option. Defaults to 0.
    */
  var pan: js.UndefOr[Double | js.Function] = js.native
  /**
    * The volume of the instrument. Can be a fixed number between 0 and 1,
    * or a function. The function receives one argument: the relative time
    * of the note playing (0 being the start, and 1 being the end of the
    * note). It should return the volume for each point in time. The poll
    * interval of this function is specified by the
    * Instrument.playCallbackInterval option. Defaults to 1.
    */
  var volume: js.UndefOr[Double | js.Function] = js.native
}

object InstrumentPlayOptionsObject {
  @scala.inline
  def apply(duration: Double, frequency: Double | js.Function): InstrumentPlayOptionsObject = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentPlayOptionsObject]
  }
  @scala.inline
  implicit class InstrumentPlayOptionsObjectOps[Self <: InstrumentPlayOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequency(value: Double | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withPan(value: Double | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

