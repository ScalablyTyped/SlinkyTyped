package typingsSlinky.isomorphicUnfetch

import org.scalajs.dom.experimental.Body
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /* was `typeof fetch` */
    @JSImport("isomorphic-unfetch", JSImport.Default)
    @js.native
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    /* was `typeof fetch` */
    @JSImport("isomorphic-unfetch", JSImport.Default)
    @js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  object unfetch {
    
    type IsomorphicBody = Body | typingsSlinky.nodeFetch.mod.Body
    
    type IsomorphicHeaders = Headers | typingsSlinky.nodeFetch.mod.Headers
    
    type IsomorphicRequest = Request | typingsSlinky.nodeFetch.mod.Request
    
    type IsomorphicRequestInit = RequestInit | typingsSlinky.nodeFetch.mod.RequestInit
    
    type IsomorphicResponse = Response | typingsSlinky.nodeFetch.mod.Response
  }
}
