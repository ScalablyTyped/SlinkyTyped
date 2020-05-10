package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseHashtagsImpressions extends js.Object {
  var account_hashtags: InsightsServiceAccountResponseAccountHashtags = js.native
  var organic: InsightsServiceAccountResponseOrganic = js.native
}

object InsightsServiceAccountResponseHashtagsImpressions {
  @scala.inline
  def apply(
    account_hashtags: InsightsServiceAccountResponseAccountHashtags,
    organic: InsightsServiceAccountResponseOrganic
  ): InsightsServiceAccountResponseHashtagsImpressions = {
    val __obj = js.Dynamic.literal(account_hashtags = account_hashtags.asInstanceOf[js.Any], organic = organic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtagsImpressions]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseHashtagsImpressionsOps[Self <: InsightsServiceAccountResponseHashtagsImpressions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_hashtags(value: InsightsServiceAccountResponseAccountHashtags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_hashtags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganic(value: InsightsServiceAccountResponseOrganic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

