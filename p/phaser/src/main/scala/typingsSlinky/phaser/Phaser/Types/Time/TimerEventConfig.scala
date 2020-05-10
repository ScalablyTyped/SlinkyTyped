package typingsSlinky.phaser.Phaser.Types.Time

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimerEventConfig extends js.Object {
  /**
    * Additional arguments to be passed to the `callback`.
    */
  var args: js.UndefOr[js.Array[_]] = js.native
  /**
    * The callback which will be called when the Timer Event fires.
    */
  var callback: js.UndefOr[js.Function] = js.native
  /**
    * The scope (`this` object) with which to invoke the `callback`.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  /**
    * The delay after which the Timer Event should fire, in milliseconds.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * `true` if the Timer Event should repeat indefinitely.
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * `true` if the Timer Event should be paused.
    */
  var paused: js.UndefOr[Boolean] = js.native
  /**
    * The total number of times the Timer Event will repeat before finishing.
    */
  var repeat: js.UndefOr[Double] = js.native
  /**
    * The initial elapsed time in milliseconds. Useful if you want a long duration with repeat, but for the first loop to fire quickly.
    */
  var startAt: js.UndefOr[Double] = js.native
  /**
    * The scale of the elapsed time.
    */
  var timeScale: js.UndefOr[Double] = js.native
}

object TimerEventConfig {
  @scala.inline
  def apply(): TimerEventConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimerEventConfig]
  }
  @scala.inline
  implicit class TimerEventConfigOps[Self <: TimerEventConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
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
    def withLoop(value: Boolean): Self = {
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
    def withStartAt(value: Double): Self = {
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

