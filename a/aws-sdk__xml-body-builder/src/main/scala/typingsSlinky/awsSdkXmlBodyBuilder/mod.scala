package typingsSlinky.awsSdkXmlBodyBuilder

import typingsSlinky.awsSdkTypes.marshallerMod.BodySerializer
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/xml-body-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class XmlBodyBuilder protected () extends BodySerializer[String] {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    
    val base64Encoder: js.Any = js.native
    
    var formatMap: js.Any = js.native
    
    var serialize: js.Any = js.native
    
    var serializeBlob: js.Any = js.native
    
    var serializeFloat: js.Any = js.native
    
    var serializeInteger: js.Any = js.native
    
    var serializeList: js.Any = js.native
    
    var serializeMap: js.Any = js.native
    
    var serializeScalar: js.Any = js.native
    
    var serializeString: js.Any = js.native
    
    var serializeStructure: js.Any = js.native
    
    var serializeStructureMember: js.Any = js.native
    
    var serializeTimestamp: js.Any = js.native
    
    var toXml: js.Any = js.native
    
    val utf8Decoder: js.Any = js.native
  }
}
