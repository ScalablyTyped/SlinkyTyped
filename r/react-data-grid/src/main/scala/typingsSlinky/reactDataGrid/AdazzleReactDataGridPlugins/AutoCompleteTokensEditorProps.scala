package typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins

import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsSlinky.reactDataGrid.anon.Caption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteTokensEditorProps extends js.Object {
  var column: js.UndefOr[ExcelColumn] = js.native
  var options: js.Array[String | Caption] = js.native
  var value: js.UndefOr[js.Array[_]] = js.native
}

object AutoCompleteTokensEditorProps {
  @scala.inline
  def apply(options: js.Array[String | Caption]): AutoCompleteTokensEditorProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteTokensEditorProps]
  }
  @scala.inline
  implicit class AutoCompleteTokensEditorPropsOps[Self <: AutoCompleteTokensEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[String | Caption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withValue(value: js.Array[_]): Self = {
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
  }
  
}

