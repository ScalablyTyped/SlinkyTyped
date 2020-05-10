package typingsSlinky.awsSdkProtocolJsonRpc

import typingsSlinky.awsSdkTypes.unmarshallerMod.BodyParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.ResponseParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc/build/JsonRpcParser", JSImport.Namespace)
@js.native
object jsonRpcParserMod extends js.Object {
  @js.native
  class JsonRpcParser[StreamType] protected () extends ResponseParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      bodyCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
    val bodyCollector: js.Any = js.native
    val bodyParser: js.Any = js.native
    val parseServiceException: js.Any = js.native
    var resolveBodyString: js.Any = js.native
    val utf8Encoder: js.Any = js.native
  }
  
}

