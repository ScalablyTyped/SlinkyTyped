package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitResponse extends js.Object {
  /** The time at which the commit occurred. */
  var commitTime: js.UndefOr[String] = js.native
  /**
    * The result of applying the writes.
    *
    * This i-th write result corresponds to the i-th write in the
    * request.
    */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.native
}

object CommitResponse {
  @scala.inline
  def apply(): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitResponse]
  }
  @scala.inline
  implicit class CommitResponseOps[Self <: CommitResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteResults(value: js.Array[WriteResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeResults")(js.undefined)
        ret
    }
  }
  
}

