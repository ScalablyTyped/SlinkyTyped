package typingsSlinky.apolloDashEnv

import typingsSlinky.apolloDashEnv.libFetchGlobalMod.RequestInfo
import typingsSlinky.apolloDashEnv.libFetchGlobalMod.RequestInit
import typingsSlinky.apolloDashEnv.libFetchGlobalMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/global", JSImport.Namespace)
@js.native
object libFetchGlobalMod extends js.Object {
  @js.native
  trait GlobalFetch extends js.Object {
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  def fetch(): js.Promise[Response] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  type Body = typingsSlinky.apolloDashEnv.libFetchFetchMod.Body
  type BodyInit = typingsSlinky.nodeDashFetch.nodeDashFetchMod.BodyInit
  type Headers = typingsSlinky.apolloDashEnv.libFetchFetchMod.Headers
  type HeadersInit = typingsSlinky.nodeDashFetch.nodeDashFetchMod.HeadersInit
  type ReferrerPolicy = typingsSlinky.apolloDashEnv.libFetchFetchMod.ReferrerPolicy
  type Request = typingsSlinky.apolloDashEnv.libFetchFetchMod.Request
  type RequestAgent = typingsSlinky.apolloDashEnv.libFetchFetchMod.RequestAgent
  type RequestCache = typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestCache
  type RequestCredentials = typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestCredentials
  type RequestInfo = typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestInfo
  type RequestInit = typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestInit
  type RequestMode = typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestMode
  type RequestRedirect = typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestRedirect
  type Response = typingsSlinky.apolloDashEnv.libFetchFetchMod.Response
  type ResponseInit = typingsSlinky.nodeDashFetch.nodeDashFetchMod.ResponseInit
  type URLSearchParams = typingsSlinky.apolloDashEnv.libFetchUrlMod.URLSearchParams
  type URLSearchParamsInit = typingsSlinky.apolloDashEnv.libFetchUrlMod.URLSearchParamsInit
}

