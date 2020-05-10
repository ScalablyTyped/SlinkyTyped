package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Streamingbuffer extends js.Object {
  /** [Output-only] A lower-bound estimate of the number of bytes currently in the streaming buffer. */
  var estimatedBytes: js.UndefOr[String] = js.native
  /** [Output-only] A lower-bound estimate of the number of rows currently in the streaming buffer. */
  var estimatedRows: js.UndefOr[String] = js.native
  /**
    * [Output-only] Contains the timestamp of the oldest entry in the streaming buffer, in milliseconds since the epoch, if the streaming buffer is
    * available.
    */
  var oldestEntryTime: js.UndefOr[String] = js.native
}

object Streamingbuffer {
  @scala.inline
  def apply(): Streamingbuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Streamingbuffer]
  }
  @scala.inline
  implicit class StreamingbufferOps[Self <: Streamingbuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withOldestEntryTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldestEntryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldestEntryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldestEntryTime")(js.undefined)
        ret
    }
  }
  
}

