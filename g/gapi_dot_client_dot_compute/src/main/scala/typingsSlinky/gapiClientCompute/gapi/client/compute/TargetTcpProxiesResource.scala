package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonQuotaUserTargetTcpProxy
import typingsSlinky.gapiClientCompute.AnonTargetTcpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTcpProxiesResource extends js.Object {
  /** Deletes the specified TargetTcpProxy resource. */
  def delete(request: AnonTargetTcpProxy): Request_[Operation] = js.native
  /** Returns the specified TargetTcpProxy resource. Get a list of available target TCP proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetTcpProxy): Request_[TargetTcpProxy] = js.native
  /** Creates a TargetTcpProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of TargetTcpProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetTcpProxyList] = js.native
  /** Changes the BackendService for TargetTcpProxy. */
  def setBackendService(request: AnonTargetTcpProxy): Request_[Operation] = js.native
  /** Changes the ProxyHeaderType for TargetTcpProxy. */
  def setProxyHeader(request: AnonTargetTcpProxy): Request_[Operation] = js.native
}

object TargetTcpProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetTcpProxy => Request_[Operation],
    get: AnonQuotaUserTargetTcpProxy => Request_[TargetTcpProxy],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[TargetTcpProxyList],
    setBackendService: AnonTargetTcpProxy => Request_[Operation],
    setProxyHeader: AnonTargetTcpProxy => Request_[Operation]
  ): TargetTcpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader))
    __obj.asInstanceOf[TargetTcpProxiesResource]
  }
  @scala.inline
  implicit class TargetTcpProxiesResourceOps[Self <: TargetTcpProxiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonTargetTcpProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUserTargetTcpProxy => Request_[TargetTcpProxy]): Self = {
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
    def withList(value: AnonAlt => Request_[TargetTcpProxyList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBackendService(value: AnonTargetTcpProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackendService")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetProxyHeader(value: AnonTargetTcpProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxyHeader")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

