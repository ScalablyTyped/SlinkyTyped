package typingsSlinky.atLifeomicAxiosDashFetch

import typingsSlinky.axios.axiosMod.AxiosInstance
import typingsSlinky.axios.axiosMod.AxiosTransformer
import typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestInfo
import typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestInit
import typingsSlinky.nodeDashFetch.nodeDashFetchMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lifeomic/axios-fetch", JSImport.Namespace)
@js.native
object atLifeomicAxiosDashFetchMod extends js.Object {
  def buildAxiosFetch(axios: AxiosInstance): js.Function2[/* url */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]] = js.native
  def buildAxiosFetch(axios: AxiosInstance, transformer: AxiosTransformer): js.Function2[/* url */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]] = js.native
}

