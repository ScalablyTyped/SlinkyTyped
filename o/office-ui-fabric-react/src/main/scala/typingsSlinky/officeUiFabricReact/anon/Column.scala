package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  var column: IColumn = js.native
  var index: Double = js.native
  def onMeasureDone(measuredWidth: Double): scala.Unit = js.native
}

object Column {
  @scala.inline
  def apply(column: IColumn, index: Double, onMeasureDone: Double => scala.Unit): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onMeasureDone = js.Any.fromFunction1(onMeasureDone))
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: IColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMeasureDone(value: Double => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMeasureDone")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

