package typingsSlinky.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Table/Table.TableProps> */
@js.native
trait WeakValidationMapTablePro extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var headers: js.UndefOr[Validator[js.UndefOr[(js.Array[TagMod[Any] | String]) | Null]]] = js.native
  var tableBodyClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var tableBodyProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var tableBodyRowProps: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) | Null | StringDictionary[_]
      ]
    ]
  ] = js.native
  var tableCellClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var tableData: js.UndefOr[Validator[js.UndefOr[js.Array[AnonRowData] | Null]]] = js.native
  var tableHeaderClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var tableHeaderProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var tableHeaderRowClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var tableHeaderRowProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var tableRowClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}

object WeakValidationMapTablePro {
  @scala.inline
  def apply(): WeakValidationMapTablePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTablePro]
  }
  @scala.inline
  implicit class WeakValidationMapTableProOps[Self <: WeakValidationMapTablePro] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Validator[js.UndefOr[(js.Array[TagMod[Any] | String]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBodyClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyProps(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBodyProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyRowProps(
      value: Validator[
          js.UndefOr[
            (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) | Null | StringDictionary[_]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyRowProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBodyRowProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyRowProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCellClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableData(value: Validator[js.UndefOr[js.Array[AnonRowData] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableData")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderProps(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderRowClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderRowClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderRowClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderRowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderRowProps(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderRowProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderRowProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderRowProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowClassName")(js.undefined)
        ret
    }
  }
  
}

