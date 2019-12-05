package typingsSlinky.atAwsDashSdkProtocolDashRest

import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typingsSlinky.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typingsSlinky.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Decoder
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest", JSImport.Namespace)
@js.native
object atAwsDashSdkProtocolDashRestMod extends js.Object {
  @js.native
  class RestParser[StreamType] protected ()
    extends typingsSlinky.atAwsDashSdkProtocolDashRest.buildRestParserMod.RestParser[StreamType] {
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
    extends typingsSlinky.atAwsDashSdkProtocolDashRest.buildRestSerializerMod.RestSerializer[StreamType] {
    def this(
      endpoint: HttpEndpoint,
      bodySerializer: BodySerializer[String],
      base64Encoder: Encoder,
      utf8Decoder: Decoder
    ) = this()
  }
  
}

