package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access the chart's position within a sheet. Can be updated using the EmbeddedChart.modify() function.
  *
  *     chart = chart.modify().setPosition(5, 5, 0, 0).build();
  *     sheet.updateChart(chart);
  */
@js.native
trait ContainerInfo extends js.Object {
  def getAnchorColumn(): Integer = js.native
  def getAnchorRow(): Integer = js.native
  def getOffsetX(): Integer = js.native
  def getOffsetY(): Integer = js.native
}

object ContainerInfo {
  @scala.inline
  def apply(
    getAnchorColumn: () => Integer,
    getAnchorRow: () => Integer,
    getOffsetX: () => Integer,
    getOffsetY: () => Integer
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal(getAnchorColumn = js.Any.fromFunction0(getAnchorColumn), getAnchorRow = js.Any.fromFunction0(getAnchorRow), getOffsetX = js.Any.fromFunction0(getOffsetX), getOffsetY = js.Any.fromFunction0(getOffsetY))
    __obj.asInstanceOf[ContainerInfo]
  }
  @scala.inline
  implicit class ContainerInfoOps[Self <: ContainerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAnchorColumn(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAnchorRow(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffsetX(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffsetY(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetY")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

