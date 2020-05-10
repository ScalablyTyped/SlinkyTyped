package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDeploymentmanager.AnonMaxResults
import typingsSlinky.gapiClientDeploymentmanager.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesResource extends js.Object {
  /** Gets information about a single resource. */
  def get(request: AnonPrettyPrint): Request_[Resource] = js.native
  /** Lists all resources in a given deployment. */
  def list(request: AnonMaxResults): Request_[ResourcesListResponse] = js.native
}

object ResourcesResource {
  @scala.inline
  def apply(
    get: AnonPrettyPrint => Request_[Resource],
    list: AnonMaxResults => Request_[ResourcesListResponse]
  ): ResourcesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ResourcesResource]
  }
  @scala.inline
  implicit class ResourcesResourceOps[Self <: ResourcesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonPrettyPrint => Request_[Resource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[ResourcesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

