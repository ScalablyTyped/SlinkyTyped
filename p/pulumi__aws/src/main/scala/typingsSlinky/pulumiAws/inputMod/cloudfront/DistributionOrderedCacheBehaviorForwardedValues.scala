package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionOrderedCacheBehaviorForwardedValues extends StObject {
  
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
  implicit class DistributionOrderedCacheBehaviorForwardedValuesMutableBuilder[Self <: DistributionOrderedCacheBehaviorForwardedValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookies(value: Input[DistributionOrderedCacheBehaviorForwardedValuesCookies]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: Input[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setQueryString(value: Input[Boolean]): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringCacheKeys(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "queryStringCacheKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringCacheKeysUndefined: Self = StObject.set(x, "queryStringCacheKeys", js.undefined)
    
    @scala.inline
    def setQueryStringCacheKeysVarargs(value: Input[String]*): Self = StObject.set(x, "queryStringCacheKeys", js.Array(value :_*))
  }
}
