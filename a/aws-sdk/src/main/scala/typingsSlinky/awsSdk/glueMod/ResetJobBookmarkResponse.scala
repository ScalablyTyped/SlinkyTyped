package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetJobBookmarkResponse extends js.Object {
  /**
    * The reset bookmark entry.
    */
  var JobBookmarkEntry: js.UndefOr[typingsSlinky.awsSdk.glueMod.JobBookmarkEntry] = js.native
}

object ResetJobBookmarkResponse {
  @scala.inline
  def apply(): ResetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetJobBookmarkResponse]
  }
  @scala.inline
  implicit class ResetJobBookmarkResponseOps[Self <: ResetJobBookmarkResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobBookmarkEntry(value: JobBookmarkEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobBookmarkEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobBookmarkEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobBookmarkEntry")(js.undefined)
        ret
    }
  }
  
}

