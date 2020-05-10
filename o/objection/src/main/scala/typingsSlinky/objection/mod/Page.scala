package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page[QM] extends js.Object {
  var results: js.Array[QM] = js.native
  var total: Double = js.native
}

object Page {
  @scala.inline
  def apply[QM](results: js.Array[QM], total: Double): Page[QM] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page[QM]]
  }
  @scala.inline
  implicit class PageOps[Self[qm] <: Page[qm], QM] (val x: Self[QM]) extends AnyVal {
    @scala.inline
    def duplicate: Self[QM] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[QM]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[QM] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[QM] with Other]
    @scala.inline
    def withResults(value: js.Array[QM]): Self[QM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self[QM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

