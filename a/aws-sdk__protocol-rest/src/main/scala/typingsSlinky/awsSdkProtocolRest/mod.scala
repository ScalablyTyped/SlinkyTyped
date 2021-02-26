package typingsSlinky.awsSdkProtocolRest

import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/protocol-rest", "RestParser")
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
  
  @JSImport("@aws-sdk/protocol-rest", "RestSerializer")
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
