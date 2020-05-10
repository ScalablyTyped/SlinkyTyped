package typingsSlinky.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  /** The data stream ID of the data source that created the points in this dataset. */
  var dataSourceId: js.UndefOr[String] = js.native
  /**
    * The largest end time of all data points in this possibly partial representation of the dataset. Time is in nanoseconds from epoch. This should also
    * match the first part of the dataset identifier.
    */
  var maxEndTimeNs: js.UndefOr[String] = js.native
  /**
    * The smallest start time of all data points in this possibly partial representation of the dataset. Time is in nanoseconds from epoch. This should also
    * match the first part of the dataset identifier.
    */
  var minStartTimeNs: js.UndefOr[String] = js.native
  /**
    * This token will be set when a dataset is received in response to a GET request and the dataset is too large to be included in a single response.
    * Provide this value in a subsequent GET request to return the next page of data points within this dataset.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A partial list of data points contained in the dataset, ordered by largest endTimeNanos first. This list is considered complete when retrieving a small
    * dataset and partial when patching a dataset or retrieving a dataset that is too large to include in a single response.
    */
  var point: js.UndefOr[js.Array[DataPoint]] = js.native
}

object Dataset {
  @scala.inline
  def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  @scala.inline
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEndTimeNs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEndTimeNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEndTimeNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEndTimeNs")(js.undefined)
        ret
    }
    @scala.inline
    def withMinStartTimeNs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minStartTimeNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinStartTimeNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minStartTimeNs")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: js.Array[DataPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
        ret
    }
  }
  
}

