package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionDetails extends js.Object {
  /**
    * The domain name corresponding to the distribution.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The entity tag is a hash of the object.
    */
  var ETag: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time that the distribution was last modified.
    */
  var LastModifiedTime: js.UndefOr[NonEmptyString] = js.native
  /**
    * A complex type that controls whether access logs are written for the distribution.
    */
  var Logging: js.UndefOr[AwsCloudFrontDistributionLogging] = js.native
  /**
    * A complex type that contains information about origins for this distribution.
    */
  var Origins: js.UndefOr[AwsCloudFrontDistributionOrigins] = js.native
  /**
    * Indicates the current status of the distribution.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  /**
    * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
    */
  var WebAclId: js.UndefOr[NonEmptyString] = js.native
}

object AwsCloudFrontDistributionDetails {
  @scala.inline
  def apply(): AwsCloudFrontDistributionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionDetails]
  }
  @scala.inline
  implicit class AwsCloudFrontDistributionDetailsOps[Self <: AwsCloudFrontDistributionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withETag(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: AwsCloudFrontDistributionLogging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logging")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: AwsCloudFrontDistributionOrigins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origins")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withWebAclId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebAclId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebAclId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebAclId")(js.undefined)
        ret
    }
  }
  
}

