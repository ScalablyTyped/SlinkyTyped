package typingsSlinky.httpLinkDataloader

import typingsSlinky.httpLinkDataloader.typesMod.GraphQLResponse
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-link-dataloader/dist/src/ClientError", JSImport.Namespace)
@js.native
object clientErrorMod extends js.Object {
  
  @js.native
  class ClientError protected () extends Error {
    def this(result: GraphQLResponse) = this()
    
    var result: GraphQLResponse = js.native
  }
  /* static members */
  @js.native
  object ClientError extends js.Object {
    
    /* private */ def extractMessage(response: js.Any): js.Any = js.native
  }
}
