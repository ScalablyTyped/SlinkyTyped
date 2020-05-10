package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for sonifying a point.
  */
@js.native
trait PointSonifyOptionsObject extends js.Object {
  /**
    * Optionally provide the minimum/maximum values for the points. If this
    * is not supplied, it is calculated from the points in the chart on
    * demand. This option is supplied in the following format, as a map of
    * point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[js.Object] = js.native
  /**
    * The instrument definitions for this point.
    */
  var instruments: js.Array[
    typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject
  ] = js.native
  /**
    * Callback called when the sonification has finished.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
}

object PointSonifyOptionsObject {
  @scala.inline
  def apply(
    instruments: js.Array[
      typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject
    ]
  ): PointSonifyOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointSonifyOptionsObject]
  }
  @scala.inline
  implicit class PointSonifyOptionsObjectOps[Self <: PointSonifyOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstruments(
      value: js.Array[
          typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataExtremes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataExtremes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataExtremes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataExtremes")(js.undefined)
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

