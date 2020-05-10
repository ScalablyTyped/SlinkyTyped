package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSentimentDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a sentiment detection job.
    */
  var SentimentDetectionJobProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.SentimentDetectionJobProperties] = js.native
}

object DescribeSentimentDetectionJobResponse {
  @scala.inline
  def apply(): DescribeSentimentDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSentimentDetectionJobResponse]
  }
  @scala.inline
  implicit class DescribeSentimentDetectionJobResponseOps[Self <: DescribeSentimentDetectionJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSentimentDetectionJobProperties(value: SentimentDetectionJobProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SentimentDetectionJobProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentimentDetectionJobProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SentimentDetectionJobProperties")(js.undefined)
        ret
    }
  }
  
}

