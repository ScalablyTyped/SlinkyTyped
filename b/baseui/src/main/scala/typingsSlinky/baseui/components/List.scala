package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonOldIndex
import typingsSlinky.baseui.dndListMod.ListOverrides
import typingsSlinky.baseui.dndListMod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.dndListMod.List] {
  @JSImport("baseui/dnd-list", "List")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    items: js.Array[TagMod[Any]] = null,
    onChange: /* args */ AnonOldIndex => _ = null,
    overrides: ListOverrides = null,
    removable: js.UndefOr[Boolean] = js.undefined,
    removableByMove: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.dndListMod.List] = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable.asInstanceOf[js.Any])
    if (!js.isUndefined(removableByMove)) __obj.updateDynamic("removableByMove")(removableByMove.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.dndListMod.List] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.dndListMod.List](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ListProps
}

