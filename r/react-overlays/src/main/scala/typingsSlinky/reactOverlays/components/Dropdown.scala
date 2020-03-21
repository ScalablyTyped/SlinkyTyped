package typingsSlinky.reactOverlays.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactOverlays.dropdownMod.Directions
import typingsSlinky.reactOverlays.dropdownMod.DropdownProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOverlays.mod.Dropdown] {
  @JSImport("react-overlays", "Dropdown")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    alignEnd: js.UndefOr[Boolean] = js.undefined,
    drop: Directions = null,
    itemSelector: String = null,
    onToggle: (/* isOpen */ Boolean, /* event */ SyntheticEvent[Event_, _]) => Unit = null,
    show: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.Dropdown] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignEnd)) __obj.updateDynamic("alignEnd")(alignEnd.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.Dropdown] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactOverlays.mod.Dropdown](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DropdownProps
}

