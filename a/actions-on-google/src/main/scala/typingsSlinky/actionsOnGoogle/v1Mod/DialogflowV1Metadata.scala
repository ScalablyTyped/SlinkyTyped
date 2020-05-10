package typingsSlinky.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1Metadata extends js.Object {
  var intentId: js.UndefOr[String] = js.native
  var intentName: js.UndefOr[String] = js.native
  var nluResponseTime: js.UndefOr[Double] = js.native
  var webhookForSlotFillingUsed: js.UndefOr[String] = js.native
  var webhookUsed: js.UndefOr[String] = js.native
}

object DialogflowV1Metadata {
  @scala.inline
  def apply(): DialogflowV1Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Metadata]
  }
  @scala.inline
  implicit class DialogflowV1MetadataOps[Self <: DialogflowV1Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentId")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentName")(js.undefined)
        ret
    }
    @scala.inline
    def withNluResponseTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nluResponseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNluResponseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nluResponseTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhookForSlotFillingUsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookForSlotFillingUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhookForSlotFillingUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookForSlotFillingUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhookUsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhookUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookUsed")(js.undefined)
        ret
    }
  }
  
}

