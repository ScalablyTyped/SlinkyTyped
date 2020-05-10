package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPermissionsFailureEntry extends js.Object {
  /**
    * An error message that applies to the failure of the entry.
    */
  var Error: js.UndefOr[ErrorDetail] = js.native
  /**
    * An identifier for an entry of the batch request.
    */
  var RequestEntry: js.UndefOr[BatchPermissionsRequestEntry] = js.native
}

object BatchPermissionsFailureEntry {
  @scala.inline
  def apply(): BatchPermissionsFailureEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPermissionsFailureEntry]
  }
  @scala.inline
  implicit class BatchPermissionsFailureEntryOps[Self <: BatchPermissionsFailureEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: ErrorDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestEntry(value: BatchPermissionsRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestEntry")(js.undefined)
        ret
    }
  }
  
}

