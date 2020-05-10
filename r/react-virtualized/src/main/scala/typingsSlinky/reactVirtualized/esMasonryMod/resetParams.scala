package typingsSlinky.reactVirtualized.esMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait resetParams extends js.Object {
  var columnCount: Double = js.native
  var columnWidth: Double = js.native
  var spacer: js.UndefOr[Double] = js.native
}

object resetParams {
  @scala.inline
  def apply(columnCount: Double, columnWidth: Double): resetParams = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[resetParams]
  }
  @scala.inline
  implicit class resetParamsOps[Self <: resetParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacer")(js.undefined)
        ret
    }
  }
  
}

