package typingsSlinky.babylonjs.meshMod

import typingsSlinky.babylonjs.bufferMod.Buffer
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  **/
@js.native
trait InstanceDataStorage extends js.Object {
  var batchCache: InstancesBatch = js.native
  var hardwareInstancedRendering: Boolean = js.native
  var instancesBuffer: Nullable[Buffer] = js.native
  var instancesBufferSize: Double = js.native
  var instancesData: js.typedarray.Float32Array = js.native
  var isFrozen: Boolean = js.native
  var manualUpdate: Boolean = js.native
  var overridenInstanceCount: Double = js.native
  var previousBatch: Nullable[InstancesBatch] = js.native
  var sideOrientation: Double = js.native
  var visibleInstances: js.Any = js.native
}

object InstanceDataStorage {
  @scala.inline
  def apply(
    batchCache: InstancesBatch,
    hardwareInstancedRendering: Boolean,
    instancesBufferSize: Double,
    instancesData: js.typedarray.Float32Array,
    isFrozen: Boolean,
    manualUpdate: Boolean,
    overridenInstanceCount: Double,
    sideOrientation: Double,
    visibleInstances: js.Any
  ): InstanceDataStorage = {
    val __obj = js.Dynamic.literal(batchCache = batchCache.asInstanceOf[js.Any], hardwareInstancedRendering = hardwareInstancedRendering.asInstanceOf[js.Any], instancesBufferSize = instancesBufferSize.asInstanceOf[js.Any], instancesData = instancesData.asInstanceOf[js.Any], isFrozen = isFrozen.asInstanceOf[js.Any], manualUpdate = manualUpdate.asInstanceOf[js.Any], overridenInstanceCount = overridenInstanceCount.asInstanceOf[js.Any], sideOrientation = sideOrientation.asInstanceOf[js.Any], visibleInstances = visibleInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceDataStorage]
  }
  @scala.inline
  implicit class InstanceDataStorageOps[Self <: InstanceDataStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchCache(value: InstancesBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHardwareInstancedRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareInstancedRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstancesBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancesBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstancesData(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancesData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFrozen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrozen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverridenInstanceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridenInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSideOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleInstances(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstancesBuffer(value: Nullable[Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancesBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstancesBufferNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancesBuffer")(null)
        ret
    }
    @scala.inline
    def withPreviousBatch(value: Nullable[InstancesBatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousBatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousBatchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousBatch")(null)
        ret
    }
  }
  
}

