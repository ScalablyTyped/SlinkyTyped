package typingsSlinky.cliColor.columnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnsOptions extends js.Object {
  /**
    * columns: Per column customizations, as e.g. `[{ align: 'right' }, null, { align: 'left' }]`
    */
  var columns: js.UndefOr[js.Array[ColumnOptions | Null]] = js.native
  /**
    *  Custom colums separator (defaults to `|`)
    */
  var sep: js.UndefOr[String] = js.native
}

object ColumnsOptions {
  @scala.inline
  def apply(): ColumnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnsOptions]
  }
  @scala.inline
  implicit class ColumnsOptionsOps[Self <: ColumnsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[ColumnOptions | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(js.undefined)
        ret
    }
  }
  
}

