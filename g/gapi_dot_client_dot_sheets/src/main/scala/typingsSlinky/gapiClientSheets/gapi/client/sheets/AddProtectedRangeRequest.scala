package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddProtectedRangeRequest extends js.Object {
  /**
    * The protected range to be added. The
    * protectedRangeId field is optional; if
    * one is not set, an id will be randomly generated. (It is an error to
    * specify the ID of a range that already exists.)
    */
  var protectedRange: js.UndefOr[ProtectedRange] = js.native
}

object AddProtectedRangeRequest {
  @scala.inline
  def apply(): AddProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddProtectedRangeRequest]
  }
  @scala.inline
  implicit class AddProtectedRangeRequestOps[Self <: AddProtectedRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtectedRange(value: ProtectedRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRange")(js.undefined)
        ret
    }
  }
  
}

