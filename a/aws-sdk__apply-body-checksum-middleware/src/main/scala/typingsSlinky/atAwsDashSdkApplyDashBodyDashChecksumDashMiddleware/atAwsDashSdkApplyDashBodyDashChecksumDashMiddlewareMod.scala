package typingsSlinky.atAwsDashSdkApplyDashBodyDashChecksumDashMiddleware

import typingsSlinky.atAwsDashSdkTypes.buildCryptoMod.StreamHasher
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.BuildMiddleware
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/apply-body-checksum-middleware", JSImport.Namespace)
@js.native
object atAwsDashSdkApplyDashBodyDashChecksumDashMiddlewareMod extends js.Object {
  def applyBodyChecksumMiddleware[StreamType](headerName: String, hashCtor: Anon_Hash, encoder: Encoder): BuildMiddleware[_, _, StreamType] = js.native
  def applyBodyChecksumMiddleware[StreamType](headerName: String, hashCtor: Anon_Hash, encoder: Encoder, streamHasher: StreamHasher[StreamType]): BuildMiddleware[_, _, StreamType] = js.native
}

