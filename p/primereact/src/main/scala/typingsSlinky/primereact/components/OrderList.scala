package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsOrderlistOrderListMod.OrderListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OrderList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.orderlistMod.OrderList] {
  @JSImport("primereact/orderlist", "OrderList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, onChange */
  def apply(
    dragdrop: js.UndefOr[Boolean] = js.undefined,
    header: js.Any = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[typingsSlinky.react.reactMod._Global_.JSX.Element] = null,
    listStyle: js.Object = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    tabIndex: String = null,
    value: js.Array[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.orderlistMod.OrderList] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dragdrop)) __obj.updateDynamic("dragdrop")(dragdrop.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.orderlistMod.OrderList] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.orderlistMod.OrderList](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = OrderListProps
}

