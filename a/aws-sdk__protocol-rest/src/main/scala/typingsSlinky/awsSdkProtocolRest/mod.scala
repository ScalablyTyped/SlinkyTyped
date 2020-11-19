package typingsSlinky.awsSdkProtocolRest

import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import typingsSlinky.awsSdkTypes.marshallerMod.BodySerializer
import typingsSlinky.awsSdkTypes.unmarshallerMod.BodyParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-rest", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class RestParser[StreamType] protected ()
    extends typingsSlinky.awsSdkProtocolRest.restParserMod.RestParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      bodyCollector: StreamCollector[StreamType],
      parseServiceException: ServiceExceptionParser,
      utf8Encoder: Encoder,
      base64Decoder: Decoder
    ) = this()
  }
  
  @js.native
  class RestSerializer[StreamType] protected ()
    extends typingsSlinky.awsSdkProtocolRest.restSerializerMod.RestSerializer[StreamType] {
    def this(
      endpoint: HttpEndpoint,
      bodySerializer: BodySerializer[String],
      base64Encoder: Encoder,
      utf8Decoder: Decoder
    ) = this()
  }
}
