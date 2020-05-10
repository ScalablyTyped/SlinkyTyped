package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for `CreateWorkerPool`.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest extends js.Object {
  /**
    * Resource name of the instance in which to create the new worker pool.
    * Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * ID of the created worker pool. A valid pool ID must: be 6-50 characters
    * long, contain only lowercase letters, digits, hyphens and underscores,
    * start with a lowercase letter, and end with a lowercase letter or a
    * digit.
    */
  var poolId: js.UndefOr[String] = js.native
  /**
    * Specifies the worker pool to create. The name in the worker pool, if
    * specified, is ignored.
    */
  var workerPool: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequestOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolId")(js.undefined)
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

