package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define an Instrument and the options for playing it.
  */
@js.native
trait EarconInstrument extends js.Object {
  /**
    * An instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | Instrument = js.native
  /**
    * The options to pass to Instrument.play.
    */
  var playOptions: js.Object = js.native
}

object EarconInstrument {
  @scala.inline
  def apply(instrument: String | Instrument, playOptions: js.Object): EarconInstrument = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], playOptions = playOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconInstrument]
  }
  @scala.inline
  implicit class EarconInstrumentOps[Self <: EarconInstrument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstrument(value: String | Instrument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

