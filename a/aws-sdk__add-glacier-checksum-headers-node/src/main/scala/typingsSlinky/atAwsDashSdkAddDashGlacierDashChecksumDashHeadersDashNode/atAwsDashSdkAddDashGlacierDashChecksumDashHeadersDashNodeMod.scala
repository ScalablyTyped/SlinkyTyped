package typingsSlinky.atAwsDashSdkAddDashGlacierDashChecksumDashHeadersDashNode

import typingsSlinky.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandler
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandlerArguments
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Decoder
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/add-glacier-checksum-headers-node", JSImport.Namespace)
@js.native
object atAwsDashSdkAddDashGlacierDashChecksumDashHeadersDashNodeMod extends js.Object {
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[_, _, Readable], 
    js.Function1[/* hasRequestRest */ BuildHandlerArguments[_, Readable], js.Promise[_]]
  ] = js.native
}

