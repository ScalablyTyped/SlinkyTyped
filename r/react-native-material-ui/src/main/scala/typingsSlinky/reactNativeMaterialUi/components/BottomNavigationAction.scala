package typingsSlinky.reactNativeMaterialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeMaterialUi.AnonActive
import typingsSlinky.reactNativeMaterialUi.mod.BottomNavigation.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BottomNavigationAction
  extends ExternalComponentWithAttributesWithRefType[tag.type, Action] {
  @JSImport("react-native-material-ui", "BottomNavigation.Action")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, label */
  def apply(
    active: Boolean,
    icon: ReactElement | String,
    onPress: () => Unit = null,
    style: AnonActive = null,
    testID: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Action] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactNativeMaterialUi.mod.BottomNavigationAction
}

