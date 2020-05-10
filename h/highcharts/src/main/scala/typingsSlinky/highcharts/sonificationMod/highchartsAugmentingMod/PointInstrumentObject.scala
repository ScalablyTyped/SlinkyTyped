package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instrument definition for a point, specifying the instrument to play
  * and how to play it.
  */
@js.native
trait PointInstrumentObject extends js.Object {
  /**
    * An Instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | Instrument = js.native
  /**
    * Mapping of instrument parameters for this instrument.
    */
  var instrumentMapping: PointInstrumentMappingObject = js.native
  /**
    * Options for this instrument.
    */
  var instrumentOptions: js.UndefOr[PointInstrumentOptionsObject] = js.native
  /**
    * Callback to call when the instrument has stopped playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
}

object PointInstrumentObject {
  @scala.inline
  def apply(instrument: String | Instrument, instrumentMapping: PointInstrumentMappingObject): PointInstrumentObject = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], instrumentMapping = instrumentMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInstrumentObject]
  }
  @scala.inline
  implicit class PointInstrumentObjectOps[Self <: PointInstrumentObject] (val x: Self) extends AnyVal {
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
    def withInstrumentMapping(value: PointInstrumentMappingObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstrumentOptions(value: PointInstrumentOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrumentOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentOptions")(js.undefined)
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
  }
  
}

