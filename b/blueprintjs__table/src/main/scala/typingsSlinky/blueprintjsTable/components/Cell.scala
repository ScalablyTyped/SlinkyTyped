package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsTable.cellMod.ICellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cell
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsTable.mod.Cell] {
  @JSImport("@blueprintjs/table", "Cell")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style, tabIndex */
  def apply(
    cellRef: /* ref */ HTMLElement | Null => Unit = null,
    columnIndex: Int | Double = null,
    intent: Intent = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onKeyDown: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    rowIndex: Int | Double = null,
    tooltip: String = null,
    truncated: js.UndefOr[Boolean] = js.undefined,
    wrapText: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Cell] = {
    val __obj = js.Dynamic.literal()
    if (cellRef != null) __obj.updateDynamic("cellRef")(js.Any.fromFunction1(cellRef))
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Cell] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsTable.mod.Cell](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ICellProps
}

