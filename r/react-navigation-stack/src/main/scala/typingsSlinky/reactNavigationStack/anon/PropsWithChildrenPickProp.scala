package typingsSlinky.reactNavigationStack.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.typesMod.HeaderLayoutPreset
import typingsSlinky.reactNavigationStack.typesMod.HeaderMode
import typingsSlinky.reactNavigationStack.typesMod.HeaderTransitionPreset
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.Scene
import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import typingsSlinky.reactNavigationStack.typesMod.TransitionerLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.PropsWithChildren<std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/Header/Header.Props, 'scene' | 'navigation' | 'position' | 'layoutPreset' | 'backTitleVisible' | 'scenes' | 'layout' | 'mode' | 'transitionPreset' | 'leftInterpolator' | 'titleInterpolator' | 'rightInterpolator' | 'backgroundInterpolator' | 'leftLabelInterpolator' | 'leftButtonInterpolator' | 'titleFromLeftInterpolator' | 'layoutInterpolator' | 'theme'>> */
trait PropsWithChildrenPickProp extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var children: js.UndefOr[ReactElement] = js.undefined
  var layout: TransitionerLayout
  var layoutInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var layoutPreset: HeaderLayoutPreset
  var leftButtonInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var leftLabelInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var mode: HeaderMode
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: Value
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var scene: Scene
  var scenes: js.Array[Scene]
  var theme: String
  var titleFromLeftInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
}

object PropsWithChildrenPickProp {
  @scala.inline
  def apply(
    layout: TransitionerLayout,
    layoutInterpolator: /* props */ SceneInterpolatorProps => _,
    layoutPreset: HeaderLayoutPreset,
    leftButtonInterpolator: /* props */ SceneInterpolatorProps => _,
    leftLabelInterpolator: /* props */ SceneInterpolatorProps => _,
    mode: HeaderMode,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: Value,
    scene: Scene,
    scenes: js.Array[Scene],
    theme: String,
    titleFromLeftInterpolator: /* props */ SceneInterpolatorProps => _
  ): PropsWithChildrenPickProp = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], layoutInterpolator = js.Any.fromFunction1(layoutInterpolator), layoutPreset = layoutPreset.asInstanceOf[js.Any], leftButtonInterpolator = js.Any.fromFunction1(leftButtonInterpolator), leftLabelInterpolator = js.Any.fromFunction1(leftLabelInterpolator), mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], titleFromLeftInterpolator = js.Any.fromFunction1(titleFromLeftInterpolator))
    __obj.asInstanceOf[PropsWithChildrenPickProp]
  }
  @scala.inline
  implicit class PropsWithChildrenPickPropOps[Self <: PropsWithChildrenPickProp] (val x: Self) extends AnyVal {
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
    def setLayout(value: TransitionerLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("layoutInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def setLayoutPreset(value: HeaderLayoutPreset): Self = this.set("layoutPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftButtonInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("leftButtonInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def setLeftLabelInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("leftLabelInterpolator", js.Any.fromFunction1(value))
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
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleFromLeftInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("titleFromLeftInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def setBackTitleVisible(value: Boolean): Self = this.set("backTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackTitleVisible: Self = this.set("backTitleVisible", js.undefined)
    @scala.inline
    def setBackgroundInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("backgroundInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBackgroundInterpolator: Self = this.set("backgroundInterpolator", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
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

