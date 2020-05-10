package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanTaskUiSummary extends js.Object {
  /**
    * A timestamp when SageMaker created the human task user interface.
    */
  var CreationTime: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of the human task user interface.
    */
  var HumanTaskUiArn: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiArn = js.native
  /**
    * The name of the human task user interface.
    */
  var HumanTaskUiName: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiName = js.native
}

object HumanTaskUiSummary {
  @scala.inline
  def apply(CreationTime: js.Date, HumanTaskUiArn: HumanTaskUiArn, HumanTaskUiName: HumanTaskUiName): HumanTaskUiSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanTaskUiSummary]
  }
  @scala.inline
  implicit class HumanTaskUiSummaryOps[Self <: HumanTaskUiSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanTaskUiArn(value: HumanTaskUiArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanTaskUiArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanTaskUiName(value: HumanTaskUiName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanTaskUiName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

