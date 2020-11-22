package typingsSlinky.awsSdkProtocolRest

import typingsSlinky.awsSdkTypes.httpMod.HttpResponse
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-rest/build/RestParser", JSImport.Namespace)
@js.native
object restParserMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseParser<StreamType> * / any */ @js.native
  class RestParser[StreamType] protected () extends js.Object {
    def this(
      bodyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser */ js.Any,
      bodyCollector: StreamCollector,
      parseServiceException: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceExceptionParser */ js.Any,
      utf8Encoder: Encoder,
      base64Decoder: Decoder
    ) = this()
    
    val base64Decoder: js.Any = js.native
    
    val bodyCollector: js.Any = js.native
    
    val bodyParser: js.Any = js.native
    
    def parse[OutputType /* <: MetadataBearer */](
      operation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperationModel */ js.Any,
      input: HttpResponse
    ): js.Promise[OutputType] = js.native
    
    var parseBody: js.Any = js.native
    
    var parseHeaders: js.Any = js.native
    
    var parseScalarBody: js.Any = js.native
    
    var parseScalarHeader: js.Any = js.native
    
    val parseServiceException: js.Any = js.native
    
    var parseStatusCode: js.Any = js.native
    
    var resolveBody: js.Any = js.native
    
    var resolveBodyString: js.Any = js.native
    
    var responseIsSuccessful: js.Any = js.native
    
    val utf8Encoder: js.Any = js.native
  }
}
