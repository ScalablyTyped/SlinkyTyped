package typingsSlinky.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldStats extends js.Object {
  /**
    * The number of documents that contain a value in the specified field in the result set.
    */
  var count: js.UndefOr[Long] = js.native
  /**
    * The maximum value found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), max is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, max is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var max: js.UndefOr[String] = js.native
  /**
    * The average of the values found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), mean is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, mean is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var mean: js.UndefOr[String] = js.native
  /**
    * The minimum value found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), min is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, min is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var min: js.UndefOr[String] = js.native
  /**
    * The number of documents that do not contain a value in the specified field in the result set.
    */
  var missing: js.UndefOr[Long] = js.native
  /**
    * The standard deviation of the values in the specified field in the result set.
    */
  var stddev: js.UndefOr[Double] = js.native
  /**
    * The sum of the field values across the documents in the result set. null for date fields.
    */
  var sum: js.UndefOr[Double] = js.native
  /**
    * The sum of all field values in the result set squared.
    */
  var sumOfSquares: js.UndefOr[Double] = js.native
}

object FieldStats {
  @scala.inline
  def apply(): FieldStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldStats]
  }
  @scala.inline
  implicit class FieldStatsOps[Self <: FieldStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMean(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMissing(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.undefined)
        ret
    }
    @scala.inline
    def withStddev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stddev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStddev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stddev")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.undefined)
        ret
    }
    @scala.inline
    def withSumOfSquares(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOfSquares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSumOfSquares: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOfSquares")(js.undefined)
        ret
    }
  }
  
}

