package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Table.TableProps
import typingsSlinky.materialDashUi.materialDashUiStrings.all
import typingsSlinky.materialDashUi.tableMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/Table", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    allRowsSelected: js.UndefOr[Boolean] = js.undefined,
    bodyStyle: CSSProperties = null,
    fixedFooter: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    footerStyle: CSSProperties = null,
    headerStyle: CSSProperties = null,
    height: String = null,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* row */ Double, /* column */ Double) => Unit = null,
    onCellHover: (/* row */ Double, /* column */ Double) => Unit = null,
    onCellHoverExit: (/* row */ Double, /* column */ Double) => Unit = null,
    onRowHover: /* row */ Double => Unit = null,
    onRowHoverExit: /* row */ Double => Unit = null,
    onRowSelection: /* selectedRows */ js.Array[Double] | all => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    wrapperStyle: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedFooter)) __obj.updateDynamic("fixedFooter")(fixedFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction2(onCellHover))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction2(onCellHoverExit))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction1(onRowHover))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction1(onRowHoverExit))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1(onRowSelection))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.materialDashUi.tableMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableProps
}

