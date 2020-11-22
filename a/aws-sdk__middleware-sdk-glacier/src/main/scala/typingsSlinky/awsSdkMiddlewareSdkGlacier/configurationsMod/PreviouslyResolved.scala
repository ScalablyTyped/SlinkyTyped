package typingsSlinky.awsSdkMiddlewareSdkGlacier.configurationsMod

import typingsSlinky.awsSdkMiddlewareSdkGlacier.anon.Sha256
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.HttpRequest
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviouslyResolved extends js.Object {
  
  var apiVersion: String = js.native
  
  def bodyChecksumGenerator(request: HttpRequest, Options: Sha256): js.Promise[js.Tuple2[String, String]] = js.native
  
  var sha256: HashConstructor = js.native
  
  def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
}
