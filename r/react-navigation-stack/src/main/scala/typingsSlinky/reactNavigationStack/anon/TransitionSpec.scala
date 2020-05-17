package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionSpec extends js.Object {
  var containerStyleDark: BackgroundColor = js.native
  var containerStyleLight: BackgroundColor = js.native
  var transitionSpec: Timing = js.native
  def screenInterpolator(): js.Object = js.native
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
    def withContainerStyleDark(value: BackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerStyleLight(value: BackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenInterpolator(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenInterpolator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTransitionSpec(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

