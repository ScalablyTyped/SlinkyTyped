package typingsSlinky.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPlayer extends js.Object {
  /**
    * Provides a callback to invoke before the animation is destroyed.
    */
  var beforeDestroy: js.UndefOr[js.Function0[_]] = js.native
  /**
    * The parent of this player, if any.
    */
  var parentPlayer: AnimationPlayer | Null = js.native
  /**
    * The total run time of the animation, in milliseconds.
    */
  val totalTime: Double = js.native
  /**
    * Destroys the animation, after invoking the `beforeDestroy()` callback.
    * Calls the `onDestroy()` callback when destruction is completed.
    */
  def destroy(): Unit = js.native
  /**
    * Ends the animation, invoking the `onDone()` callback.
    */
  def finish(): Unit = js.native
  /**
    * Reports the current position of the animation.
    * @returns A 0-based offset into the duration, in milliseconds.
    */
  def getPosition(): Double = js.native
  /**
    * Reports whether the animation has started.
    * @returns True if the animation has started, false otherwise.
    */
  def hasStarted(): Boolean = js.native
  /**
    * Initializes the animation.
    */
  def init(): Unit = js.native
  /**
    * Provides a callback to invoke after the animation is destroyed.
    * @param fn The callback function.
    * @see `destroy()`
    * @see `beforeDestroy()`
    */
  def onDestroy(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Provides a callback to invoke when the animation finishes.
    * @param fn The callback function.
    * @see `finish()`
    */
  def onDone(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Provides a callback to invoke when the animation starts.
    * @param fn The callback function.
    * @see `run()`
    */
  def onStart(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Pauses the animation.
    */
  def pause(): Unit = js.native
  /**
    * Runs the animation, invoking the `onStart()` callback.
    */
  def play(): Unit = js.native
  /**
    * Resets the animation to its initial state.
    */
  def reset(): Unit = js.native
  /**
    * Restarts the paused animation.
    */
  def restart(): Unit = js.native
  /**
    * Sets the position of the animation.
    * @param position A 0-based offset into the duration, in milliseconds.
    */
  def setPosition(position: js.Any): Unit = js.native
}

object AnimationPlayer {
  @scala.inline
  def apply(
    destroy: () => Unit,
    finish: () => Unit,
    getPosition: () => Double,
    hasStarted: () => Boolean,
    init: () => Unit,
    onDestroy: js.Function0[Unit] => Unit,
    onDone: js.Function0[Unit] => Unit,
    onStart: js.Function0[Unit] => Unit,
    pause: () => Unit,
    play: () => Unit,
    reset: () => Unit,
    restart: () => Unit,
    setPosition: js.Any => Unit,
    totalTime: Double
  ): AnimationPlayer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), getPosition = js.Any.fromFunction0(getPosition), hasStarted = js.Any.fromFunction0(hasStarted), init = js.Any.fromFunction0(init), onDestroy = js.Any.fromFunction1(onDestroy), onDone = js.Any.fromFunction1(onDone), onStart = js.Any.fromFunction1(onStart), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), reset = js.Any.fromFunction0(reset), restart = js.Any.fromFunction0(restart), setPosition = js.Any.fromFunction1(setPosition), totalTime = totalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlayer]
  }
  @scala.inline
  implicit class AnimationPlayerOps[Self <: AnimationPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFinish(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasStarted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDestroy(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDone(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStart(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTotalTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeDestroy(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withParentPlayer(value: AnimationPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentPlayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentPlayerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentPlayer")(null)
        ret
    }
  }
  
}

