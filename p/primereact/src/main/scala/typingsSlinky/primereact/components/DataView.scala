package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonRows
import typingsSlinky.primereact.dataViewMod.DataViewProps
import typingsSlinky.primereact.primereactStrings.grid
import typingsSlinky.primereact.primereactStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DataView
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactDataviewMod.DataView] {
  @JSImport("primereact/dataview", "DataView")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, rows */
  def apply(
    alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined,
    currentPageReportTemplate: String = null,
    emptyMessage: String = null,
    first: Int | Double = null,
    footer: ReactElement | String = null,
    header: ReactElement | String = null,
    itemTemplate: (/* item */ js.Any, /* layout */ grid | list) => js.UndefOr[ReactElement] = null,
    layout: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    onPage: /* e */ AnonRows => Unit = null,
    pageLinkSize: Int | Double = null,
    paginator: js.UndefOr[Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: String = null,
    rowsPerPageOptions: js.Array[Double] = null,
    sortField: String = null,
    sortOrder: Int | Double = null,
    style: String = null,
    totalRecords: Int | Double = null,
    value: js.Array[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactDataviewMod.DataView] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowPaginator)) __obj.updateDynamic("alwaysShowPaginator")(alwaysShowPaginator.asInstanceOf[js.Any])
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate.asInstanceOf[js.Any])
    if (emptyMessage != null) __obj.updateDynamic("emptyMessage")(emptyMessage.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction2(itemTemplate))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (onPage != null) __obj.updateDynamic("onPage")(js.Any.fromFunction1(onPage))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginator)) __obj.updateDynamic("paginator")(paginator.asInstanceOf[js.Any])
    if (paginatorLeft != null) __obj.updateDynamic("paginatorLeft")(paginatorLeft.asInstanceOf[js.Any])
    if (paginatorPosition != null) __obj.updateDynamic("paginatorPosition")(paginatorPosition.asInstanceOf[js.Any])
    if (paginatorRight != null) __obj.updateDynamic("paginatorRight")(paginatorRight.asInstanceOf[js.Any])
    if (paginatorTemplate != null) __obj.updateDynamic("paginatorTemplate")(paginatorTemplate.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactDataviewMod.DataView] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.primereactDataviewMod.DataView](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DataViewProps
}

