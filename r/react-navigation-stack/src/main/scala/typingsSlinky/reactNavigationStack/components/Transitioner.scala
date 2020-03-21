package typingsSlinky.reactNavigationStack.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.transitionerMod.TransitionSpec
import typingsSlinky.reactNavigationStack.transitionerMod.default
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.SceneDescriptorMap
import typingsSlinky.reactNavigationStack.typesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transitioner
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-stack/lib/typescript/views/Transitioner", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    render: (TransitionProps, js.UndefOr[TransitionProps]) => TagMod[Any],
    configureTransition: (/* current */ TransitionProps, /* previous */ js.UndefOr[TransitionProps]) => TransitionSpec = null,
    onTransitionEnd: (/* current */ TransitionProps, /* previous */ js.UndefOr[TransitionProps]) => Unit | js.Promise[_] = null,
    onTransitionStart: (/* current */ TransitionProps, /* previous */ js.UndefOr[TransitionProps]) => Unit | js.Promise[_] = null,
    screenProps: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(js.Any.fromFunction2(configureTransition))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction2(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2(onTransitionStart))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactNavigationStack.transitionerMod.Props
}

