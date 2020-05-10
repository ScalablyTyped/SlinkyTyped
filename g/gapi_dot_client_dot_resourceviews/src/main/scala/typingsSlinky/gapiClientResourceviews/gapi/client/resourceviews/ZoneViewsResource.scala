package typingsSlinky.gapiClientResourceviews.gapi.client.resourceviews

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientResourceviews.AnonFormat
import typingsSlinky.gapiClientResourceviews.AnonMaxResults
import typingsSlinky.gapiClientResourceviews.AnonOauthtoken
import typingsSlinky.gapiClientResourceviews.AnonPrettyPrint
import typingsSlinky.gapiClientResourceviews.AnonProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneViewsResource extends js.Object {
  /** Add resources to the view. */
  def addResources(request: AnonOauthtoken): Request_[Operation] = js.native
  /** Delete a resource view. */
  def delete(request: AnonOauthtoken): Request_[Operation] = js.native
  /** Get the information of a zonal resource view. */
  def get(request: AnonOauthtoken): Request_[ResourceView] = js.native
  /** Get the service information of a resource view or a resource. */
  def getService(request: AnonPrettyPrint): Request_[ZoneViewsGetServiceResponse] = js.native
  /** Create a resource view. */
  def insert(request: AnonProject): Request_[Operation] = js.native
  /** List resource views. */
  def list(request: AnonMaxResults): Request_[ZoneViewsList] = js.native
  /** List the resources of the resource view. */
  def listResources(request: AnonFormat): Request_[ZoneViewsListResourcesResponse] = js.native
  /** Remove resources from the view. */
  def removeResources(request: AnonOauthtoken): Request_[Operation] = js.native
  /** Update the service information of a resource view or a resource. */
  def setService(request: AnonOauthtoken): Request_[Operation] = js.native
}

object ZoneViewsResource {
  @scala.inline
  def apply(
    addResources: AnonOauthtoken => Request_[Operation],
    delete: AnonOauthtoken => Request_[Operation],
    get: AnonOauthtoken => Request_[ResourceView],
    getService: AnonPrettyPrint => Request_[ZoneViewsGetServiceResponse],
    insert: AnonProject => Request_[Operation],
    list: AnonMaxResults => Request_[ZoneViewsList],
    listResources: AnonFormat => Request_[ZoneViewsListResourcesResponse],
    removeResources: AnonOauthtoken => Request_[Operation],
    setService: AnonOauthtoken => Request_[Operation]
  ): ZoneViewsResource = {
    val __obj = js.Dynamic.literal(addResources = js.Any.fromFunction1(addResources), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getService = js.Any.fromFunction1(getService), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listResources = js.Any.fromFunction1(listResources), removeResources = js.Any.fromFunction1(removeResources), setService = js.Any.fromFunction1(setService))
    __obj.asInstanceOf[ZoneViewsResource]
  }
  @scala.inline
  implicit class ZoneViewsResourceOps[Self <: ZoneViewsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddResources(value: AnonOauthtoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResources")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonOauthtoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[ResourceView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetService(value: AnonPrettyPrint => Request_[ZoneViewsGetServiceResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getService")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonProject => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[ZoneViewsList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListResources(value: AnonFormat => Request_[ZoneViewsListResourcesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listResources")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveResources(value: AnonOauthtoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeResources")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetService(value: AnonOauthtoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setService")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

