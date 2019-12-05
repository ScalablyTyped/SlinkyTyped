package typingsSlinky.apolloDashServerDashEnv

import typingsSlinky.apolloDashServerDashEnv.distGlobalMod.RequestInfo
import typingsSlinky.apolloDashServerDashEnv.distGlobalMod.RequestInit
import typingsSlinky.apolloDashServerDashEnv.distGlobalMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/global", JSImport.Namespace)
@js.native
object distGlobalMod extends js.Object {
  @js.native
  trait GlobalFetch extends js.Object {
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  def fetch(): js.Promise[Response] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  type Body = typingsSlinky.apolloDashServerDashEnv.distFetchMod.Body
  type BodyInit = typingsSlinky.apolloDashServerDashEnv.distFetchMod.BodyInit
  type Headers = typingsSlinky.apolloDashServerDashEnv.distFetchMod.Headers
  type HeadersInit = typingsSlinky.apolloDashServerDashEnv.distFetchMod.HeadersInit
  type ReferrerPolicy = typingsSlinky.apolloDashServerDashEnv.distFetchMod.ReferrerPolicy
  type Request = typingsSlinky.apolloDashServerDashEnv.distFetchMod.Request
  type RequestAgent = typingsSlinky.apolloDashServerDashEnv.distFetchMod.RequestAgent
  type RequestCache = typingsSlinky.apolloDashServerDashEnv.distFetchMod.RequestCache
  type RequestCredentials = typingsSlinky.apolloDashServerDashEnv.distFetchMod.RequestCredentials
  type RequestInfo = typingsSlinky.apolloDashServerDashEnv.distFetchMod.RequestInfo
  type RequestInit = typingsSlinky.apolloDashServerDashEnv.distFetchMod.RequestInit
  type RequestMode = typingsSlinky.apolloDashServerDashEnv.distFetchMod.RequestMode
  type RequestRedirect = typingsSlinky.apolloDashServerDashEnv.distFetchMod.RequestRedirect
  type Response = typingsSlinky.apolloDashServerDashEnv.distFetchMod.Response
  type ResponseInit = typingsSlinky.apolloDashServerDashEnv.distFetchMod.ResponseInit
  type URLSearchParams = typingsSlinky.apolloDashServerDashEnv.distUrlMod.URLSearchParams
  type URLSearchParamsInit = typingsSlinky.apolloDashServerDashEnv.distUrlMod.URLSearchParamsInit
}

