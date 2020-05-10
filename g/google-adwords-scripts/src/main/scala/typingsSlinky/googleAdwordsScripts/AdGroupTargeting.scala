package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] extends AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] {
  def getTargetingSetting(): String = js.native
  def newUserListBuilder(): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = js.native
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit = js.native
}

object AdGroupTargeting {
  @scala.inline
  def apply[SearchAdGroupAudience, SearchAdGroupExcludedAudience](
    audiences: () => AdWordsSelector[SearchAdGroupAudience],
    exculdedAudiences: () => AdWordsSelector[SearchAdGroupExcludedAudience],
    getTargetingSetting: () => String,
    newUserListBuilder: () => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    setTargetingSetting: (CriterionTypeGroup, TargetingSetting) => Unit
  ): AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences), getTargetingSetting = js.Any.fromFunction0(getTargetingSetting), newUserListBuilder = js.Any.fromFunction0(newUserListBuilder), setTargetingSetting = js.Any.fromFunction2(setTargetingSetting))
    __obj.asInstanceOf[AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience]]
  }
  @scala.inline
  implicit class AdGroupTargetingOps[Self[searchadgroupaudience, searchadgroupexcludedaudience] <: AdGroupTargeting[searchadgroupaudience, searchadgroupexcludedaudience], SearchAdGroupAudience, SearchAdGroupExcludedAudience] (val x: Self[SearchAdGroupAudience, SearchAdGroupExcludedAudience]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SearchAdGroupAudience, SearchAdGroupExcludedAudience]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[SearchAdGroupAudience, SearchAdGroupExcludedAudience]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[SearchAdGroupAudience, SearchAdGroupExcludedAudience]) with Other]
    @scala.inline
    def withGetTargetingSetting(value: () => String): Self[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetingSetting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserListBuilder(value: () => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]): Self[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserListBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTargetingSetting(value: (CriterionTypeGroup, TargetingSetting) => Unit): Self[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTargetingSetting")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

