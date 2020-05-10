package typingsSlinky.primereact.columnColumnMod

import slinky.core.facade.ReactElement
import typingsSlinky.primereact.AnonField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnProps extends js.Object {
  var body: js.UndefOr[js.Any] = js.native
  var bodyClassName: js.UndefOr[String] = js.native
  var bodyStyle: js.UndefOr[js.Object] = js.native
  var className: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var columnKey: js.UndefOr[String] = js.native
  var editor: js.UndefOr[js.Function1[/* props */ js.Any, js.UndefOr[ReactElement]]] = js.native
  var editorValidator: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.native
  var editorValidatorEvent: js.UndefOr[String] = js.native
  var excludeGlobalFilter: js.UndefOr[Boolean] = js.native
  var expander: js.UndefOr[Boolean] = js.native
  var exportable: js.UndefOr[Boolean] = js.native
  var field: js.UndefOr[String] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filterElement: js.UndefOr[js.Object] = js.native
  var filterFunction: js.UndefOr[js.Function2[/* value */ js.Any, /* filter */ js.Any, Unit]] = js.native
  var filterMatchMode: js.UndefOr[String] = js.native
  var filterMaxLength: js.UndefOr[Double] = js.native
  var filterPlaceholder: js.UndefOr[String] = js.native
  var filterType: js.UndefOr[String] = js.native
  var footer: js.UndefOr[js.Any] = js.native
  var footerClassName: js.UndefOr[String] = js.native
  var footerStyle: js.UndefOr[js.Object] = js.native
  var frozen: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var headerClassName: js.UndefOr[String] = js.native
  var headerStyle: js.UndefOr[js.Object] = js.native
  var loadingBody: js.UndefOr[js.Any] = js.native
  var onEditorCancel: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
  var onEditorSubmit: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
  var rowEditor: js.UndefOr[Boolean] = js.native
  var rowReorder: js.UndefOr[Boolean] = js.native
  var rowReorderIcon: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var selectionMode: js.UndefOr[String] = js.native
  var sortField: js.UndefOr[String] = js.native
  var sortFunction: js.UndefOr[js.Function1[/* e */ AnonField, Unit]] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object ColumnProps {
  @scala.inline
  def apply(): ColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnProps]
  }
  @scala.inline
  implicit class ColumnPropsOps[Self <: ColumnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: /* props */ js.Any => js.UndefOr[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorValidator(value: /* props */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorValidator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEditorValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorValidator")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorValidatorEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorValidatorEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorValidatorEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorValidatorEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeGlobalFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeGlobalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeGlobalFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeGlobalFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withExpander(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expander")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpander: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expander")(js.undefined)
        ret
    }
    @scala.inline
    def withExportable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportable")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterElement(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterElement")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction(value: (/* value */ js.Any, /* filter */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMatchMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMatchMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMatchMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMatchMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingBody")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorCancel(value: /* props */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorSubmit(value: /* props */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEditor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withRowReorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowReorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withRowReorderIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowReorderIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowReorderIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowReorderIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSortField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFunction(value: /* e */ AnonField => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSortFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

