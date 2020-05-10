package typingsSlinky.phaser.Phaser.Types.Tweens

import typingsSlinky.phaser.Phaser.Tweens.Timeline
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineBuilderConfig extends js.Object {
  /**
    * The default scope (`this` value) to use for each callback registered by the Timeline Builder. If not specified, the Timeline itself will be used.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the time to wait, usually in milliseconds, before the Timeline completes.
    */
  var completeDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
  /**
    * The number of milliseconds to delay before the tween will start. Each individual Tween configuration can override this value.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * If `totalDuration` is not specified, the default duration, usually in milliseconds, of each Tween which will be created. Each individual Tween configuration can override the Tween's duration.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The easing equation to use for each tween. Each individual Tween configuration can override this value.
    */
  var ease: js.UndefOr[String | js.Function] = js.native
  /**
    * Optional easing parameters. Each individual Tween configuration can override this value.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property. Each individual Tween configuration can override this value.
    */
  var flipX: js.UndefOr[Boolean] = js.native
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property. Each individual Tween configuration can override this value.
    */
  var flipY: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds to hold each tween before yoyo'ing. Each individual Tween configuration can override this value.
    */
  var hold: js.UndefOr[Double] = js.native
  /**
    * How many times the Timeline should loop, or -1 to loop indefinitely.
    */
  var loop: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
  /**
    * The time, usually in milliseconds, between each loop.
    */
  var loopDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
  /**
    * If specified, the `onComplete` callback for the Timeline, called after it completes.
    */
  var onComplete: js.UndefOr[TimelineOnCompleteCallback] = js.native
  /**
    * Additional arguments to pass to the `onComplete` callback. The Timeline will always be the first argument.
    */
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onComplete` callback. If not specified, the `callbackScope` will be used.
    */
  var onCompleteScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the `onLoop` callback for the Timeline, called every time it loops.
    */
  var onLoop: js.UndefOr[TimelineOnLoopCallback] = js.native
  /**
    * Additional arguments to pass to the `onLoop` callback. The Timeline will always be the first argument.
    */
  var onLoopParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onLoop` callback. If not specified, the `callbackScope` will be used.
    */
  var onLoopScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the `onStart` callback for the Timeline, called every time it starts playing.
    */
  var onStart: js.UndefOr[TimelineOnStartCallback] = js.native
  /**
    * Additional arguments to pass to the `onStart` callback. The Timeline will always be the first argument.
    */
  var onStartParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onStart` callback. If not specified, the `callbackScope` will be used.
    */
  var onStartScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the `onUpdate` callback for the Timeline, called every frame it's active, regardless of its Tweens.
    */
  var onUpdate: js.UndefOr[TimelineOnUpdateCallback] = js.native
  /**
    * Additional arguments to pass to the `onUpdate` callback. The Timeline will always be the first argument.
    */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onUpdate` callback. If not specified, the `callbackScope` will be used.
    */
  var onUpdateScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the `onYoyo` callback for the Timeline, called every time it yoyos.
    */
  var onYoyo: js.UndefOr[TimelineOnYoyoCallback] = js.native
  /**
    * Additional arguments to pass to the `onYoyo` callback. The first argument will always be `null`, while the Timeline will always be the second argument.
    */
  var onYoyoParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onYoyo` callback. If not specified, the `callbackScope` will be used.
    */
  var onYoyoScope: js.UndefOr[js.Any] = js.native
  /**
    * If `true`, the Timeline will start paused.
    */
  var paused: js.UndefOr[Boolean] = js.native
  /**
    * The number of times to repeat each tween. Each individual Tween configuration can override this value.
    */
  var repeat: js.UndefOr[integer] = js.native
  /**
    * The number of milliseconds to pause before each tween will repeat. Each individual Tween configuration can override this value.
    */
  var repeatDelay: js.UndefOr[Double] = js.native
  /**
    * An array (or function which returns one) of default targets to which to apply the Timeline. Each individual Tween configuration can override this value.
    */
  var targets: js.UndefOr[js.Any] = js.native
  /**
    * If specified, each Tween in the Timeline will get an equal portion of this duration, usually in milliseconds, by default. Each individual Tween configuration can override the Tween's duration.
    */
  var totalDuration: js.UndefOr[Double] = js.native
  /**
    * An array of tween configuration objects to create and add into the new Timeline. If this doesn't exist or is empty, the Timeline will start off paused and none of the other configuration settings will be read. If it's a function, it will be called and its return value will be used as the array.
    */
  var tweens: js.UndefOr[(js.Array[js.Object | TweenBuilderConfig]) | js.Function] = js.native
  /**
    * If `true`, all duration in the Timeline will be in frames instead of milliseconds.
    */
  var useFrames: js.UndefOr[Boolean] = js.native
  /**
    * Should each tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete. Each individual Tween configuration can override this value.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}

object TimelineBuilderConfig {
  @scala.inline
  def apply(): TimelineBuilderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineBuilderConfig]
  }
  @scala.inline
  implicit class TimelineBuilderConfigOps[Self <: TimelineBuilderConfig] (val x: Self) extends AnyVal {
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
    def withOnComplete(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction2(value))
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
    def withOnLoop(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoop")(js.Any.fromFunction2(value))
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
    def withOnStart(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
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
    def withOnUpdate(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction2(value))
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
    def withOnYoyo(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYoyo")(js.Any.fromFunction2(value))
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
    def withTargets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTweens(value: (js.Array[js.Object | TweenBuilderConfig]) | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTweens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweens")(js.undefined)
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

