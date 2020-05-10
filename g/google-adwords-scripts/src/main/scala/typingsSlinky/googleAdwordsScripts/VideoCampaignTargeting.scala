package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoCampaignTargeting extends js.Object {
  def adSchedules(): AdWordsSelector[AdSchedule] = js.native
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel] = js.native
  def excludedLocations(): AdWordsSelector[ExcludedLocation] = js.native
  def languages(): AdWordsSelector[Language] = js.native
  def platforms(): AdWordsSelector[Platform] = js.native
  def targetedLocations(): AdWordsSelector[TargetedLocation] = js.native
  def targetedProximities(): AdWordsSelector[TargetedProximity] = js.native
}

object VideoCampaignTargeting {
  @scala.inline
  def apply(
    adSchedules: () => AdWordsSelector[AdSchedule],
    excludedContentLabels: () => AdWordsSelector[ExcludedContentLabel],
    excludedLocations: () => AdWordsSelector[ExcludedLocation],
    languages: () => AdWordsSelector[Language],
    platforms: () => AdWordsSelector[Platform],
    targetedLocations: () => AdWordsSelector[TargetedLocation],
    targetedProximities: () => AdWordsSelector[TargetedProximity]
  ): VideoCampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = js.Any.fromFunction0(adSchedules), excludedContentLabels = js.Any.fromFunction0(excludedContentLabels), excludedLocations = js.Any.fromFunction0(excludedLocations), languages = js.Any.fromFunction0(languages), platforms = js.Any.fromFunction0(platforms), targetedLocations = js.Any.fromFunction0(targetedLocations), targetedProximities = js.Any.fromFunction0(targetedProximities))
    __obj.asInstanceOf[VideoCampaignTargeting]
  }
  @scala.inline
  implicit class VideoCampaignTargetingOps[Self <: VideoCampaignTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdSchedules(value: () => AdWordsSelector[AdSchedule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adSchedules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedContentLabels(value: () => AdWordsSelector[ExcludedContentLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedContentLabels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedLocations(value: () => AdWordsSelector[ExcludedLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedLocations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLanguages(value: () => AdWordsSelector[Language]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlatforms(value: () => AdWordsSelector[Platform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTargetedLocations(value: () => AdWordsSelector[TargetedLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedLocations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTargetedProximities(value: () => AdWordsSelector[TargetedProximity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedProximities")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

