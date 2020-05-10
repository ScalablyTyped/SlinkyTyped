package typingsSlinky.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollisionData extends js.Object {
  var axisBody: Body = js.native
  var axisNumber: Double = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var collided: Boolean = js.native
  var depth: Double = js.native
  var friction: Double = js.native
  var frictionStatic: Double = js.native
  var inverseMass: Double = js.native
  var normal: Vector = js.native
  var parentA: Body = js.native
  var parentB: Body = js.native
  var penetration: Vector = js.native
  var restitution: Double = js.native
  var slop: Double = js.native
  var supports: js.Array[Vector] = js.native
  var tangent: Vector = js.native
}

object ICollisionData {
  @scala.inline
  def apply(
    axisBody: Body,
    axisNumber: Double,
    bodyA: Body,
    bodyB: Body,
    collided: Boolean,
    depth: Double,
    friction: Double,
    frictionStatic: Double,
    inverseMass: Double,
    normal: Vector,
    parentA: Body,
    parentB: Body,
    penetration: Vector,
    restitution: Double,
    slop: Double,
    supports: js.Array[Vector],
    tangent: Vector
  ): ICollisionData = {
    val __obj = js.Dynamic.literal(axisBody = axisBody.asInstanceOf[js.Any], axisNumber = axisNumber.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collided = collided.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], parentA = parentA.asInstanceOf[js.Any], parentB = parentB.asInstanceOf[js.Any], penetration = penetration.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any], tangent = tangent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionData]
  }
  @scala.inline
  implicit class ICollisionDataOps[Self <: ICollisionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisBody(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyA(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyB(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollided(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrictionStatic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseMass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentA(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentB(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPenetration(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("penetration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupports(value: js.Array[Vector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTangent(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

