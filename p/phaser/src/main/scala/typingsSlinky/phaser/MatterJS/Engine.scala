package typingsSlinky.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Engine` module contains methods for creating and manipulating engines.
  * An engine is a controller that manages updating the simulation of the world.
  * See `Matter.Runner` for an optional game loop utility.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Engine
  */
@js.native
trait Engine extends js.Object {
  /**
    * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
    *
    * @property broadphase
    * @type grid
    * @default a Matter.Grid instance
    */
  var broadphase: Grid = js.native
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @property constraintIterations
    * @type number
    * @default 2
    */
  var constraintIterations: Double = js.native
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @property enableSleeping
    * @type boolean
    * @default false
    */
  var enableSleeping: Boolean = js.native
  /**
    * A flag that specifies whether the engine is running or not.
    */
  var enabled: Boolean = js.native
  /**
    * Collision pair set for this `Engine`.
    */
  var pairs: js.Any = js.native
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property positionIterations
    * @type number
    * @default 6
    */
  var positionIterations: Double = js.native
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    * @property timing
    * @type object
    */
  var timing: IEngineTimingOptions = js.native
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property velocityIterations
    * @type number
    * @default 4
    */
  var velocityIterations: Double = js.native
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @property world
    * @type world
    * @default a Matter.World instance
    */
  var world: World = js.native
}

object Engine {
  @scala.inline
  def apply(
    broadphase: Grid,
    constraintIterations: Double,
    enableSleeping: Boolean,
    enabled: Boolean,
    pairs: js.Any,
    positionIterations: Double,
    timing: IEngineTimingOptions,
    velocityIterations: Double,
    world: World
  ): Engine = {
    val __obj = js.Dynamic.literal(broadphase = broadphase.asInstanceOf[js.Any], constraintIterations = constraintIterations.asInstanceOf[js.Any], enableSleeping = enableSleeping.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], positionIterations = positionIterations.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], velocityIterations = velocityIterations.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadphase(value: Grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadphase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraintIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSleeping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSleeping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPairs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiming(value: IEngineTimingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocityIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorld(value: World): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("world")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

