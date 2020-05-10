package typingsSlinky.agGrid.iRangeControllerMod

import typingsSlinky.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRangeSelectionParams extends js.Object {
  var columnEnd: String | Column = js.native
  var columnStart: String | Column = js.native
  var floatingEnd: String = js.native
  var floatingStart: String = js.native
  var rowEnd: Double = js.native
  var rowStart: Double = js.native
}

object AddRangeSelectionParams {
  @scala.inline
  def apply(
    columnEnd: String | Column,
    columnStart: String | Column,
    floatingEnd: String,
    floatingStart: String,
    rowEnd: Double,
    rowStart: Double
  ): AddRangeSelectionParams = {
    val __obj = js.Dynamic.literal(columnEnd = columnEnd.asInstanceOf[js.Any], columnStart = columnStart.asInstanceOf[js.Any], floatingEnd = floatingEnd.asInstanceOf[js.Any], floatingStart = floatingStart.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any], rowStart = rowStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRangeSelectionParams]
  }
  @scala.inline
  implicit class AddRangeSelectionParamsOps[Self <: AddRangeSelectionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnEnd(value: String | Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnStart(value: String | Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatingEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatingStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

