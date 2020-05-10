package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDescriptionType extends js.Object {
  /**
    * The AWS account ID for the user pool owner.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.native
  /**
    * The ARN of the CloudFront distribution.
    */
  var CloudFrontDistribution: js.UndefOr[StringType] = js.native
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
    */
  var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.native
  /**
    * The domain string.
    */
  var Domain: js.UndefOr[DomainType] = js.native
  /**
    * The S3 bucket where the static files for this domain are stored.
    */
  var S3Bucket: js.UndefOr[S3BucketType] = js.native
  /**
    * The domain status.
    */
  var Status: js.UndefOr[DomainStatusType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
  /**
    * The app version.
    */
  var Version: js.UndefOr[DomainVersionType] = js.native
}

object DomainDescriptionType {
  @scala.inline
  def apply(): DomainDescriptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDescriptionType]
  }
  @scala.inline
  implicit class DomainDescriptionTypeOps[Self <: DomainDescriptionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAWSAccountId(value: AWSAccountIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAWSAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudFrontDistribution(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontDistribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudFrontDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFrontDistribution")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDomainConfig(value: CustomDomainConfigType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDomainConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDomainConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDomainConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: DomainType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Bucket(value: S3BucketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DomainStatusType): Self = {
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
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: DomainVersionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

