package typingsSlinky.rcDashTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashTable.libColumnMod.ColumnProps
import typingsSlinky.rcDashTable.libInterfaceMod.ColumnType
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import typingsSlinky.rcDashTable.libInterfaceMod.FixedType
import typingsSlinky.rcDashTable.libInterfaceMod.Key
import typingsSlinky.rcDashTable.libInterfaceMod.RenderedCell
import typingsSlinky.rcDashTable.rcDashTableStrings.center
import typingsSlinky.rcDashTable.rcDashTableStrings.left
import typingsSlinky.rcDashTable.rcDashTableStrings.right
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ColumnProps1569304802 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  /* The following DOM/SVG props were specified: className, colSpan, rowSpan, width */
  def apply(
    align: left | center | right = null,
    dataIndex: Key = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedType = null,
    onCell: (DefaultValueType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onCellClick: (DefaultValueType, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onHeaderCell: (ColumnType[DefaultValueType], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    render: (/* value */ js.Any, DefaultValueType, /* index */ Double) => TagMod[Any] | RenderedCell = null,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (onCell != null) __obj.updateDynamic("onCell")(js.Any.fromFunction2(onCell))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction2(onHeaderCell))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ColumnProps
}

