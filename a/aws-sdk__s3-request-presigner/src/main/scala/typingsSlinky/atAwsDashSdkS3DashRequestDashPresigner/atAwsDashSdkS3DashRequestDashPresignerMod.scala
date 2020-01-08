package typingsSlinky.atAwsDashSdkS3DashRequestDashPresigner

import typingsSlinky.atAwsDashSdkS3DashRequestDashPresigner.atAwsDashSdkS3DashRequestDashPresignerStrings.service
import typingsSlinky.atAwsDashSdkS3DashRequestDashPresigner.atAwsDashSdkS3DashRequestDashPresignerStrings.uriEscapePath
import typingsSlinky.atAwsDashSdkSignatureDashV4.buildSignatureV4Mod.SignatureV4CryptoInit
import typingsSlinky.atAwsDashSdkSignatureDashV4.buildSignatureV4Mod.SignatureV4Init
import typingsSlinky.atAwsDashSdkTypes.buildSignatureMod.RequestPresigner
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/s3-request-presigner", JSImport.Namespace)
@js.native
object atAwsDashSdkS3DashRequestDashPresignerMod extends js.Object {
  @js.native
  class S3RequestPresigner protected () extends RequestPresigner {
    def this(hasServiceUriEscapePathRest: PartialBy[SignatureV4Init with SignatureV4CryptoInit, service | uriEscapePath]) = this()
    val signer: js.Any = js.native
  }
  
  /**
    * PartialBy<T, K> makes properties specified in K optional in interface T
    * see: https://stackoverflow.com/questions/43159887/make-a-single-property-optional-in-typescript
    * */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PartialBy[T, K /* <: String */] = (Omit[T, K]) with (Partial[Pick[T, K]])
}

