package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared message indicating Cloud storage type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StorageConfig extends js.Object {
  /**
    * BigQuery options specification.
    */
  var bigQueryOptions: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryOptions] = js.native
  /**
    * Google Cloud Storage options specification.
    */
  var cloudStorageOptions: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStorageOptions] = js.native
  /**
    * Google Cloud Datastore options specification.
    */
  var datastoreOptions: js.UndefOr[SchemaGooglePrivacyDlpV2DatastoreOptions] = js.native
  var timespanConfig: js.UndefOr[SchemaGooglePrivacyDlpV2TimespanConfig] = js.native
}

object SchemaGooglePrivacyDlpV2StorageConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StorageConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StorageConfigOps[Self <: SchemaGooglePrivacyDlpV2StorageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigQueryOptions(value: SchemaGooglePrivacyDlpV2BigQueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigQueryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigQueryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigQueryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudStorageOptions(value: SchemaGooglePrivacyDlpV2CloudStorageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudStorageOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDatastoreOptions(value: SchemaGooglePrivacyDlpV2DatastoreOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatastoreOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTimespanConfig(value: SchemaGooglePrivacyDlpV2TimespanConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timespanConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimespanConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timespanConfig")(js.undefined)
        ret
    }
  }
  
}

