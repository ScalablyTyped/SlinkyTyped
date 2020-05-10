package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterBodyConfig extends js.Object {
  /**
    * A number specifying the angle of the body, in radians.
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * A number, or array of numbers, to chamfer the vertices of the body, or a full Chamfer configuration object.
    */
  var chamfer: js.UndefOr[Double | js.Array[Double] | MatterChamferConfig] = js.native
  /**
    * The radius of this body if a circle.
    */
  var circleRadius: js.UndefOr[Double] = js.native
  /**
    * An `Object` that specifies the collision filtering properties of this body.
    */
  var collisionFilter: js.UndefOr[MatterCollisionFilter] = js.native
  /**
    * A `Number` that defines the density of the body, that is its mass per unit area. If you pass the density via `Body.create` the `mass` property is automatically calculated for you based on the size (area) of the object. This is generally preferable to simply setting mass and allows for more intuitive definition of materials (e.g. rock has a higher density than wood).
    */
  var density: js.UndefOr[Double] = js.native
  /**
    * A `Vector` that specifies the force to apply in the current step. It is zeroed after every `Body.update`. See also `Body.applyForce`.
    */
  var force: js.UndefOr[Vector2Like] = js.native
  /**
    * A `Number` that defines the friction of the body. The value is always positive and is in the range `(0, 1)`. A value of `0` means that the body may slide indefinitely. A value of `1` means the body may come to a stop almost instantly after a force is applied.
    */
  var friction: js.UndefOr[Double] = js.native
  /**
    * A `Number` that defines the air friction of the body (air resistance). A value of `0` means the body will never slow as it moves through space. The higher the value, the faster a body slows when moving through space.
    */
  var frictionAir: js.UndefOr[Double] = js.native
  /**
    * A `Number` that defines the static friction of the body (in the Coulomb friction model). A value of `0` means the body will never 'stick' when it is nearly stationary and only dynamic `friction` is used. The higher the value (e.g. `10`), the more force it will take to initially get the body moving when nearly stationary. This value is multiplied with the `friction` property to make it easier to change `friction` and maintain an appropriate amount of static friction.
    */
  var frictionStatic: js.UndefOr[Double] = js.native
  /**
    * A `Vector` that scales the influence of World gravity when applied to this body.
    */
  var gravityScale: js.UndefOr[Vector2Like] = js.native
  /**
    * A boolean that toggles if this body should ignore world gravity or not.
    */
  var ignoreGravity: js.UndefOr[Boolean] = js.native
  /**
    * A boolean that toggles if this body should ignore pointer / mouse constraints or not.
    */
  var ignorePointer: js.UndefOr[Boolean] = js.native
  /**
    * A `Number` that defines the inverse mass of the body (`1 / mass`). If you modify this value, you must also modify the `body.mass` property.
    */
  var inverseMass: js.UndefOr[Double] = js.native
  /**
    * A flag that indicates whether a body is a sensor. Sensor triggers collision events, but doesn't react with colliding body physically.
    */
  var isSensor: js.UndefOr[Boolean] = js.native
  /**
    * A flag that indicates whether a body is considered static. A static body can never change position or angle and is completely fixed.
    */
  var isStatic: js.UndefOr[Boolean] = js.native
  /**
    * An arbitrary string-based name to help identify this body.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * A `Number` that defines the mass of the body, although it may be more appropriate to specify the `density` property instead. If you modify this value, you must also modify the `body.inverseMass` property (`1 / mass`).
    */
  var mass: js.UndefOr[Double] = js.native
  /**
    * A callback that is invoked for the duration that this Body is colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideActiveCallback: js.UndefOr[js.Function] = js.native
  /**
    * A callback that is invoked when this Body starts colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideCallback: js.UndefOr[js.Function] = js.native
  /**
    * A callback that is invoked when this Body stops colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideEndCallback: js.UndefOr[js.Function] = js.native
  /**
    * A collision callback dictionary used by the `Body.setOnCollideWith` function.
    */
  var onCollideWith: js.UndefOr[js.Any] = js.native
  /**
    * An array of bodies that make up this body. The first body in the array must always be a self reference to the current body instance. All bodies in the `parts` array together form a single rigid compound body.
    */
  var parts: js.UndefOr[js.Array[BodyType]] = js.native
  /**
    * An object reserved for storing plugin-specific properties.
    */
  var plugin: js.UndefOr[js.Any] = js.native
  /**
    * A `Vector` that specifies the current world-space position of the body.
    */
  var position: js.UndefOr[Vector2Like] = js.native
  /**
    * The Debug Render configuration object for this body.
    */
  var render: js.UndefOr[MatterBodyRenderConfig] = js.native
  /**
    * A `Number` that defines the restitution (elasticity) of the body. The value is always positive and is in the range `(0, 1)`.
    */
  var restitution: js.UndefOr[Double] = js.native
  /**
    * A `Vector` that specifies the initial scale of the body.
    */
  var scale: js.UndefOr[Vector2Like] = js.native
  /**
    * A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping by the `Matter.Sleeping` module (if sleeping is enabled by the engine).
    */
  var sleepThreshold: js.UndefOr[Double] = js.native
  /**
    * A `Number` that specifies a tolerance on how far a body is allowed to 'sink' or rotate into other bodies. Avoid changing this value unless you understand the purpose of `slop` in physics engines. The default should generally suffice, although very large bodies may require larger values for stable stacking.
    */
  var slop: js.UndefOr[Double] = js.native
  /**
    * A `Number` that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    */
  var timeScale: js.UndefOr[Double] = js.native
  /**
    * A `Number` that specifies the torque (turning force) to apply in the current step. It is zeroed after every `Body.update`.
    */
  var torque: js.UndefOr[Double] = js.native
  /**
    * An array of `Vector` objects that specify the convex hull of the rigid body. These should be provided about the origin `(0, 0)`.
    */
  var vertices: js.UndefOr[js.Array[Vector2Like]] = js.native
}

object MatterBodyConfig {
  @scala.inline
  def apply(): MatterBodyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterBodyConfig]
  }
  @scala.inline
  implicit class MatterBodyConfigOps[Self <: MatterBodyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withChamfer(value: Double | js.Array[Double] | MatterChamferConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChamfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamfer")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionFilter(value: MatterCollisionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(js.undefined)
        ret
    }
    @scala.inline
    def withFrictionAir(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionAir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionAir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionAir")(js.undefined)
        ret
    }
    @scala.inline
    def withFrictionStatic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withGravityScale(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravityScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityScale")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreGravity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreGravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreGravity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreGravity")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePointer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePointer")(js.undefined)
        ret
    }
    @scala.inline
    def withInverseMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseMass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverseMass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseMass")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSensor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSensor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSensor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
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
    def withOnCollideActiveCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollideActiveCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCollideActiveCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollideActiveCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollideCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollideCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCollideCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollideCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollideEndCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollideEndCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCollideEndCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollideEndCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollideWith(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollideWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCollideWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollideWith")(js.undefined)
        ret
    }
    @scala.inline
    def withParts(value: js.Array[BodyType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: MatterBodyRenderConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestitution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSleepThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSleepThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slop")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScale")(js.undefined)
        ret
    }
    @scala.inline
    def withTorque(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torque")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTorque: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torque")(js.undefined)
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[Vector2Like]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(js.undefined)
        ret
    }
  }
  
}

