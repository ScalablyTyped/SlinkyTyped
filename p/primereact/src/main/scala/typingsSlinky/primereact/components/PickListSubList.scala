package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonEventValue
import typingsSlinky.primereact.pickListSubListMod.PickListSubListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListSubList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.pickListSubListMod.PickListSubList] {
  @JSImport("primereact/components/picklist/PickListSubList", "PickListSubList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    header: String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[ReactElement] = null,
    list: js.Array[_] = null,
    listClassName: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    onItemClick: () => Unit = null,
    onSelectionChange: /* e */ AnonEventValue => Unit = null,
    selection: js.Array[_] = null,
    showControls: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.pickListSubListMod.PickListSubList] = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction0(onItemClick))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(showControls)) __obj.updateDynamic("showControls")(showControls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.pickListSubListMod.PickListSubList] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.pickListSubListMod.PickListSubList](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PickListSubListProps
}

