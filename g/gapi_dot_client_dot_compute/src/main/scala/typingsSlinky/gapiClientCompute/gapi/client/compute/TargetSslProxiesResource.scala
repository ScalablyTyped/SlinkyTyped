package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.QuotaUserTargetSslProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: QuotaUserTargetSslProxy): Request[TargetSslProxy] = js.native
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetSslProxyList] = js.native
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: typingsSlinky.gapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: typingsSlinky.gapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: typingsSlinky.gapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    get: QuotaUserTargetSslProxy => Request[TargetSslProxy],
    insert: AltFields => Request[Operation],
    list: Alt => Request[TargetSslProxyList],
    setBackendService: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    setProxyHeader: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    setSslCertificates: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation]
  ): TargetSslProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader), setSslCertificates = js.Any.fromFunction1(setSslCertificates))
    __obj.asInstanceOf[TargetSslProxiesResource]
  }
  @scala.inline
  implicit class TargetSslProxiesResourceOps[Self <: TargetSslProxiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: QuotaUserTargetSslProxy => Request[TargetSslProxy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[TargetSslProxyList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBackendService(value: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackendService")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetProxyHeader(value: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxyHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSslCertificates(value: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSslCertificates")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

