package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statistics extends js.Object {
  /**
    * For a numeric field, the average value in the field.
    */
  var Avg: js.UndefOr[Double] = js.native
  /**
    * The number of values in the field.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The number of distinct values in the field.
    */
  var CountDistinct: js.UndefOr[Integer] = js.native
  /**
    * The number of NAN (not a number) values in the field.
    */
  var CountNan: js.UndefOr[Integer] = js.native
  /**
    * The number of null values in the field.
    */
  var CountNull: js.UndefOr[Integer] = js.native
  /**
    * For a numeric field, the maximum value in the field.
    */
  var Max: js.UndefOr[String] = js.native
  /**
    * For a numeric field, the minimum value in the field.
    */
  var Min: js.UndefOr[String] = js.native
  /**
    * For a numeric field, the standard deviation.
    */
  var Stddev: js.UndefOr[Double] = js.native
}

object Statistics {
  @scala.inline
  def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  @scala.inline
  implicit class StatisticsOps[Self <: Statistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Avg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Avg")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withCountDistinct(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountDistinct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountDistinct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountDistinct")(js.undefined)
        ret
    }
    @scala.inline
    def withCountNan(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountNan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountNan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountNan")(js.undefined)
        ret
    }
    @scala.inline
    def withCountNull(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountNull")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Min")(js.undefined)
        ret
    }
    @scala.inline
    def withStddev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stddev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStddev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stddev")(js.undefined)
        ret
    }
  }
  
}

