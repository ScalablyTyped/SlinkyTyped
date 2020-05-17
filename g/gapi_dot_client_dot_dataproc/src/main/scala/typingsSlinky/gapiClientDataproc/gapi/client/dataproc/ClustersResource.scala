package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDataproc.anon.Accesstoken
import typingsSlinky.gapiClientDataproc.anon.Alt
import typingsSlinky.gapiClientDataproc.anon.Bearertoken
import typingsSlinky.gapiClientDataproc.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClustersResource extends js.Object {
  /** Creates a cluster in a project. */
  def create(request: Accesstoken): Request[Operation] = js.native
  /** Deletes a cluster in a project. */
  def delete(request: Alt): Request[Operation] = js.native
  /** Gets cluster diagnostic information. After the operation completes, the Operation.response field contains DiagnoseClusterOutputLocation. */
  def diagnose(request: Alt): Request[Operation] = js.native
  /** Gets the resource representation for a cluster in a project. */
  def get(request: Alt): Request[Cluster] = js.native
  /** Lists all regions/{region}/clusters in a project. */
  def list(request: Bearertoken): Request[ListClustersResponse] = js.native
  /** Updates a cluster in a project. */
  def patch(request: Callback): Request[Operation] = js.native
}

object ClustersResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[Operation],
    delete: Alt => Request[Operation],
    diagnose: Alt => Request[Operation],
    get: Alt => Request[Cluster],
    list: Bearertoken => Request[ListClustersResponse],
    patch: Callback => Request[Operation]
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
    def withCreate(value: Accesstoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Alt => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDiagnose(value: Alt => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[Cluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Bearertoken => Request[ListClustersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Callback => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

