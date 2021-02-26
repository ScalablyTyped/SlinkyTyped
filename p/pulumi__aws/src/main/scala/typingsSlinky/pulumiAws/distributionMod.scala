package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.cloudfront.DistributionCustomErrorResponse
import typingsSlinky.pulumiAws.outputMod.cloudfront.DistributionDefaultCacheBehavior
import typingsSlinky.pulumiAws.outputMod.cloudfront.DistributionLoggingConfig
import typingsSlinky.pulumiAws.outputMod.cloudfront.DistributionOrderedCacheBehavior
import typingsSlinky.pulumiAws.outputMod.cloudfront.DistributionOrigin
import typingsSlinky.pulumiAws.outputMod.cloudfront.DistributionOriginGroup
import typingsSlinky.pulumiAws.outputMod.cloudfront.DistributionRestrictions
import typingsSlinky.pulumiAws.outputMod.cloudfront.DistributionTrustedSigner
import typingsSlinky.pulumiAws.outputMod.cloudfront.DistributionViewerCertificate
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionMod {
  
  @JSImport("@pulumi/aws/cloudfront/distribution", "Distribution")
  @js.native
  class Distribution protected () extends CustomResource {
    /**
      * Create a Distribution resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DistributionArgs) = this()
    def this(name: String, args: DistributionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Extra CNAMEs (alternate domain names), if any, for
      * this distribution.
      */
    val aliases: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The ARN (Amazon Resource Name) for the distribution. For example: `arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5`, where `123456789012` is your AWS account ID.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Internal value used by CloudFront to allow future
      * updates to the distribution configuration.
      */
    val callerReference: Output_[String] = js.native
    
    /**
      * Any comments you want to include about the
      * distribution.
      */
    val comment: Output_[js.UndefOr[String]] = js.native
    
    /**
      * One or more custom error response elements (multiples allowed).
      */
    val customErrorResponses: Output_[js.UndefOr[js.Array[DistributionCustomErrorResponse]]] = js.native
    
    /**
      * The default cache behavior for this distribution (maximum
      * one).
      */
    val defaultCacheBehavior: Output_[DistributionDefaultCacheBehavior] = js.native
    
    /**
      * The object that you want CloudFront to
      * return (for example, index.html) when an end user requests the root URL.
      */
    val defaultRootObject: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The DNS domain name of either the S3 bucket, or
      * web site of your custom origin.
      */
    val domainName: Output_[String] = js.native
    
    /**
      * Whether the distribution is enabled to accept end
      * user requests for content.
      */
    val enabled: Output_[Boolean] = js.native
    
    /**
      * The current version of the distribution's information. For example:
      * `E2QWRUHAPOMQZL`.
      */
    val etag: Output_[String] = js.native
    
    /**
      * The CloudFront Route 53 zone ID that can be used to
      * route an [Alias Resource Record Set](http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html) to. This attribute is simply an
      * alias for the zone ID `Z2FDTNDATAQYW2`.
      */
    val hostedZoneId: Output_[String] = js.native
    
    /**
      * The maximum HTTP version to support on the
      * distribution. Allowed values are `http1.1` and `http2`. The default is
      * `http2`.
      */
    val httpVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The number of invalidation batches
      * currently in progress.
      */
    val inProgressValidationBatches: Output_[Double] = js.native
    
    /**
      * Whether the IPv6 is enabled for the distribution.
      */
    val isIpv6Enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The date and time the distribution was last modified.
      */
    val lastModifiedTime: Output_[String] = js.native
    
    /**
      * The logging
      * configuration that controls how logs are written
      * to your distribution (maximum one).
      */
    val loggingConfig: Output_[js.UndefOr[DistributionLoggingConfig]] = js.native
    
    /**
      * An ordered list of cache behaviors
      * resource for this distribution. List from top to bottom
      * in order of precedence. The topmost cache behavior will have precedence 0.
      */
    val orderedCacheBehaviors: Output_[js.UndefOr[js.Array[DistributionOrderedCacheBehavior]]] = js.native
    
    /**
      * One or more originGroup for this
      * distribution (multiples allowed).
      */
    val originGroups: Output_[js.UndefOr[js.Array[DistributionOriginGroup]]] = js.native
    
    /**
      * One or more origins for this
      * distribution (multiples allowed).
      */
    val origins: Output_[js.Array[DistributionOrigin]] = js.native
    
    /**
      * The price class for this distribution. One of
      * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
      */
    val priceClass: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The restriction
      * configuration for this distribution (maximum one).
      */
    val restrictions: Output_[DistributionRestrictions] = js.native
    
    /**
      * Disables the distribution instead of
      * deleting it when destroying the resource. If this is set,
      * the distribution needs to be deleted manually afterwards. Default: `false`.
      */
    val retainOnDelete: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The current status of the distribution. `Deployed` if the
      * distribution's information is fully propagated throughout the Amazon
      * CloudFront system.
      */
    val status: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
      * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
      */
    val trustedSigners: Output_[js.Array[DistributionTrustedSigner]] = js.native
    
    /**
      * The SSL
      * configuration for this distribution (maximum
      * one).
      */
    val viewerCertificate: Output_[DistributionViewerCertificate] = js.native
    
    /**
      * If enabled, the resource will wait for
      * the distribution status to change from `InProgress` to `Deployed`. Setting
      * this to`false` will skip the process. Default: `true`.
      */
    val waitForDeployment: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A unique identifier that specifies the AWS WAF web ACL,
      * if any, to associate with this distribution.
      * To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
      * for example `aws_wafv2_web_acl.example.arn`. To specify a web
      * ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
      * The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
      * credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
      */
    val webAclId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Distribution {
    
    /**
      * Get an existing Distribution resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudfront/distribution", "Distribution.get")
    @js.native
    def get(name: String, id: Input[ID]): Distribution = js.native
    @JSImport("@pulumi/aws/cloudfront/distribution", "Distribution.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Distribution = js.native
    @JSImport("@pulumi/aws/cloudfront/distribution", "Distribution.get")
    @js.native
    def get(name: String, id: Input[ID], state: DistributionState): Distribution = js.native
    @JSImport("@pulumi/aws/cloudfront/distribution", "Distribution.get")
    @js.native
    def get(name: String, id: Input[ID], state: DistributionState, opts: CustomResourceOptions): Distribution = js.native
    
    /**
      * Returns true if the given object is an instance of Distribution.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudfront/distribution", "Distribution.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/distribution.Distribution */ Boolean = js.native
  }
  
  @js.native
  trait DistributionArgs extends StObject {
    
    /**
      * Extra CNAMEs (alternate domain names), if any, for
      * this distribution.
      */
    val aliases: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Any comments you want to include about the
      * distribution.
      */
    val comment: js.UndefOr[Input[String]] = js.native
    
    /**
      * One or more custom error response elements (multiples allowed).
      */
    val customErrorResponses: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionCustomErrorResponse]
          ]
        ]
      ] = js.native
    
    /**
      * The default cache behavior for this distribution (maximum
      * one).
      */
    val defaultCacheBehavior: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionDefaultCacheBehavior] = js.native
    
    /**
      * The object that you want CloudFront to
      * return (for example, index.html) when an end user requests the root URL.
      */
    val defaultRootObject: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the distribution is enabled to accept end
      * user requests for content.
      */
    val enabled: Input[Boolean] = js.native
    
    /**
      * The maximum HTTP version to support on the
      * distribution. Allowed values are `http1.1` and `http2`. The default is
      * `http2`.
      */
    val httpVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the IPv6 is enabled for the distribution.
      */
    val isIpv6Enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The logging
      * configuration that controls how logs are written
      * to your distribution (maximum one).
      */
    val loggingConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionLoggingConfig]] = js.native
    
    /**
      * An ordered list of cache behaviors
      * resource for this distribution. List from top to bottom
      * in order of precedence. The topmost cache behavior will have precedence 0.
      */
    val orderedCacheBehaviors: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrderedCacheBehavior]
          ]
        ]
      ] = js.native
    
    /**
      * One or more originGroup for this
      * distribution (multiples allowed).
      */
    val originGroups: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOriginGroup]]
        ]
      ] = js.native
    
    /**
      * One or more origins for this
      * distribution (multiples allowed).
      */
    val origins: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrigin]]] = js.native
    
    /**
      * The price class for this distribution. One of
      * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
      */
    val priceClass: js.UndefOr[Input[String]] = js.native
    
    /**
      * The restriction
      * configuration for this distribution (maximum one).
      */
    val restrictions: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionRestrictions] = js.native
    
    /**
      * Disables the distribution instead of
      * deleting it when destroying the resource. If this is set,
      * the distribution needs to be deleted manually afterwards. Default: `false`.
      */
    val retainOnDelete: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The SSL
      * configuration for this distribution (maximum
      * one).
      */
    val viewerCertificate: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionViewerCertificate] = js.native
    
    /**
      * If enabled, the resource will wait for
      * the distribution status to change from `InProgress` to `Deployed`. Setting
      * this to`false` will skip the process. Default: `true`.
      */
    val waitForDeployment: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A unique identifier that specifies the AWS WAF web ACL,
      * if any, to associate with this distribution.
      * To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
      * for example `aws_wafv2_web_acl.example.arn`. To specify a web
      * ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
      * The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
      * credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
      */
    val webAclId: js.UndefOr[Input[String]] = js.native
  }
  object DistributionArgs {
    
    @scala.inline
    def apply(
      defaultCacheBehavior: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionDefaultCacheBehavior],
      enabled: Input[Boolean],
      origins: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrigin]]],
      restrictions: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionRestrictions],
      viewerCertificate: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionViewerCertificate]
    ): DistributionArgs = {
      val __obj = js.Dynamic.literal(defaultCacheBehavior = defaultCacheBehavior.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], viewerCertificate = viewerCertificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributionArgs]
    }
    
    @scala.inline
    implicit class DistributionArgsMutableBuilder[Self <: DistributionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: Input[String]*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCustomErrorResponses(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionCustomErrorResponse]
              ]
            ]
      ): Self = StObject.set(x, "customErrorResponses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomErrorResponsesUndefined: Self = StObject.set(x, "customErrorResponses", js.undefined)
      
      @scala.inline
      def setCustomErrorResponsesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionCustomErrorResponse]*): Self = StObject.set(x, "customErrorResponses", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCacheBehavior(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionDefaultCacheBehavior]): Self = StObject.set(x, "defaultCacheBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRootObject(value: Input[String]): Self = StObject.set(x, "defaultRootObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRootObjectUndefined: Self = StObject.set(x, "defaultRootObject", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersion(value: Input[String]): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersionUndefined: Self = StObject.set(x, "httpVersion", js.undefined)
      
      @scala.inline
      def setIsIpv6Enabled(value: Input[Boolean]): Self = StObject.set(x, "isIpv6Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIpv6EnabledUndefined: Self = StObject.set(x, "isIpv6Enabled", js.undefined)
      
      @scala.inline
      def setLoggingConfig(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionLoggingConfig]): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
      
      @scala.inline
      def setOrderedCacheBehaviors(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrderedCacheBehavior]
              ]
            ]
      ): Self = StObject.set(x, "orderedCacheBehaviors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedCacheBehaviorsUndefined: Self = StObject.set(x, "orderedCacheBehaviors", js.undefined)
      
      @scala.inline
      def setOrderedCacheBehaviorsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrderedCacheBehavior]*): Self = StObject.set(x, "orderedCacheBehaviors", js.Array(value :_*))
      
      @scala.inline
      def setOriginGroups(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOriginGroup]]
            ]
      ): Self = StObject.set(x, "originGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginGroupsUndefined: Self = StObject.set(x, "originGroups", js.undefined)
      
      @scala.inline
      def setOriginGroupsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOriginGroup]*): Self = StObject.set(x, "originGroups", js.Array(value :_*))
      
      @scala.inline
      def setOrigins(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrigin]]]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrigin]*): Self = StObject.set(x, "origins", js.Array(value :_*))
      
      @scala.inline
      def setPriceClass(value: Input[String]): Self = StObject.set(x, "priceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceClassUndefined: Self = StObject.set(x, "priceClass", js.undefined)
      
      @scala.inline
      def setRestrictions(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionRestrictions]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainOnDelete(value: Input[Boolean]): Self = StObject.set(x, "retainOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainOnDeleteUndefined: Self = StObject.set(x, "retainOnDelete", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setViewerCertificate(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionViewerCertificate]): Self = StObject.set(x, "viewerCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForDeployment(value: Input[Boolean]): Self = StObject.set(x, "waitForDeployment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForDeploymentUndefined: Self = StObject.set(x, "waitForDeployment", js.undefined)
      
      @scala.inline
      def setWebAclId(value: Input[String]): Self = StObject.set(x, "webAclId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAclIdUndefined: Self = StObject.set(x, "webAclId", js.undefined)
    }
  }
  
  @js.native
  trait DistributionState extends StObject {
    
    /**
      * Extra CNAMEs (alternate domain names), if any, for
      * this distribution.
      */
    val aliases: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ARN (Amazon Resource Name) for the distribution. For example: `arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5`, where `123456789012` is your AWS account ID.
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
    val customErrorResponses: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionCustomErrorResponse]
          ]
        ]
      ] = js.native
    
    /**
      * The default cache behavior for this distribution (maximum
      * one).
      */
    val defaultCacheBehavior: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionDefaultCacheBehavior]
      ] = js.native
    
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
      * route an [Alias Resource Record Set](http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html) to. This attribute is simply an
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
    val loggingConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionLoggingConfig]] = js.native
    
    /**
      * An ordered list of cache behaviors
      * resource for this distribution. List from top to bottom
      * in order of precedence. The topmost cache behavior will have precedence 0.
      */
    val orderedCacheBehaviors: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrderedCacheBehavior]
          ]
        ]
      ] = js.native
    
    /**
      * One or more originGroup for this
      * distribution (multiples allowed).
      */
    val originGroups: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOriginGroup]]
        ]
      ] = js.native
    
    /**
      * One or more origins for this
      * distribution (multiples allowed).
      */
    val origins: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrigin]]]
      ] = js.native
    
    /**
      * The price class for this distribution. One of
      * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
      */
    val priceClass: js.UndefOr[Input[String]] = js.native
    
    /**
      * The restriction
      * configuration for this distribution (maximum one).
      */
    val restrictions: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionRestrictions]] = js.native
    
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
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
      * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
      */
    val trustedSigners: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionTrustedSigner]]
        ]
      ] = js.native
    
    /**
      * The SSL
      * configuration for this distribution (maximum
      * one).
      */
    val viewerCertificate: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionViewerCertificate]] = js.native
    
    /**
      * If enabled, the resource will wait for
      * the distribution status to change from `InProgress` to `Deployed`. Setting
      * this to`false` will skip the process. Default: `true`.
      */
    val waitForDeployment: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A unique identifier that specifies the AWS WAF web ACL,
      * if any, to associate with this distribution.
      * To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
      * for example `aws_wafv2_web_acl.example.arn`. To specify a web
      * ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
      * The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
      * credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
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
    implicit class DistributionStateMutableBuilder[Self <: DistributionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: Input[String]*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCallerReference(value: Input[String]): Self = StObject.set(x, "callerReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallerReferenceUndefined: Self = StObject.set(x, "callerReference", js.undefined)
      
      @scala.inline
      def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCustomErrorResponses(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionCustomErrorResponse]
              ]
            ]
      ): Self = StObject.set(x, "customErrorResponses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomErrorResponsesUndefined: Self = StObject.set(x, "customErrorResponses", js.undefined)
      
      @scala.inline
      def setCustomErrorResponsesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionCustomErrorResponse]*): Self = StObject.set(x, "customErrorResponses", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCacheBehavior(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionDefaultCacheBehavior]): Self = StObject.set(x, "defaultCacheBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCacheBehaviorUndefined: Self = StObject.set(x, "defaultCacheBehavior", js.undefined)
      
      @scala.inline
      def setDefaultRootObject(value: Input[String]): Self = StObject.set(x, "defaultRootObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRootObjectUndefined: Self = StObject.set(x, "defaultRootObject", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setEtag(value: Input[String]): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setHostedZoneId(value: Input[String]): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
      
      @scala.inline
      def setHttpVersion(value: Input[String]): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersionUndefined: Self = StObject.set(x, "httpVersion", js.undefined)
      
      @scala.inline
      def setInProgressValidationBatches(value: Input[Double]): Self = StObject.set(x, "inProgressValidationBatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInProgressValidationBatchesUndefined: Self = StObject.set(x, "inProgressValidationBatches", js.undefined)
      
      @scala.inline
      def setIsIpv6Enabled(value: Input[Boolean]): Self = StObject.set(x, "isIpv6Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIpv6EnabledUndefined: Self = StObject.set(x, "isIpv6Enabled", js.undefined)
      
      @scala.inline
      def setLastModifiedTime(value: Input[String]): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
      
      @scala.inline
      def setLoggingConfig(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionLoggingConfig]): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
      
      @scala.inline
      def setOrderedCacheBehaviors(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrderedCacheBehavior]
              ]
            ]
      ): Self = StObject.set(x, "orderedCacheBehaviors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedCacheBehaviorsUndefined: Self = StObject.set(x, "orderedCacheBehaviors", js.undefined)
      
      @scala.inline
      def setOrderedCacheBehaviorsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrderedCacheBehavior]*): Self = StObject.set(x, "orderedCacheBehaviors", js.Array(value :_*))
      
      @scala.inline
      def setOriginGroups(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOriginGroup]]
            ]
      ): Self = StObject.set(x, "originGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginGroupsUndefined: Self = StObject.set(x, "originGroups", js.undefined)
      
      @scala.inline
      def setOriginGroupsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOriginGroup]*): Self = StObject.set(x, "originGroups", js.Array(value :_*))
      
      @scala.inline
      def setOrigins(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrigin]]]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      @scala.inline
      def setOriginsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionOrigin]*): Self = StObject.set(x, "origins", js.Array(value :_*))
      
      @scala.inline
      def setPriceClass(value: Input[String]): Self = StObject.set(x, "priceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceClassUndefined: Self = StObject.set(x, "priceClass", js.undefined)
      
      @scala.inline
      def setRestrictions(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionRestrictions]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
      
      @scala.inline
      def setRetainOnDelete(value: Input[Boolean]): Self = StObject.set(x, "retainOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainOnDeleteUndefined: Self = StObject.set(x, "retainOnDelete", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTrustedSigners(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionTrustedSigner]]
            ]
      ): Self = StObject.set(x, "trustedSigners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustedSignersUndefined: Self = StObject.set(x, "trustedSigners", js.undefined)
      
      @scala.inline
      def setTrustedSignersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionTrustedSigner]*): Self = StObject.set(x, "trustedSigners", js.Array(value :_*))
      
      @scala.inline
      def setViewerCertificate(value: Input[typingsSlinky.pulumiAws.inputMod.cloudfront.DistributionViewerCertificate]): Self = StObject.set(x, "viewerCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewerCertificateUndefined: Self = StObject.set(x, "viewerCertificate", js.undefined)
      
      @scala.inline
      def setWaitForDeployment(value: Input[Boolean]): Self = StObject.set(x, "waitForDeployment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForDeploymentUndefined: Self = StObject.set(x, "waitForDeployment", js.undefined)
      
      @scala.inline
      def setWebAclId(value: Input[String]): Self = StObject.set(x, "webAclId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAclIdUndefined: Self = StObject.set(x, "webAclId", js.undefined)
    }
  }
}
