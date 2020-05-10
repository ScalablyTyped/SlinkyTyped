package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddNamedRangeRequest extends js.Object {
  /**
    * The named range to add. The namedRangeId
    * field is optional; if one is not set, an id will be randomly generated. (It
    * is an error to specify the ID of a range that already exists.)
    */
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

