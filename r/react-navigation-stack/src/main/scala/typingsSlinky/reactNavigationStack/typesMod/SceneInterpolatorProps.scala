package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneInterpolatorProps extends js.Object {
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined
  var layout: TransitionerLayout
  var mode: js.UndefOr[HeaderMode] = js.undefined
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: AnimatedInterpolation
  var scene: Scene
  var scenes: js.Array[Scene]
  var shadowEnabled: js.UndefOr[Boolean] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayout(value: TransitionerLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: AnimatedInterpolation): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setScene(value: Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenesVarargs(value: Scene*): Self = this.set("scenes", js.Array(value :_*))
    @scala.inline
    def setScenes(value: js.Array[Scene]): Self = this.set("scenes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardOverlayEnabled(value: Boolean): Self = this.set("cardOverlayEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardOverlayEnabled: Self = this.set("cardOverlayEnabled", js.undefined)
    @scala.inline
    def setMode(value: HeaderMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setShadowEnabled(value: Boolean): Self = this.set("shadowEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowEnabled: Self = this.set("shadowEnabled", js.undefined)
  }
  
}

