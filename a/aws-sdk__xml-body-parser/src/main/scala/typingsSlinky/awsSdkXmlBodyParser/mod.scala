package typingsSlinky.awsSdkXmlBodyParser

import typingsSlinky.awsSdkTypes.utilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/xml-body-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser * / any */ @js.native
  class XmlBodyParser protected () extends js.Object {
    def this(base64Decoder: Decoder) = this()
    
    val base64Decoder: js.Any = js.native
    
    var mapToXMLKey: js.Any = js.native
    
    def parse[OutputType](
      member: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Member */ js.Any,
      input: String
    ): OutputType = js.native
    
    var parseList: js.Any = js.native
    
    var parseMap: js.Any = js.native
    
    var parseStructure: js.Any = js.native
    
    var parseTimeStamp: js.Any = js.native
    
    var unmarshall: js.Any = js.native
  }
}
