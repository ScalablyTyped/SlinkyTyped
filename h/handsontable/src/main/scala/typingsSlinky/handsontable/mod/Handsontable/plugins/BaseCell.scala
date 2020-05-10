package typingsSlinky.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseCell extends js.Object {
  var columnAbsolute: Boolean = js.native
  var columnOffset: Double = js.native
  var rowAbsolute: Boolean = js.native
  var rowOffset: Double = js.native
  def isEqual(cell: BaseCell): Boolean = js.native
  def translateTo(rowOffset: Double, columnOffset: Double): Unit = js.native
}

object BaseCell {
  @scala.inline
  def apply(
    columnAbsolute: Boolean,
    columnOffset: Double,
    isEqual: BaseCell => Boolean,
    rowAbsolute: Boolean,
    rowOffset: Double,
    translateTo: (Double, Double) => Unit
  ): BaseCell = {
    val __obj = js.Dynamic.literal(columnAbsolute = columnAbsolute.asInstanceOf[js.Any], columnOffset = columnOffset.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), rowAbsolute = rowAbsolute.asInstanceOf[js.Any], rowOffset = rowOffset.asInstanceOf[js.Any], translateTo = js.Any.fromFunction2(translateTo))
    __obj.asInstanceOf[BaseCell]
  }
  @scala.inline
  implicit class BaseCellOps[Self <: BaseCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnAbsolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEqual(value: BaseCell => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAbsolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateTo(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateTo")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

