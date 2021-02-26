package typingsSlinky.apolloEnv

import typingsSlinky.node.httpMod.Agent
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

object fetchFetchMod {
  
  @JSImport("apollo-env/lib/fetch/fetch", "Body")
  @js.native
  class Body ()
    extends typingsSlinky.nodeFetch.mod.Body {
    def this(body: js.Any) = this()
    def this(body: js.UndefOr[scala.Nothing], opts: Size) = this()
    def this(body: js.Any, opts: Size) = this()
  }
  
  @JSImport("apollo-env/lib/fetch/fetch", "Headers")
  @js.native
  class Headers ()
    extends typingsSlinky.nodeFetch.mod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("apollo-env/lib/fetch/fetch", "Request")
  @js.native
  class Request protected ()
    extends typingsSlinky.nodeFetch.mod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @JSImport("apollo-env/lib/fetch/fetch", "Response")
  @js.native
  class Response ()
    extends typingsSlinky.nodeFetch.mod.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-env/lib/fetch/fetch", "Response.error")
    @js.native
    def error(): typingsSlinky.nodeFetch.mod.Response = js.native
    
    @JSImport("apollo-env/lib/fetch/fetch", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): typingsSlinky.nodeFetch.mod.Response = js.native
  }
  
  object fetch {
    
    @JSImport("apollo-env/lib/fetch/fetch", "fetch")
    @js.native
    def apply(url: RequestInfo): js.Promise[typingsSlinky.nodeFetch.mod.Response] = js.native
    @JSImport("apollo-env/lib/fetch/fetch", "fetch")
    @js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typingsSlinky.nodeFetch.mod.Response] = js.native
    
    @JSImport("apollo-env/lib/fetch/fetch", "fetch.isRedirect")
    @js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.apolloEnv.apolloEnvStrings._empty
    - typingsSlinky.apolloEnv.apolloEnvStrings.`no-referrer`
    - typingsSlinky.apolloEnv.apolloEnvStrings.`no-referrer-when-downgrade`
    - typingsSlinky.apolloEnv.apolloEnvStrings.`same-origin`
    - typingsSlinky.apolloEnv.apolloEnvStrings.origin
    - typingsSlinky.apolloEnv.apolloEnvStrings.`strict-origin`
    - typingsSlinky.apolloEnv.apolloEnvStrings.`origin-when-cross-origin`
    - typingsSlinky.apolloEnv.apolloEnvStrings.`strict-origin-when-cross-origin`
    - typingsSlinky.apolloEnv.apolloEnvStrings.`unsafe-url`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    @scala.inline
    def _empty: typingsSlinky.apolloEnv.apolloEnvStrings._empty = "".asInstanceOf[typingsSlinky.apolloEnv.apolloEnvStrings._empty]
    
    @scala.inline
    def `no-referrer`: typingsSlinky.apolloEnv.apolloEnvStrings.`no-referrer` = "no-referrer".asInstanceOf[typingsSlinky.apolloEnv.apolloEnvStrings.`no-referrer`]
    
    @scala.inline
    def `no-referrer-when-downgrade`: typingsSlinky.apolloEnv.apolloEnvStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typingsSlinky.apolloEnv.apolloEnvStrings.`no-referrer-when-downgrade`]
    
    @scala.inline
    def origin: typingsSlinky.apolloEnv.apolloEnvStrings.origin = "origin".asInstanceOf[typingsSlinky.apolloEnv.apolloEnvStrings.origin]
    
    @scala.inline
    def `origin-when-cross-origin`: typingsSlinky.apolloEnv.apolloEnvStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typingsSlinky.apolloEnv.apolloEnvStrings.`origin-when-cross-origin`]
    
    @scala.inline
    def `same-origin`: typingsSlinky.apolloEnv.apolloEnvStrings.`same-origin` = "same-origin".asInstanceOf[typingsSlinky.apolloEnv.apolloEnvStrings.`same-origin`]
    
    @scala.inline
    def `strict-origin`: typingsSlinky.apolloEnv.apolloEnvStrings.`strict-origin` = "strict-origin".asInstanceOf[typingsSlinky.apolloEnv.apolloEnvStrings.`strict-origin`]
    
    @scala.inline
    def `strict-origin-when-cross-origin`: typingsSlinky.apolloEnv.apolloEnvStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typingsSlinky.apolloEnv.apolloEnvStrings.`strict-origin-when-cross-origin`]
    
    @scala.inline
    def `unsafe-url`: typingsSlinky.apolloEnv.apolloEnvStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typingsSlinky.apolloEnv.apolloEnvStrings.`unsafe-url`]
  }
  
  type RequestAgent = Agent | typingsSlinky.node.httpsMod.Agent
}
