package typingsSlinky.atAwsDashSdkAddDashGlacierDashChecksumDashHeadersDashBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandler
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandlerArguments
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/add-glacier-checksum-headers-browser", JSImport.Namespace)
@js.native
object atAwsDashSdkAddDashGlacierDashChecksumDashHeadersDashBrowserMod extends js.Object {
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[_, _, Blob], 
    js.Function1[/* hasRequestRest */ BuildHandlerArguments[_, Blob], js.Promise[_]]
  ] = js.native
}

