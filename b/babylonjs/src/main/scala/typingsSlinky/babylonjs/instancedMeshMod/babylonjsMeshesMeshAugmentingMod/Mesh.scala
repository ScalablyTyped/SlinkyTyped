package typingsSlinky.babylonjs.instancedMeshMod.babylonjsMeshesMeshAugmentingMod

import typingsSlinky.babylonjs.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mesh extends js.Object {
  /** @hidden */
  var _userInstancedBuffersStorage: Data = js.native
  /**
    * Register a custom buffer that will be instanced
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
    * @param kind defines the buffer kind
    * @param stride defines the stride in floats
    */
  def registerInstancedBuffer(kind: String, stride: Double): Unit = js.native
}

object Mesh {
  @scala.inline
  def apply(_userInstancedBuffersStorage: Data, registerInstancedBuffer: (String, Double) => Unit): Mesh = {
    val __obj = js.Dynamic.literal(_userInstancedBuffersStorage = _userInstancedBuffersStorage.asInstanceOf[js.Any], registerInstancedBuffer = js.Any.fromFunction2(registerInstancedBuffer))
    __obj.asInstanceOf[Mesh]
  }
  @scala.inline
  implicit class MeshOps[Self <: Mesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_userInstancedBuffersStorage(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_userInstancedBuffersStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterInstancedBuffer(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInstancedBuffer")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

