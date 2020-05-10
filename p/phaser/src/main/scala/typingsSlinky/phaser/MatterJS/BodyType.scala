package typingsSlinky.phaser.MatterJS

import typingsSlinky.phaser.Phaser.Types.Physics.Matter.MatterBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyType extends MatterBody {
  /**
    * Holds the original friction, mass, etc values from when this Body was made static.
    *
    * @property _original
    * @type any
    */
  var _original: js.Any = js.native
  /**
    * A `Number` specifying the angle of the body, in radians.
    *
    * @property angle
    * @type number
    * @default 0
    */
  var angle: Double = js.native
  /**
    * The previous angle.
    *
    * @property anglePrev
    * @type number
    * @default 0
    */
  var anglePrev: Double = js.native
  /**
    * A `Number` that _measures_ the current angular speed of the body after the last `Body.update`. It is read-only and always positive (it's the magnitude of `body.angularVelocity`).
    *
    * @readOnly
    * @property angularSpeed
    * @type number
    * @default 0
    */
  var angularSpeed: Double = js.native
  /**
    * A `Number` that _measures_ the current angular velocity of the body after the last `Body.update`. It is read-only.
    * If you need to modify a body's angular velocity directly, you should apply a torque or simply change the body's `angle` (as the engine uses position-Verlet integration).
    *
    * @readOnly
    * @property angularVelocity
    * @type number
    * @default 0
    */
  var angularVelocity: Double = js.native
  /**
    * A `Number` that _measures_ the area of the body's convex hull, calculated at creation by `Body.create`.
    *
    * @property area
    * @type number
    * @default
    */
  var area: Double = js.native
  /**
    * An array of unique axis vectors (edge normals) used for collision detection.
    * These are automatically calculated from the given convex hull (`vertices` array) in `Body.create`.
    * They are constantly updated by `Body.update` during the simulation.
    *
    * @property axes
    * @type vector[]
    */
  var axes: js.UndefOr[js.Array[Vector]] = js.native
  /**
    * A `Bounds` object that defines the AABB region for the body.
    * It is automatically calculated from the given convex hull (`vertices` array) in `Body.create` and constantly updated by `Body.update` during simulation.
    *
    * @property bounds
    * @type bounds
    */
  var bounds: IBound = js.native
  /**
    * The center of mass of the Body.
    *
    * @property centerOfMass
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var centerOfMass: Vector = js.native
  /**
    * The center of the body in pixel values.
    * Used by Phaser for texture aligment.
    *
    * @property centerOffset
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var centerOffset: Vector = js.native
  /**
    * A Chamfer object, if this Body has them.
    *
    * @property chamfer
    * @type any
    */
  var chamfer: js.UndefOr[IChamfer] = js.native
  /**
    * The radius of this Body, if it's a circle.
    *
    * @property circleRadius
    * @type number
    * @default 0
    */
  var circleRadius: Double = js.native
  /**
    * An `Object` that specifies the collision filtering properties of this body.
    *
    * Collisions between two bodies will obey the following rules:
    * - If the two bodies have the same non-zero value of `collisionFilter.group`,
    *   they will always collide if the value is positive, and they will never collide
    *   if the value is negative.
    * - If the two bodies have different values of `collisionFilter.group` or if one
    *   (or both) of the bodies has a value of 0, then the category/mask rules apply as follows:
    *
    * Each body belongs to a collision category, given by `collisionFilter.category`. This
    * value is used as a bit field and the category should have only one bit set, meaning that
    * the value of this property is a power of two in the range [1, 2^31]. Thus, there are 32
    * different collision categories available.
    *
    * Each body also defines a collision bitmask, given by `collisionFilter.mask` which specifies
    * the categories it collides with (the value is the bitwise AND value of all these categories).
    *
    * Using the category/mask rules, two bodies `A` and `B` collide if each includes the other's
    * category in its mask, i.e. `(categoryA & maskB) !== 0` and `(categoryB & maskA) !== 0`
    * are both true.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: ICollisionFilter = js.native
  /**
    * A `Vector` that specifies the constraint impulse.
    *
    * @property constraintImpulse
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var constraintImpulse: Vector = js.native
  /**
    * A `Number` that defines the density of the body, that is its mass per unit area.
    * If you pass the density via `Body.create` the `mass` property is automatically calculated for you based on the size (area) of the object.
    * This is generally preferable to simply setting mass and allows for more intuitive definition of materials (e.g. rock has a higher density than wood).
    *
    * @property density
    * @type number
    * @default 0.001
    */
  var density: Double = js.native
  /**
    * Holds Body event handlers.
    *
    * @property events
    * @type any
    */
  var events: js.UndefOr[js.Any] = js.native
  /**
    * A `Vector` that specifies the force to apply in the current step. It is zeroed after every `Body.update`. See also `Body.applyForce`.
    *
    * @property force
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var force: Vector = js.native
  /**
    * A `Number` that defines the friction of the body. The value is always positive and is in the range `(0, 1)`.
    * A value of `0` means that the body may slide indefinitely.
    * A value of `1` means the body may come to a stop almost instantly after a force is applied.
    *
    * The effects of the value may be non-linear.
    * High values may be unstable depending on the body.
    * The engine uses a Coulomb friction model including static and kinetic friction.
    * Note that collision response is based on _pairs_ of bodies, and that `friction` values are _combined_ with the following formula:
    *
    *     Math.min(bodyA.friction, bodyB.friction)
    *
    * @property friction
    * @type number
    * @default 0.1
    */
  var friction: Double = js.native
  /**
    * A `Number` that defines the air friction of the body (air resistance).
    * A value of `0` means the body will never slow as it moves through space.
    * The higher the value, the faster a body slows when moving through space.
    * The effects of the value are non-linear.
    *
    * @property frictionAir
    * @type number
    * @default 0.01
    */
  var frictionAir: Double = js.native
  /**
    * A `Number` that defines the static friction of the body (in the Coulomb friction model).
    * A value of `0` means the body will never 'stick' when it is nearly stationary and only dynamic `friction` is used.
    * The higher the value (e.g. `10`), the more force it will take to initially get the body moving when nearly stationary.
    * This value is multiplied with the `friction` property to make it easier to change `friction` and maintain an appropriate amount of static friction.
    *
    * @property frictionStatic
    * @type number
    * @default 0.5
    */
  var frictionStatic: Double = js.native
  /**
    * A reference to the Phaser Game Object this body belongs to, if any.
    *
    * @property gameObject
    * @type Phaser.GameObjects.GameObject
    */
  var gameObject: js.UndefOr[js.Any] = js.native
  /**
    * Scale the influence of World gravity when applied to this body.
    *
    * @property gravityScale
    * @type vector
    * @default { x: 1, y: 1 }
    */
  var gravityScale: Vector = js.native
  /**
    * An integer `Number` uniquely identifying number generated in `Body.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: Double = js.native
  /**
    * Will this Body ignore World gravity during the Engine update?
    *
    * @property ignoreGravity
    * @type boolean
    * @default false
    */
  var ignoreGravity: Boolean = js.native
  /**
    * Will this Body ignore Phaser Pointer input events?
    *
    * @property ignorePointer
    * @type boolean
    * @default false
    */
  var ignorePointer: Boolean = js.native
  /**
    * A `Number` that defines the moment of inertia (i.e. second moment of area) of the body.
    * It is automatically calculated from the given convex hull (`vertices` array) and density in `Body.create`.
    * If you modify this value, you must also modify the `body.inverseInertia` property (`1 / inertia`).
    *
    * @property inertia
    * @type number
    */
  var inertia: Double = js.native
  /**
    * A `Number` that defines the inverse moment of inertia of the body (`1 / inertia`).
    * If you modify this value, you must also modify the `body.inertia` property.
    *
    * @property inverseInertia
    * @type number
    */
  var inverseInertia: Double = js.native
  /**
    * A `Number` that defines the inverse mass of the body (`1 / mass`).
    * If you modify this value, you must also modify the `body.mass` property.
    *
    * @property inverseMass
    * @type number
    */
  var inverseMass: Double = js.native
  /**
    * A flag that indicates whether a body is a sensor. Sensor triggers collision events, but doesn't react with colliding body physically.
    *
    * @property isSensor
    * @type boolean
    * @default false
    */
  var isSensor: Boolean = js.native
  /**
    * A flag that indicates whether the body is considered sleeping. A sleeping body acts similar to a static body, except it is only temporary and can be awoken.
    * If you need to set a body as sleeping, you should use `Sleeping.set` as this requires more than just setting this flag.
    *
    * @property isSleeping
    * @type boolean
    * @default false
    */
  var isSleeping: Boolean = js.native
  /**
    * A flag that indicates whether a body is considered static. A static body can never change position or angle and is completely fixed.
    * If you need to set a body as static after its creation, you should use `Body.setStatic` as this requires more than just setting this flag.
    *
    * @property isStatic
    * @type boolean
    * @default false
    */
  var isStatic: Boolean = js.native
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type string
    * @default "Body"
    */
  var label: String = js.native
  /**
    * A `Number` that defines the mass of the body, although it may be more appropriate to specify the `density` property instead.
    * If you modify this value, you must also modify the `body.inverseMass` property (`1 / mass`).
    *
    * @property mass
    * @type number
    */
  var mass: Double = js.native
  /**
    * A `Number` that _measures_ the amount of movement a body currently has (a combination of `speed` and `angularSpeed`). It is read-only and always positive.
    * It is used and updated by the `Matter.Sleeping` module during simulation to decide if a body has come to rest.
    *
    * @readOnly
    * @property motion
    * @type number
    * @default 0
    */
  var motion: Double = js.native
  /**
    * A callback that is invoked for the duration that this Body is colliding with any other Body.
    * 
    * You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    *
    * @property onCollideActiveCallback
    * @type function
    * @default null
    */
  var onCollideActiveCallback: js.UndefOr[js.Function] = js.native
  /**
    * A callback that is invoked when this Body starts colliding with any other Body.
    * 
    * You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    *
    * @property onCollideCallback
    * @type function
    * @default null
    */
  var onCollideCallback: js.UndefOr[js.Function] = js.native
  /**
    * A callback that is invoked when this Body stops colliding with any other Body.
    * 
    * You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    *
    * @property onCollideEndCallback
    * @type function
    * @default null
    */
  var onCollideEndCallback: js.UndefOr[js.Function] = js.native
  /**
    * A collision callback dictionary used by the `Body.setOnCollideWith` function.
    *
    * @property onCollideWith
    * @type object
    * @default null
    */
  var onCollideWith: js.UndefOr[js.Any] = js.native
  /**
    * A self reference if the body is _not_ a part of another body.
    * Otherwise this is a reference to the body that this is a part of.
    * See `body.parts`.
    *
    * @property parent
    * @type body
    */
  var parent: BodyType = js.native
  /**
    * An array of bodies that make up this body. 
    * The first body in the array must always be a self reference to the current body instance.
    * All bodies in the `parts` array together form a single rigid compound body.
    * Parts are allowed to overlap, have gaps or holes or even form concave bodies.
    * Parts themselves should never be added to a `World`, only the parent body should be.
    * Use `Body.setParts` when setting parts to ensure correct updates of all properties.
    *
    * @property parts
    * @type body[]
    */
  var parts: js.Array[BodyType] = js.native
  /**
    * An object reserved for storing plugin-specific properties.
    *
    * @property plugin
    * @type {}
    */
  var plugin: js.Any = js.native
  /**
    * A `Vector` that specifies the current world-space position of the body.
    *
    * @property position
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var position: Vector = js.native
  /**
    * A `Vector` that specifies the position impulse.
    *
    * @property positionImpulse
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var positionImpulse: Vector = js.native
  /**
    * A `Vector` that specifies the previous position.
    *
    * @property positionPrev
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var positionPrev: Vector = js.native
  /**
    * A `Vector` that specifies the previous position impulse.
    *
    * @property previousPositionImpulse
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var previousPositionImpulse: Vector = js.native
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type object
    */
  var render: IBodyRenderOptions = js.native
  /**
    * A `Number` that defines the restitution (elasticity) of the body. The value is always positive and is in the range `(0, 1)`.
    * A value of `0` means collisions may be perfectly inelastic and no bouncing may occur.
    * A value of `0.8` means the body may bounce back with approximately 80% of its kinetic energy.
    * Note that collision response is based on _pairs_ of bodies, and that `restitution` values are _combined_ with the following formula:
    *
    *     Math.max(bodyA.restitution, bodyB.restitution)
    *
    * @property restitution
    * @type number
    * @default 0
    */
  var restitution: Double = js.native
  /**
    * The scale of the Body.
    *
    * @property scale
    * @readonly
    * @type vector
    * @default { x: 1, y: 1 }
    */
  var scale: Vector = js.native
  /**
    * A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping by the `Matter.Sleeping` module (if sleeping is enabled by the engine).
    *
    * @property sleepThreshold
    * @type number
    * @default 60
    */
  var sleepThreshold: Double = js.native
  /**
    * A `Number` that specifies a tolerance on how far a body is allowed to 'sink' or rotate into other bodies.
    * Avoid changing this value unless you understand the purpose of `slop` in physics engines.
    * The default should generally suffice, although very large bodies may require larger values for stable stacking.
    *
    * @property slop
    * @type number
    * @default 0.05
    */
  var slop: Double = js.native
  /**
    * A `Number` that _measures_ the current speed of the body after the last `Body.update`. It is read-only and always positive (it's the magnitude of `body.velocity`).
    *
    * @readOnly
    * @property speed
    * @type number
    * @default 0
    */
  var speed: Double = js.native
  /**
    * A `Number` that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    *
    * @property timeScale
    * @type number
    * @default 1
    */
  var timeScale: Double = js.native
  /**
    * A `Number` that specifies the torque (turning force) to apply in the current step. It is zeroed after every `Body.update`.
    *
    * @property torque
    * @type number
    * @default 0
    */
  var torque: Double = js.native
  /**
    * The total number of contacts.
    *
    * @property totalContacts
    * @type number
    * @default 0
    */
  var totalContacts: Double = js.native
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "body"
    * @readOnly
    */
  var `type`: String = js.native
  /**
    * A `Vector` that _measures_ the current velocity of the body after the last `Body.update`. It is read-only.
    * If you need to modify a body's velocity directly, you should either apply a force or simply change the body's `position` (as the engine uses position-Verlet integration).
    *
    * @readOnly
    * @property velocity
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var velocity: Vector = js.native
  /**
    * An array of `Vector` objects that specify the convex hull of the rigid body.
    * These should be provided about the origin `(0, 0)`. E.g.
    *
    *     [{ x: 0, y: 0 }, { x: 25, y: 50 }, { x: 50, y: 0 }]
    *
    * When passed via `Body.create`, the vertices are translated relative to `body.position` (i.e. world-space, and constantly updated by `Body.update` during simulation).
    * The `Vector` objects are also augmented with additional properties required for efficient collision detection. 
    *
    * Other properties such as `inertia` and `bounds` are automatically calculated from the passed vertices (unless provided via `options`).
    * Concave hulls are not currently supported. The module `Matter.Vertices` contains useful methods for working with vertices.
    *
    * @property vertices
    * @type vector[]
    */
  var vertices: js.UndefOr[js.Array[Vector]] = js.native
  /**
    * Sets the onCollideWith callback.
    *
    * @property setOnCollideWith
    * @type Function
    */
  def setOnCollideWith(body: BodyType, callback: js.Function): BodyType = js.native
}

