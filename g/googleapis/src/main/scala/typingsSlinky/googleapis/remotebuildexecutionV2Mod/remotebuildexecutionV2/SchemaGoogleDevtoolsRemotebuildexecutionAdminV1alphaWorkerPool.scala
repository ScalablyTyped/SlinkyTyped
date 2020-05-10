package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A worker pool resource in the Remote Build Execution API.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool extends js.Object {
  /**
    * WorkerPool resource name formatted as:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    * name should not be populated when creating a worker pool since it is
    * provided in the `poolId` field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. State of the worker pool.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Specifies the properties, such as machine type and disk size, used for
    * creating workers in a worker pool.
    */
  var workerConfig: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] = js.native
  /**
    * The desired number of workers in the worker pool. Must be a value between
    * 0 and 1000.
    */
  var workerCount: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPoolOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerConfig(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(js.undefined)
        ret
    }
  }
  
}

