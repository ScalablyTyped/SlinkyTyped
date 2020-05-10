package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortRangeRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.native
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
}

object SortRangeRequest {
  @scala.inline
  def apply(): SortRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortRangeRequest]
  }
  @scala.inline
  implicit class SortRangeRequestOps[Self <: SortRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSortSpecs(value: js.Array[SortSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSpecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSpecs")(js.undefined)
        ret
    }
  }
  
}

