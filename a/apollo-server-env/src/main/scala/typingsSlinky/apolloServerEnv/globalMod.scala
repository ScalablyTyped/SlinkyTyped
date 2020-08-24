package typingsSlinky.apolloServerEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  @js.native
  trait GlobalFetch extends js.Object {
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  def fetch(): js.Promise[Response] = js.native
  def fetch(input: js.UndefOr[RequestInfo], init: RequestInit): js.Promise[Response] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  type Body = typingsSlinky.apolloServerEnv.fetchMod.Body
  type BodyInit = typingsSlinky.apolloServerEnv.fetchMod.BodyInit
  type Headers = typingsSlinky.apolloServerEnv.fetchMod.Headers
  type HeadersInit = typingsSlinky.apolloServerEnv.fetchMod.HeadersInit
  type ReferrerPolicy = typingsSlinky.apolloServerEnv.fetchMod.ReferrerPolicy
  type Request = typingsSlinky.apolloServerEnv.fetchMod.Request
  type RequestAgent = typingsSlinky.apolloServerEnv.fetchMod.RequestAgent
  type RequestCache = typingsSlinky.apolloServerEnv.fetchMod.RequestCache
  type RequestCredentials = typingsSlinky.apolloServerEnv.fetchMod.RequestCredentials
  type RequestInfo = typingsSlinky.apolloServerEnv.fetchMod.RequestInfo
  type RequestInit = typingsSlinky.apolloServerEnv.fetchMod.RequestInit
  type RequestMode = typingsSlinky.apolloServerEnv.fetchMod.RequestMode
  type RequestRedirect = typingsSlinky.apolloServerEnv.fetchMod.RequestRedirect
  type Response = typingsSlinky.apolloServerEnv.fetchMod.Response
  type ResponseInit = typingsSlinky.apolloServerEnv.fetchMod.ResponseInit
  type URLSearchParams = typingsSlinky.apolloServerEnv.urlMod.URLSearchParams
  type URLSearchParamsInit = typingsSlinky.apolloServerEnv.urlMod.URLSearchParamsInit
}

