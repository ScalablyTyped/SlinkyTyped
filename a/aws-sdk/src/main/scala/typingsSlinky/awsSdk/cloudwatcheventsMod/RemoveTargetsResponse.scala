package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTargetsResponse extends js.Object {
  /**
    * The failed target entries.
    */
  var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList] = js.native
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}

object RemoveTargetsResponse {
  @scala.inline
  def apply(): RemoveTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetsResponse]
  }
  @scala.inline
  implicit class RemoveTargetsResponseOps[Self <: RemoveTargetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedEntries(value: RemoveTargetsResultEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedEntryCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedEntryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedEntryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedEntryCount")(js.undefined)
        ret
    }
  }
  
}

