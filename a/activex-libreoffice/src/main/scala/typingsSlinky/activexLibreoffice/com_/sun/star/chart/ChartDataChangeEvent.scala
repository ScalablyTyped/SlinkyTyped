package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a change that was applied to the data. */
@js.native
trait ChartDataChangeEvent extends EventObject {
  /** specifies the column number in which the changes end. */
  var EndColumn: Double = js.native
  /** specifies the row number in which the changes end. */
  var EndRow: Double = js.native
  /** specifies the column number in which the changes begin. */
  var StartColumn: Double = js.native
  /** specifies the row number in which the changes begin. */
  var StartRow: Double = js.native
  /** specifies the type of change to the data. */
  var Type: ChartDataChangeType = js.native
}

object ChartDataChangeEvent {
  @scala.inline
  def apply(
    EndColumn: Double,
    EndRow: Double,
    Source: XInterface,
    StartColumn: Double,
    StartRow: Double,
    Type: ChartDataChangeType
  ): ChartDataChangeEvent = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn.asInstanceOf[js.Any], EndRow = EndRow.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], StartColumn = StartColumn.asInstanceOf[js.Any], StartRow = StartRow.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataChangeEvent]
  }
  @scala.inline
  implicit class ChartDataChangeEventOps[Self <: ChartDataChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ChartDataChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

