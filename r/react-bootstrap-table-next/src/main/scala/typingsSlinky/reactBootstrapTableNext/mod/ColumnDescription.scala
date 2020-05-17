package typingsSlinky.reactBootstrapTableNext.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactText
import typingsSlinky.reactBootstrapTableNext.anon.FilterElement
import typingsSlinky.reactBootstrapTableNext.anon.OnClick
import typingsSlinky.reactBootstrapTableNext.anon.Options
import typingsSlinky.reactBootstrapTableNext.anon.TooltipFormatter
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDescription[T /* <: js.Object */, E] extends js.Object {
  var align: js.UndefOr[CellAlignment] = js.native
  /**
    * Toggle column display in CSV export
    */
  var csvExport: js.UndefOr[Boolean] = js.native
  /**
    * Custom csv cell formatter used when exporting csv
    */
  var csvFormatter: js.UndefOr[ColumnFormatter[T, E, _]] = js.native
  /**
    * csvText defaults to column.text
    */
  var csvText: js.UndefOr[String] = js.native
  /**
    * CSV Column options only used with the toolkit provider
    */
  /**
    * export csv cell type can be Number or String
    */
  var csvType: js.UndefOr[js.Object] = js.native
  var dataField: js.Any = js.native
  var editable: js.UndefOr[
    Boolean | (js.Function4[/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double, Boolean])
  ] = js.native
  var editor: js.UndefOr[Options] = js.native
  var filter: js.UndefOr[Boolean | (TableColumnFilterProps[_, _])] = js.native
  var filterValue: js.UndefOr[
    js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, 
      /* row */ T, 
      String
    ]
  ] = js.native
  var footer: js.UndefOr[
    Boolean | Double | String | (js.Function3[
      /* columnData */ js.Any, 
      /* column */ ColumnDescription[T, E], 
      /* columnIndex */ Double, 
      String
    ])
  ] = js.native
  var footerAlign: js.UndefOr[
    CellAlignment | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, CellAlignment])
  ] = js.native
  var footerClasses: js.UndefOr[
    String | (js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, String])
  ] = js.native
  var footerEvents: js.UndefOr[OnClick[T, E]] = js.native
  var footerFormatter: js.UndefOr[
    js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, Unit]
  ] = js.native
  var footerStyle: js.UndefOr[CSSProperties] = js.native
  var footerTitle: js.UndefOr[Boolean] = js.native
  var formatExtraData: js.UndefOr[TooltipFormatter[T] with E] = js.native
  var formatter: js.UndefOr[ColumnFormatter[T, E, _]] = js.native
  var headerAlign: js.UndefOr[CellAlignment] = js.native
  var headerFormatter: js.UndefOr[HeaderFormatter[T]] = js.native
  var headerStyle: js.UndefOr[CSSProperties | js.Function0[CSSProperties]] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * If set the column will not use cell values
    */
  var isDummyField: js.UndefOr[Boolean] = js.native
  var searchable: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[Boolean] = js.native
  var sortFunc: js.UndefOr[ColumnSortFunc[T, _]] = js.native
  /**
    * Column header field
    */
  var text: String = js.native
  var tooltipDataField: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ColumnDescription {
  @scala.inline
  def apply[T, E](dataField: js.Any, text: String): ColumnDescription[T, E] = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDescription[T, E]]
  }
  @scala.inline
  implicit class ColumnDescriptionOps[Self[t, e] <: ColumnDescription[t, e], T, E] (val x: Self[T, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, E]) with Other]
    @scala.inline
    def withDataField(value: js.Any): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: CellAlignment): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvExport(value: Boolean): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvExport: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvExport")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvFormatter(value: (_, T, /* rowIndex */ Double, E) => ReactElement | String | Boolean | ReactText): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFormatter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCsvFormatter: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvText(value: String): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvText: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvText")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvType(value: js.Object): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvType: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvType")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableFunction4(value: (/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double) => Boolean): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withEditable(
      value: Boolean | (js.Function4[/* cell */ js.Any, /* row */ T, /* rowIndex */ Double, /* colIndex */ Double, Boolean])
    ): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: Options): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean | (TableColumnFilterProps[_, _])): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValue(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* cell */ js.Any, /* row */ T) => String
    ): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterValue: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFunction3(
      value: (/* columnData */ js.Any, /* column */ ColumnDescription[T, E], /* columnIndex */ Double) => String
    ): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFooter(
      value: Boolean | Double | String | (js.Function3[
          /* columnData */ js.Any, 
          /* column */ ColumnDescription[T, E], 
          /* columnIndex */ Double, 
          String
        ])
    ): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterAlignFunction2(value: (/* column */ ColumnDescription[T, E], /* colIndex */ Double) => CellAlignment): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerAlign")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFooterAlign(
      value: CellAlignment | (js.Function2[/* column */ ColumnDescription[T, E], /* colIndex */ Double, CellAlignment])
    ): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterAlign: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterClassesFunction2(value: (/* column */ ColumnDescription[T, E], /* columnIndex */ Double) => String): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClasses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFooterClasses(
      value: String | (js.Function2[/* column */ ColumnDescription[T, E], /* columnIndex */ Double, String])
    ): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterClasses: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterEvents(value: OnClick[T, E]): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterEvents: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFormatter(value: (/* column */ ColumnDescription[T, E], /* columnIndex */ Double) => Unit): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFooterFormatter: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterStyle(value: CSSProperties): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterStyle: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterTitle(value: Boolean): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterTitle: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatExtraData(value: TooltipFormatter[T] with E): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatExtraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatExtraData: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatExtraData")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: (_, T, /* rowIndex */ Double, E) => ReactElement | String | Boolean | ReactText): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderAlign(value: CellAlignment): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderAlign: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFormatter(
      value: (/* column */ ColumnDescription[T, js.Any], /* colIndex */ Double, /* components */ FilterElement) => ReactElement | String | Double | ReactText
    ): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHeaderFormatter: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderStyleFunction0(value: () => CSSProperties): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaderStyle(value: CSSProperties | js.Function0[CSSProperties]): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderStyle: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDummyField(value: Boolean): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDummyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDummyField: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDummyField")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchable: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFunc(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* a */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* b */ js.Any, /* order */ asc | desc, /* dataField */ js.Any, T, T) => Double
    ): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunc")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutSortFunc: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipDataField(value: String): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipDataField: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDataField")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

