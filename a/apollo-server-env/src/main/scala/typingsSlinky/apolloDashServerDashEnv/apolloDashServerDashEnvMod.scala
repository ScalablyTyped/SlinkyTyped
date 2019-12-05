package typingsSlinky.apolloDashServerDashEnv

import typingsSlinky.apolloDashServerDashEnv.distFetchMod.BodyInit
import typingsSlinky.apolloDashServerDashEnv.distFetchMod.HeadersInit
import typingsSlinky.apolloDashServerDashEnv.distFetchMod.RequestInfo
import typingsSlinky.apolloDashServerDashEnv.distFetchMod.RequestInit
import typingsSlinky.apolloDashServerDashEnv.distFetchMod.ResponseInit
import typingsSlinky.apolloDashServerDashEnv.distUrlMod.URLSearchParamsInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env", JSImport.Namespace)
@js.native
object apolloDashServerDashEnvMod extends js.Object {
  @js.native
  class Body ()
    extends typingsSlinky.apolloDashServerDashEnv.distFetchMod.Body
  
  @js.native
  class Headers ()
    extends typingsSlinky.apolloDashServerDashEnv.distFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typingsSlinky.apolloDashServerDashEnv.distFetchMod.Request {
    def this(input: String) = this()
    def this(input: typingsSlinky.apolloDashServerDashEnv.distFetchMod.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typingsSlinky.apolloDashServerDashEnv.distFetchMod.Request, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typingsSlinky.apolloDashServerDashEnv.distFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typingsSlinky.apolloDashServerDashEnv.distUrlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typingsSlinky.apolloDashServerDashEnv.distUrlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.apolloDashServerDashEnv.distUrlMod.URLSearchParams {
    def this(init: URLSearchParamsInit) = this()
  }
  
  def fetch(): js.Promise[typingsSlinky.apolloDashServerDashEnv.distFetchMod.Response] = js.native
  def fetch(input: RequestInfo): js.Promise[typingsSlinky.apolloDashServerDashEnv.distFetchMod.Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typingsSlinky.apolloDashServerDashEnv.distFetchMod.Response] = js.native
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typingsSlinky.apolloDashServerDashEnv.distFetchMod.Response = js.native
    def redirect(url: String): typingsSlinky.apolloDashServerDashEnv.distFetchMod.Response = js.native
    def redirect(url: String, status: Double): typingsSlinky.apolloDashServerDashEnv.distFetchMod.Response = js.native
  }
  
}

