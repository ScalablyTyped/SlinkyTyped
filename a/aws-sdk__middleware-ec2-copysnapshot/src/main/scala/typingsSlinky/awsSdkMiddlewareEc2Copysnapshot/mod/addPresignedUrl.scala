package typingsSlinky.awsSdkMiddlewareEc2Copysnapshot.mod

import typingsSlinky.awsSdkTypes.middlewareMod.Middleware
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-ec2-copysnapshot", "addPresignedUrl")
@js.native
object addPresignedUrl extends js.Object {
  
  def apply[Input /* <: CopySnapshotInput */, Output /* <: MetadataBearer */](hasRegionCredentialsEndpointBase64EncoderUtf8DecoderSha256: AddPresignedUrlParameters): Middleware[Input, Output] = js.native
}
