package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplicateFilterViewResponse extends js.Object {
  /** The newly created filter. */
  var filter: js.UndefOr[FilterView] = js.native
}

object DuplicateFilterViewResponse {
  @scala.inline
  def apply(): DuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateFilterViewResponse]
  }
  @scala.inline
  implicit class DuplicateFilterViewResponseOps[Self <: DuplicateFilterViewResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: FilterView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

