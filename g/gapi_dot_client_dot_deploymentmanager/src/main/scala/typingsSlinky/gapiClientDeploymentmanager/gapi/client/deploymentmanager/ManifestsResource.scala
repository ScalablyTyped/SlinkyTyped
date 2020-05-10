package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDeploymentmanager.AnonDeployment
import typingsSlinky.gapiClientDeploymentmanager.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestsResource extends js.Object {
  /** Gets information about a specific manifest. */
  def get(request: AnonDeployment): Request_[Manifest] = js.native
  /** Lists all manifests for a given deployment. */
  def list(request: AnonMaxResults): Request_[ManifestsListResponse] = js.native
}

object ManifestsResource {
  @scala.inline
  def apply(get: AnonDeployment => Request_[Manifest], list: AnonMaxResults => Request_[ManifestsListResponse]): ManifestsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ManifestsResource]
  }
  @scala.inline
  implicit class ManifestsResourceOps[Self <: ManifestsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonDeployment => Request_[Manifest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[ManifestsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

