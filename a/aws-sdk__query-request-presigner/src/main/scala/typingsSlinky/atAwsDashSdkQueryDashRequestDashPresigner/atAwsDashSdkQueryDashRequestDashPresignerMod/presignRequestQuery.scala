package typingsSlinky.atAwsDashSdkQueryDashRequestDashPresigner.atAwsDashSdkQueryDashRequestDashPresignerMod

import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/query-request-presigner", "presignRequestQuery")
@js.native
object presignRequestQuery extends js.Object {
  def apply(
    request: HttpRequest[scala.scalajs.js.typedarray.Uint8Array],
    hasCredentialsSha256SigningNameSigningRegionEndpointExpireTime: PresignOption
  ): js.Promise[HttpRequest[scala.scalajs.js.typedarray.Uint8Array]] = js.native
}

