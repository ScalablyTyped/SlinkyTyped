package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerStyleLight extends js.Object {
  var containerStyleDark: BackgroundColor = js.native
  var containerStyleLight: BackgroundColor = js.native
  var transitionSpec: Damping | Duration = js.native
  def screenInterpolator(props: SceneInterpolatorProps): OpacityNumber | OpacityTransform | OpacityUndefinedTransformArray = js.native
}

object ContainerStyleLight {
  @scala.inline
  def apply(
    containerStyleDark: BackgroundColor,
    containerStyleLight: BackgroundColor,
    screenInterpolator: SceneInterpolatorProps => OpacityNumber | OpacityTransform | OpacityUndefinedTransformArray,
    transitionSpec: Damping | Duration
  ): ContainerStyleLight = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStyleLight]
  }
  @scala.inline
  implicit class ContainerStyleLightOps[Self <: ContainerStyleLight] (val x: Self) extends AnyVal {
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
    def withScreenInterpolator(value: SceneInterpolatorProps => OpacityNumber | OpacityTransform | OpacityUndefinedTransformArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransitionSpec(value: Damping | Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

