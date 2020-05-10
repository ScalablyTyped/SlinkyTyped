package typingsSlinky.phaser.Phaser.Types.Tweens

import typingsSlinky.phaser.Phaser.Tweens.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberTweenBuilderConfig extends js.Object {
  /**
    * Scope (this) for the callbacks. The default scope is the tween.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  /**
    * The time the tween will wait before the onComplete event is dispatched once it has completed, in ms.
    */
  var completeDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
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
  var ease: js.UndefOr[String | js.Function] = js.native
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The start number.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[Double] = js.native
  /**
    * The number of times the tween will repeat. (A value of 1 means the tween will play twice, as it repeated once.) The first loop starts after every property tween has completed once.
    */
  var loop: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
  /**
    * The time the tween will pause before starting either a yoyo or returning to the start for a repeat.
    */
  var loopDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
  /**
    * Used when the Tween is part of a Timeline.
    */
  var offset: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
  /**
    * A function to call when the tween completes.
    */
  var onComplete: js.UndefOr[TweenOnCompleteCallback] = js.native
  /**
    * Additional parameters to pass to `onComplete`.
    */
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * Scope (this) for `onComplete`.
    */
  var onCompleteScope: js.UndefOr[js.Any] = js.native
  /**
    * A function to call each time the tween loops.
    */
  var onLoop: js.UndefOr[TweenOnLoopCallback] = js.native
  /**
    * Additional parameters to pass to `onLoop`.
    */
  var onLoopParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * Scope (this) for `onLoop`.
    */
  var onLoopScope: js.UndefOr[js.Any] = js.native
  /**
    * A function to call each time the tween repeats. Called once per property per target.
    */
  var onRepeat: js.UndefOr[TweenOnRepeatCallback] = js.native
  /**
    * Additional parameters to pass to `onRepeat`.
    */
  var onRepeatParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * Scope (this) for `onRepeat`.
    */
  var onRepeatScope: js.UndefOr[js.Any] = js.native
  /**
    * A function to call when the tween starts.
    */
  var onStart: js.UndefOr[TweenOnStartCallback] = js.native
  /**
    * Additional parameters to pass to `onStart`.
    */
  var onStartParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * Scope (this) for `onStart`.
    */
  var onStartScope: js.UndefOr[js.Any] = js.native
  /**
    * A function to call each time the tween steps. Called once per property per target.
    */
  var onUpdate: js.UndefOr[TweenOnUpdateCallback] = js.native
  /**
    * Additional parameters to pass to `onUpdate`.
    */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * Scope (this) for `onUpdate`.
    */
  var onUpdateScope: js.UndefOr[js.Any] = js.native
  /**
    * A function to call each time the tween yoyos. Called once per property per target.
    */
  var onYoyo: js.UndefOr[TweenOnYoyoCallback] = js.native
  /**
    * Additional parameters to pass to `onYoyo`.
    */
  var onYoyoParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * Scope (this) for `onYoyo`.
    */
  var onYoyoScope: js.UndefOr[js.Any] = js.native
  /**
    * Does the tween start in a paused state (true) or playing (false)?
    */
  var paused: js.UndefOr[Boolean] = js.native
  /**
    * The number of times to repeat the tween.
    */
  var repeat: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds to pause before a tween will repeat.
    */
  var repeatDelay: js.UndefOr[Double] = js.native
  /**
    * The end number.
    */
  var to: js.UndefOr[Double] = js.native
  /**
    * Use frames or milliseconds?
    */
  var useFrames: js.UndefOr[Boolean] = js.native
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}

object NumberTweenBuilderConfig {
  @scala.inline
  def apply(): NumberTweenBuilderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberTweenBuilderConfig]
  }
  @scala.inline
  implicit class NumberTweenBuilderConfigOps[Self <: NumberTweenBuilderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackScope")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteDelay(value: Double | js.Function | js.Object | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeDelay")(js.undefined)
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
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
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
    def withLoop(value: Double | js.Function | js.Object | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopDelay(value: Double | js.Function | js.Object | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | js.Function | js.Object | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompleteParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleteParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCompleteParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleteParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompleteScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleteScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCompleteScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleteScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoop(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoopParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoopParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoopParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoopParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoopScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoopScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoopScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoopScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRepeat(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepeat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepeat")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRepeatParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepeatParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRepeatParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepeatParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRepeatScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepeatScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRepeatScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepeatScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStartParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStartScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdateParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUpdateParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdateScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUpdateScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOnYoyo(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYoyo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnYoyo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYoyo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnYoyoParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYoyoParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnYoyoParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYoyoParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOnYoyoScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYoyoScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnYoyoScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYoyoScope")(js.undefined)
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.undefined)
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
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFrames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFrames")(js.undefined)
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

