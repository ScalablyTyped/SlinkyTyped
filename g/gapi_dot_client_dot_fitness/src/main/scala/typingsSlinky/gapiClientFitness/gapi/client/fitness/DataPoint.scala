package typingsSlinky.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPoint extends js.Object {
  /** Used for version checking during transformation; that is, a datapoint can only replace another datapoint that has an older computation time stamp. */
  var computationTimeMillis: js.UndefOr[String] = js.native
  /** The data type defining the format of the values in this data point. */
  var dataTypeName: js.UndefOr[String] = js.native
  /** The end time of the interval represented by this data point, in nanoseconds since epoch. */
  var endTimeNanos: js.UndefOr[String] = js.native
  /**
    * Indicates the last time this data point was modified. Useful only in contexts where we are listing the data changes, rather than representing the
    * current state of the data.
    */
  var modifiedTimeMillis: js.UndefOr[String] = js.native
  /**
    * If the data point is contained in a dataset for a derived data source, this field will be populated with the data source stream ID that created the
    * data point originally.
    */
  var originDataSourceId: js.UndefOr[String] = js.native
  /** The raw timestamp from the original SensorEvent. */
  var rawTimestampNanos: js.UndefOr[String] = js.native
  /** The start time of the interval represented by this data point, in nanoseconds since epoch. */
  var startTimeNanos: js.UndefOr[String] = js.native
  /**
    * Values of each data type field for the data point. It is expected that each value corresponding to a data type field will occur in the same order that
    * the field is listed with in the data type specified in a data source.
    *
    * Only one of integer and floating point fields will be populated, depending on the format enum value within data source's type field.
    */
  var value: js.UndefOr[js.Array[Value]] = js.native
}

object DataPoint {
  @scala.inline
  def apply(): DataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPoint]
  }
  @scala.inline
  implicit class DataPointOps[Self <: DataPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputationTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputationTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginDataSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originDataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originDataSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withRawTimestampNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawTimestampNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawTimestampNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawTimestampNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[Value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

