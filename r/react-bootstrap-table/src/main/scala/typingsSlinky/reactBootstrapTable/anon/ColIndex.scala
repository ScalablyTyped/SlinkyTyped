package typingsSlinky.reactBootstrapTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColIndex extends js.Object {
  var colIndex: Double = js.native
  var rowIndex: Double = js.native
}

object ColIndex {
  @scala.inline
  def apply(colIndex: Double, rowIndex: Double): ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColIndex]
  }
  @scala.inline
  implicit class ColIndexOps[Self <: ColIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

