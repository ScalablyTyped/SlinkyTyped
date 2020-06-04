package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var isLandscape: Boolean
  var layout: TransitionerLayout
  var layoutPreset: HeaderLayoutPreset
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var mode: HeaderMode
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: Value
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var scene: Scene
  var scenes: js.Array[Scene]
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsLandscape(value: Boolean): Self = this.set("isLandscape", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: TransitionerLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutPreset(value: HeaderLayoutPreset): Self = this.set("layoutPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: HeaderMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Value): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setScene(value: Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenes(value: js.Array[Scene]): Self = this.set("scenes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackTitleVisible(value: Boolean): Self = this.set("backTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackTitleVisible: Self = this.set("backTitleVisible", js.undefined)
    @scala.inline
    def setBackgroundInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("backgroundInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBackgroundInterpolator: Self = this.set("backgroundInterpolator", js.undefined)
    @scala.inline
    def setLeftInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("leftInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLeftInterpolator: Self = this.set("leftInterpolator", js.undefined)
    @scala.inline
    def setRightInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("rightInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRightInterpolator: Self = this.set("rightInterpolator", js.undefined)
    @scala.inline
    def setTitleInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("titleInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTitleInterpolator: Self = this.set("titleInterpolator", js.undefined)
    @scala.inline
    def setTransitionPreset(value: HeaderTransitionPreset): Self = this.set("transitionPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionPreset: Self = this.set("transitionPreset", js.undefined)
  }
  
}

