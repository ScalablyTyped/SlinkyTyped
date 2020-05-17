package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTD extends js.Object {
  @JSName("Excel.RTD_typekey")
  var ExcelDotRTD_typekey: RTD = js.native
  var ThrottleInterval: Double = js.native
  def RefreshData(): Unit = js.native
  def RestartServers(): Unit = js.native
}

object RTD {
  @scala.inline
  def apply(
    ExcelDotRTD_typekey: RTD,
    RefreshData: () => Unit,
    RestartServers: () => Unit,
    ThrottleInterval: Double
  ): RTD = {
    val __obj = js.Dynamic.literal(RefreshData = js.Any.fromFunction0(RefreshData), RestartServers = js.Any.fromFunction0(RestartServers), ThrottleInterval = ThrottleInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.RTD_typekey")(ExcelDotRTD_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTD]
  }
  @scala.inline
  implicit class RTDOps[Self <: RTD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcelDotRTD_typekey(value: RTD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.RTD_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestartServers(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartServers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThrottleInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrottleInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

