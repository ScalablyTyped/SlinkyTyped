package typingsSlinky.awsSdkApplyBodyChecksumMiddleware

import typingsSlinky.awsSdkApplyBodyChecksumMiddleware.anon.Instantiable
import typingsSlinky.awsSdkTypes.cryptoMod.StreamHasher
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/apply-body-checksum-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def applyBodyChecksumMiddleware[StreamType](headerName: String, hashCtor: Instantiable, encoder: Encoder): BuildMiddleware[_, _] = js.native
  def applyBodyChecksumMiddleware[StreamType](
    headerName: String,
    hashCtor: Instantiable,
    encoder: Encoder,
    streamHasher: StreamHasher[StreamType]
  ): BuildMiddleware[_, _] = js.native
}
