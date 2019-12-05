package typingsSlinky.androiduix.android.view.animation.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationListener extends js.Object {
  def onAnimationEnd(animation: typingsSlinky.androiduix.android.view.animation.Animation): Unit
  def onAnimationRepeat(animation: typingsSlinky.androiduix.android.view.animation.Animation): Unit
  def onAnimationStart(animation: typingsSlinky.androiduix.android.view.animation.Animation): Unit
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
}

