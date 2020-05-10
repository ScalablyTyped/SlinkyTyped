package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.MatterJS.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterCollisionData extends js.Object {
  /**
    * A reference to the dominant axis body.
    */
  var axisBody: BodyType = js.native
  /**
    * The index of the dominant collision axis vector (edge normal)
    */
  var axisNumber: Double = js.native
  /**
    * A reference to the first body involved in the collision.
    */
  var bodyA: BodyType = js.native
  /**
    * A reference to the second body involved in the collision.
    */
  var bodyB: BodyType = js.native
  /**
    * Have the pair collided or not?
    */
  var collided: Boolean = js.native
  /**
    * The depth of the collision on the minimum overlap.
    */
  var depth: Double = js.native
  /**
    * The resulting friction from the collision.
    */
  var friction: Double = js.native
  /**
    * The resulting static friction from the collision.
    */
  var frictionStatic: Double = js.native
  /**
    * The resulting inverse mass from the collision.
    */
  var inverseMass: Double = js.native
  /**
    * The collision normal, facing away from Body A.
    */
  var normal: Vector = js.native
  /**
    * A reference to the parent of Body A, or to Body A itself if it has no parent.
    */
  var parentA: BodyType = js.native
  /**
    * A reference to the parent of Body B, or to Body B itself if it has no parent.
    */
  var parentB: BodyType = js.native
  /**
    * The penetration distances between the two bodies.
    */
  var penetration: Vector = js.native
  /**
    * The resulting restitution from the collision.
    */
  var restitution: Double = js.native
  /**
    * The resulting slop from the collision.
    */
  var slop: Double = js.native
  /**
    * An array of support points, either exactly one or two points.
    */
  var supports: js.Array[Vector] = js.native
  /**
    * The tangent of the collision normal.
    */
  var tangent: Vector = js.native
}

object MatterCollisionData {
  @scala.inline
  def apply(
    axisBody: BodyType,
    axisNumber: Double,
    bodyA: BodyType,
    bodyB: BodyType,
    collided: Boolean,
    depth: Double,
    friction: Double,
    frictionStatic: Double,
    inverseMass: Double,
    normal: Vector,
    parentA: BodyType,
    parentB: BodyType,
    penetration: Vector,
    restitution: Double,
    slop: Double,
    supports: js.Array[Vector],
    tangent: Vector
  ): MatterCollisionData = {
    val __obj = js.Dynamic.literal(axisBody = axisBody.asInstanceOf[js.Any], axisNumber = axisNumber.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collided = collided.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], parentA = parentA.asInstanceOf[js.Any], parentB = parentB.asInstanceOf[js.Any], penetration = penetration.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any], tangent = tangent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterCollisionData]
  }
  @scala.inline
  implicit class MatterCollisionDataOps[Self <: MatterCollisionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisBody(value: BodyType): Self = {
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
    def withBodyA(value: BodyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyB(value: BodyType): Self = {
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
    def withParentA(value: BodyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentB(value: BodyType): Self = {
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

