package typingsSlinky.babylonjs.babylonjsIndexMod.babylonjsMeshesAbstractMeshAugmentingMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractMesh extends js.Object {
  /**
    * Object used to store instanced buffers defined by user
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
    */
  var instancedBuffers: StringDictionary[js.Any] = js.native
}

object AbstractMesh {
  @scala.inline
  def apply(instancedBuffers: StringDictionary[js.Any]): AbstractMesh = {
    val __obj = js.Dynamic.literal(instancedBuffers = instancedBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMesh]
  }
  @scala.inline
  implicit class AbstractMeshOps[Self <: AbstractMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstancedBuffers(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancedBuffers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

