package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import typingsSlinky.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterWorldConfig extends js.Object {
  /**
    * Automatically call Engine.update every time the game steps.
    */
  var autoUpdate: js.UndefOr[Boolean] = js.native
  /**
    * The number of constraint iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var constraintIterations: js.UndefOr[Double] = js.native
  /**
    * An optional Number that specifies the time correction factor to apply to the update.
    */
  var correction: js.UndefOr[Double] = js.native
  /**
    * Controls the Matter Debug Rendering options. If a boolean it will use the default values, otherwise, specify a Debug Config object.
    */
  var debug: js.UndefOr[Boolean | MatterDebugConfig] = js.native
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module. Sleeping can improve stability and performance, but often at the expense of accuracy.
    */
  var enableSleeping: js.UndefOr[Boolean] = js.native
  /**
    * Toggles if the world is enabled or not.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Sets the Resolver friction normal multiplier property.
    */
  var frictionNormalMultiplier: js.UndefOr[Double] = js.native
  /**
    * This function is called every time the core game loop steps, which is bound to the Request Animation Frame frequency unless otherwise modified.
    */
  var getDelta: js.UndefOr[js.Function] = js.native
  /**
    * Sets {@link Phaser.Physics.Matter.World#gravity}. If `false` Gravity will be set to zero.
    */
  var gravity: js.UndefOr[Vector2Like | Boolean] = js.native
  /**
    * Should the Matter Attractor Plugin be enabled? An attractors plugin that makes it easy to apply continual forces on bodies. It's possible to simulate effects such as wind, gravity and magnetism.
    */
  @JSName("plugins.attractors")
  var pluginsDotattractors: js.UndefOr[Boolean] = js.native
  /**
    * Should the Matter Collision Events Plugin be enabled?
    */
  @JSName("plugins.collisionevents")
  var pluginsDotcollisionevents: js.UndefOr[Boolean] = js.native
  /**
    * Should the Matter Wrap Plugin be enabled? A coordinate wrapping plugin that automatically wraps the position of bodies such that they always stay within the given bounds. Upon crossing a boundary the body will appear on the opposite side of the bounds, while maintaining its velocity.
    */
  @JSName("plugins.wrap")
  var pluginsDotwrap: js.UndefOr[Boolean] = js.native
  /**
    * Sets the Resolver position dampen property.
    */
  var positionDampen: js.UndefOr[Double] = js.native
  /**
    * The number of position iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var positionIterations: js.UndefOr[Double] = js.native
  /**
    * Sets the Resolver position warming property.
    */
  var positionWarming: js.UndefOr[Double] = js.native
  /**
    * Sets the Resolver resting threshold property.
    */
  var restingThresh: js.UndefOr[Double] = js.native
  /**
    * Sets the Resolver resting threshold tangent property.
    */
  var restingThreshTangent: js.UndefOr[Double] = js.native
  /**
    * Sets the Matter Runner options.
    */
  var runner: js.UndefOr[MatterRunnerConfig] = js.native
  /**
    * Should the world have bounds enabled by default?
    */
  var setBounds: js.UndefOr[js.Object | Boolean] = js.native
  /**
    * Should the bottom world bounds wall be created?
    */
  @JSName("setBounds.bottom")
  var setBoundsDotbottom: js.UndefOr[Boolean] = js.native
  /**
    * The height of the world bounds.
    */
  @JSName("setBounds.height")
  var setBoundsDotheight: js.UndefOr[Double] = js.native
  /**
    * Should the left-side world bounds wall be created?
    */
  @JSName("setBounds.left")
  var setBoundsDotleft: js.UndefOr[Boolean] = js.native
  /**
    * Should the right-side world bounds wall be created?
    */
  @JSName("setBounds.right")
  var setBoundsDotright: js.UndefOr[Boolean] = js.native
  /**
    * The thickness of the walls of the world bounds.
    */
  @JSName("setBounds.thickness")
  var setBoundsDotthickness: js.UndefOr[Double] = js.native
  /**
    * Should the top world bounds wall be created?
    */
  @JSName("setBounds.top")
  var setBoundsDottop: js.UndefOr[Boolean] = js.native
  /**
    * The width of the world bounds.
    */
  @JSName("setBounds.width")
  var setBoundsDotwidth: js.UndefOr[Double] = js.native
  /**
    * The x coordinate of the world bounds.
    */
  @JSName("setBounds.x")
  var setBoundsDotx: js.UndefOr[Double] = js.native
  /**
    * The y coordinate of the world bounds.
    */
  @JSName("setBounds.y")
  var setBoundsDoty: js.UndefOr[Double] = js.native
  /**
    * A `Number` that specifies the global scaling factor of time for all bodies. A value of `0` freezes the simulation. A value of `0.1` gives a slow-motion effect. A value of `1.2` gives a speed-up effect.
    */
  @JSName("timing.timeScale")
  var timingDottimeScale: js.UndefOr[Double] = js.native
  /**
    * A `Number` that specifies the current simulation-time in milliseconds starting from `0`. It is incremented on every `Engine.update` by the given `delta` argument.
    */
  @JSName("timing.timestamp")
  var timingDottimestamp: js.UndefOr[Double] = js.native
  /**
    * The number of velocity iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var velocityIterations: js.UndefOr[Double] = js.native
}

object MatterWorldConfig {
  @scala.inline
  def apply(): MatterWorldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterWorldConfig]
  }
  @scala.inline
  implicit class MatterWorldConfigOps[Self <: MatterWorldConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdate")(js.undefined)
        ret
    }
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
    def withCorrection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correction")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean | MatterDebugConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
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
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFrictionNormalMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionNormalMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionNormalMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionNormalMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDelta(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withGravity(value: Vector2Like | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginsDotattractors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins.attractors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginsDotattractors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins.attractors")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginsDotcollisionevents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins.collisionevents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginsDotcollisionevents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins.collisionevents")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginsDotwrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins.wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginsDotwrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins.wrap")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionDampen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionDampen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionDampen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionDampen")(js.undefined)
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
    def withPositionWarming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionWarming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionWarming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionWarming")(js.undefined)
        ret
    }
    @scala.inline
    def withRestingThresh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restingThresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestingThresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restingThresh")(js.undefined)
        ret
    }
    @scala.inline
    def withRestingThreshTangent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restingThreshTangent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestingThreshTangent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restingThreshTangent")(js.undefined)
        ret
    }
    @scala.inline
    def withRunner(value: MatterRunnerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runner")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBounds(value: js.Object | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoundsDotbottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBoundsDotbottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoundsDotheight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBoundsDotheight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.height")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoundsDotleft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBoundsDotleft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.left")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoundsDotright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBoundsDotright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.right")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoundsDotthickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBoundsDotthickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.thickness")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoundsDottop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBoundsDottop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.top")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoundsDotwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBoundsDotwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.width")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoundsDotx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBoundsDotx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.x")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoundsDoty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBoundsDoty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds.y")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingDottimeScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing.timeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingDottimeScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing.timeScale")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingDottimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing.timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingDottimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing.timestamp")(js.undefined)
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
  }
  
}

