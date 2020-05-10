package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonQuotaUserTargetHttpsProxy
import typingsSlinky.gapiClientCompute.AnonTargetHttpsProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(request: AnonTargetHttpsProxy): Request_[Operation] = js.native
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetHttpsProxy): Request_[TargetHttpsProxy] = js.native
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetHttpsProxyList] = js.native
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: AnonTargetHttpsProxy): Request_[Operation] = js.native
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: AnonTargetHttpsProxy): Request_[Operation] = js.native
}

object TargetHttpsProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetHttpsProxy => Request_[Operation],
    get: AnonQuotaUserTargetHttpsProxy => Request_[TargetHttpsProxy],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[TargetHttpsProxyList],
    setSslCertificates: AnonTargetHttpsProxy => Request_[Operation],
    setUrlMap: AnonTargetHttpsProxy => Request_[Operation]
  ): TargetHttpsProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setSslCertificates = js.Any.fromFunction1(setSslCertificates), setUrlMap = js.Any.fromFunction1(setUrlMap))
    __obj.asInstanceOf[TargetHttpsProxiesResource]
  }
  @scala.inline
  implicit class TargetHttpsProxiesResourceOps[Self <: TargetHttpsProxiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonTargetHttpsProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUserTargetHttpsProxy => Request_[TargetHttpsProxy]): Self = {
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
    def withList(value: AnonAlt => Request_[TargetHttpsProxyList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSslCertificates(value: AnonTargetHttpsProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSslCertificates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUrlMap(value: AnonTargetHttpsProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrlMap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

