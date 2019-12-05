package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.div.tag
import typingsSlinky.atBlueprintjsTable.libEsmCommonGridMod.Grid
import typingsSlinky.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.ITableQuadrantProps
import typingsSlinky.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableQuadrant
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.TableQuadrant
    ] {
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onScroll, onWheel */
  def apply(
    bodyRenderer: (js.UndefOr[QuadrantType], js.UndefOr[Boolean], js.UndefOr[Boolean]) => typingsSlinky.react.reactMod._Global_.JSX.Element,
    grid: Grid,
    bodyRef: /* ref */ HTMLElement | Null => _ = null,
    columnHeaderCellRenderer: /* showFrozenColumnsOnly */ js.UndefOr[Boolean] => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: () => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    quadrantRef: /* ref */ HTMLElement | Null => _ = null,
    quadrantType: QuadrantType = null,
    rowHeaderCellRenderer: /* showFrozenRowsOnly */ js.UndefOr[Boolean] => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    scrollContainerRef: /* ref */ HTMLElement | Null => _ = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.TableQuadrant
  ] = {
    val __obj = js.Dynamic.literal(bodyRenderer = js.Any.fromFunction3(bodyRenderer), grid = grid.asInstanceOf[js.Any])
    if (bodyRef != null) __obj.updateDynamic("bodyRef")(js.Any.fromFunction1(bodyRef))
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1(columnHeaderCellRenderer))
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction0(menuRenderer))
    if (quadrantRef != null) __obj.updateDynamic("quadrantRef")(js.Any.fromFunction1(quadrantRef))
    if (quadrantType != null) __obj.updateDynamic("quadrantType")(quadrantType.asInstanceOf[js.Any])
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1(rowHeaderCellRenderer))
    if (scrollContainerRef != null) __obj.updateDynamic("scrollContainerRef")(js.Any.fromFunction1(scrollContainerRef))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITableQuadrantProps
}

