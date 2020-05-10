package typingsSlinky.phaser.Phaser.Types.Physics.Impact

import typingsSlinky.phaser.Phaser.Physics.Impact.COLLIDES
import typingsSlinky.phaser.Phaser.Physics.Impact.TYPE
import typingsSlinky.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONImpactBody extends js.Object {
  /**
    * Current acceleration to be added to the entity's velocity per second. E.g. an entity with a `vel.x` of 0 and `accel.x` of 10 will have a `vel.x` of 100 ten seconds later.
    */
  var accel: Vector2Like = js.native
  /**
    * [description]
    */
  var bounciness: Double = js.native
  /**
    * [description]
    */
  var checkAgainst: TYPE = js.native
  /**
    * [description]
    */
  var collides: COLLIDES = js.native
  /**
    * Deceleration to be subtracted from the entity's velocity per second. Only applies if `accel` is 0.
    */
  var friction: Vector2Like = js.native
  /**
    * [description]
    */
  var gravityFactor: Double = js.native
  /**
    * The maximum velocity a body can move.
    */
  var maxVel: Vector2Like = js.native
  /**
    * [description]
    */
  var minBounceVelocity: Double = js.native
  /**
    * [description]
    */
  var name: String = js.native
  /**
    * The entity's position in the game world.
    */
  var pos: Vector2Like = js.native
  /**
    * [description]
    */
  var size: Vector2Like = js.native
  /**
    * [description]
    */
  var `type`: TYPE = js.native
  /**
    * Current velocity in pixels per second.
    */
  var vel: Vector2Like = js.native
}

object JSONImpactBody {
  @scala.inline
  def apply(
    accel: Vector2Like,
    bounciness: Double,
    checkAgainst: TYPE,
    collides: COLLIDES,
    friction: Vector2Like,
    gravityFactor: Double,
    maxVel: Vector2Like,
    minBounceVelocity: Double,
    name: String,
    pos: Vector2Like,
    size: Vector2Like,
    `type`: TYPE,
    vel: Vector2Like
  ): JSONImpactBody = {
    val __obj = js.Dynamic.literal(accel = accel.asInstanceOf[js.Any], bounciness = bounciness.asInstanceOf[js.Any], checkAgainst = checkAgainst.asInstanceOf[js.Any], collides = collides.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], gravityFactor = gravityFactor.asInstanceOf[js.Any], maxVel = maxVel.asInstanceOf[js.Any], minBounceVelocity = minBounceVelocity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vel = vel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONImpactBody]
  }
  @scala.inline
  implicit class JSONImpactBodyOps[Self <: JSONImpactBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccel(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounciness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounciness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckAgainst(value: TYPE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAgainst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollides(value: COLLIDES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriction(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGravityFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVel(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinBounceVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBounceVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TYPE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVel(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

