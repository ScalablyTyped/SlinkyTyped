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
trait WeakValidationMapPickProp extends js.Object {
  var backTitleVisible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var backgroundInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var layout: js.UndefOr[Validator[js.UndefOr[Null | TransitionerLayout]]] = js.undefined
  var layoutInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var layoutPreset: js.UndefOr[Validator[js.UndefOr[HeaderLayoutPreset | Null]]] = js.undefined
  var leftButtonInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var leftInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var leftLabelInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var mode: js.UndefOr[Validator[js.UndefOr[HeaderMode | Null]]] = js.undefined
  var navigation: js.UndefOr[
    Validator[
      js.UndefOr[
        (NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]) | Null
      ]
    ]
  ] = js.undefined
  var position: js.UndefOr[Validator[js.UndefOr[Null | Value]]] = js.undefined
  var rightInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var scene: js.UndefOr[Validator[js.UndefOr[Null | Scene]]] = js.undefined
  var scenes: js.UndefOr[Validator[js.UndefOr[js.Array[Scene] | Null]]] = js.undefined
  var theme: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var titleFromLeftInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var titleInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var transitionPreset: js.UndefOr[Validator[js.UndefOr[HeaderTransitionPreset | Null]]] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackTitleVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("backTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackTitleVisible: Self = this.set("backTitleVisible", js.undefined)
    @scala.inline
    def setBackgroundInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = this.set("backgroundInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundInterpolator: Self = this.set("backgroundInterpolator", js.undefined)
    @scala.inline
    def setLayout(value: Validator[js.UndefOr[Null | TransitionerLayout]]): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLayoutInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = this.set("layoutInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutInterpolator: Self = this.set("layoutInterpolator", js.undefined)
    @scala.inline
    def setLayoutPreset(value: Validator[js.UndefOr[HeaderLayoutPreset | Null]]): Self = this.set("layoutPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutPreset: Self = this.set("layoutPreset", js.undefined)
    @scala.inline
    def setLeftButtonInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = this.set("leftButtonInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftButtonInterpolator: Self = this.set("leftButtonInterpolator", js.undefined)
    @scala.inline
    def setLeftInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = this.set("leftInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftInterpolator: Self = this.set("leftInterpolator", js.undefined)
    @scala.inline
    def setLeftLabelInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = this.set("leftLabelInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftLabelInterpolator: Self = this.set("leftLabelInterpolator", js.undefined)
    @scala.inline
    def setMode(value: Validator[js.UndefOr[HeaderMode | Null]]): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setNavigation(
      value: Validator[
          js.UndefOr[
            (NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]) | Null
          ]
        ]
    ): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setPosition(value: Validator[js.UndefOr[Null | Value]]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRightInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = this.set("rightInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightInterpolator: Self = this.set("rightInterpolator", js.undefined)
    @scala.inline
    def setScene(value: Validator[js.UndefOr[Null | Scene]]): Self = this.set("scene", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScene: Self = this.set("scene", js.undefined)
    @scala.inline
    def setScenes(value: Validator[js.UndefOr[js.Array[Scene] | Null]]): Self = this.set("scenes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScenes: Self = this.set("scenes", js.undefined)
    @scala.inline
    def setTheme(value: Validator[js.UndefOr[Null | String]]): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitleFromLeftInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = this.set("titleFromLeftInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleFromLeftInterpolator: Self = this.set("titleFromLeftInterpolator", js.undefined)
    @scala.inline
    def setTitleInterpolator(value: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]): Self = this.set("titleInterpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleInterpolator: Self = this.set("titleInterpolator", js.undefined)
    @scala.inline
    def setTransitionPreset(value: Validator[js.UndefOr[HeaderTransitionPreset | Null]]): Self = this.set("transitionPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionPreset: Self = this.set("transitionPreset", js.undefined)
  }
  
}

