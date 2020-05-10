package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainerStyleLight extends js.Object {
  var containerStyleDark: AnonBackgroundColor = js.native
  var containerStyleLight: AnonBackgroundColor = js.native
  var transitionSpec: AnonDamping | AnonDuration = js.native
  def screenInterpolator(props: SceneInterpolatorProps): AnonOpacityNumber | AnonOpacityTransform | AnonOpacityUndefinedTransformArray = js.native
}

object AnonContainerStyleLight {
  @scala.inline
  def apply(
    containerStyleDark: AnonBackgroundColor,
    containerStyleLight: AnonBackgroundColor,
    screenInterpolator: SceneInterpolatorProps => AnonOpacityNumber | AnonOpacityTransform | AnonOpacityUndefinedTransformArray,
    transitionSpec: AnonDamping | AnonDuration
  ): AnonContainerStyleLight = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerStyleLight]
  }
  @scala.inline
  implicit class AnonContainerStyleLightOps[Self <: AnonContainerStyleLight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerStyleDark(value: AnonBackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerStyleLight(value: AnonBackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenInterpolator(
      value: SceneInterpolatorProps => AnonOpacityNumber | AnonOpacityTransform | AnonOpacityUndefinedTransformArray
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransitionSpec(value: AnonDamping | AnonDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

