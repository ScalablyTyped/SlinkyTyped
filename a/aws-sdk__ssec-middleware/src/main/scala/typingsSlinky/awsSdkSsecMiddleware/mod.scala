package typingsSlinky.awsSdkSsecMiddleware

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.awsSdkSsecMiddleware.anon.Instantiable
import typingsSlinky.awsSdkTypes.middlewareMod.Middleware
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/ssec-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def ssecMiddleware[Input /* <: js.Object */](hasUtf8DecoderBase64EncoderHashConstructorSsecProperties: SsecMiddlewareConfiguration[Input]): Middleware[Input, _] = js.native
  
  @js.native
  trait SsecMiddlewareConfiguration[Input /* <: js.Object */] extends js.Object {
    
    def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    var hashConstructor: Instantiable = js.native
    
    var ssecProperties: SsecPropertiesConfiguration[Input] = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
  }
  
  type SsecPropertiesConfiguration[Input /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ sourceProperty in keyof Input ]:? {  targetProperty :string,   hashTargetProperty :string}}
    */ typingsSlinky.awsSdkSsecMiddleware.awsSdkSsecMiddlewareStrings.SsecPropertiesConfiguration with TopLevel[js.Any]
}
