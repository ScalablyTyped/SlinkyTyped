package typingsSlinky.s3Uploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3UploaderOptions extends js.Object {
  var awsAccessKeyId: js.UndefOr[String] = js.native
  var awsBucketAcl: js.UndefOr[String] = js.native
  var awsBucketPath: js.UndefOr[String] = js.native
  var awsBucketRegion: js.UndefOr[String] = js.native
  var awsHttpTimeout: js.UndefOr[Double] = js.native
  var awsMaxRetries: js.UndefOr[Double] = js.native
  var awsSecretAccessKey: js.UndefOr[String] = js.native
  var resizeQuality: js.UndefOr[Double] = js.native
  var returnExif: js.UndefOr[Boolean] = js.native
  var tmpDir: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var versions: js.UndefOr[js.Array[S3UploaderVersion]] = js.native
  var workers: js.UndefOr[Double] = js.native
}

object S3UploaderOptions {
  @scala.inline
  def apply(): S3UploaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3UploaderOptions]
  }
  @scala.inline
  implicit class S3UploaderOptionsOps[Self <: S3UploaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccessKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccessKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccessKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsBucketAcl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsBucketAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsBucketAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsBucketAcl")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsBucketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsBucketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsBucketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsBucketPath")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsBucketRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsBucketRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsBucketRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsBucketRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsHttpTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsHttpTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsHttpTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsHttpTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsMaxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsMaxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsSecretAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsSecretAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsSecretAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsSecretAccessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnExif(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnExif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnExif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnExif")(js.undefined)
        ret
    }
    @scala.inline
    def withTmpDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmpDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpDir")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[S3UploaderVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(js.undefined)
        ret
    }
  }
  
}

