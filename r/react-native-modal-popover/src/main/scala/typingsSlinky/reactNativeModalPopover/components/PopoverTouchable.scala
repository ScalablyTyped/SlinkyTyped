package typingsSlinky.reactNativeModalPopover.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PopoverTouchable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverTouchable] {
  @JSImport("react-native-modal-popover", "PopoverTouchable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(onPopoverDisplayed: () => _ = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverTouchable] = {
    val __obj = js.Dynamic.literal()
    if (onPopoverDisplayed != null) __obj.updateDynamic("onPopoverDisplayed")(js.Any.fromFunction0(onPopoverDisplayed))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeModalPopover.mod.PopoverTouchable] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeModalPopover.mod.PopoverTouchable](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactNativeModalPopover.popoverTouchableMod.Props
}

