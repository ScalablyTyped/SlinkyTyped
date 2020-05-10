package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionLogging extends js.Object {
  /**
    * The Amazon S3 bucket to store the access logs in.
    */
  var Bucket: js.UndefOr[NonEmptyString] = js.native
  /**
    * With this field, you can enable or disable the selected distribution.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether you want CloudFront to include cookies in access logs.
    */
  var IncludeCookies: js.UndefOr[Boolean] = js.native
  /**
    * An optional string that you want CloudFront to use as a prefix to the access log filenames for this distribution.
    */
  var Prefix: js.UndefOr[NonEmptyString] = js.native
}

object AwsCloudFrontDistributionLogging {
  @scala.inline
  def apply(): AwsCloudFrontDistributionLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionLogging]
  }
  @scala.inline
  implicit class AwsCloudFrontDistributionLoggingOps[Self <: AwsCloudFrontDistributionLogging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
  }
  
}

