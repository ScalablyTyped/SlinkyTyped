package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDuplicatesResponse extends js.Object {
  /** The number of duplicate rows removed. */
  var duplicatesRemovedCount: js.UndefOr[Double] = js.native
}

object DeleteDuplicatesResponse {
  @scala.inline
  def apply(): DeleteDuplicatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDuplicatesResponse]
  }
  @scala.inline
  implicit class DeleteDuplicatesResponseOps[Self <: DeleteDuplicatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuplicatesRemovedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicatesRemovedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicatesRemovedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicatesRemovedCount")(js.undefined)
        ret
    }
  }
  
}

