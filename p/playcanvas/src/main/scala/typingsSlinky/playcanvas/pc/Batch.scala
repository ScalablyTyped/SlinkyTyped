package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Batch
  * @classdesc Holds information about batched mesh instances. Created in {@link pc.BatchManager#create}.
  * @param {pc.MeshInstance[]} meshInstances - The mesh instances to be batched.
  * @param {boolean} dynamic - Whether this batch is dynamic (supports transforming mesh instances at runtime).
  * @param {number} batchGroupId - Link this batch to a specific batch group. This is done automatically with default batches.
  * @property {pc.MeshInstance[]} origMeshInstances An array of original mesh instances, from which this batch was generated.
  * @property {pc.MeshInstance} meshInstance A single combined mesh instance, the result of batching.
  * @property {pc.Model} model A handy model object.
  * @property {boolean} dynamic Whether this batch is dynamic (supports transforming mesh instances at runtime).
  * @property {number} [batchGroupId] Link this batch to a specific batch group. This is done automatically with default batches.
  */
@js.native
trait Batch extends js.Object {
  /**
    * Link this batch to a specific batch group. This is done automatically with default batches.
    */
  var batchGroupId: js.UndefOr[Double] = js.native
  /**
    * Whether this batch is dynamic (supports transforming mesh instances at runtime).
    */
  var dynamic: Boolean = js.native
  /**
    * A single combined mesh instance, the result of batching.
    */
  var meshInstance: MeshInstance = js.native
  /**
    * A handy model object.
    */
  var model: Model = js.native
  /**
    * An array of original mesh instances, from which this batch was generated.
    */
  var origMeshInstances: js.Array[MeshInstance] = js.native
}

object Batch {
  @scala.inline
  def apply(
    dynamic: Boolean,
    meshInstance: MeshInstance,
    model: Model,
    origMeshInstances: js.Array[MeshInstance]
  ): Batch = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], meshInstance = meshInstance.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], origMeshInstances = origMeshInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
  @scala.inline
  implicit class BatchOps[Self <: Batch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshInstance(value: MeshInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigMeshInstances(value: js.Array[MeshInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origMeshInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchGroupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchGroupId")(js.undefined)
        ret
    }
  }
  
}

