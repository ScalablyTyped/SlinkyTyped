package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenInterpolator extends js.Object {
  var transitionSpec: Easing
  def screenInterpolator(props: SceneInterpolatorProps): OpacityNumber | OpacityTransform | `1`
}

object ScreenInterpolator {
  @scala.inline
  def apply(
    screenInterpolator: SceneInterpolatorProps => OpacityNumber | OpacityTransform | `1`,
    transitionSpec: Easing
  ): ScreenInterpolator = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenInterpolator]
  }
  @scala.inline
  implicit class ScreenInterpolatorOps[Self <: ScreenInterpolator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScreenInterpolator(value: SceneInterpolatorProps => OpacityNumber | OpacityTransform | `1`): Self = this.set("screenInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def setTransitionSpec(value: Easing): Self = this.set("transitionSpec", value.asInstanceOf[js.Any])
  }
  
}

