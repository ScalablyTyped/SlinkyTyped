package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTrialComponentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialArn] = js.native
  /**
    * The ARN of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialComponentArn] = js.native
}

object DisassociateTrialComponentResponse {
  @scala.inline
  def apply(): DisassociateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateTrialComponentResponse]
  }
  @scala.inline
  implicit class DisassociateTrialComponentResponseOps[Self <: DisassociateTrialComponentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrialArn(value: TrialArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialComponentArn(value: TrialComponentArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialComponentArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponentArn")(js.undefined)
        ret
    }
  }
  
}

