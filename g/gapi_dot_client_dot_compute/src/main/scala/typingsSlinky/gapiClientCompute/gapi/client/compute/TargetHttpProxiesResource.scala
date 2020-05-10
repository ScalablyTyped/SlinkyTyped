package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonQuotaUserTargetHttpProxy
import typingsSlinky.gapiClientCompute.AnonTargetHttpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHttpProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(request: AnonTargetHttpProxy): Request_[Operation] = js.native
  /** Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetHttpProxy): Request_[TargetHttpProxy] = js.native
  /** Creates a TargetHttpProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of TargetHttpProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetHttpProxyList] = js.native
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(request: AnonTargetHttpProxy): Request_[Operation] = js.native
}

object TargetHttpProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetHttpProxy => Request_[Operation],
    get: AnonQuotaUserTargetHttpProxy => Request_[TargetHttpProxy],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[TargetHttpProxyList],
    setUrlMap: AnonTargetHttpProxy => Request_[Operation]
  ): TargetHttpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setUrlMap = js.Any.fromFunction1(setUrlMap))
    __obj.asInstanceOf[TargetHttpProxiesResource]
  }
  @scala.inline
  implicit class TargetHttpProxiesResourceOps[Self <: TargetHttpProxiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonTargetHttpProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUserTargetHttpProxy => Request_[TargetHttpProxy]): Self = {
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
    def withList(value: AnonAlt => Request_[TargetHttpProxyList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUrlMap(value: AnonTargetHttpProxy => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrlMap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

