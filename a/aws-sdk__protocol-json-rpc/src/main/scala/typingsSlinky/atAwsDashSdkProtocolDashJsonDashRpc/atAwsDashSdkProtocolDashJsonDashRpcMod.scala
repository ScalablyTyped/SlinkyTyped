package typingsSlinky.atAwsDashSdkProtocolDashJsonDashRpc

import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typingsSlinky.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc", JSImport.Namespace)
@js.native
object atAwsDashSdkProtocolDashJsonDashRpcMod extends js.Object {
  @js.native
  class JsonRpcParser[StreamType] protected ()
    extends typingsSlinky.atAwsDashSdkProtocolDashJsonDashRpc.buildJsonRpcParserMod.JsonRpcParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      bodyCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class JsonRpcSerializer[StreamType] protected ()
    extends typingsSlinky.atAwsDashSdkProtocolDashJsonDashRpc.buildJsonRpcSerializerMod.JsonRpcSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

