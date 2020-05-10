package typingsSlinky.pulumiAws.distributionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionCustomErrorResponse
import typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionDefaultCacheBehavior
import typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionLoggingConfig
import typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrderedCacheBehavior
import typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrigin
import typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOriginGroup
import typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionRestrictions
import typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionViewerCertificate
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionState extends js.Object {
  /**
    * The key pair IDs that CloudFront is aware of for
    * each trusted signer, if the distribution is set up to serve private content
    * with signed URLs.
    */
  val activeTrustedSigners: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Extra CNAMEs (alternate domain names), if any, for
    * this distribution.
    */
  val aliases: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Internal value used by CloudFront to allow future
    * updates to the distribution configuration.
    */
  val callerReference: js.UndefOr[Input[String]] = js.native
  /**
    * Any comments you want to include about the
    * distribution.
    */
  val comment: js.UndefOr[Input[String]] = js.native
  /**
    * One or more custom error response elements (multiples allowed).
    */
  val customErrorResponses: js.UndefOr[Input[js.Array[Input[DistributionCustomErrorResponse]]]] = js.native
  /**
    * The default cache behavior for this distribution (maximum
    * one).
    */
  val defaultCacheBehavior: js.UndefOr[Input[DistributionDefaultCacheBehavior]] = js.native
  /**
    * The object that you want CloudFront to
    * return (for example, index.html) when an end user requests the root URL.
    */
  val defaultRootObject: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The current version of the distribution's information. For example:
    * `E2QWRUHAPOMQZL`.
    */
  val etag: js.UndefOr[Input[String]] = js.native
  /**
    * The CloudFront Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set][7] to. This attribute is simply an
    * alias for the zone ID `Z2FDTNDATAQYW2`.
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum HTTP version to support on the
    * distribution. Allowed values are `http1.1` and `http2`. The default is
    * `http2`.
    */
  val httpVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The number of invalidation batches
    * currently in progress.
    */
  val inProgressValidationBatches: js.UndefOr[Input[Double]] = js.native
  /**
    * Whether the IPv6 is enabled for the distribution.
    */
  val isIpv6Enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The date and time the distribution was last modified.
    */
  val lastModifiedTime: js.UndefOr[Input[String]] = js.native
  /**
    * The logging
    * configuration that controls how logs are written
    * to your distribution (maximum one).
    */
  val loggingConfig: js.UndefOr[Input[DistributionLoggingConfig]] = js.native
  /**
    * An ordered list of cache behaviors
    * resource for this distribution. List from top to bottom
    * in order of precedence. The topmost cache behavior will have precedence 0.
    */
  val orderedCacheBehaviors: js.UndefOr[Input[js.Array[Input[DistributionOrderedCacheBehavior]]]] = js.native
  /**
    * One or more originGroup for this
    * distribution (multiples allowed).
    */
  val originGroups: js.UndefOr[Input[js.Array[Input[DistributionOriginGroup]]]] = js.native
  /**
    * One or more origins for this
    * distribution (multiples allowed).
    */
  val origins: js.UndefOr[Input[js.Array[Input[DistributionOrigin]]]] = js.native
  /**
    * The price class for this distribution. One of
    * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
    */
  val priceClass: js.UndefOr[Input[String]] = js.native
  /**
    * The restriction
    * configuration for this distribution (maximum one).
    */
  val restrictions: js.UndefOr[Input[DistributionRestrictions]] = js.native
  /**
    * Disables the distribution instead of
    * deleting it when destroying the resource. If this is set,
    * the distribution needs to be deleted manually afterwards. Default: `false`.
    */
  val retainOnDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The current status of the distribution. `Deployed` if the
    * distribution's information is fully propagated throughout the Amazon
    * CloudFront system.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The SSL
    * configuration for this distribution (maximum
    * one).
    */
  val viewerCertificate: js.UndefOr[Input[DistributionViewerCertificate]] = js.native
  /**
    * If enabled, the resource will wait for
    * the distribution status to change from `InProgress` to `Deployed`. Setting
    * this to`false` will skip the process. Default: `true`.
    */
  val waitForDeployment: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If you're using AWS WAF to filter CloudFront
    * requests, the Id of the AWS WAF web ACL that is associated with the
    * distribution. The WAF Web ACL must exist in the WAF Global (CloudFront)
    * region and the credentials configuring this argument must have
    * `waf:GetWebACL` permissions assigned.
    */
  val webAclId: js.UndefOr[Input[String]] = js.native
}

object DistributionState {
  @scala.inline
  def apply(): DistributionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionState]
  }
  @scala.inline
  implicit class DistributionStateOps[Self <: DistributionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTrustedSigners(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTrustedSigners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTrustedSigners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTrustedSigners")(js.undefined)
        ret
    }
    @scala.inline
    def withAliases(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCallerReference(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallerReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerReference")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomErrorResponses(value: Input[js.Array[Input[DistributionCustomErrorResponse]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customErrorResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomErrorResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customErrorResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCacheBehavior(value: Input[DistributionDefaultCacheBehavior]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCacheBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCacheBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCacheBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRootObject(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRootObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withInProgressValidationBatches(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgressValidationBatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInProgressValidationBatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgressValidationBatches")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIpv6Enabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIpv6Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIpv6Enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIpv6Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingConfig(value: Input[DistributionLoggingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderedCacheBehaviors(value: Input[js.Array[Input[DistributionOrderedCacheBehavior]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedCacheBehaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderedCacheBehaviors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedCacheBehaviors")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginGroups(value: Input[js.Array[Input[DistributionOriginGroup]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: Input[js.Array[Input[DistributionOrigin]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceClass(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictions(value: Input[DistributionRestrictions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainOnDelete(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainOnDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainOnDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withViewerCertificate(value: Input[DistributionViewerCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewerCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForDeployment(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForDeployment")(js.undefined)
        ret
    }
    @scala.inline
    def withWebAclId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAclId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebAclId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAclId")(js.undefined)
        ret
    }
  }
  
}

