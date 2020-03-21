package typingsSlinky.awsSdkProtocolQuery

import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import typingsSlinky.awsSdkTypes.marshallerMod.BodySerializer
import typingsSlinky.awsSdkTypes.unmarshallerMod.BodyParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class QueryParser[StreamType] protected ()
    extends typingsSlinky.awsSdkProtocolQuery.queryParserMod.QueryParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      streamCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class QuerySerializer[StreamType] protected ()
    extends typingsSlinky.awsSdkProtocolQuery.querySerializerMod.QuerySerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

