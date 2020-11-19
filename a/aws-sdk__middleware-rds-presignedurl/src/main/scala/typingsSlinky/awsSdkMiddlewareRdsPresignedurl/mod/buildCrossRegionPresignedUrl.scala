package typingsSlinky.awsSdkMiddlewareRdsPresignedurl.mod

import typingsSlinky.awsSdkTypes.middlewareMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-rds-presignedurl", "buildCrossRegionPresignedUrl")
@js.native
object buildCrossRegionPresignedUrl extends js.Object {
  
  def apply[Input /* <: RDSInput */, Output /* <: js.Object */](
    hasSourceIdentifierKeyRegionCredentialsEndpointBase64EncoderUtf8DecoderSha256: BuildRDSPresignedUrlParameters
  ): Middleware[Input, Output] = js.native
}
