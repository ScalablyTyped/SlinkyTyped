package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNamedRangeRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `namedRange` is implied and should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /** The named range to update with the new properties. */
  var namedRange: js.UndefOr[NamedRange] = js.native
}

object UpdateNamedRangeRequest {
  @scala.inline
  def apply(): UpdateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNamedRangeRequest]
  }
  @scala.inline
  implicit class UpdateNamedRangeRequestOps[Self <: UpdateNamedRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
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

