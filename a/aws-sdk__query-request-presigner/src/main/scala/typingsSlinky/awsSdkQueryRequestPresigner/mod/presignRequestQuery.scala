package typingsSlinky.awsSdkQueryRequestPresigner.mod

import typingsSlinky.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/query-request-presigner", "presignRequestQuery")
@js.native
object presignRequestQuery extends js.Object {
  
  def apply(
    request: HttpRequest[js.typedarray.Uint8Array],
    hasCredentialsSha256SigningNameSigningRegionEndpointExpireTime: PresignOption
  ): js.Promise[HttpRequest[js.typedarray.Uint8Array]] = js.native
}
