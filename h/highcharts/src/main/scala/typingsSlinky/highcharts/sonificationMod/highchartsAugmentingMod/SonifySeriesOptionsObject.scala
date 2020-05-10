package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for sonifying a series.
  */
@js.native
trait SonifySeriesOptionsObject extends js.Object {
  /**
    * Optionally provide the minimum/maximum data values for the points. If
    * this is not supplied, it is calculated from all points in the chart
    * on demand. This option is supplied in the following format, as a map
    * of point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[js.Object] = js.native
  /**
    * The duration for playing the points. Note that points might continue
    * to play after the duration has passed, but no new points will start
    * playing.
    */
  var duration: Double = js.native
  /**
    * Earcons to add to the series.
    */
  var earcons: js.UndefOr[js.Array[EarconConfiguration]] = js.native
  /**
    * The instrument definitions for the points in this series.
    */
  var instruments: js.Array[PointInstrumentObject] = js.native
  /**
    * Callback after the series has played.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
  /**
    * Callback after a point has finished playing.
    */
  var onPointEnd: js.UndefOr[js.Function] = js.native
  /**
    * Callback before a point is played.
    */
  var onPointStart: js.UndefOr[js.Function] = js.native
  /**
    * The axis to use for when to play the points. Can be a string with a
    * data property (e.g. `x`), or a function. If it is a function, this
    * function receives the point as argument, and should return a numeric
    * value. The points with the lowest numeric values are then played
    * first, and the time between points will be proportional to the
    * distance between the numeric values.
    */
  var pointPlayTime: String | js.Function = js.native
}

object SonifySeriesOptionsObject {
  @scala.inline
  def apply(
    duration: Double,
    instruments: js.Array[PointInstrumentObject],
    pointPlayTime: String | js.Function
  ): SonifySeriesOptionsObject = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], instruments = instruments.asInstanceOf[js.Any], pointPlayTime = pointPlayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonifySeriesOptionsObject]
  }
  @scala.inline
  implicit class SonifySeriesOptionsObjectOps[Self <: SonifySeriesOptionsObject] (val x: Self) extends AnyVal {
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
    def withInstruments(value: js.Array[PointInstrumentObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointPlayTime(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointPlayTime")(value.asInstanceOf[js.Any])
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
    def withEarcons(value: js.Array[EarconConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earcons")(js.undefined)
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
    def withOnPointEnd(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointStart(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointStart")(js.undefined)
        ret
    }
  }
  
}

