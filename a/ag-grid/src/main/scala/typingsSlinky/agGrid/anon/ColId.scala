package typingsSlinky.agGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColId extends js.Object {
  var colId: String = js.native
  var sort: String = js.native
}

object ColId {
  @scala.inline
  def apply(colId: String, sort: String): ColId = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColId]
  }
  @scala.inline
  implicit class ColIdOps[Self <: ColId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

