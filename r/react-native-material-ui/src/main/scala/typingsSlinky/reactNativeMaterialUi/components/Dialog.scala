package typingsSlinky.reactNativeMaterialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeMaterialUi.AnonContainerViewStyle
import typingsSlinky.reactNativeMaterialUi.mod.DialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dialog
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Dialog] {
  @JSImport("react-native-material-ui", "Dialog")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onPress: () => Unit = null,
    style: AnonContainerViewStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Dialog] = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Dialog] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeMaterialUi.mod.Dialog](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DialogProps
}

