package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAdGroupAudienceBuilder[SearchAdGroupAudience] extends AdWordsBuilder[SearchAdGroupAudience] {
  def exclude(): AdWordsOperation[SearchAdGroupAudience] = js.native
  def withAudience(userList: UserList): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = js.native
  def withAudienceId(audienceId: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = js.native
  def withBidModifier(modifier: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = js.native
}

object SearchAdGroupAudienceBuilder {
  @scala.inline
  def apply[SearchAdGroupAudience](
    build: () => AdWordsOperation[SearchAdGroupAudience],
    exclude: () => AdWordsOperation[SearchAdGroupAudience],
    withAudience: UserList => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    withAudienceId: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    withBidModifier: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  ): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
    __obj.asInstanceOf[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]]
  }
  @scala.inline
  implicit class SearchAdGroupAudienceBuilderOps[Self[searchadgroupaudience] <: SearchAdGroupAudienceBuilder[searchadgroupaudience], SearchAdGroupAudience] (val x: Self[SearchAdGroupAudience]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SearchAdGroupAudience] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SearchAdGroupAudience]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SearchAdGroupAudience] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SearchAdGroupAudience] with Other]
    @scala.inline
    def withExclude(value: () => AdWordsOperation[SearchAdGroupAudience]): Self[SearchAdGroupAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWithAudience(value: UserList => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self[SearchAdGroupAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAudience")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithAudienceId(value: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self[SearchAdGroupAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAudienceId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithBidModifier(value: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self[SearchAdGroupAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withBidModifier")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

