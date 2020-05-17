package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerStyleDark extends js.Object {
  var containerStyleDark: BackgroundColor = js.native
  var containerStyleLight: BackgroundColor = js.native
  var transitionSpec: Damping | Duration = js.native
  def screenInterpolator(props: SceneInterpolatorProps): OpacityNumber | OverlayOpacity | ShadowOpacity = js.native
}

object ContainerStyleDark {
  @scala.inline
  def apply(
    containerStyleDark: BackgroundColor,
    containerStyleLight: BackgroundColor,
    screenInterpolator: SceneInterpolatorProps => OpacityNumber | OverlayOpacity | ShadowOpacity,
    transitionSpec: Damping | Duration
  ): ContainerStyleDark = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStyleDark]
  }
  @scala.inline
  implicit class ContainerStyleDarkOps[Self <: ContainerStyleDark] (val x: Self) extends AnyVal {
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
    def withScreenInterpolator(value: SceneInterpolatorProps => OpacityNumber | OverlayOpacity | ShadowOpacity): Self = {
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

