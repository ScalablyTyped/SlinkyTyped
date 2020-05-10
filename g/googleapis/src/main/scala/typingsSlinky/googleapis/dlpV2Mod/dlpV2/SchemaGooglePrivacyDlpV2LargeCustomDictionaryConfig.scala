package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a custom dictionary created from a data source of any
  * size up to the maximum size defined in the
  * [limits](https://cloud.google.com/dlp/limits) page. The artifacts of
  * dictionary creation are stored in the specified Google Cloud Storage
  * location. Consider using `CustomInfoType.Dictionary` for smaller
  * dictionaries that satisfy the size requirements.
  */
@js.native
trait SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig extends js.Object {
  /**
    * Field in a BigQuery table where each cell represents a dictionary phrase.
    */
  var bigQueryField: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryField] = js.native
  /**
    * Set of files containing newline-delimited lists of dictionary phrases.
    */
  var cloudStorageFileSet: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStorageFileSet] = js.native
  /**
    * Location to store dictionary artifacts in Google Cloud Storage. These
    * files will only be accessible by project owners and the DLP API. If any
    * of these artifacts are modified, the dictionary is considered invalid and
    * can no longer be used.
    */
  var outputPath: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStoragePath] = js.native
}

object SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfigOps[Self <: SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigQueryField(value: SchemaGooglePrivacyDlpV2BigQueryField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigQueryField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigQueryField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigQueryField")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudStorageFileSet(value: SchemaGooglePrivacyDlpV2CloudStorageFileSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageFileSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudStorageFileSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageFileSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPath(value: SchemaGooglePrivacyDlpV2CloudStoragePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
  }
  
}

