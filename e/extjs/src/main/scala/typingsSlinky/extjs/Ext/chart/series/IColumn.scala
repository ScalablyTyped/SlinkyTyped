package typingsSlinky.extjs.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumn extends IBar {
  /** [Config Option] (String) */
  @JSName("axis")
  var axis_IColumn: js.UndefOr[String] = js.native
}

object IColumn {
  @scala.inline
  def apply(): IColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumn]
  }
  @scala.inline
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
  }
  
}

