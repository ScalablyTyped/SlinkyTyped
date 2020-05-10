package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentSourceDetail extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.native
  var TrainingJob: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJob] = js.native
}

object TrialComponentSourceDetail {
  @scala.inline
  def apply(): TrialComponentSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentSourceDetail]
  }
  @scala.inline
  implicit class TrialComponentSourceDetailOps[Self <: TrialComponentSourceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceArn(value: TrialComponentSourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingJob(value: TrainingJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJob")(js.undefined)
        ret
    }
  }
  
}

