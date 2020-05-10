package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for UpdateWorkerPool.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest extends js.Object {
  /**
    * The update mask applies to worker_pool. For the `FieldMask` definition,
    * see
    * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * If an empty update_mask is provided, only the non-default valued field in
    * the worker pool field will be updated. Note that in order to update a
    * field to the default value (zero, false, empty string) an explicit
    * update_mask must be provided.
    */
  var updateMask: js.UndefOr[String] = js.native
  /**
    * Specifies the worker pool to update.
    */
  var workerPool: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequestOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerPool(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPool")(js.undefined)
        ret
    }
  }
  
}

