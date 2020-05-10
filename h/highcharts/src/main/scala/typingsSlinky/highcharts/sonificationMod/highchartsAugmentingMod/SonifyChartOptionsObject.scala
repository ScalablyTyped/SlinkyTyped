package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for sonifying a chart.
  */
@js.native
trait SonifyChartOptionsObject extends js.Object {
  /**
    * Milliseconds of silent waiting to add between series. Note that
    * waiting time is considered part of the sonify duration.
    */
  var afterSeriesWait: js.UndefOr[Double] = js.native
  /**
    * Optionally provide the minimum/maximum data values for the points. If
    * this is not supplied, it is calculated from all points in the chart
    * on demand. This option is supplied in the following format, as a map
    * of point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[js.Object] = js.native
  /**
    * Duration for sonifying the entire chart. The duration is distributed
    * across the different series intelligently, but does not take earcons
    * into account. It is also possible to set the duration explicitly per
    * series, using `seriesOptions`. Note that points may continue to play
    * after the duration has passed, but no new points will start playing.
    */
  var duration: Double = js.native
  /**
    * Earcons to add to the chart. Note that earcons can also be added per
    * series using `seriesOptions`.
    */
  var earcons: js.UndefOr[js.Array[EarconConfiguration]] = js.native
  /**
    * The instrument definitions for the points in this chart.
    */
  var instruments: js.UndefOr[js.Array[PointInstrumentObject]] = js.native
  /**
    * Callback after the chart has played.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
  /**
    * Callback after a series has finished playing.
    */
  var onSeriesEnd: js.UndefOr[js.Function] = js.native
  /**
    * Callback before a series is played.
    */
  var onSeriesStart: js.UndefOr[js.Function] = js.native
  /**
    * Define the order to play the series in. This can be given as a
    * string, or an array specifying a custom ordering. If given as a
    * string, valid values are `sequential` - where each series is played
    * in order - or `simultaneous`, where all series are played at once.
    * For custom ordering, supply an array as the order. Each element in
    * the array can be either a string with a series ID, an Earcon object,
    * or an object with a numeric `silentWait` property designating a
    * number of milliseconds to wait before continuing. Each element of the
    * array will be played in order. To play elements simultaneously, group
    * the elements in an array.
    */
  var order: String | (js.Array[String | Earcon | (js.Array[String | Earcon])]) = js.native
  /**
    * The axis to use for when to play the points. Can be a string with a
    * data property (e.g. `x`), or a function. If it is a function, this
    * function receives the point as argument, and should return a numeric
    * value. The points with the lowest numeric values are then played
    * first, and the time between points will be proportional to the
    * distance between the numeric values. This option can not be
    * overridden per series.
    */
  var pointPlayTime: String | js.Function = js.native
  /**
    * Options as given to `series.sonify` to override options per series.
    * If the option is supplied as an array of options objects, the `id`
    * property of the object should correspond to the series' id. If the
    * option is supplied as a single object, the options apply to all
    * series.
    */
  var seriesOptions: js.UndefOr[js.Object | js.Array[js.Object]] = js.native
}

object SonifyChartOptionsObject {
  @scala.inline
  def apply(
    duration: Double,
    order: String | (js.Array[String | Earcon | (js.Array[String | Earcon])]),
    pointPlayTime: String | js.Function
  ): SonifyChartOptionsObject = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pointPlayTime = pointPlayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonifyChartOptionsObject]
  }
  @scala.inline
  implicit class SonifyChartOptionsObjectOps[Self <: SonifyChartOptionsObject] (val x: Self) extends AnyVal {
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
    def withOrder(value: String | (js.Array[String | Earcon | (js.Array[String | Earcon])])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointPlayTime(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointPlayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSeriesWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSeriesWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterSeriesWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSeriesWait")(js.undefined)
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
    def withInstruments(value: js.Array[PointInstrumentObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstruments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruments")(js.undefined)
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
    def withOnSeriesEnd(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSeriesEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeriesStart(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSeriesStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesOptions(value: js.Object | js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesOptions")(js.undefined)
        ret
    }
  }
  
}

