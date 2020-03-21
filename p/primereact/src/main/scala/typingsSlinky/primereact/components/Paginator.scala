package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.paginatorMod.PageState
import typingsSlinky.primereact.paginatorMod.PaginatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Paginator
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactPaginatorMod.Paginator] {
  @JSImport("primereact/paginator", "Paginator")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, rows */
  def apply(
    alwaysShow: js.UndefOr[Boolean] = js.undefined,
    currentPageReportTemplate: String = null,
    first: Int | Double = null,
    leftContent: ReactElement = null,
    onPageChange: /* event */ PageState => Unit = null,
    pageLinkSize: Int | Double = null,
    rightContent: ReactElement = null,
    rowsPerPageOptions: js.Array[_] = null,
    style: js.Object = null,
    template: String = null,
    totalRecords: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactPaginatorMod.Paginator] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow.asInstanceOf[js.Any])
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (leftContent != null) __obj.updateDynamic("leftContent")(leftContent.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (rightContent != null) __obj.updateDynamic("rightContent")(rightContent.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactPaginatorMod.Paginator] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.primereactPaginatorMod.Paginator](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PaginatorProps
}

