package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: String = js.native
  /**
    * CloudFront automatically adds this element to the response only if you've set up the distribution to serve private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of for each trusted signer. The Signer child element lists the AWS account number of the trusted signer (or an empty Self element if the signer is you). The Signer element also includes the IDs of any active key pairs associated with the trusted signer's AWS account. If no KeyPairId element appears for a Signer, that signer can't create working signed URLs.
    */
  var ActiveTrustedSigners: typingsSlinky.awsSdk.cloudfrontMod.ActiveTrustedSigners = js.native
  /**
    * AWS services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions. For more information about ICP recordals, see  Signup, Accounts, and Credentials in Getting Started with AWS services in China.
    */
  var AliasICPRecordals: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.AliasICPRecordals] = js.native
  /**
    * The current configuration information for the distribution. Send a GET request to the /CloudFront API version/distribution ID/config resource.
    */
  var DistributionConfig: typingsSlinky.awsSdk.cloudfrontMod.DistributionConfig = js.native
  /**
    * The domain name corresponding to the distribution, for example, d111111abcdef8.cloudfront.net. 
    */
  var DomainName: String = js.native
  /**
    * The identifier for the distribution. For example: EDFDVBD632BHDS5. 
    */
  var Id: String = js.native
  /**
    * The number of invalidation batches currently in progress. 
    */
  var InProgressInvalidationBatches: integer = js.native
  /**
    * The date and time the distribution was last modified. 
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * This response element indicates the current status of the distribution. When the status is Deployed, the distribution's information is fully propagated to all CloudFront edge locations. 
    */
  var Status: String = js.native
}

object Distribution {
  @scala.inline
  def apply(
    ARN: String,
    ActiveTrustedSigners: ActiveTrustedSigners,
    DistributionConfig: DistributionConfig,
    DomainName: String,
    Id: String,
    InProgressInvalidationBatches: integer,
    LastModifiedTime: js.Date,
    Status: String
  ): Distribution = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], ActiveTrustedSigners = ActiveTrustedSigners.asInstanceOf[js.Any], DistributionConfig = DistributionConfig.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InProgressInvalidationBatches = InProgressInvalidationBatches.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTrustedSigners(value: ActiveTrustedSigners): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveTrustedSigners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistributionConfig(value: DistributionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInProgressInvalidationBatches(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InProgressInvalidationBatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliasICPRecordals(value: AliasICPRecordals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasICPRecordals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasICPRecordals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasICPRecordals")(js.undefined)
        ret
    }
  }
  
}

