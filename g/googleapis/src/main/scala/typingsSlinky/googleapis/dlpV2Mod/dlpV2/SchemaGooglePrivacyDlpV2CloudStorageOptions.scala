package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options defining a file or a set of files within a Google Cloud Storage
  * bucket.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CloudStorageOptions extends js.Object {
  /**
    * Max number of bytes to scan from a file. If a scanned file&#39;s size is
    * bigger than this value then the rest of the bytes are omitted. Only one
    * of bytes_limit_per_file and bytes_limit_per_file_percent can be
    * specified.
    */
  var bytesLimitPerFile: js.UndefOr[String] = js.native
  /**
    * Max percentage of bytes to scan from a file. The rest are omitted. The
    * number of bytes scanned is rounded down. Must be between 0 and 100,
    * inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of
    * bytes_limit_per_file and bytes_limit_per_file_percent can be specified.
    */
  var bytesLimitPerFilePercent: js.UndefOr[Double] = js.native
  /**
    * The set of one or more files to scan.
    */
  var fileSet: js.UndefOr[SchemaGooglePrivacyDlpV2FileSet] = js.native
  /**
    * List of file type groups to include in the scan. If empty, all files are
    * scanned and available data format processors are applied. In addition,
    * the binary content of the selected files is always scanned as well.
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Limits the number of files to scan to this percentage of the input
    * FileSet. Number of files scanned is rounded down. Must be between 0 and
    * 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
    */
  var filesLimitPercent: js.UndefOr[Double] = js.native
  var sampleMethod: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CloudStorageOptions {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CloudStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageOptions]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CloudStorageOptionsOps[Self <: SchemaGooglePrivacyDlpV2CloudStorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesLimitPerFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesLimitPerFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesLimitPerFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesLimitPerFile")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesLimitPerFilePercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesLimitPerFilePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesLimitPerFilePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesLimitPerFilePercent")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSet(value: SchemaGooglePrivacyDlpV2FileSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSet")(js.undefined)
        ret
    }
    @scala.inline
    def withFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesLimitPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesLimitPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesLimitPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesLimitPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleMethod")(js.undefined)
        ret
    }
  }
  
}

