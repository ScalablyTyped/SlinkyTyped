package typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins

import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsSlinky.reactDataGrid.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteEditorProps extends js.Object {
  var column: js.UndefOr[ExcelColumn] = js.native
  var editorDisplayValue: js.UndefOr[js.Function2[/* column */ ExcelColumn, /* value */ js.Any, String]] = js.native
  var height: js.UndefOr[Double] = js.native
  var label: js.UndefOr[js.Any] = js.native
  var onCommit: js.UndefOr[js.Function0[Unit]] = js.native
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.native
  var options: js.UndefOr[js.Array[Id]] = js.native
  var resultIdentifier: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
  var valueParams: js.UndefOr[js.Array[String]] = js.native
}

object AutoCompleteEditorProps {
  @scala.inline
  def apply(): AutoCompleteEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteEditorProps]
  }
  @scala.inline
  implicit class AutoCompleteEditorPropsOps[Self <: AutoCompleteEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: ExcelColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorDisplayValue(value: (/* column */ ExcelColumn, /* value */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorDisplayValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditorDisplayValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorDisplayValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCommit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCommit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withResultIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueParams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueParams")(js.undefined)
        ret
    }
  }
  
}

