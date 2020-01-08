package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsPicklistPickListItemMod.PickListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.componentsPicklistPickListItemMod.PickListItem] {
  @JSImport("primereact/components/picklist/PickListItem", "PickListItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick, selected */
  def apply(
    template: /* item */ js.Any => js.UndefOr[typingsSlinky.react.reactMod._Global_.JSX.Element] = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.componentsPicklistPickListItemMod.PickListItem] = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.componentsPicklistPickListItemMod.PickListItem] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.componentsPicklistPickListItemMod.PickListItem](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PickListItemProps
}

