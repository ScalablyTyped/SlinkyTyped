package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteResponse extends js.Object {
  /** The time at which the commit occurred. */
  var commitTime: js.UndefOr[String] = js.native
  /**
    * The ID of the stream.
    * Only set on the first message, when a new stream was created.
    */
  var streamId: js.UndefOr[String] = js.native
  /**
    * A token that represents the position of this response in the stream.
    * This can be used by a client to resume the stream at this point.
    *
    * This field is always set.
    */
  var streamToken: js.UndefOr[String] = js.native
  /**
    * The result of applying the writes.
    *
    * This i-th write result corresponds to the i-th write in the
    * request.
    */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.native
}

object WriteResponse {
  @scala.inline
  def apply(): WriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteResponse]
  }
  @scala.inline
  implicit class WriteResponseOps[Self <: WriteResponse] (val x: Self) extends AnyVal {
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
    def withStreamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamToken")(js.undefined)
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

