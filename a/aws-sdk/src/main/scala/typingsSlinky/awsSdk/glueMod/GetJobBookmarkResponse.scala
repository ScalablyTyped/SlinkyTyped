package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobBookmarkResponse extends js.Object {
  /**
    * A structure that defines a point that a job can resume processing.
    */
  var JobBookmarkEntry: js.UndefOr[typingsSlinky.awsSdk.glueMod.JobBookmarkEntry] = js.native
}

object GetJobBookmarkResponse {
  @scala.inline
  def apply(): GetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobBookmarkResponse]
  }
  @scala.inline
  implicit class GetJobBookmarkResponseOps[Self <: GetJobBookmarkResponse] (val x: Self) extends AnyVal {
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

