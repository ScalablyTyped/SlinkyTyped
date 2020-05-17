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
@js.native
trait PartialPickPropsscenenavi extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.native
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var layout: js.UndefOr[TransitionerLayout] = js.native
  var layoutInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var layoutPreset: js.UndefOr[HeaderLayoutPreset] = js.native
  var leftButtonInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var leftLabelInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var mode: js.UndefOr[HeaderMode] = js.native
  var navigation: js.UndefOr[NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]] = js.native
  var position: js.UndefOr[Value] = js.native
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var scene: js.UndefOr[Scene] = js.native
  var scenes: js.UndefOr[js.Array[Scene]] = js.native
  var theme: js.UndefOr[String] = js.native
  var titleFromLeftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.native
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.native
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
    def withLayout(value: TransitionerLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayoutInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutPreset(value: HeaderLayoutPreset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPreset")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftButtonInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtonInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLeftButtonInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtonInterpolator")(js.undefined)
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
    def withLeftLabelInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabelInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLeftLabelInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabelInterpolator")(js.undefined)
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
    def withNavigation(value: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
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
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(js.undefined)
        ret
    }
    @scala.inline
    def withScenes(value: js.Array[Scene]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScenes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenes")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFromLeftInterpolator(value: /* props */ SceneInterpolatorProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFromLeftInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTitleFromLeftInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFromLeftInterpolator")(js.undefined)
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

