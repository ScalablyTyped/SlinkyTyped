package typingsSlinky.googleGax

import typingsSlinky.googleGax.apitypesMod.APICallback
import typingsSlinky.googleGax.apitypesMod.GRPCCallResult
import typingsSlinky.googleGax.apitypesMod.RequestType
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceCollectorMod {
  
  @JSImport("google-gax/build/src/paginationCalls/resourceCollector", "ResourceCollector")
  @js.native
  class ResourceCollector protected () extends StObject {
    def this(apiCall: SimpleCallbackFunction) = this()
    def this(apiCall: SimpleCallbackFunction, maxResults: Double) = this()
    
    def apiCall(request: RequestType, callback: APICallback): GRPCCallResult = js.native
    @JSName("apiCall")
    var apiCall_Original: SimpleCallbackFunction = js.native
    
    var callback: js.Any = js.native
    
    var maxResults: Double = js.native
    
    def processAllPages(firstRequest: RequestType): js.Promise[js.Array[js.Object]] = js.native
    
    var rejectCallback: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
    
    var resolveCallback: js.UndefOr[js.Function1[/* resources */ js.Array[js.Object], Unit]] = js.native
    
    var resources: js.Array[js.Object] = js.native
  }
}
