package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchCampaignAudienceBuilder[SearchCampaignAudience] extends AdWordsBuilder[SearchCampaignAudience] {
  def exclude(): AdWordsOperation[SearchCampaignAudience] = js.native
  def withAudience(userList: UserList): SearchCampaignAudienceBuilder[SearchCampaignAudience] = js.native
  def withAudienceId(audienceId: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience] = js.native
  def withBidModifier(modifier: Double): SearchCampaignAudienceBuilder[SearchCampaignAudience] = js.native
}

object SearchCampaignAudienceBuilder {
  @scala.inline
  def apply[SearchCampaignAudience](
    build: () => AdWordsOperation[SearchCampaignAudience],
    exclude: () => AdWordsOperation[SearchCampaignAudience],
    withAudience: UserList => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    withAudienceId: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    withBidModifier: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]
  ): SearchCampaignAudienceBuilder[SearchCampaignAudience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[SearchCampaignAudienceBuilder[SearchCampaignAudience]]
  }
  @scala.inline
  implicit class SearchCampaignAudienceBuilderOps[Self[searchcampaignaudience] <: SearchCampaignAudienceBuilder[searchcampaignaudience], SearchCampaignAudience] (val x: Self[SearchCampaignAudience]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SearchCampaignAudience] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SearchCampaignAudience]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SearchCampaignAudience] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SearchCampaignAudience] with Other]
    @scala.inline
    def withExclude(value: () => AdWordsOperation[SearchCampaignAudience]): Self[SearchCampaignAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWithAudience(value: UserList => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self[SearchCampaignAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAudience")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithAudienceId(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self[SearchCampaignAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAudienceId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithBidModifier(value: Double => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self[SearchCampaignAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withBidModifier")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

