package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.QuotaUserTargetHttpsProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.TargetHttpsProxy): Request[Operation] = js.native
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(request: QuotaUserTargetHttpsProxy): Request[TargetHttpsProxy] = js.native
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetHttpsProxyList] = js.native
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: typingsSlinky.gapiClientCompute.anon.TargetHttpsProxy): Request[Operation] = js.native
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: typingsSlinky.gapiClientCompute.anon.TargetHttpsProxy): Request[Operation] = js.native
}

object TargetHttpsProxiesResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation],
    get: QuotaUserTargetHttpsProxy => Request[TargetHttpsProxy],
    insert: AltFields => Request[Operation],
    list: Alt => Request[TargetHttpsProxyList],
    setSslCertificates: typingsSlinky.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation],
    setUrlMap: typingsSlinky.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation]
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
    def withDelete(value: typingsSlinky.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: QuotaUserTargetHttpsProxy => Request[TargetHttpsProxy]): Self = {
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
    def withList(value: Alt => Request[TargetHttpsProxyList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSslCertificates(value: typingsSlinky.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSslCertificates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUrlMap(value: typingsSlinky.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrlMap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

