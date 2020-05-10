package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddNamedRangeResponse extends js.Object {
  /** The named range to add. */
  var namedRange: js.UndefOr[NamedRange] = js.native
}

object AddNamedRangeResponse {
  @scala.inline
  def apply(): AddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddNamedRangeResponse]
  }
  @scala.inline
  implicit class AddNamedRangeResponseOps[Self <: AddNamedRangeResponse] (val x: Self) extends AnyVal {
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

