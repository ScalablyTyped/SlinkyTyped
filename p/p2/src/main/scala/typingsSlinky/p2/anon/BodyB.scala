package typingsSlinky.p2.anon

import typingsSlinky.p2.mod.ContactEquation
import typingsSlinky.p2.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyB extends js.Object {
  var bodyA: typingsSlinky.p2.mod.Body = js.native
  var bodyB: typingsSlinky.p2.mod.Body = js.native
  var contactEquations: js.Array[ContactEquation] = js.native
  var shapeA: Shape = js.native
  var shapeB: Shape = js.native
  var `type`: String = js.native
}

object BodyB {
  @scala.inline
  def apply(
    bodyA: typingsSlinky.p2.mod.Body,
    bodyB: typingsSlinky.p2.mod.Body,
    contactEquations: js.Array[ContactEquation],
    shapeA: Shape,
    shapeB: Shape,
    `type`: String
  ): BodyB = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contactEquations = contactEquations.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyB]
  }
  @scala.inline
  implicit class BodyBOps[Self <: BodyB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyA(value: typingsSlinky.p2.mod.Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyB(value: typingsSlinky.p2.mod.Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactEquations(value: js.Array[ContactEquation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEquations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeA(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeB(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeB")(value.asInstanceOf[js.Any])
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

