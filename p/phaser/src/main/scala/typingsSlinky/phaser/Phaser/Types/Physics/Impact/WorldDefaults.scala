package typingsSlinky.phaser.Phaser.Types.Physics.Impact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the 4 wall bodies that bound the physics world.
  */
@js.native
trait WorldDefaults extends js.Object {
  /**
    * The color of this Body on the debug display.
    */
  var bodyDebugColor: Double = js.native
  /**
    * The default bounce, or restitution, of bodies in the world.
    */
  var bounciness: Double = js.native
  /**
    * Whether the Body's boundary is drawn to the debug display.
    */
  var debugShowBody: Boolean = js.native
  /**
    * Whether the Body's velocity is drawn to the debug display.
    */
  var debugShowVelocity: Boolean = js.native
  /**
    * Gravity multiplier. Set to 0 for no gravity.
    */
  var gravityFactor: Double = js.native
  /**
    * Maximum X velocity objects can move.
    */
  var maxVelocityX: Double = js.native
  /**
    * Maximum Y velocity objects can move.
    */
  var maxVelocityY: Double = js.native
  /**
    * The minimum velocity an object can be moving at to be considered for bounce.
    */
  var minBounceVelocity: Double = js.native
  /**
    * The color of the Body's velocity on the debug display.
    */
  var velocityDebugColor: Double = js.native
}

object WorldDefaults {
  @scala.inline
  def apply(
    bodyDebugColor: Double,
    bounciness: Double,
    debugShowBody: Boolean,
    debugShowVelocity: Boolean,
    gravityFactor: Double,
    maxVelocityX: Double,
    maxVelocityY: Double,
    minBounceVelocity: Double,
    velocityDebugColor: Double
  ): WorldDefaults = {
    val __obj = js.Dynamic.literal(bodyDebugColor = bodyDebugColor.asInstanceOf[js.Any], bounciness = bounciness.asInstanceOf[js.Any], debugShowBody = debugShowBody.asInstanceOf[js.Any], debugShowVelocity = debugShowVelocity.asInstanceOf[js.Any], gravityFactor = gravityFactor.asInstanceOf[js.Any], maxVelocityX = maxVelocityX.asInstanceOf[js.Any], maxVelocityY = maxVelocityY.asInstanceOf[js.Any], minBounceVelocity = minBounceVelocity.asInstanceOf[js.Any], velocityDebugColor = velocityDebugColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldDefaults]
  }
  @scala.inline
  implicit class WorldDefaultsOps[Self <: WorldDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyDebugColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyDebugColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounciness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounciness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugShowBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugShowVelocity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGravityFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinBounceVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBounceVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocityDebugColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityDebugColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

