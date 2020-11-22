package typingsSlinky.awsSdkProtocolRest

import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
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
      bodyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser */ js.Any,
      bodyCollector: StreamCollector,
      parseServiceException: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceExceptionParser */ js.Any,
      utf8Encoder: Encoder,
      base64Decoder: Decoder
    ) = this()
  }
  
  @js.native
  class RestSerializer[StreamType] protected ()
    extends typingsSlinky.awsSdkProtocolRest.restSerializerMod.RestSerializer[StreamType] {
    def this(
      endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any,
      bodySerializer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer<string> */ js.Any,
      base64Encoder: Encoder,
      utf8Decoder: Decoder
    ) = this()
  }
}
