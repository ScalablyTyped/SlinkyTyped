package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonOptionOriginalEvent
import typingsSlinky.primereact.listBoxItemMod.ListBoxItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListBoxItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.listBoxItemMod.ListBoxItem] {
  @JSImport("primereact/components/listbox/ListBoxItem", "ListBoxItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: selected */
  def apply(
    onClick: /* e */ AnonOptionOriginalEvent => Unit = null,
    onTouchEnd: /* e */ AnonOptionOriginalEvent => Unit = null,
    option: js.Any = null,
    template: /* item */ js.Any => js.UndefOr[ReactElement] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.listBoxItemMod.ListBoxItem] = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.listBoxItemMod.ListBoxItem] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.listBoxItemMod.ListBoxItem](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ListBoxItemProps
}

