package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.react.mod.Validator
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

/* Inlined react.react.WeakValidationMap<std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/Header/Header.Props, 'scene' | 'navigation' | 'position' | 'layoutPreset' | 'backTitleVisible' | 'scenes' | 'layout' | 'mode' | 'transitionPreset' | 'leftInterpolator' | 'titleInterpolator' | 'rightInterpolator' | 'backgroundInterpolator' | 'leftLabelInterpolator' | 'leftButtonInterpolator' | 'titleFromLeftInterpolator' | 'layoutInterpolator' | 'theme'>> */
@js.native
trait WeakValidationMapPickProp extends js.Object {
  var backTitleVisible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var backgroundInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.native
  var layout: js.UndefOr[Validator[js.UndefOr[Null | TransitionerLayout]]] = js.native
  var layoutInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.native
  var layoutPreset: js.UndefOr[Validator[js.UndefOr[HeaderLayoutPreset | Null]]] = js.native
  var leftButtonInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.native
  var leftInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.native
  var leftLabelInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.native
  var mode: js.UndefOr[Validator[js.UndefOr[HeaderMode | Null]]] = js.native
  var navigation: js.UndefOr[
    Validator[
      js.UndefOr[
        (NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]) | Null
      ]
    ]
  ] = js.native
  var position: js.UndefOr[Validator[js.UndefOr[Null | Value]]] = js.native
  var rightInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.native
  var scene: js.UndefOr[Validator[js.UndefOr[Null | Scene]]] = js.native
  var scenes: js.UndefOr[Validator[js.UndefOr[js.Array[Scene] | Null]]] = js.native
  var theme: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var titleFromLeftInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.native
  var titleInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.native
  var transitionPreset: js.UndefOr[Validator[js.UndefOr[HeaderTransitionPreset | Null]]] = js.native
}

object WeakValidationMapPickProp {
  @scala.inline
  def apply(): WeakValidationMapPickProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPickProp]
  }
  @scala.inline
  implicit class WeakValidationMapPickPropOps[Self <: WeakValidationMapPickProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackTitleVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def withBackgroundInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundInterpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Validator[js.UndefOr[Null | TransitionerLayout]]): Self = {
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
    def withLayoutInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutInterpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutPreset(value: Validator[js.UndefOr[HeaderLayoutPreset | Null]]): Self = {
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
    def withLeftButtonInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtonInterpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftButtonInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButtonInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftInterpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftLabelInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabelInterpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftLabelInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabelInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Validator[js.UndefOr[HeaderMode | Null]]): Self = {
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
    def withNavigation(
      value: Validator[
          js.UndefOr[
            (NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]) | Null
          ]
        ]
    ): Self = {
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
    def withPosition(value: Validator[js.UndefOr[Null | Value]]): Self = {
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
    def withRightInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightInterpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withScene(value: Validator[js.UndefOr[Null | Scene]]): Self = {
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
    def withScenes(value: Validator[js.UndefOr[js.Array[Scene] | Null]]): Self = {
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
    def withTheme(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withTitleFromLeftInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFromLeftInterpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFromLeftInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFromLeftInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInterpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionPreset(value: Validator[js.UndefOr[HeaderTransitionPreset | Null]]): Self = {
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

