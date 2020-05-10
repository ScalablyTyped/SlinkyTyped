package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timing extends js.Object {
  /**
    * The time the job finished transcoding, in epoch milliseconds.
    */
  var FinishTimeMillis: js.UndefOr[NullableLong] = js.native
  /**
    * The time the job began transcoding, in epoch milliseconds.
    */
  var StartTimeMillis: js.UndefOr[NullableLong] = js.native
  /**
    * The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
    */
  var SubmitTimeMillis: js.UndefOr[NullableLong] = js.native
}

object Timing {
  @scala.inline
  def apply(): Timing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timing]
  }
  @scala.inline
  implicit class TimingOps[Self <: Timing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinishTimeMillis(value: NullableLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeMillis(value: NullableLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitTimeMillis(value: NullableLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeMillis")(js.undefined)
        ret
    }
  }
  
}