object BodyType {
  @scala.inline
  def apply(
    _original: js.Any,
    angle: Double,
    anglePrev: Double,
    angularSpeed: Double,
    angularVelocity: Double,
    area: Double,
    bounds: IBound,
    centerOfMass: Vector,
    centerOffset: Vector,
    circleRadius: Double,
    collisionFilter: ICollisionFilter,
    constraintImpulse: Vector,
    density: Double,
    force: Vector,
    friction: Double,
    frictionAir: Double,
    frictionStatic: Double,
    gravityScale: Vector,
    id: Double,
    ignoreGravity: Boolean,
    ignorePointer: Boolean,
    inertia: Double,
    inverseInertia: Double,
    inverseMass: Double,
    isSensor: Boolean,
    isSleeping: Boolean,
    isStatic: Boolean,
    label: String,
    mass: Double,
    motion: Double,
    parent: BodyType,
    parts: js.Array[BodyType],
    plugin: js.Any,
    position: Vector,
    positionImpulse: Vector,
    positionPrev: Vector,
    previousPositionImpulse: Vector,
    render: IBodyRenderOptions,
    restitution: Double,
    scale: Vector,
    setOnCollideWith: (BodyType, js.Function) => BodyType,
    sleepThreshold: Double,
    slop: Double,
    speed: Double,
    timeScale: Double,
    torque: Double,
    totalContacts: Double,
    `type`: String,
    velocity: Vector
  ): BodyType = {
    val __obj = js.Dynamic.literal(_original = _original.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], anglePrev = anglePrev.asInstanceOf[js.Any], angularSpeed = angularSpeed.asInstanceOf[js.Any], angularVelocity = angularVelocity.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], centerOfMass = centerOfMass.asInstanceOf[js.Any], centerOffset = centerOffset.asInstanceOf[js.Any], circleRadius = circleRadius.asInstanceOf[js.Any], collisionFilter = collisionFilter.asInstanceOf[js.Any], constraintImpulse = constraintImpulse.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionAir = frictionAir.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], gravityScale = gravityScale.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ignoreGravity = ignoreGravity.asInstanceOf[js.Any], ignorePointer = ignorePointer.asInstanceOf[js.Any], inertia = inertia.asInstanceOf[js.Any], inverseInertia = inverseInertia.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], isSleeping = isSleeping.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionImpulse = positionImpulse.asInstanceOf[js.Any], positionPrev = positionPrev.asInstanceOf[js.Any], previousPositionImpulse = previousPositionImpulse.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setOnCollideWith = js.Any.fromFunction2(setOnCollideWith), sleepThreshold = sleepThreshold.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timeScale = timeScale.asInstanceOf[js.Any], torque = torque.asInstanceOf[js.Any], totalContacts = totalContacts.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyType]
  }
  @scala.inline
  implicit class BodyTypeOps[Self <: BodyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_original(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnglePrev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anglePrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: IBound): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterOfMass(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerOfMass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterOffset(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircleRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollisionFilter(value: ICollisionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraintImpulse(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintImpulse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForce(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrictionAir(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionAir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrictionStatic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGravityScale(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreGravity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreGravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnorePointer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInertia(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseInertia(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseInertia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseMass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSensor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSleeping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSleeping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: BodyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParts(value: js.Array[BodyType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionImpulse(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionImpulse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionPrev(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousPositionImpulse(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPositionImpulse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: IBodyRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetOnCollideWith(value: (BodyType, js.Function) => BodyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnCollideWith")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSleepThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTorque(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torque")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalContacts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalContacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocity(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxes(value: js.Array[Vector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withChamfer(value: IChamfer): Self = {
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
    def withEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withGameObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameObject")(js.undefined)
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
    def withVertices(value: js.Array[Vector]): Self = {
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

