package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListDataPointChangesResponse extends js.Object {
  /**
    * The data stream ID of the data source with data point changes.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  /**
    * Deleted data points for the user. Note, for modifications this should be
    * parsed before handling insertions.
    */
  var deletedDataPoint: js.UndefOr[js.Array[SchemaDataPoint]] = js.native
  /**
    * Inserted data points for the user.
    */
  var insertedDataPoint: js.UndefOr[js.Array[SchemaDataPoint]] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDataPointChangesResponse {
  @scala.inline
  def apply(): SchemaListDataPointChangesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDataPointChangesResponse]
  }
  @scala.inline
  implicit class SchemaListDataPointChangesResponseOps[Self <: SchemaListDataPointChangesResponse] (val x: Self) extends AnyVal {
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
    def withDeletedDataPoint(value: js.Array[SchemaDataPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedDataPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedDataPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedDataPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertedDataPoint(value: js.Array[SchemaDataPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedDataPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertedDataPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedDataPoint")(js.undefined)
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
  }
  
}

