package typingsSlinky.phaser.Phaser.Types.Tweens

import typingsSlinky.phaser.Phaser.Tweens.Tween
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenPropConfig extends js.Object {
  /**
    * Time in ms/frames before tween will start.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Duration of the tween in ms/frames.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The ease function this tween uses.
    */
  var ease: js.UndefOr[String | js.Function] = js.native
  /**
    * Should toggleFlipX be called when yoyo or repeat happens?
    */
  var flipX: js.UndefOr[Boolean] = js.native
  /**
    * Should toggleFlipY be called when yoyo or repeat happens?
    */
  var flipY: js.UndefOr[Boolean] = js.native
  /**
    * What the property will be set to immediately when this tween becomes active.
    */
  var getActive: js.UndefOr[GetActiveCallback] = js.native
  /**
    * What the property will be at the END of the Tween.
    */
  var getEnd: js.UndefOr[GetEndCallback] = js.native
  /**
    * What the property will be at the START of the Tween.
    */
  var getStart: js.UndefOr[GetStartCallback] = js.native
  /**
    * Time in ms/frames the tween will pause before repeating or returning to its starting value if yoyo is set to true.
    */
  var hold: js.UndefOr[Double] = js.native
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.UndefOr[Double] = js.native
  /**
    * Time in ms/frames before the repeat will start.
    */
  var repeatDelay: js.UndefOr[Double] = js.native
  /**
    * What the property will be at the END of the Tween.
    */
  var value: js.UndefOr[Double | String | GetEndCallback | TweenPropConfig] = js.native
  /**
    * Determines whether the tween should return back to its start value after hold has expired.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}

object TweenPropConfig {
  @scala.inline
  def apply(): TweenPropConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TweenPropConfig]
  }
  @scala.inline
  implicit class TweenPropConfigOps[Self <: TweenPropConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEase(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActive(
      value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActive")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutGetActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActive")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnd(
      value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnd")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutGetEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStart(
      value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutGetStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.undefined)
        ret
    }
    @scala.inline
    def withHold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: Double): Self = {
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
    def withRepeatDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFunction6(
      value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withValue(value: Double | String | GetEndCallback | TweenPropConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
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

