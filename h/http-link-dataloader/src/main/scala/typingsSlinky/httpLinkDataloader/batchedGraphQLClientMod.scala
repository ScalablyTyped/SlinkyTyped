package typingsSlinky.httpLinkDataloader

import typingsSlinky.httpLinkDataloader.typesMod.ClientOptions
import typingsSlinky.httpLinkDataloader.typesMod.Options
import typingsSlinky.httpLinkDataloader.typesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-link-dataloader/dist/src/BatchedGraphQLClient", JSImport.Namespace)
@js.native
object batchedGraphQLClientMod extends js.Object {
  
  @js.native
  class BatchedGraphQLClient protected () extends js.Object {
    def this(uri: String) = this()
    def this(uri: String, options: Options with ClientOptions) = this()
    
    var dataloader: js.Any = js.native
    
    def load(keys: js.Array[String]): js.Promise[_] = js.native
    
    var options: Options = js.native
    
    def request[T /* <: js.Any */](query: String): js.Promise[T] = js.native
    def request[T /* <: js.Any */](query: String, variables: js.UndefOr[scala.Nothing], operationName: String): js.Promise[T] = js.native
    def request[T /* <: js.Any */](query: String, variables: Variables): js.Promise[T] = js.native
    def request[T /* <: js.Any */](query: String, variables: Variables, operationName: String): js.Promise[T] = js.native
    
    var uri: String = js.native
  }
}
