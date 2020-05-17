package typingsSlinky.reactVirtualized.anon

import typingsSlinky.reactVirtualized.esTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortBy extends js.Object {
  var sortBy: String = js.native
  var sortDirection: SortDirectionType = js.native
}

object SortBy {
  @scala.inline
  def apply(sortBy: String, sortDirection: SortDirectionType): SortBy = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortBy]
  }
  @scala.inline
  implicit class SortByOps[Self <: SortBy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSortBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortDirection(value: SortDirectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

