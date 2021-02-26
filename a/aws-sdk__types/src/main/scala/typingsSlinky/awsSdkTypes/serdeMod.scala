package typingsSlinky.awsSdkTypes

import typingsSlinky.awsSdkTypes.httpMod.Endpoint
import typingsSlinky.awsSdkTypes.transferMod.RequestHandler
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serdeMod {
  
  @js.native
  trait EndpointBearer extends StObject {
    
    def endpoint(): js.Promise[Endpoint] = js.native
    @JSName("endpoint")
    var endpoint_Original: Provider[Endpoint] = js.native
  }
  
  type RequestSerializer[Request, Context /* <: EndpointBearer */] = js.Function2[/* input */ js.Any, /* context */ Context, js.Promise[Request]]
  
  type ResponseDeserializer[OutputType, ResponseType, Context] = js.Function2[/* output */ ResponseType, /* context */ Context, js.Promise[OutputType]]
  
  @js.native
  trait SerdeContext extends EndpointBearer {
    
    def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder = js.native
    
    def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    var requestHandler: RequestHandler[_, _, js.Object] = js.native
    
    def streamCollector(stream: js.Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
  
  type StreamCollector = js.Function1[/* stream */ js.Any, js.Promise[js.typedarray.Uint8Array]]
}
