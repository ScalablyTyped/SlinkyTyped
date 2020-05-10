package typingsSlinky.phaser.Phaser.Types.Physics.Impact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorldConfig extends js.Object {
  /**
    * The default bounce, or restitution, of bodies in the world.
    */
  var bounciness: js.UndefOr[Double] = js.native
  /**
    * The size of the cells used for the broadphase pass. Increase this value if you have lots of large objects in the world.
    */
  var cellSize: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Impact.World#debug}.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * The color of this Body on the debug display.
    */
  var debugBodyColor: js.UndefOr[Double] = js.native
  /**
    * Whether the Body's boundary is drawn to the debug display.
    */
  var debugShowBody: js.UndefOr[Boolean] = js.native
  /**
    * Whether the Body's velocity is drawn to the debug display.
    */
  var debugShowVelocity: js.UndefOr[Boolean] = js.native
  /**
    * The color of the Body's velocity on the debug display.
    */
  var debugVelocityColor: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Impact.World#gravity}
    */
  var gravity: js.UndefOr[Double] = js.native
  /**
    * Gravity multiplier. Set to 0 for no gravity.
    */
  var gravityFactor: js.UndefOr[Double] = js.native
  /**
    * [description]
    */
  var maxStep: js.UndefOr[Double] = js.native
  /**
    * The maximum velocity a body can move.
    */
  var maxVelocity: js.UndefOr[Double] = js.native
  /**
    * Maximum X velocity objects can move.
    */
  var maxVelocityX: js.UndefOr[Double] = js.native
  /**
    * Maximum Y velocity objects can move.
    */
  var maxVelocityY: js.UndefOr[Double] = js.native
  /**
    * The minimum velocity an object can be moving at to be considered for bounce.
    */
  var minBounceVelocity: js.UndefOr[Double] = js.native
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
    * A number that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    */
  var timeScale: js.UndefOr[Double] = js.native
}

object WorldConfig {
  @scala.inline
  def apply(): WorldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldConfig]
  }
  @scala.inline
  implicit class WorldConfigOps[Self <: WorldConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounciness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounciness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounciness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounciness")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
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
    def withDebugBodyColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugBodyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugBodyColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugBodyColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugShowBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowBody")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugShowVelocity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugVelocityColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugVelocityColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugVelocityColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugVelocityColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGravity(value: Double): Self = {
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
    def withGravityFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravityFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVelocityX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityX")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVelocityY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityY")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBounceVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBounceVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBounceVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBounceVelocity")(js.undefined)
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
  }
  
}

