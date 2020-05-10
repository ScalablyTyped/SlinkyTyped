package typingsSlinky.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseInformation extends js.Object {
  var advertiserId: String = js.native
  var campaignId: String = js.native
  var creativeId: js.UndefOr[Double] = js.native
  var creativeTemplateId: js.UndefOr[Double] = js.native
  var lineItemId: js.UndefOr[Double] = js.native
}

object ResponseInformation {
  @scala.inline
  def apply(advertiserId: String, campaignId: String): ResponseInformation = {
    val __obj = js.Dynamic.literal(advertiserId = advertiserId.asInstanceOf[js.Any], campaignId = campaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInformation]
  }
  @scala.inline
  implicit class ResponseInformationOps[Self <: ResponseInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertiserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCampaignId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreativeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeTemplateId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemId")(js.undefined)
        ret
    }
  }
  
}

