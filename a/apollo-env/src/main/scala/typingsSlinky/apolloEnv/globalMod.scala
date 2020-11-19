package typingsSlinky.apolloEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-env/lib/fetch/global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  
  def fetch(): js.Promise[Response] = js.native
  def fetch(input: js.UndefOr[RequestInfo], init: RequestInit): js.Promise[Response] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  
  @js.native
  trait GlobalFetch extends js.Object {
    
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  type Body = typingsSlinky.apolloEnv.fetchFetchMod.Body
  
  type BodyInit = typingsSlinky.nodeFetch.mod.BodyInit
  
  type Headers = typingsSlinky.apolloEnv.fetchFetchMod.Headers
  
  type HeadersInit = typingsSlinky.nodeFetch.mod.HeadersInit
  
  type ReferrerPolicy = typingsSlinky.apolloEnv.fetchFetchMod.ReferrerPolicy
  
  type Request = typingsSlinky.apolloEnv.fetchFetchMod.Request
  
  type RequestAgent = typingsSlinky.apolloEnv.fetchFetchMod.RequestAgent
  
  type RequestCache = typingsSlinky.nodeFetch.mod.RequestCache
  
  type RequestCredentials = typingsSlinky.nodeFetch.mod.RequestCredentials
  
  type RequestInfo = typingsSlinky.nodeFetch.mod.RequestInfo
  
  type RequestInit = typingsSlinky.nodeFetch.mod.RequestInit
  
  type RequestMode = typingsSlinky.nodeFetch.mod.RequestMode
  
  type RequestRedirect = typingsSlinky.nodeFetch.mod.RequestRedirect
  
  type Response = typingsSlinky.apolloEnv.fetchFetchMod.Response
  
  type ResponseInit = typingsSlinky.nodeFetch.mod.ResponseInit
  
  type URLSearchParams = typingsSlinky.apolloEnv.urlMod.URLSearchParams
  
  type URLSearchParamsInit = typingsSlinky.apolloEnv.urlMod.URLSearchParamsInit
}
