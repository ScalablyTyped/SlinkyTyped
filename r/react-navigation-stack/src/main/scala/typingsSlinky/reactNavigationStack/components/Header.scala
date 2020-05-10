package typingsSlinky.reactNavigationStack.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.PickPropsscenenavigationp
import typingsSlinky.reactNavigationStack.headerMod.default
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

object Header {
  @JSImport("react-navigation-stack/lib/typescript/views/Header/Header", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def backTitleVisible(value: Boolean): this.type = set("backTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundInterpolator(value: /* props */ SceneInterpolatorProps => _): this.type = set("backgroundInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def leftInterpolator(value: /* props */ SceneInterpolatorProps => _): this.type = set("leftInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def rightInterpolator(value: /* props */ SceneInterpolatorProps => _): this.type = set("rightInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def titleInterpolator(value: /* props */ SceneInterpolatorProps => _): this.type = set("titleInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def transitionPreset(value: HeaderTransitionPreset): this.type = set("transitionPreset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropsscenenavigationp): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
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
  ): Builder = {
    val __props = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], layoutInterpolator = js.Any.fromFunction1(layoutInterpolator), layoutPreset = layoutPreset.asInstanceOf[js.Any], leftButtonInterpolator = js.Any.fromFunction1(leftButtonInterpolator), leftLabelInterpolator = js.Any.fromFunction1(leftLabelInterpolator), mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], titleFromLeftInterpolator = js.Any.fromFunction1(titleFromLeftInterpolator))
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropsscenenavigationp]))
  }
}

