package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonQuotaUserTargetSslProxy
import typingsSlinky.gapiClientCompute.AnonTargetSslProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: AnonTargetSslProxy): Request_[Operation] = js.native
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetSslProxy): Request_[TargetSslProxy] = js.native
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetSslProxyList] = js.native
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: AnonTargetSslProxy): Request_[Operation] = js.native
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: AnonTargetSslProxy): Request_[Operation] = js.native
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: AnonTargetSslProxy): Request_[Operation] = js.native
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetSslProxy => Request_[Operation],
    get: AnonQuotaUserTargetSslProxy => Request_[TargetSslProxy],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[TargetSslProxyList],
    setBackendService: AnonTargetSslProxy => Request_[Operation],
    setProxyHeader: AnonTargetSslProxy => Request_[Operation],
    setSslCertificates: AnonTargetSslProxy => Request_[Operation]
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
    def withDelete(value: AnonTargetSslProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUserTargetSslProxy => Request_[TargetSslProxy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[TargetSslProxyList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBackendService(value: AnonTargetSslProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackendService")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetProxyHeader(value: AnonTargetSslProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxyHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSslCertificates(value: AnonTargetSslProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSslCertificates")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

