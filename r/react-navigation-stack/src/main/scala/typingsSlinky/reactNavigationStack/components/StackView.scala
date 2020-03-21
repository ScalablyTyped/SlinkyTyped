package typingsSlinky.reactNavigationStack.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.stackViewMod.default
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackConfig
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackView
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-stack/lib/typescript/views/StackView/StackView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    navigationConfig: NavigationStackConfig,
    onGestureBegin: () => Unit = null,
    onGestureCanceled: () => Unit = null,
    onGestureEnd: () => Unit = null,
    onTransitionStart: () => Unit = null,
    screenProps: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    if (onGestureBegin != null) __obj.updateDynamic("onGestureBegin")(js.Any.fromFunction0(onGestureBegin))
    if (onGestureCanceled != null) __obj.updateDynamic("onGestureCanceled")(js.Any.fromFunction0(onGestureCanceled))
    if (onGestureEnd != null) __obj.updateDynamic("onGestureEnd")(js.Any.fromFunction0(onGestureEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction0(onTransitionStart))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactNavigationStack.stackViewMod.Props
}

