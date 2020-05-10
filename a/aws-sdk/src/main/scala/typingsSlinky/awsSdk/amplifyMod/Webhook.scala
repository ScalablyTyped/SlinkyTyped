package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: BranchName = js.native
  /**
    *  Create date / time for a webhook. 
    */
  var createTime: js.Date = js.native
  /**
    *  Description for a webhook. 
    */
  var description: Description = js.native
  /**
    *  Update date / time for a webhook. 
    */
  var updateTime: js.Date = js.native
  /**
    *  ARN for the webhook. 
    */
  var webhookArn: WebhookArn = js.native
  /**
    *  Id of the webhook. 
    */
  var webhookId: WebhookId = js.native
  /**
    *  Url of the webhook. 
    */
  var webhookUrl: WebhookUrl = js.native
}

object Webhook {
  @scala.inline
  def apply(
    branchName: BranchName,
    createTime: js.Date,
    description: Description,
    updateTime: js.Date,
    webhookArn: WebhookArn,
    webhookId: WebhookId,
    webhookUrl: WebhookUrl
  ): Webhook = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any], webhookArn = webhookArn.asInstanceOf[js.Any], webhookId = webhookId.asInstanceOf[js.Any], webhookUrl = webhookUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchName(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebhookArn(value: WebhookArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebhookId(value: WebhookId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebhookUrl(value: WebhookUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

