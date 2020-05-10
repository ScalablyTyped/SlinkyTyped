package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionLoggingConfig extends js.Object {
  /**
    * The Amazon S3 bucket to store the access logs in, for
    * example, `myawslogbucket.s3.amazonaws.com`.
    */
  var bucket: Input[String] = js.native
  /**
    * Specifies whether you want CloudFront to
    * include cookies in access logs (default: `false`).
    */
  var includeCookies: js.UndefOr[Input[Boolean]] = js.native
  /**
    * An optional string that you want CloudFront to prefix
    * to the access log filenames for this distribution, for example, `myprefix/`.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
}

object DistributionLoggingConfig {
  @scala.inline
  def apply(bucket: Input[String]): DistributionLoggingConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionLoggingConfig]
  }
  @scala.inline
  implicit class DistributionLoggingConfigOps[Self <: DistributionLoggingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeCookies(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

