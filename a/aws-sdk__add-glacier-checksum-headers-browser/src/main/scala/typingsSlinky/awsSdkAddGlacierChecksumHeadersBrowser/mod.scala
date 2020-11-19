package typingsSlinky.awsSdkAddGlacierChecksumHeadersBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/add-glacier-checksum-headers-browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[_, _, Blob], 
    js.Function1[/* hasRequestRest */ BuildHandlerArguments[_, Blob], js.Promise[_]]
  ] = js.native
}
