package typingsSlinky.httpLinkDataloader

import typingsSlinky.httpLinkDataloader.typesMod.ClientOptions
import typingsSlinky.httpLinkDataloader.typesMod.HttpOptions
import typingsSlinky.httpLinkDataloader.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-link-dataloader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class BatchedGraphQLClient protected ()
    extends typingsSlinky.httpLinkDataloader.batchedGraphQLClientMod.BatchedGraphQLClient {
    def this(uri: String) = this()
    def this(uri: String, options: Options with ClientOptions) = this()
  }
  
  @js.native
  class HTTPLinkDataloader protected ()
    extends typingsSlinky.httpLinkDataloader.httplinkdataloaderMod.HTTPLinkDataloader {
    def this(options: HttpOptions) = this()
  }
  /* static members */
  @js.native
  object HTTPLinkDataloader extends js.Object {
    
    /* private */ def createBatchedHttpRequest(options: js.Any): js.Any = js.native
  }
}
