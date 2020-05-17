package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDeploymentmanager.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /** Gets information about a specific operation. */
  def get(request: typingsSlinky.gapiClientDeploymentmanager.anon.Operation): Request[Operation] = js.native
  /** Lists all operations for a project. */
  def list(request: Filter): Request[OperationsListResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(
    get: typingsSlinky.gapiClientDeploymentmanager.anon.Operation => Request[Operation],
    list: Filter => Request[OperationsListResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
  @scala.inline
  implicit class OperationsResourceOps[Self <: OperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: typingsSlinky.gapiClientDeploymentmanager.anon.Operation => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Filter => Request[OperationsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

