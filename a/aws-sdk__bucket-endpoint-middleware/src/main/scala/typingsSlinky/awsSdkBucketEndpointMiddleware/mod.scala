package typingsSlinky.awsSdkBucketEndpointMiddleware

import typingsSlinky.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod.bucketEndpointMiddlewareConfiguration
import typingsSlinky.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostnameParameters
import typingsSlinky.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostname_
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/bucket-endpoint-middleware", "bucketEndpointMiddleware")
  @js.native
  def bucketEndpointMiddleware(): BuildMiddleware[_, _] = js.native
  @JSImport("@aws-sdk/bucket-endpoint-middleware", "bucketEndpointMiddleware")
  @js.native
  def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/bucket-endpoint-middleware", "bucketHostname")
  @js.native
  def bucketHostname(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname_ = js.native
}
