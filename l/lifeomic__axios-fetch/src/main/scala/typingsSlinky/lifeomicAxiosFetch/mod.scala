package typingsSlinky.lifeomicAxiosFetch

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.axios.mod.AxiosTransformer
import typingsSlinky.nodeFetch.mod.RequestInfo
import typingsSlinky.nodeFetch.mod.RequestInit
import typingsSlinky.nodeFetch.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lifeomic/axios-fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def buildAxiosFetch(axios: AxiosInstance): js.Function2[/* url */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]] = js.native
  def buildAxiosFetch(axios: AxiosInstance, transformer: AxiosTransformer): js.Function2[/* url */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]] = js.native
}
