package typingsSlinky.crossFetch

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("cross-fetch", JSImport.Default)
    @js.native
    def apply(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
    @JSImport("cross-fetch", JSImport.Default)
    @js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  }
  
  @JSImport("cross-fetch", "Headers")
  @js.native
  val Headers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _Headers */ js.Any = js.native
  
  @JSImport("cross-fetch", "Request")
  @js.native
  val Request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _Request */ js.Any = js.native
  
  object Response {
    
    @JSImport("cross-fetch", "Response.error")
    @js.native
    def error(): org.scalajs.dom.experimental.Response = js.native
    
    @JSImport("cross-fetch", "Response.redirect")
    @js.native
    def redirect(url: String): org.scalajs.dom.experimental.Response = js.native
    @JSImport("cross-fetch", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): org.scalajs.dom.experimental.Response = js.native
  }
  
  @JSImport("cross-fetch", "fetch")
  @js.native
  def fetch(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  @JSImport("cross-fetch", "fetch")
  @js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
}
