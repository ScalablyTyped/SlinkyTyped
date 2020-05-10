package typingsSlinky.reactVirtualized.esTableMod

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortParams extends js.Object {
  var defaultSortDirection: SortDirectionType = js.native
  var event: MouseEvent = js.native
  var sortBy: String = js.native
}

object SortParams {
  @scala.inline
  def apply(defaultSortDirection: SortDirectionType, event: MouseEvent, sortBy: String): SortParams = {
    val __obj = js.Dynamic.literal(defaultSortDirection = defaultSortDirection.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortParams]
  }
  @scala.inline
  implicit class SortParamsOps[Self <: SortParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSortDirection(value: SortDirectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

