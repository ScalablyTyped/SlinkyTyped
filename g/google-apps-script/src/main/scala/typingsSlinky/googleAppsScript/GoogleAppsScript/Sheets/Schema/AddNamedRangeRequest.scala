package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddNamedRangeRequest extends js.Object {
  var namedRange: js.UndefOr[NamedRange] = js.native
}

object AddNamedRangeRequest {
  @scala.inline
  def apply(): AddNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddNamedRangeRequest]
  }
  @scala.inline
  implicit class AddNamedRangeRequestOps[Self <: AddNamedRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedRange(value: NamedRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRange")(js.undefined)
        ret
    }
  }
  
}

