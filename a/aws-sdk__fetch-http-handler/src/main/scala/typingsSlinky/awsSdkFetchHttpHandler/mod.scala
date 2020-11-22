package typingsSlinky.awsSdkFetchHttpHandler

import typingsSlinky.awsSdkFetchHttpHandler.fetchHttpHandlerMod.BrowserHttpOptions
import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/fetch-http-handler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val streamCollector: StreamCollector = js.native
  
  @js.native
  class FetchHttpHandler ()
    extends typingsSlinky.awsSdkFetchHttpHandler.fetchHttpHandlerMod.FetchHttpHandler {
    def this(httpOptions: BrowserHttpOptions) = this()
  }
}
