package typingsSlinky.apolloServerEnv

import typingsSlinky.apolloServerEnv.fetchMod.BodyInit
import typingsSlinky.apolloServerEnv.fetchMod.HeadersInit
import typingsSlinky.apolloServerEnv.fetchMod.RequestInfo
import typingsSlinky.apolloServerEnv.fetchMod.RequestInit
import typingsSlinky.apolloServerEnv.fetchMod.ResponseInit
import typingsSlinky.apolloServerEnv.urlMod.URLSearchParamsInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apollo-server-env", "Body")
  @js.native
  class Body ()
    extends typingsSlinky.apolloServerEnv.fetchMod.Body
  
  @JSImport("apollo-server-env", "Headers")
  @js.native
  class Headers ()
    extends typingsSlinky.apolloServerEnv.fetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("apollo-server-env", "Request")
  @js.native
  class Request protected ()
    extends typingsSlinky.apolloServerEnv.fetchMod.Request {
    def this(input: String) = this()
    def this(input: typingsSlinky.apolloServerEnv.fetchMod.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typingsSlinky.apolloServerEnv.fetchMod.Request, init: RequestInit) = this()
  }
  
  @JSImport("apollo-server-env", "Response")
  @js.native
  class Response ()
    extends typingsSlinky.apolloServerEnv.fetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-server-env", "Response.error")
    @js.native
    def error(): typingsSlinky.apolloServerEnv.fetchMod.Response = js.native
    
    @JSImport("apollo-server-env", "Response.redirect")
    @js.native
    def redirect(url: String): typingsSlinky.apolloServerEnv.fetchMod.Response = js.native
    @JSImport("apollo-server-env", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): typingsSlinky.apolloServerEnv.fetchMod.Response = js.native
  }
  
  @JSImport("apollo-server-env", "URL")
  @js.native
  class URL protected ()
    extends typingsSlinky.apolloServerEnv.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typingsSlinky.apolloServerEnv.urlMod.URL) = this()
  }
  
  @JSImport("apollo-server-env", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.apolloServerEnv.urlMod.URLSearchParams {
    def this(init: URLSearchParamsInit) = this()
  }
  
  @JSImport("apollo-server-env", "fetch")
  @js.native
  def fetch(): js.Promise[typingsSlinky.apolloServerEnv.fetchMod.Response] = js.native
  @JSImport("apollo-server-env", "fetch")
  @js.native
  def fetch(input: js.UndefOr[RequestInfo], init: RequestInit): js.Promise[typingsSlinky.apolloServerEnv.fetchMod.Response] = js.native
  @JSImport("apollo-server-env", "fetch")
  @js.native
  def fetch(input: RequestInfo): js.Promise[typingsSlinky.apolloServerEnv.fetchMod.Response] = js.native
}
