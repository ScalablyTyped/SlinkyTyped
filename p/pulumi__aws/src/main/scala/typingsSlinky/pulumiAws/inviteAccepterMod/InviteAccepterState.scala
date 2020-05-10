package typingsSlinky.pulumiAws.inviteAccepterMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAccepterState extends js.Object {
  /**
    * The detector ID of the member GuardDuty account.
    */
  val detectorId: js.UndefOr[Input[String]] = js.native
  /**
    * AWS account ID for master account.
    */
  val masterAccountId: js.UndefOr[Input[String]] = js.native
}

object InviteAccepterState {
  @scala.inline
  def apply(): InviteAccepterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteAccepterState]
  }
  @scala.inline
  implicit class InviteAccepterStateOps[Self <: InviteAccepterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAccountId")(js.undefined)
        ret
    }
  }
  
}

