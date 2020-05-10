package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactFlowSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the contact flow.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The type of contact flow.
    */
  var ContactFlowType: js.UndefOr[typingsSlinky.awsSdk.connectMod.ContactFlowType] = js.native
  /**
    * The identifier of the contact flow.
    */
  var Id: js.UndefOr[ContactFlowId] = js.native
  /**
    * The name of the contact flow.
    */
  var Name: js.UndefOr[ContactFlowName] = js.native
}

object ContactFlowSummary {
  @scala.inline
  def apply(): ContactFlowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFlowSummary]
  }
  @scala.inline
  implicit class ContactFlowSummaryOps[Self <: ContactFlowSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withContactFlowType(value: ContactFlowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactFlowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactFlowType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactFlowType")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ContactFlowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ContactFlowName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

