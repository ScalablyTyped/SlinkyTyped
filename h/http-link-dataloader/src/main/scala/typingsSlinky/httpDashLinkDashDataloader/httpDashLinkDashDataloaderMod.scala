package typingsSlinky.httpDashLinkDashDataloader

import typingsSlinky.httpDashLinkDashDataloader.distSrcTypesMod.ClientOptions
import typingsSlinky.httpDashLinkDashDataloader.distSrcTypesMod.HttpOptions
import typingsSlinky.httpDashLinkDashDataloader.distSrcTypesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader", JSImport.Namespace)
@js.native
object httpDashLinkDashDataloaderMod extends js.Object {
  @js.native
  class BatchedGraphQLClient protected ()
    extends typingsSlinky.httpDashLinkDashDataloader.distSrcBatchedGraphQLClientMod.BatchedGraphQLClient {
    def this(uri: String) = this()
    def this(uri: String, options: Options with ClientOptions) = this()
  }
  
  @js.native
  class HTTPLinkDataloader protected ()
    extends typingsSlinky.httpDashLinkDashDataloader.distSrcHTTPLinkDataloaderMod.HTTPLinkDataloader {
    def this(options: HttpOptions) = this()
  }
  
  /* static members */
  @js.native
  object HTTPLinkDataloader extends js.Object {
    /* private */ def createBatchedHttpRequest(options: js.Any): js.Any = js.native
  }
  
}

