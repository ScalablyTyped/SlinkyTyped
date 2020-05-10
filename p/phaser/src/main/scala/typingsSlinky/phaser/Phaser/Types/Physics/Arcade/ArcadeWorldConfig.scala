package typingsSlinky.phaser.Phaser.Types.Physics.Arcade

import typingsSlinky.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcadeWorldConfig extends js.Object {
  /**
    * Sets {@link Phaser.Physics.Arcade.World#checkCollision}.
    */
  var checkCollision: js.UndefOr[CheckCollisionObject] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#debug}.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugBodyColor}.
    */
  var debugBodyColor: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowBody}.
    */
  var debugShowBody: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
    */
  var debugShowStaticBody: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
    */
  var debugShowVelocity: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugStaticBodyColor}.
    */
  var debugStaticBodyColor: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugVelocityColor}.
    */
  var debugVelocityColor: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#forceX}.
    */
  var forceX: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#fps}.
    */
  var fps: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#gravity}.
    */
  var gravity: js.UndefOr[Vector2Like] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.height}.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#isPaused}.
    */
  var isPaused: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#maxEntries}.
    */
  var maxEntries: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#OVERLAP_BIAS}.
    */
  var overlapBias: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#TILE_BIAS}.
    */
  var tileBias: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#timeScale}.
    */
  var timeScale: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#useTree}.
    */
  var useTree: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.width}.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.x}.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.y}.
    */
  var y: js.UndefOr[Double] = js.native
}

object ArcadeWorldConfig {
  @scala.inline
  def apply(): ArcadeWorldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcadeWorldConfig]
  }
  @scala.inline
  implicit class ArcadeWorldConfigOps[Self <: ArcadeWorldConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckCollision(value: CheckCollisionObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCollision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCollision")(js.undefined)
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
    def withDebugShowStaticBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowStaticBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowStaticBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowStaticBody")(js.undefined)
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
    def withDebugStaticBodyColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugStaticBodyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugStaticBodyColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugStaticBodyColor")(js.undefined)
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
    def withForceX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceX")(js.undefined)
        ret
    }
    @scala.inline
    def withFps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(js.undefined)
        ret
    }
    @scala.inline
    def withGravity(value: Vector2Like): Self = {
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlapBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlapBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapBias")(js.undefined)
        ret
    }
    @scala.inline
    def withTileBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileBias")(js.undefined)
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
    def withUseTree(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTree")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

