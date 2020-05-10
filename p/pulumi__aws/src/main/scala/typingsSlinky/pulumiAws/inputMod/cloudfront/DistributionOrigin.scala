package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOrigin extends js.Object {
  /**
    * One or more sub-resources with `name` and
    * `value` parameters that specify header data that will be sent to the origin
    * (multiples allowed).
    */
  var customHeaders: js.UndefOr[Input[js.Array[Input[DistributionOriginCustomHeader]]]] = js.native
  /**
    * The CloudFront custom
    * origin configuration information. If an S3
    * origin is required, use `s3OriginConfig` instead.
    */
  var customOriginConfig: js.UndefOr[Input[DistributionOriginCustomOriginConfig]] = js.native
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  var domainName: Input[String] = js.native
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String] = js.native
  /**
    * An optional element that causes CloudFront to
    * request your content from a directory in your Amazon S3 bucket or your
    * custom origin.
    */
  var originPath: js.UndefOr[Input[String]] = js.native
  /**
    * The CloudFront S3 origin
    * configuration information. If a custom origin is required, use
    * `customOriginConfig` instead.
    */
  var s3OriginConfig: js.UndefOr[Input[DistributionOriginS3OriginConfig]] = js.native
}

object DistributionOrigin {
  @scala.inline
  def apply(domainName: Input[String], originId: Input[String]): DistributionOrigin = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrigin]
  }
  @scala.inline
  implicit class DistributionOriginOps[Self <: DistributionOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomHeaders(value: Input[js.Array[Input[DistributionOriginCustomHeader]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomOriginConfig(value: Input[DistributionOriginCustomOriginConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOriginConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomOriginConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOriginConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originPath")(js.undefined)
        ret
    }
    @scala.inline
    def withS3OriginConfig(value: Input[DistributionOriginS3OriginConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3OriginConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3OriginConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3OriginConfig")(js.undefined)
        ret
    }
  }
  
}

