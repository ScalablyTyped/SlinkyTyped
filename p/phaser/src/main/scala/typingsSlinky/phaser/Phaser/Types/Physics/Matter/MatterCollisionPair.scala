package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.MatterJS.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterCollisionPair extends js.Object {
  /**
    * An array containing all of the active contacts between bodies A and B.
    */
  var activeContacts: js.Array[Vector] = js.native
  /**
    * A reference to the first body involved in the collision.
    */
  var bodyA: BodyType = js.native
  /**
    * A reference to the second body involved in the collision.
    */
  var bodyB: BodyType = js.native
  /**
    * The collision data object.
    */
  var collision: MatterCollisionData = js.native
  /**
    * Has Matter determined the collision are being active yet?
    */
  var confirmedActive: Boolean = js.native
  /**
    * The resulting friction from the collision.
    */
  var friction: Double = js.native
  /**
    * The resulting static friction from the collision.
    */
  var frictionStatic: Double = js.native
  /**
    * The unique auto-generated collision pair id. A combination of the body A and B IDs.
    */
  var id: String = js.native
  /**
    * The resulting inverse mass from the collision.
    */
  var inverseMass: Double = js.native
  /**
    * Is the collision still active or not?
    */
  var isActive: Boolean = js.native
  /**
    * Is either body A or B a sensor?
    */
  var isSensor: Boolean = js.native
  /**
    * The resulting restitution from the collision.
    */
  var restitution: Double = js.native
  /**
    * The amount of separation that occured between bodies A and B.
    */
  var separation: Double = js.native
  /**
    * The resulting slop from the collision.
    */
  var slop: Double = js.native
  /**
    * The timestamp when the collision pair was created.
    */
  var timeCreated: Double = js.native
  /**
    * The timestamp when the collision pair was most recently updated.
    */
  var timeUpdated: Double = js.native
}

object MatterCollisionPair {
  @scala.inline
  def apply(
    activeContacts: js.Array[Vector],
    bodyA: BodyType,
    bodyB: BodyType,
    collision: MatterCollisionData,
    confirmedActive: Boolean,
    friction: Double,
    frictionStatic: Double,
    id: String,
    inverseMass: Double,
    isActive: Boolean,
    isSensor: Boolean,
    restitution: Double,
    separation: Double,
    slop: Double,
    timeCreated: Double,
    timeUpdated: Double
  ): MatterCollisionPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collision = collision.asInstanceOf[js.Any], confirmedActive = confirmedActive.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeUpdated = timeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterCollisionPair]
  }
  @scala.inline
  implicit class MatterCollisionPairOps[Self <: MatterCollisionPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveContacts(value: js.Array[Vector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeContacts")(value.asInstanceOf[js.Any])
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
    def withCollision(value: MatterCollisionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmedActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmedActive")(value.asInstanceOf[js.Any])
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseMass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSensor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUpdated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

