package typingsSlinky.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEngineDefinition extends js.Object {
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @property constraintIterations
    * @type number
    * @default 2
    */
  var constraintIterations: js.UndefOr[Double] = js.native
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @property enableSleeping
    * @type boolean
    * @default false
    */
  var enableSleeping: js.UndefOr[Boolean] = js.native
  /**
    * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
    *
    * @property broadphase
    * @type grid
    * @default a Matter.Grid instance
    */
  var grid: js.UndefOr[Grid] = js.native
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property positionIterations
    * @type number
    * @default 6
    */
  var positionIterations: js.UndefOr[Double] = js.native
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    * @property timing
    * @type object
    */
  var timing: js.UndefOr[IEngineTimingOptions] = js.native
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @property velocityIterations
    * @type number
    * @default 4
    */
  var velocityIterations: js.UndefOr[Double] = js.native
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @property world
    * @type world
    * @default a Matter.World instance
    */
  var world: js.UndefOr[World] = js.native
}

object IEngineDefinition {
  @scala.inline
  def apply(): IEngineDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEngineDefinition]
  }
  @scala.inline
  implicit class IEngineDefinitionOps[Self <: IEngineDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraintIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintIterations")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSleeping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSleeping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSleeping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSleeping")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionIterations")(js.undefined)
        ret
    }
    @scala.inline
    def withTiming(value: IEngineTimingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityIterations")(js.undefined)
        ret
    }
    @scala.inline
    def withWorld(value: World): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("world")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("world")(js.undefined)
        ret
    }
  }
  
}

