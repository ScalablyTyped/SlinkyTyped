package typingsSlinky.phaser.Phaser.Types.Tweens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenConfigDefaults extends js.Object {
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * The duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The easing equation to use for the tween.
    */
  var ease: js.UndefOr[String] = js.native
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property.
    */
  var flipX: js.UndefOr[Boolean] = js.native
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property.
    */
  var flipY: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[Double] = js.native
  /**
    * The number of times to repeat the tween.
    */
  var repeat: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds to pause before a tween will repeat.
    */
  var repeatDelay: js.UndefOr[Double] = js.native
  /**
    * The object, or an array of objects, to run the tween on.
    */
  var targets: js.Object | js.Array[js.Object] = js.native
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}

object TweenConfigDefaults {
  @scala.inline
  def apply(targets: js.Object | js.Array[js.Object]): TweenConfigDefaults = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenConfigDefaults]
  }
  @scala.inline
  implicit class TweenConfigDefaultsOps[Self <: TweenConfigDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargets(value: js.Object | js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withEase(value: String): Self = {
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
    def withEaseParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeParams")(js.undefined)
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

