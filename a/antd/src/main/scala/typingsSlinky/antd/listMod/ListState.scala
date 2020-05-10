package typingsSlinky.antd.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListState extends js.Object {
  var paginationCurrent: Double = js.native
  var paginationSize: Double = js.native
}

object ListState {
  @scala.inline
  def apply(paginationCurrent: Double, paginationSize: Double): ListState = {
    val __obj = js.Dynamic.literal(paginationCurrent = paginationCurrent.asInstanceOf[js.Any], paginationSize = paginationSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListState]
  }
  @scala.inline
  implicit class ListStateOps[Self <: ListState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaginationCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

