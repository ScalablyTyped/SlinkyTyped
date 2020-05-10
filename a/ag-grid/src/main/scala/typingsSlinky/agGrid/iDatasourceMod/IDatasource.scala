package typingsSlinky.agGrid.iDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatasource extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** If you know up front how many rows are in the dataset, set it here. Otherwise leave blank.*/
  var rowCount: js.UndefOr[Double] = js.native
  /** Callback the grid calls that you implement to fetch rows from the server. See below for params.*/
  def getRows(params: IGetRowsParams): Unit = js.native
}

object IDatasource {
  @scala.inline
  def apply(getRows: IGetRowsParams => Unit): IDatasource = {
    val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction1(getRows))
    __obj.asInstanceOf[IDatasource]
  }
  @scala.inline
  implicit class IDatasourceOps[Self <: IDatasource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRows(value: IGetRowsParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(js.undefined)
        ret
    }
  }
  
}

