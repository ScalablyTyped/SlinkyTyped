package typingsSlinky.awsSdkMiddlewareSdkGlacier

import typingsSlinky.awsSdkMiddlewareSdkGlacier.anon.Sha256
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.HttpRequest
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationsMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/configurations", "getGlacierPlugin")
  @js.native
  def getGlacierPlugin(config: PreviouslyResolved): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/configurations", "resolveGlacierMiddlewareConfig")
  @js.native
  def resolveGlacierMiddlewareConfig[T](input: T with PreviouslyResolved with GlacierMiddlewareInputConfig): T with ResolvedGlacierMiddlewareConfig = js.native
  
  @js.native
  trait GlacierMiddlewareInputConfig extends StObject
  
  @js.native
  trait PreviouslyResolved extends StObject {
    
    var apiVersion: String = js.native
    
    def bodyChecksumGenerator(request: HttpRequest, Options: Sha256): js.Promise[js.Tuple2[String, String]] = js.native
    
    var sha256: HashConstructor = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
  }
  
  @js.native
  trait ResolvedGlacierMiddlewareConfig extends StObject {
    
    var apiVersion: String = js.native
    
    def bodyChecksumGenerator(request: HttpRequest, Options: Sha256): js.Promise[js.Tuple2[String, String]] = js.native
    
    var sha256: HashConstructor = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
  }
}
