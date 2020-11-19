package typingsSlinky.isomorphicUnfetch

import org.scalajs.dom.experimental.Body
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("isomorphic-unfetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  @js.native
  object unfetch extends js.Object {
    
    type IsomorphicBody = Body | typingsSlinky.nodeFetch.mod.Body
    
    type IsomorphicHeaders = Headers | typingsSlinky.nodeFetch.mod.Headers
    
    type IsomorphicRequest = Request | typingsSlinky.nodeFetch.mod.Request
    
    type IsomorphicResponse = Response | typingsSlinky.nodeFetch.mod.Response
  }
}
