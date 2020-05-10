package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing existing `WorkerPools`.
  */
@js.native
trait SchemaListWorkerPoolsResponse extends js.Object {
  /**
    * `WorkerPools` for the project.
    */
  var workerPools: js.UndefOr[js.Array[SchemaWorkerPool]] = js.native
}

object SchemaListWorkerPoolsResponse {
  @scala.inline
  def apply(): SchemaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkerPoolsResponse]
  }
  @scala.inline
  implicit class SchemaListWorkerPoolsResponseOps[Self <: SchemaListWorkerPoolsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkerPools(value: js.Array[SchemaWorkerPool]): Self = {
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

