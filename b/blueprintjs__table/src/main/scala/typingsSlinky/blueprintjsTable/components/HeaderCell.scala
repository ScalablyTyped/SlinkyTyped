package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsTable.headerCellMod.IInternalHeaderCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderCell
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsTable.headerCellMod.HeaderCell] {
  @JSImport("@blueprintjs/table/lib/esm/headers/headerCell", "HeaderCell")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, name, style */
  def apply(
    index: Int | Double = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[Double] => ReactElement = null,
    reorderHandle: ReactElement = null,
    resizeHandle: typingsSlinky.blueprintjsTable.resizeHandleMod.ResizeHandle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.headerCellMod.HeaderCell] = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1(menuRenderer))
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.asInstanceOf[js.Any])
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.headerCellMod.HeaderCell] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.blueprintjsTable.headerCellMod.HeaderCell](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IInternalHeaderCellProps
}

