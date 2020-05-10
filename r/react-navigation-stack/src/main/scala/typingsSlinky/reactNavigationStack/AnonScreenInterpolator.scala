package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScreenInterpolator extends js.Object {
  var transitionSpec: AnonEasing = js.native
  def screenInterpolator(props: SceneInterpolatorProps): AnonOpacityNumber | AnonOpacityTransform | Anon1 = js.native
}

object AnonScreenInterpolator {
  @scala.inline
  def apply(
    screenInterpolator: SceneInterpolatorProps => AnonOpacityNumber | AnonOpacityTransform | Anon1,
    transitionSpec: AnonEasing
  ): AnonScreenInterpolator = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScreenInterpolator]
  }
  @scala.inline
  implicit class AnonScreenInterpolatorOps[Self <: AnonScreenInterpolator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScreenInterpolator(value: SceneInterpolatorProps => AnonOpacityNumber | AnonOpacityTransform | Anon1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransitionSpec(value: AnonEasing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

