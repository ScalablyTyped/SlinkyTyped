package typingsSlinky.awsSdkJsonParser

import typingsSlinky.awsSdkTypes.unmarshallerMod.BodyParser
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/json-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class JsonParser protected () extends BodyParser[String] {
    def this(base64Decoder: Decoder) = this()
    
    val base64Decoder: js.Any = js.native
    
    var unmarshall: js.Any = js.native
  }
}
