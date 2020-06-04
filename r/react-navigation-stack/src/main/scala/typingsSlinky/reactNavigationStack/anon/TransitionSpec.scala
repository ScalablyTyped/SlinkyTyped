package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionSpec extends js.Object {
  var containerStyleDark: BackgroundColor
  var containerStyleLight: BackgroundColor
  var transitionSpec: Timing
  def screenInterpolator(): js.Object
}

object TransitionSpec {
  @scala.inline
  def apply(
    containerStyleDark: BackgroundColor,
    containerStyleLight: BackgroundColor,
    screenInterpolator: () => js.Object,
    transitionSpec: Timing
  ): TransitionSpec = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction0(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionSpec]
  }
  @scala.inline
  implicit class TransitionSpecOps[Self <: TransitionSpec] (val x: Self) extends AnyVal {
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
    def setContainerStyleDark(value: BackgroundColor): Self = this.set("containerStyleDark", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerStyleLight(value: BackgroundColor): Self = this.set("containerStyleLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenInterpolator(value: () => js.Object): Self = this.set("screenInterpolator", js.Any.fromFunction0(value))
    @scala.inline
    def setTransitionSpec(value: Timing): Self = this.set("transitionSpec", value.asInstanceOf[js.Any])
  }
  
}

