package typingsSlinky.androiduix.android.view.animation.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationListener extends js.Object {
  def onAnimationEnd(animation: typingsSlinky.androiduix.android.view.animation.Animation): Unit = js.native
  def onAnimationRepeat(animation: typingsSlinky.androiduix.android.view.animation.Animation): Unit = js.native
  def onAnimationStart(animation: typingsSlinky.androiduix.android.view.animation.Animation): Unit = js.native
}

object AnimationListener {
  @scala.inline
  def apply(
    onAnimationEnd: typingsSlinky.androiduix.android.view.animation.Animation => Unit,
    onAnimationRepeat: typingsSlinky.androiduix.android.view.animation.Animation => Unit,
    onAnimationStart: typingsSlinky.androiduix.android.view.animation.Animation => Unit
  ): AnimationListener = {
    val __obj = js.Dynamic.literal(onAnimationEnd = js.Any.fromFunction1(onAnimationEnd), onAnimationRepeat = js.Any.fromFunction1(onAnimationRepeat), onAnimationStart = js.Any.fromFunction1(onAnimationStart))
    __obj.asInstanceOf[AnimationListener]
  }
  @scala.inline
  implicit class AnimationListenerOps[Self <: AnimationListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAnimationEnd(value: typingsSlinky.androiduix.android.view.animation.Animation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAnimationRepeat(value: typingsSlinky.androiduix.android.view.animation.Animation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationRepeat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAnimationStart(value: typingsSlinky.androiduix.android.view.animation.Animation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

