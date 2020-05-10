package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressUpdateStreamSummary extends js.Object {
  /**
    * The name of the ProgressUpdateStream. Do not store personal data in this field. 
    */
  var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.native
}

object ProgressUpdateStreamSummary {
  @scala.inline
  def apply(): ProgressUpdateStreamSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressUpdateStreamSummary]
  }
  @scala.inline
  implicit class ProgressUpdateStreamSummaryOps[Self <: ProgressUpdateStreamSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgressUpdateStreamName(value: ProgressUpdateStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressUpdateStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStreamName")(js.undefined)
        ret
    }
  }
  
}

