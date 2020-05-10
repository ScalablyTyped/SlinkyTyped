package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1OutputStorageConfig extends js.Object {
  /**
    * The path to a Google Cloud Storage location to store output.
    * The bucket must already exist and
    * the Google APIs service account for DLP must have write permission to
    * write to the given bucket.
    * Results are split over multiple csv files with each file name matching
    * the pattern "[operation_id]_[count].csv", for example
    * `3094877188788974909_1.csv`. The `operation_id` matches the
    * identifier for the Operation, and the `count` is a counter used for
    * tracking the number of files written.
    *
    * The CSV file(s) contain the following columns regardless of storage type
    * scanned:
    * - id
    * - info_type
    * - likelihood
    * - byte size of finding
    * - quote
    * - timestamp
    *
    * For Cloud Storage the next columns are:
    *
    * - file_path
    * - start_offset
    *
    * For Cloud Datastore the next columns are:
    *
    * - project_id
    * - namespace_id
    * - path
    * - column_name
    * - offset
    *
    * For BigQuery the next columns are:
    *
    * - row_number
    * - project_id
    * - dataset_id
    * - table_id
    */
  var storagePath: js.UndefOr[GooglePrivacyDlpV2beta1CloudStoragePath] = js.native
  /** Store findings in a new table in the dataset. */
  var table: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.native
}

object GooglePrivacyDlpV2beta1OutputStorageConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1OutputStorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1OutputStorageConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1OutputStorageConfigOps[Self <: GooglePrivacyDlpV2beta1OutputStorageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStoragePath(value: GooglePrivacyDlpV2beta1CloudStoragePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoragePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePath")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: GooglePrivacyDlpV2beta1BigQueryTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
  }
  
}

