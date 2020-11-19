package typingsSlinky.awsSdkProtocolQuery

import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import typingsSlinky.awsSdkTypes.marshallerMod.BodySerializer
import typingsSlinky.awsSdkTypes.marshallerMod.RequestSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-query/build/QuerySerializer", JSImport.Namespace)
@js.native
object querySerializerMod extends js.Object {
  
  @js.native
  class QuerySerializer[StreamType] protected () extends RequestSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
    
    val bodySerializer: js.Any = js.native
    
    val endpoint: js.Any = js.native
  }
}
