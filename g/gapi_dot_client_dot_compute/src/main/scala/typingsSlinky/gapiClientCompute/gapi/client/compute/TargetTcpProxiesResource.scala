package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.QuotaUserTargetTcpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTcpProxiesResource extends js.Object {
  
  /** Deletes the specified TargetTcpProxy resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.TargetTcpProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetTcpProxy resource. Get a list of available target TCP proxies by making a list() request. */
  def get(request: QuotaUserTargetTcpProxy): Request[TargetTcpProxy] = js.native
  
  /** Creates a TargetTcpProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  
  /** Retrieves the list of TargetTcpProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetTcpProxyList] = js.native
  
  /** Changes the BackendService for TargetTcpProxy. */
  def setBackendService(request: typingsSlinky.gapiClientCompute.anon.TargetTcpProxy): Request[Operation] = js.native
  
  /** Changes the ProxyHeaderType for TargetTcpProxy. */
  def setProxyHeader(request: typingsSlinky.gapiClientCompute.anon.TargetTcpProxy): Request[Operation] = js.native
}
object TargetTcpProxiesResource {
  
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.TargetTcpProxy => Request[Operation],
    get: QuotaUserTargetTcpProxy => Request[TargetTcpProxy],
    insert: AltFields => Request[Operation],
    list: Alt => Request[TargetTcpProxyList],
    setBackendService: typingsSlinky.gapiClientCompute.anon.TargetTcpProxy => Request[Operation],
    setProxyHeader: typingsSlinky.gapiClientCompute.anon.TargetTcpProxy => Request[Operation]
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelete(value: typingsSlinky.gapiClientCompute.anon.TargetTcpProxy => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: QuotaUserTargetTcpProxy => Request[TargetTcpProxy]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Alt => Request[TargetTcpProxyList]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBackendService(value: typingsSlinky.gapiClientCompute.anon.TargetTcpProxy => Request[Operation]): Self = this.set("setBackendService", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProxyHeader(value: typingsSlinky.gapiClientCompute.anon.TargetTcpProxy => Request[Operation]): Self = this.set("setProxyHeader", js.Any.fromFunction1(value))
  }
}
