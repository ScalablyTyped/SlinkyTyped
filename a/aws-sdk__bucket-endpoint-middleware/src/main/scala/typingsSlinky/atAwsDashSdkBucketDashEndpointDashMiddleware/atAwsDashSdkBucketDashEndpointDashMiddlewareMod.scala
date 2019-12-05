package typingsSlinky.atAwsDashSdkBucketDashEndpointDashMiddleware

import typingsSlinky.atAwsDashSdkBucketDashEndpointDashMiddleware.buildBucketEndpointMiddlewareMod.bucketEndpointMiddlewareConfiguration
import typingsSlinky.atAwsDashSdkBucketDashEndpointDashMiddleware.buildBucketHostnameMod.BucketHostname
import typingsSlinky.atAwsDashSdkBucketDashEndpointDashMiddleware.buildBucketHostnameMod.BucketHostnameParameters
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.BuildMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/bucket-endpoint-middleware", JSImport.Namespace)
@js.native
object atAwsDashSdkBucketDashEndpointDashMiddlewareMod extends js.Object {
  def bucketEndpointMiddleware(): BuildMiddleware[_, _, _] = js.native
  def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[_, _, _] = js.native
  def bucketHostname(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname = js.native
}

