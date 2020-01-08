package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Table.TableRowProps
import typingsSlinky.materialDashUi.tableTableRowMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableRow
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/Table/TableRow", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, selected */
  def apply(
    displayBorder: js.UndefOr[Boolean] = js.undefined,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    hovered: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double) => Unit = null,
    onCellHover: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double) => Unit = null,
    onCellHoverExit: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double) => Unit = null,
    onRowClick: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double) => Unit = null,
    onRowHover: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double) => Unit = null,
    onRowHoverExit: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double) => Unit = null,
    rowNumber: Int | Double = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayBorder)) __obj.updateDynamic("displayBorder")(displayBorder.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (!js.isUndefined(hovered)) __obj.updateDynamic("hovered")(hovered.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction3(onCellClick))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction3(onCellHover))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction3(onCellHoverExit))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction2(onRowHover))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction2(onRowHoverExit))
    if (rowNumber != null) __obj.updateDynamic("rowNumber")(rowNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.materialDashUi.tableTableRowMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableRowProps
}

