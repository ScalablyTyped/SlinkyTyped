package typingsSlinky.reactVirtualized.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowIndexNumber extends js.Object {
  var rowIndex: Double = js.native
}

object RowIndexNumber {
  @scala.inline
  def apply(rowIndex: Double): RowIndexNumber = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndexNumber]
  }
  @scala.inline
  implicit class RowIndexNumberOps[Self <: RowIndexNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

