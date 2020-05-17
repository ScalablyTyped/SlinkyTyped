package typingsSlinky.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complete extends js.Object {
  var complete: String = js.native
  var failed: String = js.native
  var parsing: String = js.native
  var queued: String = js.native
  var running: String = js.native
  var under_review: String = js.native
  var uploading: String = js.native
  var waiting: String = js.native
  var waiting_analyzed: String = js.native
}

object Complete {
  @scala.inline
  def apply(
    complete: String,
    failed: String,
    parsing: String,
    queued: String,
    running: String,
    under_review: String,
    uploading: String,
    waiting: String,
    waiting_analyzed: String
  ): Complete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], under_review = under_review.asInstanceOf[js.Any], uploading = uploading.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], waiting_analyzed = waiting_analyzed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  @scala.inline
  implicit class CompleteOps[Self <: Complete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueued(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnder_review(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("under_review")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting_analyzed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting_analyzed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

