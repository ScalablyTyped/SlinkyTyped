package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsListboxListBoxItemMod.ListBoxItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListBoxItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.componentsListboxListBoxItemMod.ListBoxItem] {
  @JSImport("primereact/components/listbox/ListBoxItem", "ListBoxItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onClick, onTouchEnd, selected */
  def apply(
    option: js.Any = null,
    template: /* item */ js.Any => js.UndefOr[typingsSlinky.react.reactMod._Global_.JSX.Element] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.componentsListboxListBoxItemMod.ListBoxItem] = {
    val __obj = js.Dynamic.literal()
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ListBoxItemProps
}

