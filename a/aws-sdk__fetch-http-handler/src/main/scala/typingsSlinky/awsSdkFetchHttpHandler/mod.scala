package typingsSlinky.awsSdkFetchHttpHandler

import typingsSlinky.awsSdkFetchHttpHandler.fetchHttpHandlerMod.BrowserHttpOptions
import typingsSlinky.awsSdkTypes.serdeMod.StreamCollector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/fetch-http-handler", "FetchHttpHandler")
  @js.native
  class FetchHttpHandler ()
    extends typingsSlinky.awsSdkFetchHttpHandler.fetchHttpHandlerMod.FetchHttpHandler {
    def this(httpOptions: BrowserHttpOptions) = this()
  }
  
  @JSImport("@aws-sdk/fetch-http-handler", "streamCollector")
  @js.native
  val streamCollector: StreamCollector = js.native
}
