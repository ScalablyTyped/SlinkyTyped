package typingsSlinky.antd.tableInterfaceMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.PartialOmitCheckboxPropsc
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowSelection[T] extends js.Object {
  var columnTitle: js.UndefOr[String | TagMod[Any]] = js.native
  var columnWidth: js.UndefOr[String | Double] = js.native
  var fixed: js.UndefOr[Boolean] = js.native
  var getCheckboxProps: js.UndefOr[js.Function1[/* record */ T, PartialOmitCheckboxPropsc]] = js.native
  var hideDefaultSelections: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T], Unit]
  ] = js.native
  var onSelect: js.UndefOr[SelectionSelectFn[T]] = js.native
  /** @deprecated This function is meaningless and should use `onChange` instead */
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.native
  /** @deprecated This function is meaningless and should use `onChange` instead */
  var onSelectInvert: js.UndefOr[js.Function1[/* selectedRowKeys */ js.Array[Key], Unit]] = js.native
  var onSelectMultiple: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.native
  var selectedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  var selections: js.UndefOr[js.Array[SelectionItem] | Boolean] = js.native
  var `type`: js.UndefOr[RowSelectionType] = js.native
}

object TableRowSelection {
  @scala.inline
  def apply[T](): TableRowSelection[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowSelection[T]]
  }
  @scala.inline
  implicit class TableRowSelectionOps[Self[t] <: TableRowSelection[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColumnTitleReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnTitle(value: String | TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnTitle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: String | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCheckboxProps(value: /* record */ T => PartialOmitCheckboxPropsc): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCheckboxProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCheckboxProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCheckboxProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDefaultSelections(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDefaultSelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDefaultSelections: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDefaultSelections")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(
      value: (T, /* selected */ Boolean, /* selectedRows */ js.Array[js.Object], /* nativeEvent */ Event_) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectAll(
      value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSelectAll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectInvert(value: /* selectedRowKeys */ js.Array[Key] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectInvert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectInvert: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectInvert")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectMultiple(
      value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectMultiple")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSelectMultiple: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRowKeys(value: js.Array[Key]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRowKeys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSelections(value: js.Array[SelectionItem] | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelections: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selections")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RowSelectionType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

