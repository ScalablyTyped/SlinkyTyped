package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.NodeMaterialConnectionPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitVertex extends js.Object {
  var emitFragment: Boolean = js.native
  var emitVertex: Boolean = js.native
  var notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint] = js.native
}

object EmitVertex {
  @scala.inline
  def apply(
    emitFragment: Boolean,
    emitVertex: Boolean,
    notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
  ): EmitVertex = {
    val __obj = js.Dynamic.literal(emitFragment = emitFragment.asInstanceOf[js.Any], emitVertex = emitVertex.asInstanceOf[js.Any], notConnectedNonOptionalInputs = notConnectedNonOptionalInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitVertex]
  }
  @scala.inline
  implicit class EmitVertexOps[Self <: EmitVertex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmitFragment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitVertex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitVertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotConnectedNonOptionalInputs(value: js.Array[NodeMaterialConnectionPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notConnectedNonOptionalInputs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

