package typingsSlinky.reactVirtualized.esColumnSizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizedColumnProps extends js.Object {
  var adjustedWidth: Double = js.native
  var columnWidth: Double = js.native
  var registerChild: js.Any = js.native
  def getColumnWidth(): Double = js.native
}

object SizedColumnProps {
  @scala.inline
  def apply(adjustedWidth: Double, columnWidth: Double, getColumnWidth: () => Double, registerChild: js.Any): SizedColumnProps = {
    val __obj = js.Dynamic.literal(adjustedWidth = adjustedWidth.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], getColumnWidth = js.Any.fromFunction0(getColumnWidth), registerChild = registerChild.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizedColumnProps]
  }
  @scala.inline
  implicit class SizedColumnPropsOps[Self <: SizedColumnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustedWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColumnWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterChild(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerChild")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

