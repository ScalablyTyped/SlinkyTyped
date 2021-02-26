package typingsSlinky.apolloEnv

import typingsSlinky.node.NodeJS.Dict
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.nodeFetch.anon.Size
import typingsSlinky.nodeFetch.mod.BodyInit
import typingsSlinky.nodeFetch.mod.HeadersInit
import typingsSlinky.nodeFetch.mod.RequestInfo
import typingsSlinky.nodeFetch.mod.RequestInit
import typingsSlinky.nodeFetch.mod.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("apollo-env/lib/fetch", "Body")
  @js.native
  class Body ()
    extends typingsSlinky.apolloEnv.fetchFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.UndefOr[scala.Nothing], opts: Size) = this()
    def this(body: js.Any, opts: Size) = this()
  }
  
  @JSImport("apollo-env/lib/fetch", "Headers")
  @js.native
  class Headers ()
    extends typingsSlinky.apolloEnv.fetchFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("apollo-env/lib/fetch", "Request")
  @js.native
  class Request protected ()
    extends typingsSlinky.apolloEnv.fetchFetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @JSImport("apollo-env/lib/fetch", "Response")
  @js.native
  class Response ()
    extends typingsSlinky.apolloEnv.fetchFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-env/lib/fetch", "Response.error")
    @js.native
    def error(): typingsSlinky.nodeFetch.mod.Response = js.native
    
    @JSImport("apollo-env/lib/fetch", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): typingsSlinky.nodeFetch.mod.Response = js.native
  }
  
  @JSImport("apollo-env/lib/fetch", "URL")
  @js.native
  class URL protected ()
    extends typingsSlinky.apolloEnv.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @JSImport("apollo-env/lib/fetch", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.apolloEnv.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
    def this(init: Dict[String | js.Array[String]]) = this()
    def this(init: typingsSlinky.node.urlMod.URLSearchParams) = this()
  }
  
  object fetch {
    
    @JSImport("apollo-env/lib/fetch", "fetch")
    @js.native
    def apply(url: RequestInfo): js.Promise[typingsSlinky.nodeFetch.mod.Response] = js.native
    @JSImport("apollo-env/lib/fetch", "fetch")
    @js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typingsSlinky.nodeFetch.mod.Response] = js.native
    
    @JSImport("apollo-env/lib/fetch", "fetch.isRedirect")
    @js.native
    def isRedirect(code: Double): Boolean = js.native
  }
}
