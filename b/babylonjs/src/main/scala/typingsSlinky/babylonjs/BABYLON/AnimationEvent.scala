package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEvent extends js.Object {
  /** The frame for which the event is triggered **/
  var frame: Double = js.native
  /**
    * Specifies if the animation event is done
    */
  var isDone: Boolean = js.native
  /** Specifies if the event should be triggered only once**/
  var onlyOnce: js.UndefOr[Boolean] = js.native
  /** @hidden */
  def _clone(): AnimationEvent = js.native
  /** The event to perform when triggered **/
  def action(currentFrame: Double): Unit = js.native
}

object AnimationEvent {
  @scala.inline
  def apply(_clone: () => AnimationEvent, action: Double => Unit, frame: Double, isDone: Boolean): AnimationEvent = {
    val __obj = js.Dynamic.literal(_clone = js.Any.fromFunction0(_clone), action = js.Any.fromFunction1(action), frame = frame.asInstanceOf[js.Any], isDone = isDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent]
  }
  @scala.inline
  implicit class AnimationEventOps[Self <: AnimationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_clone(value: () => AnimationEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAction(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFrame(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnce")(js.undefined)
        ret
    }
  }
  
}

