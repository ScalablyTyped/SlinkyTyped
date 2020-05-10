package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] extends AdWordsTargeting[AdWordsEntity, AdWordsEntity] {
  def adSchedules(): AdWordsSelector[AdSchedule] = js.native
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel] = js.native
  def excludedLocations(): AdWordsSelector[ExcludedLocation] = js.native
  def getTargetingSetting(criterionTypeGroup: CriterionTypeGroup): TargetingSetting = js.native
  def languages(): AdWordsSelector[Language] = js.native
  def newUserListBuilder(): SearchCampaignAudienceBuilder[SearchCampaignAudience] = js.native
  def platforms(): AdWordsSelector[Platform] = js.native
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit = js.native
  def targetedLocations(): AdWordsSelector[TargetedLocation] = js.native
  def targetedProximities(): AdWordsSelector[TargetedProximity] = js.native
}

object CampaignTargeting {
  @scala.inline
  def apply[SearchCampaignAudience, SearchCampaignExcludedAudience](
    adSchedules: () => AdWordsSelector[AdSchedule],
    audiences: () => AdWordsSelector[AdWordsEntity],
    excludedContentLabels: () => AdWordsSelector[ExcludedContentLabel],
    excludedLocations: () => AdWordsSelector[ExcludedLocation],
    exculdedAudiences: () => AdWordsSelector[AdWordsEntity],
    getTargetingSetting: CriterionTypeGroup => TargetingSetting,
    languages: () => AdWordsSelector[Language],
    newUserListBuilder: () => SearchCampaignAudienceBuilder[SearchCampaignAudience],
    platforms: () => AdWordsSelector[Platform],
    setTargetingSetting: (CriterionTypeGroup, TargetingSetting) => Unit,
    targetedLocations: () => AdWordsSelector[TargetedLocation],
    targetedProximities: () => AdWordsSelector[TargetedProximity]
  ): CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
    val __obj = js.Dynamic.literal(adSchedules = js.Any.fromFunction0(adSchedules), audiences = js.Any.fromFunction0(audiences), excludedContentLabels = js.Any.fromFunction0(excludedContentLabels), excludedLocations = js.Any.fromFunction0(excludedLocations), exculdedAudiences = js.Any.fromFunction0(exculdedAudiences), getTargetingSetting = js.Any.fromFunction1(getTargetingSetting), languages = js.Any.fromFunction0(languages), newUserListBuilder = js.Any.fromFunction0(newUserListBuilder), platforms = js.Any.fromFunction0(platforms), setTargetingSetting = js.Any.fromFunction2(setTargetingSetting), targetedLocations = js.Any.fromFunction0(targetedLocations), targetedProximities = js.Any.fromFunction0(targetedProximities))
    __obj.asInstanceOf[CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience]]
  }
  @scala.inline
  implicit class CampaignTargetingOps[Self[searchcampaignaudience, searchcampaignexcludedaudience] <: CampaignTargeting[searchcampaignaudience, searchcampaignexcludedaudience], SearchCampaignAudience, SearchCampaignExcludedAudience] (val x: Self[SearchCampaignAudience, SearchCampaignExcludedAudience]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SearchCampaignAudience, SearchCampaignExcludedAudience]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[SearchCampaignAudience, SearchCampaignExcludedAudience]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[SearchCampaignAudience, SearchCampaignExcludedAudience]) with Other]
    @scala.inline
    def withAdSchedules(value: () => AdWordsSelector[AdSchedule]): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adSchedules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedContentLabels(value: () => AdWordsSelector[ExcludedContentLabel]): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedContentLabels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedLocations(value: () => AdWordsSelector[ExcludedLocation]): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedLocations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTargetingSetting(value: CriterionTypeGroup => TargetingSetting): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetingSetting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLanguages(value: () => AdWordsSelector[Language]): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserListBuilder(value: () => SearchCampaignAudienceBuilder[SearchCampaignAudience]): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserListBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlatforms(value: () => AdWordsSelector[Platform]): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTargetingSetting(value: (CriterionTypeGroup, TargetingSetting) => Unit): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTargetingSetting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTargetedLocations(value: () => AdWordsSelector[TargetedLocation]): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedLocations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTargetedProximities(value: () => AdWordsSelector[TargetedProximity]): Self[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedProximities")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

