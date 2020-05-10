package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReportExportConfig extends js.Object {
  /**
    *  The name of the S3 bucket where the raw data of a report are exported. 
    */
  var bucket: js.UndefOr[NonEmptyString] = js.native
  /**
    *  A boolean value that specifies if the results of a report are encrypted. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  The encryption key for the report's encrypted raw data. 
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The type of build output artifact to create. Valid values include:     NONE: AWS CodeBuild creates the raw data in the output bucket. This is the default if packaging is not specified.     ZIP: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.   
    */
  var packaging: js.UndefOr[ReportPackagingType] = js.native
  /**
    *  The path to the exported report's raw data results. 
    */
  var path: js.UndefOr[String] = js.native
}

object S3ReportExportConfig {
  @scala.inline
  def apply(): S3ReportExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReportExportConfig]
  }
  @scala.inline
  implicit class S3ReportExportConfigOps[Self <: S3ReportExportConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionDisabled(value: WrapperBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKey(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPackaging(value: ReportPackagingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packaging")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

