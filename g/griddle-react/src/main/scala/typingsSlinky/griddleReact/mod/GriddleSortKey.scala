package typingsSlinky.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleSortKey extends js.Object {
  var id: String = js.native
  var sortAscending: Boolean = js.native
}

object GriddleSortKey {
  @scala.inline
  def apply(id: String, sortAscending: Boolean): GriddleSortKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sortAscending = sortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddleSortKey]
  }
  @scala.inline
  implicit class GriddleSortKeyOps[Self <: GriddleSortKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

