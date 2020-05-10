package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseHashtagsImpressions extends js.Object {
  var hashtags: InsightsServicePostResponseHashtags = js.native
  var organic: InsightsServicePostResponseOrganic = js.native
}

object InsightsServicePostResponseHashtagsImpressions {
  @scala.inline
  def apply(hashtags: InsightsServicePostResponseHashtags, organic: InsightsServicePostResponseOrganic): InsightsServicePostResponseHashtagsImpressions = {
    val __obj = js.Dynamic.literal(hashtags = hashtags.asInstanceOf[js.Any], organic = organic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseHashtagsImpressions]
  }
  @scala.inline
  implicit class InsightsServicePostResponseHashtagsImpressionsOps[Self <: InsightsServicePostResponseHashtagsImpressions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashtags(value: InsightsServicePostResponseHashtags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganic(value: InsightsServicePostResponseOrganic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

