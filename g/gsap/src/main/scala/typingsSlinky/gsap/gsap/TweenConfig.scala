package typingsSlinky.gsap.gsap

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenConfig
  extends /** Any tweenable property */
/* p */ StringDictionary[js.Any] {
  /** If true atuomatically populates the css property for tween on DOM elements */
  var autoCSS: js.UndefOr[Boolean] = js.native
  /** The scope to be used for all of the callbacks (onStart, onUpdate, onComplete, etc.). The scope is what "this" refers to inside any of the callbacks. */
  var callbackScope: js.UndefOr[js.Object] = js.native
  /**
    * Amount of delay in seconds (or frames for frames-based tweens) before the animation should begin.
    */
  var delay: js.UndefOr[Double] = js.native
  /** Ease (or () => void or String) - You can choose from various eases to control the rate of change during the animation, giving it a specific "feel". */
  var ease: js.UndefOr[Ease] = js.native
  /**
    * Normally when you create a tween, it begins rendering on the very next frame (update cycle) unless you specify a delay. However, if you prefer to force the tween to render
    * immediately when it is created, setimmediateRender to true. Or to prevent a from() from rendering immediately, set immediateRender to false. By default, from() tweens set
    * immediateRender to true.
    */
  var immediateRender: js.UndefOr[Boolean] = js.native
  /**
    * When a tween renders for the very first time and reads its starting values, GSAP will automatically "lazy render" that particular tick by default, meaning it will try to delay the
    * rendering (writing of values) until the very end of the "tick" cycle which can improve performance because it avoids the read/write/read/write layout thrashing that some browsers do.
    *
    * If you would like to disable lazy rendering for a particular tween, you can set lazy:false. Or, since zero-duration tweens do not lazy-render by default, you can specifically give it
    * permission to lazy-render by setting lazy:true like TweenLite.set(element, {opacity:0, lazy:true});. In most cases, you won't need to set lazy.
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  /**  A () => void that should be called when the animation has completed. */
  var onComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** An Array of parameters to pass the onComplete () => void */
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.native
  /** Defines the scope of the onComplete () => void (what "this" refers to inside that () => void). */
  var onCompleteScope: js.UndefOr[js.Object] = js.native
  /** A () => void that should be called when the tween gets overwritten by another tween. */
  var onOverwrite: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onRepeat: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onRepeatScope: js.UndefOr[js.Object] = js.native
  /** A () => void that should be called when the tween has reached its beginning again from the reverse direction. */
  var onReverseComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** An Array of parameters to pass the onReverseComplete () => void. */
  var onReverseCompleteParams: js.UndefOr[js.Array[_]] = js.native
  /** Defines the scope of the onReverseComplete () => void (what "this" refers to inside that () => void). */
  var onReverseCompleteScope: js.UndefOr[js.Object] = js.native
  /** A () => void that should be called when the tween begins (when its time changes from 0 to some other value which can happen more than once if the tween is restarted multiple times). */
  var onStart: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** An Array of parameters to pass the onStart () => void. */
  var onStartParams: js.UndefOr[js.Array[_]] = js.native
  /** Defines the scope of the onStart () => void (what "this" refers to inside that () => void). */
  var onStartScope: js.UndefOr[js.Object] = js.native
  /** A () => void that should be called every time the animation updates (on every frame while the animation is active). */
  var onUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** An Array of parameters to pass the onUpdate () => void. */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.native
  /** Defines the scope of the onUpdate () => void (what "this" refers to inside that () => void). */
  var onUpdateScope: js.UndefOr[js.Object] = js.native
  /**
    * Controls how (and if) other tweens of the same target are overwritten. There are several modes to choose from, but "auto" is the default (although you can change the default mode using
    * theTweenLite.defaultOverwrite property)
    */
  var overwrite: js.UndefOr[String | Double] = js.native
  /** If true, the tween will pause itself immediately upon creation. */
  var paused: js.UndefOr[Boolean] = js.native
  var repeat: js.UndefOr[Double] = js.native
  var repeatDelay: js.UndefOr[Double] = js.native
  var startAt: js.UndefOr[js.Object] = js.native
  /**
    * If useFrames is true, the tweens's timing will be based on frames instead of seconds because it is intially added to the root frames-based timeline. This causes both its duration and
    * delay to be based on frames. An animations's timing mode is always determined by its parent timeline.
    */
  var useFrames: js.UndefOr[Boolean] = js.native
  var yoyo: js.UndefOr[Boolean] = js.native
}

object TweenConfig {
  @scala.inline
  def apply(): TweenConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TweenConfig]
  }
  @scala.inline
  implicit class TweenConfigOps[Self <: TweenConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackScope(value: js.Object): Self = {
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
    def withEase(value: Ease): Self = {
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
    def withImmediateRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediateRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateRender")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
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
    def withOnCompleteScope(value: js.Object): Self = {
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
    def withOnOverwrite(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverwrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRepeat(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepeat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepeat")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRepeatScope(value: js.Object): Self = {
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
    def withOnReverseComplete(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReverseComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReverseComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReverseComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReverseCompleteParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReverseCompleteParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnReverseCompleteParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReverseCompleteParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReverseCompleteScope(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReverseCompleteScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnReverseCompleteScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReverseCompleteScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
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
    def withOnStartScope(value: js.Object): Self = {
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
    def withOnUpdate(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
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
    def withOnUpdateScope(value: js.Object): Self = {
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
    def withOverwrite(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
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
    def withStartAt(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(js.undefined)
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

