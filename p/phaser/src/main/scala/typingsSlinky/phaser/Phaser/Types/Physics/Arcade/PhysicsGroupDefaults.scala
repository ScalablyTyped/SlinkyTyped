package typingsSlinky.phaser.Phaser.Types.Physics.Arcade

import typingsSlinky.phaser.Phaser.Geom.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsGroupDefaults extends js.Object {
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAccelerationX}.
    */
  var setAccelerationX: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAccelerationY}.
    */
  var setAccelerationY: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAllowDrag}.
    */
  var setAllowDrag: Boolean = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAllowGravity}.
    */
  var setAllowGravity: Boolean = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAllowRotation}.
    */
  var setAllowRotation: Boolean = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAngularAcceleration}.
    */
  var setAngularAcceleration: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAngularDrag}.
    */
  var setAngularDrag: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAngularVelocity}.
    */
  var setAngularVelocity: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setBounceX}.
    */
  var setBounceX: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setBounceY}.
    */
  var setBounceY: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setBoundsRectangle}.
    */
  var setBoundsRectangle: Rectangle = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setCollideWorldBounds}.
    */
  var setCollideWorldBounds: Boolean = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setDragX}.
    */
  var setDragX: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setDragY}.
    */
  var setDragY: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setEnable}.
    */
  var setEnable: Boolean = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setFrictionX}.
    */
  var setFrictionX: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setFrictionY}.
    */
  var setFrictionY: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setGravityX}.
    */
  var setGravityX: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setGravityY}.
    */
  var setGravityY: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setImmovable}.
    */
  var setImmovable: Boolean = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setMass}.
    */
  var setMass: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setVelocityX}.
    */
  var setVelocityX: Double = js.native
  /**
    * As {@link Phaser.Physics.Arcade.Body#setVelocityY}.
    */
  var setVelocityY: Double = js.native
}

object PhysicsGroupDefaults {
  @scala.inline
  def apply(
    setAccelerationX: Double,
    setAccelerationY: Double,
    setAllowDrag: Boolean,
    setAllowGravity: Boolean,
    setAllowRotation: Boolean,
    setAngularAcceleration: Double,
    setAngularDrag: Double,
    setAngularVelocity: Double,
    setBounceX: Double,
    setBounceY: Double,
    setBoundsRectangle: Rectangle,
    setCollideWorldBounds: Boolean,
    setDragX: Double,
    setDragY: Double,
    setEnable: Boolean,
    setFrictionX: Double,
    setFrictionY: Double,
    setGravityX: Double,
    setGravityY: Double,
    setImmovable: Boolean,
    setMass: Double,
    setVelocityX: Double,
    setVelocityY: Double
  ): PhysicsGroupDefaults = {
    val __obj = js.Dynamic.literal(setAccelerationX = setAccelerationX.asInstanceOf[js.Any], setAccelerationY = setAccelerationY.asInstanceOf[js.Any], setAllowDrag = setAllowDrag.asInstanceOf[js.Any], setAllowGravity = setAllowGravity.asInstanceOf[js.Any], setAllowRotation = setAllowRotation.asInstanceOf[js.Any], setAngularAcceleration = setAngularAcceleration.asInstanceOf[js.Any], setAngularDrag = setAngularDrag.asInstanceOf[js.Any], setAngularVelocity = setAngularVelocity.asInstanceOf[js.Any], setBounceX = setBounceX.asInstanceOf[js.Any], setBounceY = setBounceY.asInstanceOf[js.Any], setBoundsRectangle = setBoundsRectangle.asInstanceOf[js.Any], setCollideWorldBounds = setCollideWorldBounds.asInstanceOf[js.Any], setDragX = setDragX.asInstanceOf[js.Any], setDragY = setDragY.asInstanceOf[js.Any], setEnable = setEnable.asInstanceOf[js.Any], setFrictionX = setFrictionX.asInstanceOf[js.Any], setFrictionY = setFrictionY.asInstanceOf[js.Any], setGravityX = setGravityX.asInstanceOf[js.Any], setGravityY = setGravityY.asInstanceOf[js.Any], setImmovable = setImmovable.asInstanceOf[js.Any], setMass = setMass.asInstanceOf[js.Any], setVelocityX = setVelocityX.asInstanceOf[js.Any], setVelocityY = setVelocityY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsGroupDefaults]
  }
  @scala.inline
  implicit class PhysicsGroupDefaultsOps[Self <: PhysicsGroupDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAccelerationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccelerationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAccelerationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccelerationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAllowDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAllowGravity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowGravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAllowRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAngularAcceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAngularAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAngularDrag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAngularDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAngularVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAngularVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBounceX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBounceY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBoundsRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBoundsRectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCollideWorldBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCollideWorldBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDragX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDragX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDragY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDragY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFrictionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrictionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFrictionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrictionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetGravityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGravityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetGravityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGravityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetImmovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImmovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVelocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVelocityY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

