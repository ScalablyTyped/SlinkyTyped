package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global classes and objects related to sonification.
  */
@js.native
trait SonificationObject extends js.Object {
  /**
    * The Earcon class.
    */
  var Earcon: js.Function = js.native
  /**
    * The Instrument class.
    */
  var Instrument: js.Function = js.native
  /**
    * Note fade-out-time in milliseconds. Most notes are faded out quickly
    * by default if there is time. This is to avoid abrupt stops which will
    * cause perceived clicks.
    */
  var fadeOutDuration: Double = js.native
  /**
    * Predefined instruments, given as an object with a map between the
    * instrument name and the Highcharts.Instrument object.
    */
  var instruments: js.Object = js.native
}

object SonificationObject {
  @scala.inline
  def apply(Earcon: js.Function, Instrument: js.Function, fadeOutDuration: Double, instruments: js.Object): SonificationObject = {
    val __obj = js.Dynamic.literal(Earcon = Earcon.asInstanceOf[js.Any], Instrument = Instrument.asInstanceOf[js.Any], fadeOutDuration = fadeOutDuration.asInstanceOf[js.Any], instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonificationObject]
  }
  @scala.inline
  implicit class SonificationObjectOps[Self <: SonificationObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEarcon(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Earcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstrument(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instrument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFadeOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOutDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstruments(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

