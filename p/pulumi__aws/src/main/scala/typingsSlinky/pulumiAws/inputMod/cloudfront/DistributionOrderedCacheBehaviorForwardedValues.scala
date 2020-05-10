package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOrderedCacheBehaviorForwardedValues extends js.Object {
  /**
    * The forwarded values cookies
    * that specifies how CloudFront handles cookies (maximum one).
    */
  var cookies: Input[DistributionOrderedCacheBehaviorForwardedValuesCookies] = js.native
  /**
    * Specifies the Headers, if any, that you want
    * CloudFront to vary upon for this cache behavior. Specify `*` to include all
    * headers.
    */
  var headers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Indicates whether you want CloudFront to forward
    * query strings to the origin that is associated with this cache behavior.
    */
  var queryString: Input[Boolean] = js.native
  /**
    * When specified, along with a value of
    * `true` for `queryString`, all query strings are forwarded, however only the
    * query string keys listed in this argument are cached. When omitted with a
    * value of `true` for `queryString`, all query string keys are cached.
    */
  var queryStringCacheKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object DistributionOrderedCacheBehaviorForwardedValues {
  @scala.inline
  def apply(
    cookies: Input[DistributionOrderedCacheBehaviorForwardedValuesCookies],
    queryString: Input[Boolean]
  ): DistributionOrderedCacheBehaviorForwardedValues = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrderedCacheBehaviorForwardedValues]
  }
  @scala.inline
  implicit class DistributionOrderedCacheBehaviorForwardedValuesOps[Self <: DistributionOrderedCacheBehaviorForwardedValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookies(value: Input[DistributionOrderedCacheBehaviorForwardedValuesCookies]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStringCacheKeys(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringCacheKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStringCacheKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringCacheKeys")(js.undefined)
        ret
    }
  }
  
}

