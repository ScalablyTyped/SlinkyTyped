package typingsSlinky.physijs.Physijs

import typingsSlinky.three.mod.Object3D
import typingsSlinky.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConeTwistConstraintDefinition extends js.Object {
  var axisa: Vector3 = js.native
  var axisb: Vector3 = js.native
  var id: Double = js.native
  var objecta: Object3D = js.native
  var objectb: Object3D = js.native
  var positiona: Vector3 = js.native
  var positionb: Vector3 = js.native
  var `type`: String = js.native
}

object ConeTwistConstraintDefinition {
  @scala.inline
  def apply(
    axisa: Vector3,
    axisb: Vector3,
    id: Double,
    objecta: Object3D,
    objectb: Object3D,
    positiona: Vector3,
    positionb: Vector3,
    `type`: String
  ): ConeTwistConstraintDefinition = {
    val __obj = js.Dynamic.literal(axisa = axisa.asInstanceOf[js.Any], axisb = axisb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConeTwistConstraintDefinition]
  }
  @scala.inline
  implicit class ConeTwistConstraintDefinitionOps[Self <: ConeTwistConstraintDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisa(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisb(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjecta(value: Object3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objecta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectb(value: Object3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositiona(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiona")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionb(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

