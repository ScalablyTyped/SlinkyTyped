package typingsSlinky.griddleReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.griddleReact.mod.GriddleComponent
import typingsSlinky.griddleReact.mod.components.CellProps
import typingsSlinky.griddleReact.mod.components.ColumnDefinition
import typingsSlinky.griddleReact.mod.components.ColumnDefinitionProps
import typingsSlinky.griddleReact.mod.components.TableHeadingCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsColumnDefinition
  extends ExternalComponentWithAttributesWithRefType[tag.type, ColumnDefinition] {
  @JSImport("griddle-react", "components.ColumnDefinition")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: colSpan, title, width */
  def apply(
    id: String,
    cssClassName: String | (js.Function1[/* props */ js.Any, String]) = null,
    customComponent: GriddleComponent[CellProps with js.Any] = null,
    customHeadingComponent: GriddleComponent[TableHeadingCellProps with js.Any] = null,
    extraData: js.Any = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    headerCssClassName: String | (js.Function1[/* props */ js.Any, String]) = null,
    isMetadata: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    order: Int | Double = null,
    sortMethod: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double = null,
    sortType: String = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ColumnDefinition] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (cssClassName != null) __obj.updateDynamic("cssClassName")(cssClassName.asInstanceOf[js.Any])
    if (customComponent != null) __obj.updateDynamic("customComponent")(customComponent.asInstanceOf[js.Any])
    if (customHeadingComponent != null) __obj.updateDynamic("customHeadingComponent")(customHeadingComponent.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (headerCssClassName != null) __obj.updateDynamic("headerCssClassName")(headerCssClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isMetadata)) __obj.updateDynamic("isMetadata")(isMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3(sortMethod))
    if (sortType != null) __obj.updateDynamic("sortType")(sortType.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ColumnDefinitionProps
}

