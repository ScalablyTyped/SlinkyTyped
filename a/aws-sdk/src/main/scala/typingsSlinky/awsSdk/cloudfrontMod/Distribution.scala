package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distribution extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: String = js.native
  
  /**
    * CloudFront automatically adds this field to the response if you’ve configured a cache behavior in this distribution to serve private content using key groups. This field contains a list of key groups and the public keys in each key group that CloudFront can use to verify the signatures of signed URLs or signed cookies.
    */
  var ActiveTrustedKeyGroups: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.ActiveTrustedKeyGroups] = js.native
  
  /**
    *  We recommend using TrustedKeyGroups instead of TrustedSigners.  CloudFront automatically adds this field to the response if you’ve configured a cache behavior in this distribution to serve private content using trusted signers. This field contains a list of AWS account IDs and the active CloudFront key pairs in each account that CloudFront can use to verify the signatures of signed URLs or signed cookies.
    */
  var ActiveTrustedSigners: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.ActiveTrustedSigners] = js.native
  
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
    DistributionConfig: DistributionConfig,
    DomainName: String,
    Id: String,
    InProgressInvalidationBatches: integer,
    LastModifiedTime: js.Date,
    Status: String
  ): Distribution = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], DistributionConfig = DistributionConfig.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InProgressInvalidationBatches = InProgressInvalidationBatches.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  implicit class DistributionMutableBuilder[Self <: Distribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTrustedKeyGroups(value: ActiveTrustedKeyGroups): Self = StObject.set(x, "ActiveTrustedKeyGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTrustedKeyGroupsUndefined: Self = StObject.set(x, "ActiveTrustedKeyGroups", js.undefined)
    
    @scala.inline
    def setActiveTrustedSigners(value: ActiveTrustedSigners): Self = StObject.set(x, "ActiveTrustedSigners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTrustedSignersUndefined: Self = StObject.set(x, "ActiveTrustedSigners", js.undefined)
    
    @scala.inline
    def setAliasICPRecordals(value: AliasICPRecordals): Self = StObject.set(x, "AliasICPRecordals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasICPRecordalsUndefined: Self = StObject.set(x, "AliasICPRecordals", js.undefined)
    
    @scala.inline
    def setAliasICPRecordalsVarargs(value: AliasICPRecordal*): Self = StObject.set(x, "AliasICPRecordals", js.Array(value :_*))
    
    @scala.inline
    def setDistributionConfig(value: DistributionConfig): Self = StObject.set(x, "DistributionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgressInvalidationBatches(value: integer): Self = StObject.set(x, "InProgressInvalidationBatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
