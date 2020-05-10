package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchClearValuesRequest extends js.Object {
  /** The ranges to clear, in A1 notation. */
  var ranges: js.UndefOr[js.Array[String]] = js.native
}

object BatchClearValuesRequest {
  @scala.inline
  def apply(): BatchClearValuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchClearValuesRequest]
  }
  @scala.inline
  implicit class BatchClearValuesRequestOps[Self <: BatchClearValuesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
  }
  
}

