package typingsSlinky.apolloUploadClient.mod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.apolloUploadClient.anon.FnCall
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait GlobalFetch extends js.Object {
    
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    @JSName("fetch")
    var fetch_Original: FnCall = js.native
  }
}
