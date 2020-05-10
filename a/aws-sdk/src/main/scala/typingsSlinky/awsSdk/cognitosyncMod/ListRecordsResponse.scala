package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecordsResponse extends js.Object {
  /**
    * Total number of records.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * A boolean value specifying whether to delete the dataset locally.
    */
  var DatasetDeletedAfterRequestedSyncCount: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the dataset exists.
    */
  var DatasetExists: js.UndefOr[Boolean] = js.native
  /**
    * Server sync count for this dataset.
    */
  var DatasetSyncCount: js.UndefOr[Long] = js.native
  /**
    * The user/device that made the last change to this record.
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  /**
    * Names of merged datasets.
    */
  var MergedDatasetNames: js.UndefOr[MergedDatasetNameList] = js.native
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of all records.
    */
  var Records: js.UndefOr[RecordList] = js.native
  /**
    * A token containing a session ID, identity ID, and expiration.
    */
  var SyncSessionToken: js.UndefOr[String] = js.native
}

object ListRecordsResponse {
  @scala.inline
  def apply(): ListRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordsResponse]
  }
  @scala.inline
  implicit class ListRecordsResponseOps[Self <: ListRecordsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDatasetDeletedAfterRequestedSyncCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetDeletedAfterRequestedSyncCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetDeletedAfterRequestedSyncCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetDeletedAfterRequestedSyncCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetExists")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetSyncCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetSyncCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetSyncCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetSyncCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMergedDatasetNames(value: MergedDatasetNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergedDatasetNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergedDatasetNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergedDatasetNames")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRecords(value: RecordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncSessionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncSessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncSessionToken")(js.undefined)
        ret
    }
  }
  
}

