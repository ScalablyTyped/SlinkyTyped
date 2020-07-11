package typingsSlinky.reactNavigationStack.anon

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

/* Inlined std.Partial<std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/Header/Header.Props, 'scene' | 'navigation' | 'position' | 'layoutPreset' | 'backTitleVisible' | 'scenes' | 'layout' | 'mode' | 'transitionPreset' | 'leftInterpolator' | 'titleInterpolator' | 'rightInterpolator' | 'backgroundInterpolator' | 'leftLabelInterpolator' | 'leftButtonInterpolator' | 'titleFromLeftInterpolator' | 'layoutInterpolator' | 'theme'>> */
trait PartialPickPropsscenenavi extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var layout: js.UndefOr[TransitionerLayout] = js.undefined
  var layoutInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var layoutPreset: js.UndefOr[HeaderLayoutPreset] = js.undefined
  var leftButtonInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var leftLabelInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var mode: js.UndefOr[HeaderMode] = js.undefined
  var navigation: js.UndefOr[NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]] = js.undefined
  var position: js.UndefOr[Value] = js.undefined
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var scene: js.UndefOr[Scene] = js.undefined
  var scenes: js.UndefOr[js.Array[Scene]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var titleFromLeftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
}

object PartialPickPropsscenenavi {
  @scala.inline
  def apply(): PartialPickPropsscenenavi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickPropsscenenavi]
  }
  @scala.inline
  implicit class PartialPickPropsscenenaviOps[Self <: PartialPickPropsscenenavi] (val x: Self) extends AnyVal {
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
    def setBackTitleVisible(value: Boolean): Self = this.set("backTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackTitleVisible: Self = this.set("backTitleVisible", js.undefined)
    @scala.inline
    def setBackgroundInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("backgroundInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBackgroundInterpolator: Self = this.set("backgroundInterpolator", js.undefined)
    @scala.inline
    def setLayout(value: TransitionerLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLayoutInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("layoutInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLayoutInterpolator: Self = this.set("layoutInterpolator", js.undefined)
    @scala.inline
    def setLayoutPreset(value: HeaderLayoutPreset): Self = this.set("layoutPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutPreset: Self = this.set("layoutPreset", js.undefined)
    @scala.inline
    def setLeftButtonInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("leftButtonInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLeftButtonInterpolator: Self = this.set("leftButtonInterpolator", js.undefined)
    @scala.inline
    def setLeftInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("leftInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLeftInterpolator: Self = this.set("leftInterpolator", js.undefined)
    @scala.inline
    def setLeftLabelInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("leftLabelInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLeftLabelInterpolator: Self = this.set("leftLabelInterpolator", js.undefined)
    @scala.inline
    def setMode(value: HeaderMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setNavigation(value: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setPosition(value: Value): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRightInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("rightInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRightInterpolator: Self = this.set("rightInterpolator", js.undefined)
    @scala.inline
    def setScene(value: Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScene: Self = this.set("scene", js.undefined)
    @scala.inline
    def setScenesVarargs(value: Scene*): Self = this.set("scenes", js.Array(value :_*))
    @scala.inline
    def setScenes(value: js.Array[Scene]): Self = this.set("scenes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScenes: Self = this.set("scenes", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitleFromLeftInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = this.set("titleFromLeftInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTitleFromLeftInterpolator: Self = this.set("titleFromLeftInterpolator", js.undefined)
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

