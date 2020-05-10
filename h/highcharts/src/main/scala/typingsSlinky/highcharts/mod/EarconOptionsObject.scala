package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for an Earcon.
  */
@js.native
trait EarconOptionsObject extends js.Object {
  /**
    * The unique ID of the Earcon. Generated if not supplied.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The instruments and their options defining this earcon.
    */
  var instruments: js.Array[
    typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.EarconInstrument
  ] = js.native
  /**
    * Callback function to call when earcon has finished playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
  /**
    * Global panning of all instruments. Overrides all panning on
    * individual instruments. Can be a number between -1 and 1.
    */
  var pan: js.UndefOr[Double] = js.native
  /**
    * Master volume for all instruments. Volume settings on individual
    * instruments can still be used for relative volume between the
    * instruments. This setting does not affect volumes set by functions in
    * individual instruments. Can be a number between 0 and 1. Defaults to
    * 1.
    */
  var volume: js.UndefOr[Double] = js.native
}

object EarconOptionsObject {
  @scala.inline
  def apply(
    instruments: js.Array[
      typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.EarconInstrument
    ]
  ): EarconOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconOptionsObject]
  }
  @scala.inline
  implicit class EarconOptionsObjectOps[Self <: EarconOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstruments(
      value: js.Array[
          typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.EarconInstrument
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruments")(value.asInstanceOf[js.Any])
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
    def withPan(value: Double): Self = {
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
    def withVolume(value: Double): Self = {
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

