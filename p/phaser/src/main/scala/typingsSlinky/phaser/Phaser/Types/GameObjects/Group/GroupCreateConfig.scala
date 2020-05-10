package typingsSlinky.phaser.Phaser.Types.GameObjects.Group

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.Phaser.Types.Actions.GridAlignConfig
import typingsSlinky.phaser.Phaser.Types.Input.HitAreaCallback
import typingsSlinky.phaser.integer
import typingsSlinky.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The total number of objects created will be
  * 
  *     key.length * frame.length * frameQuantity * (yoyo ? 2 : 1) * (1 + repeat)
  * 
  * If `max` is nonzero, then the total created will not exceed `max`.
  * 
  * `key` is required. {@link Phaser.GameObjects.Group#defaultKey} is not used.
  */
@js.native
trait GroupCreateConfig extends js.Object {
  /**
    * The active state of each new Game Object.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * The class of each new Game Object.
    */
  var classType: js.UndefOr[js.Function] = js.native
  /**
    * The texture frame of each new Game Object.
    */
  var frame: js.UndefOr[String | (js.Array[String | integer]) | integer] = js.native
  /**
    * The number of times each `frame` should be combined with one `key`.
    */
  var frameQuantity: js.UndefOr[integer] = js.native
  /**
    * Align the new Game Objects in a grid using these settings.
    */
  var gridAlign: js.UndefOr[`false` | GridAlignConfig] = js.native
  /**
    * A geometric shape that defines the hit area for the Game Object.
    */
  var hitArea: js.UndefOr[js.Any] = js.native
  /**
    * A callback to be invoked when the Game Object is interacted with.
    */
  var hitAreaCallback: js.UndefOr[HitAreaCallback] = js.native
  /**
    * The texture key of each new Game Object.
    */
  var key: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The maximum number of new Game Objects to create. 0 is no maximum.
    */
  var max: js.UndefOr[integer] = js.native
  /**
    * The number of Game Objects to create. If set, this overrides the `frameQuantity` value. Use `frameQuantity` for more advanced control.
    */
  var quantity: js.UndefOr[integer] = js.native
  /**
    * Select a `frame` at random.
    */
  var randomFrame: js.UndefOr[Boolean] = js.native
  /**
    * Select a `key` at random.
    */
  var randomKey: js.UndefOr[Boolean] = js.native
  /**
    * The number of times each `key` × `frame` combination will be *repeated* (after the first combination).
    */
  var repeat: js.UndefOr[integer] = js.native
  var setAlpha: js.UndefOr[js.Object] = js.native
  /**
    * Increment each Game Object's alpha from the previous by this amount, starting from `setAlpha.value`.
    */
  @JSName("setAlpha.step")
  var setAlphaDotstep: js.UndefOr[Double] = js.native
  /**
    * The alpha value of each new Game Object.
    */
  @JSName("setAlpha.value")
  var setAlphaDotvalue: js.UndefOr[Double] = js.native
  var setDepth: js.UndefOr[js.Object] = js.native
  /**
    * Increment each Game Object's depth from the previous by this amount, starting from `setDepth.value`.
    */
  @JSName("setDepth.step")
  var setDepthDotstep: js.UndefOr[Double] = js.native
  /**
    * The depth value of each new Game Object.
    */
  @JSName("setDepth.value")
  var setDepthDotvalue: js.UndefOr[Double] = js.native
  var setRotation: js.UndefOr[js.Object] = js.native
  /**
    * Increment each Game Object's rotation from the previous by this amount, starting at `setRotation.value`.
    */
  @JSName("setRotation.step")
  var setRotationDotstep: js.UndefOr[Double] = js.native
  /**
    * Rotation of each new Game Object.
    */
  @JSName("setRotation.value")
  var setRotationDotvalue: js.UndefOr[Double] = js.native
  var setScale: js.UndefOr[js.Object] = js.native
  /**
    * Increment each Game Object's horizontal scale from the previous by this amount, starting from `setScale.x`.
    */
  @JSName("setScale.stepX")
  var setScaleDotstepX: js.UndefOr[Double] = js.native
  /**
    * Increment each Game object's vertical scale from the previous by this amount, starting from `setScale.y`.
    */
  @JSName("setScale.stepY")
  var setScaleDotstepY: js.UndefOr[Double] = js.native
  /**
    * The horizontal scale of each new Game Object.
    */
  @JSName("setScale.x")
  var setScaleDotx: js.UndefOr[Double] = js.native
  /**
    * The vertical scale of each new Game Object.
    */
  @JSName("setScale.y")
  var setScaleDoty: js.UndefOr[Double] = js.native
  var setScrollFactor: js.UndefOr[js.Object] = js.native
  /**
    * Increment each Game Object's horizontal scroll factor from the previous by this amount, starting from `setScrollFactor.x`.
    */
  @JSName("setScrollFactor.stepX")
  var setScrollFactorDotstepX: js.UndefOr[Double] = js.native
  /**
    * Increment each Game object's vertical scroll factor from the previous by this amount, starting from `setScrollFactor.y`.
    */
  @JSName("setScrollFactor.stepY")
  var setScrollFactorDotstepY: js.UndefOr[Double] = js.native
  /**
    * The horizontal scroll factor of each new Game Object.
    */
  @JSName("setScrollFactor.x")
  var setScrollFactorDotx: js.UndefOr[Double] = js.native
  /**
    * The vertical scroll factor of each new Game Object.
    */
  @JSName("setScrollFactor.y")
  var setScrollFactorDoty: js.UndefOr[Double] = js.native
  var setXY: js.UndefOr[js.Object] = js.native
  /**
    * Increment each Game Object's horizontal position from the previous by this amount, starting from `setXY.x`.
    */
  @JSName("setXY.stepX")
  var setXYDotstepX: js.UndefOr[Double] = js.native
  /**
    * Increment each Game Object's vertical position from the previous by this amount, starting from `setXY.y`.
    */
  @JSName("setXY.stepY")
  var setXYDotstepY: js.UndefOr[Double] = js.native
  /**
    * The horizontal position of each new Game Object.
    */
  @JSName("setXY.x")
  var setXYDotx: js.UndefOr[Double] = js.native
  /**
    * The vertical position of each new Game Object.
    */
  @JSName("setXY.y")
  var setXYDoty: js.UndefOr[Double] = js.native
  /**
    * The visible state of each new Game Object.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Select keys and frames by moving forward then backward through `key` and `frame`.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}

object GroupCreateConfig {
  @scala.inline
  def apply(): GroupCreateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCreateConfig]
  }
  @scala.inline
  implicit class GroupCreateConfigOps[Self <: GroupCreateConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFrame(value: String | (js.Array[String | integer]) | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAlign(value: `false` | GridAlignConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withHitArea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitArea")(js.undefined)
        ret
    }
    @scala.inline
    def withHitAreaCallback(value: (/* hitArea */ js.Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitAreaCallback")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutHitAreaCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitAreaCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAlpha(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAlphaDotstep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlpha.step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAlphaDotstep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlpha.step")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAlphaDotvalue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlpha.value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAlphaDotvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlpha.value")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDepth(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDepthDotstep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDepth.step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetDepthDotstep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDepth.step")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDepthDotvalue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDepth.value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetDepthDotvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDepth.value")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRotation(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRotationDotstep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation.step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetRotationDotstep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation.step")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRotationDotvalue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation.value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetRotationDotvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation.value")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScale(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScaleDotstepX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale.stepX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScaleDotstepX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale.stepX")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScaleDotstepY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale.stepY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScaleDotstepY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale.stepY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScaleDotx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale.x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScaleDotx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale.x")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScaleDoty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale.y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScaleDoty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale.y")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollFactor(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScrollFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollFactorDotstepX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor.stepX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScrollFactorDotstepX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor.stepX")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollFactorDotstepY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor.stepY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScrollFactorDotstepY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor.stepY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollFactorDotx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor.x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScrollFactorDotx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor.x")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollFactorDoty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor.y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetScrollFactorDoty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollFactor.y")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXY(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXYDotstepX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY.stepX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetXYDotstepX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY.stepX")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXYDotstepY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY.stepY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetXYDotstepY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY.stepY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXYDotx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY.x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetXYDotx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY.x")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXYDoty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY.y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetXYDoty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY.y")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withYoyo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoyo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyo")(js.undefined)
        ret
    }
  }
  
}

