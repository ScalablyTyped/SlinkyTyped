package typingsSlinky.awsSdkProtocolJsonRpc

import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import typingsSlinky.awsSdkTypes.marshallerMod.BodySerializer
import typingsSlinky.awsSdkTypes.unmarshallerMod.BodyParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonRpcParser[StreamType] protected ()
    extends typingsSlinky.awsSdkProtocolJsonRpc.jsonRpcParserMod.JsonRpcParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      bodyCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class JsonRpcSerializer[StreamType] protected ()
    extends typingsSlinky.awsSdkProtocolJsonRpc.jsonRpcSerializerMod.JsonRpcSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

