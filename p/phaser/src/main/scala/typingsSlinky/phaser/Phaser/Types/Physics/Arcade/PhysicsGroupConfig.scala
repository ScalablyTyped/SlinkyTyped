package typingsSlinky.phaser.Phaser.Types.Physics.Arcade

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.Phaser.Geom.Rectangle
import typingsSlinky.phaser.Phaser.Types.GameObjects.Group.GroupCallback
import typingsSlinky.phaser.Phaser.Types.GameObjects.Group.GroupMultipleCreateCallback
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phaser.Phaser.Types.GameObjects.Group.GroupConfig & {  collideWorldBounds ? :boolean,   customBoundsRectangle ? :phaser.Phaser.Geom.Rectangle,   accelerationX ? :number,   accelerationY ? :number,   allowDrag ? :boolean,   allowGravity ? :boolean,   allowRotation ? :boolean,   bounceX ? :number,   bounceY ? :number,   dragX ? :number,   dragY ? :number,   enable ? :boolean,   gravityX ? :number,   gravityY ? :number,   frictionX ? :number,   frictionY ? :number,   velocityX ? :number,   velocityY ? :number,   angularVelocity ? :number,   angularAcceleration ? :number,   angularDrag ? :number,   mass ? :number,   immovable ? :boolean} */
@js.native
trait PhysicsGroupConfig extends js.Object {
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.x}.
    */
  var accelerationX: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.y}.
    */
  var accelerationY: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#active}.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#allowDrag}.
    */
  var allowDrag: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#allowGravity}.
    */
  var allowGravity: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#allowRotation}.
    */
  var allowRotation: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#angularAcceleration}.
    */
  var angularAcceleration: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#angularDrag}.
    */
  var angularDrag: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#angularVelocity}.
    */
  var angularVelocity: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.x}.
    */
  var bounceX: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.y}.
    */
  var bounceY: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#classType}.
    */
  var classType: js.UndefOr[js.Function] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#collideWorldBounds}.
    */
  var collideWorldBounds: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#createCallback}.
    */
  var createCallback: js.UndefOr[GroupCallback] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#createMultipleCallback}.
    */
  var createMultipleCallback: js.UndefOr[GroupMultipleCreateCallback] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#setBoundsRectangle setBoundsRectangle}.
    */
  var customBoundsRectangle: js.UndefOr[Rectangle] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultFrame}.
    */
  var defaultFrame: js.UndefOr[String | integer] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultKey}.
    */
  var defaultKey: js.UndefOr[String] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#drag drag.x}.
    */
  var dragX: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#drag drag.y}.
    */
  var dragY: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#enable enable}.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#friction friction.x}.
    */
  var frictionX: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#friction friction.y}.
    */
  var frictionY: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.x}.
    */
  var gravityX: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.y}.
    */
  var gravityY: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#immovable}.
    */
  var immovable: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#mass}.
    */
  var mass: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#maxSize}.
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#name}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#removeCallback}.
    */
  var removeCallback: js.UndefOr[GroupCallback] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#runChildUpdate}.
    */
  var runChildUpdate: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.x}.
    */
  var velocityX: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.y}.
    */
  var velocityY: js.UndefOr[Double] = js.native
}

object PhysicsGroupConfig {
  @scala.inline
  def apply(): PhysicsGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsGroupConfig]
  }
  @scala.inline
  implicit class PhysicsGroupConfigOps[Self <: PhysicsGroupConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerationX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationX")(js.undefined)
        ret
    }
    @scala.inline
    def withAccelerationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerationY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationY")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowGravity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowGravity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGravity")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularAcceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularAcceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularAcceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularDrag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceX")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceY")(js.undefined)
        ret
    }
    @scala.inline
    def withClassType(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classType")(js.undefined)
        ret
    }
    @scala.inline
    def withCollideWorldBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideWorldBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollideWorldBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideWorldBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateCallback(value: /* item */ GameObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateMultipleCallback(value: /* items */ js.Array[GameObject] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMultipleCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateMultipleCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMultipleCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomBoundsRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBoundsRectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomBoundsRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBoundsRectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFrame(value: String | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDragX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragX")(js.undefined)
        ret
    }
    @scala.inline
    def withDragY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragY")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withFrictionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionX")(js.undefined)
        ret
    }
    @scala.inline
    def withFrictionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionY")(js.undefined)
        ret
    }
    @scala.inline
    def withGravityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravityX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityX")(js.undefined)
        ret
    }
    @scala.inline
    def withGravityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravityY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityY")(js.undefined)
        ret
    }
    @scala.inline
    def withImmovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immovable")(js.undefined)
        ret
    }
    @scala.inline
    def withMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCallback(value: /* item */ GameObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRunChildUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runChildUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunChildUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runChildUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityX")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityY")(js.undefined)
        ret
    }
  }
  
}

