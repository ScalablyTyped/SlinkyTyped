package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingDistributionSummary extends js.Object {
  
  /**
    *  The ARN (Amazon Resource Name) for the streaming distribution. For example: arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: String = js.native
  
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming distribution.
    */
  var Aliases: typingsSlinky.awsSdk.cloudfrontMod.Aliases = js.native
  
  /**
    * The comment originally specified when this distribution was created.
    */
  var Comment: String = js.native
  
  /**
    * The domain name corresponding to the distribution, for example, d111111abcdef8.cloudfront.net.
    */
  var DomainName: String = js.native
  
  /**
    * Whether the distribution is enabled to accept end user requests for content.
    */
  var Enabled: Boolean = js.native
  
  /**
    * The identifier for the distribution, for example, EDFDVBD632BHDS5.
    */
  var Id: String = js.native
  
  /**
    * The date and time the distribution was last modified.
    */
  var LastModifiedTime: js.Date = js.native
  
  /**
    * A complex type that contains information about price class for this streaming distribution. 
    */
  var PriceClass: typingsSlinky.awsSdk.cloudfrontMod.PriceClass = js.native
  
  /**
    * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
    */
  var S3Origin: typingsSlinky.awsSdk.cloudfrontMod.S3Origin = js.native
  
  /**
    *  Indicates the current status of the distribution. When the status is Deployed, the distribution's information is fully propagated throughout the Amazon CloudFront system.
    */
  var Status: String = js.native
  
  /**
    * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items.If you don't want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it's currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide. 
    */
  var TrustedSigners: typingsSlinky.awsSdk.cloudfrontMod.TrustedSigners = js.native
}
object StreamingDistributionSummary {
  
  @scala.inline
  def apply(
    ARN: String,
    Aliases: Aliases,
    Comment: String,
    DomainName: String,
    Enabled: Boolean,
    Id: String,
    LastModifiedTime: js.Date,
    PriceClass: PriceClass,
    S3Origin: S3Origin,
    Status: String,
    TrustedSigners: TrustedSigners
  ): StreamingDistributionSummary = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], Aliases = Aliases.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], PriceClass = PriceClass.asInstanceOf[js.Any], S3Origin = S3Origin.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TrustedSigners = TrustedSigners.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistributionSummary]
  }
  
  @scala.inline
  implicit class StreamingDistributionSummaryOps[Self <: StreamingDistributionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliases(value: Aliases): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceClass(value: PriceClass): Self = this.set("PriceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Origin(value: S3Origin): Self = this.set("S3Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustedSigners(value: TrustedSigners): Self = this.set("TrustedSigners", value.asInstanceOf[js.Any])
  }
}
