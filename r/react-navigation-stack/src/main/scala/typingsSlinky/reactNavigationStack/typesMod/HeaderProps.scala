package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderProps extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.native
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var isLandscape: Boolean = js.native
  var layout: TransitionerLayout = js.native
  var layoutPreset: HeaderLayoutPreset = js.native
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var mode: HeaderMode = js.native
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
  var position: Value = js.native
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var scene: Scene = js.native
  var scenes: js.Array[Scene] = js.native
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.native
}

object HeaderProps {
  @scala.inline
  def apply(
    isLandscape: Boolean,
    layout: TransitionerLayout,
    layoutPreset: HeaderLayoutPreset,
    mode: HeaderMode,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: Value,
    scene: Scene,
    scenes: js.Array[Scene]
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(isLandscape = isLandscape.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], layoutPreset = layoutPreset.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
  @scala.inline
  implicit class HeaderPropsOps[Self <: HeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLandscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: TransitionerLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutPreset(value: HeaderLayoutPreset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: HeaderMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Value): Self = {
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
    def withBackTitleVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backTitleVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackTitleVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backTitleVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBackgroundInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLeftInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withRightInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRightInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTitleInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionPreset(value: HeaderTransitionPreset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionPreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionPreset")(js.undefined)
        ret
    }
  }
  
}

