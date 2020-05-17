package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesBatch extends js.Object {
  var hardwareInstancedRendering: js.Array[Boolean] = js.native
  var mustReturn: Boolean = js.native
  var renderSelf: js.Array[Boolean] = js.native
  var visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]] = js.native
}

object InstancesBatch {
  @scala.inline
  def apply(
    hardwareInstancedRendering: js.Array[Boolean],
    mustReturn: Boolean,
    renderSelf: js.Array[Boolean],
    visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]]
  ): InstancesBatch = {
    val __obj = js.Dynamic.literal(hardwareInstancedRendering = hardwareInstancedRendering.asInstanceOf[js.Any], mustReturn = mustReturn.asInstanceOf[js.Any], renderSelf = renderSelf.asInstanceOf[js.Any], visibleInstances = visibleInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesBatch]
  }
  @scala.inline
  implicit class InstancesBatchOps[Self <: InstancesBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHardwareInstancedRendering(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareInstancedRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMustReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderSelf(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleInstances(value: js.Array[Nullable[js.Array[InstancedMesh]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleInstances")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

