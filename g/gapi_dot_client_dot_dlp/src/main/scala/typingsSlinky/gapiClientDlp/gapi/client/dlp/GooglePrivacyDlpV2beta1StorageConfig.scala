package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1StorageConfig extends js.Object {
  /** BigQuery options specification. */
  var bigQueryOptions: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryOptions] = js.native
  /** Google Cloud Storage options specification. */
  var cloudStorageOptions: js.UndefOr[GooglePrivacyDlpV2beta1CloudStorageOptions] = js.native
  /** Google Cloud Datastore options specification. */
  var datastoreOptions: js.UndefOr[GooglePrivacyDlpV2beta1DatastoreOptions] = js.native
}

object GooglePrivacyDlpV2beta1StorageConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1StorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1StorageConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1StorageConfigOps[Self <: GooglePrivacyDlpV2beta1StorageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigQueryOptions(value: GooglePrivacyDlpV2beta1BigQueryOptions): Self = {
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
    def withCloudStorageOptions(value: GooglePrivacyDlpV2beta1CloudStorageOptions): Self = {
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
    def withDatastoreOptions(value: GooglePrivacyDlpV2beta1DatastoreOptions): Self = {
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
  }
  
}

