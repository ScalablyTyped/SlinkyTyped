package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDataproc.AnonAccesstoken
import typingsSlinky.gapiClientDataproc.AnonAlt
import typingsSlinky.gapiClientDataproc.AnonBearertoken
import typingsSlinky.gapiClientDataproc.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClustersResource extends js.Object {
  /** Creates a cluster in a project. */
  def create(request: AnonAccesstoken): Request_[Operation] = js.native
  /** Deletes a cluster in a project. */
  def delete(request: AnonAlt): Request_[Operation] = js.native
  /** Gets cluster diagnostic information. After the operation completes, the Operation.response field contains DiagnoseClusterOutputLocation. */
  def diagnose(request: AnonAlt): Request_[Operation] = js.native
  /** Gets the resource representation for a cluster in a project. */
  def get(request: AnonAlt): Request_[Cluster] = js.native
  /** Lists all regions/{region}/clusters in a project. */
  def list(request: AnonBearertoken): Request_[ListClustersResponse] = js.native
  /** Updates a cluster in a project. */
  def patch(request: AnonCallback): Request_[Operation] = js.native
}

object ClustersResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Operation],
    delete: AnonAlt => Request_[Operation],
    diagnose: AnonAlt => Request_[Operation],
    get: AnonAlt => Request_[Cluster],
    list: AnonBearertoken => Request_[ListClustersResponse],
    patch: AnonCallback => Request_[Operation]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), diagnose = js.Any.fromFunction1(diagnose), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[ClustersResource]
  }
  @scala.inline
  implicit class ClustersResourceOps[Self <: ClustersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDiagnose(value: AnonAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[Cluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListClustersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonCallback => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

