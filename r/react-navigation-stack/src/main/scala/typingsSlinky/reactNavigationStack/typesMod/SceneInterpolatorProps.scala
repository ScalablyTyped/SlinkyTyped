package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneInterpolatorProps extends js.Object {
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
  var layout: TransitionerLayout = js.native
  var mode: js.UndefOr[HeaderMode] = js.native
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
  var position: AnimatedInterpolation = js.native
  var scene: Scene = js.native
  var scenes: js.Array[Scene] = js.native
  var shadowEnabled: js.UndefOr[Boolean] = js.native
}

object SceneInterpolatorProps {
  @scala.inline
  def apply(
    layout: TransitionerLayout,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: AnimatedInterpolation,
    scene: Scene,
    scenes: js.Array[Scene]
  ): SceneInterpolatorProps = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneInterpolatorProps]
  }
  @scala.inline
  implicit class SceneInterpolatorPropsOps[Self <: SceneInterpolatorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayout(value: TransitionerLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: AnimatedInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScenes(value: js.Array[Scene]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardOverlayEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOverlayEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardOverlayEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOverlayEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: HeaderMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowEnabled")(js.undefined)
        ret
    }
  }
  
}

