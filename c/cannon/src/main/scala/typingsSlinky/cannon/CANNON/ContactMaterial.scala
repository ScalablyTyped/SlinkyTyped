package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactMaterial extends js.Object {
  var contactEquationRelaxation: Double = js.native
  var contactEquationStiffness: Double = js.native
  var friction: Double = js.native
  var frictionEquationRelaxation: Double = js.native
  var frictionEquationStiffness: Double = js.native
  var id: Double = js.native
  var materials: js.Array[Material] = js.native
  var restitution: Double = js.native
}

object ContactMaterial {
  @scala.inline
  def apply(
    contactEquationRelaxation: Double,
    contactEquationStiffness: Double,
    friction: Double,
    frictionEquationRelaxation: Double,
    frictionEquationStiffness: Double,
    id: Double,
    materials: js.Array[Material],
    restitution: Double
  ): ContactMaterial = {
    val __obj = js.Dynamic.literal(contactEquationRelaxation = contactEquationRelaxation.asInstanceOf[js.Any], contactEquationStiffness = contactEquationStiffness.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionEquationRelaxation = frictionEquationRelaxation.asInstanceOf[js.Any], frictionEquationStiffness = frictionEquationStiffness.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMaterial]
  }
  @scala.inline
  implicit class ContactMaterialOps[Self <: ContactMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactEquationRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEquationRelaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactEquationStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEquationStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrictionEquationRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionEquationRelaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrictionEquationStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionEquationStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterials(value: js.Array[Material]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

