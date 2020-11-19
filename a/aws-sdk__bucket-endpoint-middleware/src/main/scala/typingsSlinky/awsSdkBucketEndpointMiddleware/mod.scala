package typingsSlinky.awsSdkBucketEndpointMiddleware

import typingsSlinky.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod.bucketEndpointMiddlewareConfiguration
import typingsSlinky.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostnameParameters
import typingsSlinky.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostname_
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/bucket-endpoint-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def bucketEndpointMiddleware(): BuildMiddleware[_, _, _] = js.native
  def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[_, _, _] = js.native
  
  def bucketHostname(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname_ = js.native
}
