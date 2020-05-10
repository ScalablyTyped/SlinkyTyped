package typingsSlinky.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionDefaultCacheBehavior extends js.Object {
  /**
    * Controls which HTTP methods CloudFront
    * processes and forwards to your Amazon S3 bucket or your custom origin.
    */
  var allowedMethods: js.Array[String] = js.native
  /**
    * Controls whether CloudFront caches the
    * response to requests using the specified HTTP methods.
    */
  var cachedMethods: js.Array[String] = js.native
  /**
    * Whether you want CloudFront to automatically
    * compress content for web requests that include `Accept-Encoding: gzip` in
    * the request header (default: `false`).
    */
  var compress: js.UndefOr[Boolean] = js.native
  /**
    * The default amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * in the absence of an `Cache-Control max-age` or `Expires` header. Defaults to
    * 1 day.
    */
  var defaultTtl: js.UndefOr[Double] = js.native
  /**
    * Field level encryption configuration ID
    */
  var fieldLevelEncryptionId: js.UndefOr[String] = js.native
  /**
    * The forwarded values configuration that specifies how CloudFront
    * handles query strings, cookies and headers (maximum one).
    */
  var forwardedValues: DistributionDefaultCacheBehaviorForwardedValues = js.native
  /**
    * A config block that triggers a lambda function with
    * specific actions. Defined below, maximum 4.
    */
  var lambdaFunctionAssociations: js.UndefOr[js.Array[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]] = js.native
  /**
    * The maximum amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * to your origin to determine whether the object has been updated. Only
    * effective in the presence of `Cache-Control max-age`, `Cache-Control
    * s-maxage`, and `Expires` headers. Defaults to 365 days.
    */
  var maxTtl: js.UndefOr[Double] = js.native
  /**
    * The minimum amount of time that you want objects to
    * stay in CloudFront caches before CloudFront queries your origin to see
    * whether the object has been updated. Defaults to 0 seconds.
    */
  var minTtl: js.UndefOr[Double] = js.native
  /**
    * Indicates whether you want to distribute
    * media files in Microsoft Smooth Streaming format using the origin that is
    * associated with this cache behavior.
    */
  var smoothStreaming: js.UndefOr[Boolean] = js.native
  /**
    * The value of ID for the origin that you want
    * CloudFront to route requests to when a request matches the path pattern
    * either for a cache behavior or for the default cache behavior.
    */
  var targetOriginId: String = js.native
  /**
    * The AWS accounts, if any, that you want to
    * allow to create signed URLs for private content.
    */
  var trustedSigners: js.UndefOr[js.Array[String]] = js.native
  /**
    * Use this element to specify the
    * protocol that users can use to access the files in the origin specified by
    * TargetOriginId when a request matches the path pattern in PathPattern. One
    * of `allow-all`, `https-only`, or `redirect-to-https`.
    */
  var viewerProtocolPolicy: String = js.native
}

object DistributionDefaultCacheBehavior {
  @scala.inline
  def apply(
    allowedMethods: js.Array[String],
    cachedMethods: js.Array[String],
    forwardedValues: DistributionDefaultCacheBehaviorForwardedValues,
    targetOriginId: String,
    viewerProtocolPolicy: String
  ): DistributionDefaultCacheBehavior = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], cachedMethods = cachedMethods.asInstanceOf[js.Any], forwardedValues = forwardedValues.asInstanceOf[js.Any], targetOriginId = targetOriginId.asInstanceOf[js.Any], viewerProtocolPolicy = viewerProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDefaultCacheBehavior]
  }
  @scala.inline
  implicit class DistributionDefaultCacheBehaviorOps[Self <: DistributionDefaultCacheBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCachedMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardedValues(value: DistributionDefaultCacheBehaviorForwardedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetOriginId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOriginId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewerProtocolPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerProtocolPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTtl")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldLevelEncryptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldLevelEncryptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldLevelEncryptionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldLevelEncryptionId")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionAssociations(value: js.Array[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionAssociations")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTtl")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTtl")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothStreaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothStreaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothStreaming")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustedSigners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedSigners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustedSigners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedSigners")(js.undefined)
        ret
    }
  }
  
}

