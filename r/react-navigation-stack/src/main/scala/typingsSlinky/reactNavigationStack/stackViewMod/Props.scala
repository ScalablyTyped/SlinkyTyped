package typingsSlinky.reactNavigationStack.stackViewMod

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackConfig
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var descriptors: SceneDescriptorMap
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var navigationConfig: NavigationStackConfig
  var onGestureBegin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onGestureCanceled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onGestureEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var screenProps: js.UndefOr[js.Any] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    navigationConfig: NavigationStackConfig
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setDescriptors(value: SceneDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationConfig(value: NavigationStackConfig): Self = this.set("navigationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnGestureBegin(value: () => Unit): Self = this.set("onGestureBegin", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnGestureBegin: Self = this.set("onGestureBegin", js.undefined)
    @scala.inline
    def setOnGestureCanceled(value: () => Unit): Self = this.set("onGestureCanceled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnGestureCanceled: Self = this.set("onGestureCanceled", js.undefined)
    @scala.inline
    def setOnGestureEnd(value: () => Unit): Self = this.set("onGestureEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnGestureEnd: Self = this.set("onGestureEnd", js.undefined)
    @scala.inline
    def setOnTransitionStart(value: () => Unit): Self = this.set("onTransitionStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTransitionStart: Self = this.set("onTransitionStart", js.undefined)
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenProps: Self = this.set("screenProps", js.undefined)
  }
  
}

