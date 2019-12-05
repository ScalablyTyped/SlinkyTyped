package typingsSlinky.atAwsDashSdkProtocolDashQuery

import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typingsSlinky.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query", JSImport.Namespace)
@js.native
object atAwsDashSdkProtocolDashQueryMod extends js.Object {
  @js.native
  class QueryParser[StreamType] protected ()
    extends typingsSlinky.atAwsDashSdkProtocolDashQuery.buildQueryParserMod.QueryParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      streamCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class QuerySerializer[StreamType] protected ()
    extends typingsSlinky.atAwsDashSdkProtocolDashQuery.buildQuerySerializerMod.QuerySerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

