package typingsSlinky.p2

import typingsSlinky.p2.mod.ContactEquation
import typingsSlinky.p2.mod.FrictionEquation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContactEquations extends js.Object {
  var contactEquations: js.Array[ContactEquation] = js.native
  var frictionEquations: js.Array[FrictionEquation] = js.native
  var `type`: String = js.native
}

object AnonContactEquations {
  @scala.inline
  def apply(
    contactEquations: js.Array[ContactEquation],
    frictionEquations: js.Array[FrictionEquation],
    `type`: String
  ): AnonContactEquations = {
    val __obj = js.Dynamic.literal(contactEquations = contactEquations.asInstanceOf[js.Any], frictionEquations = frictionEquations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContactEquations]
  }
  @scala.inline
  implicit class AnonContactEquationsOps[Self <: AnonContactEquations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactEquations(value: js.Array[ContactEquation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEquations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrictionEquations(value: js.Array[FrictionEquation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionEquations")(value.asInstanceOf[js.Any])
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

