package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse extends js.Object {
  /**
    * The list of worker pools in a given instance.
    */
  var workerPools: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponseOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkerPools(value: js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerPools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPools")(js.undefined)
        ret
    }
  }
  
}

