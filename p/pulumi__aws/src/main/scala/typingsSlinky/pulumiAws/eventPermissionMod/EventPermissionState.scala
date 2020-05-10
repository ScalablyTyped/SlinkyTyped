package typingsSlinky.pulumiAws.eventPermissionMod

import typingsSlinky.pulumiAws.inputMod.cloudwatch.EventPermissionCondition
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPermissionState extends js.Object {
  /**
    * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
    */
  val action: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
    */
  val condition: js.UndefOr[Input[EventPermissionCondition]] = js.native
  /**
    * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
    */
  val principal: js.UndefOr[Input[String]] = js.native
  /**
    * An identifier string for the external account that you are granting permissions to.
    */
  val statementId: js.UndefOr[Input[String]] = js.native
}

object EventPermissionState {
  @scala.inline
  def apply(): EventPermissionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPermissionState]
  }
  @scala.inline
  implicit class EventPermissionStateOps[Self <: EventPermissionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: Input[EventPermissionCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipal(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(js.undefined)
        ret
    }
    @scala.inline
    def withStatementId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementId")(js.undefined)
        ret
    }
  }
  
}

