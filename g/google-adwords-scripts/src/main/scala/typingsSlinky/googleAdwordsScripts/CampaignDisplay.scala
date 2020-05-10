package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignDisplay extends Display {
  def excludedAudiences(): AdWordsSelector[ExcludedAudience] = js.native
  def excludedKeywords(): AdWordsSelector[ExcludedDisplayKeyword] = js.native
  def excludedPlacements(): AdWordsSelector[ExcludedPlacement] = js.native
  def excludedTopics(): AdWordsSelector[Topic] = js.native
  def newAudienceBuilder(): AudienceBuilder[Audience] = js.native
  def newKeywordBuilder(): DisplayKeywordBuilder[DisplayKeyword] = js.native
  def newPlacementBuilder(): PlacementBuilder[Placement] = js.native
  def newTopicBuilder(): TopicBuilder[Topic] = js.native
}

object CampaignDisplay {
  @scala.inline
  def apply(
    audiences: () => AdWordsSelector[Audience],
    excludedAudiences: () => AdWordsSelector[ExcludedAudience],
    excludedKeywords: () => AdWordsSelector[ExcludedDisplayKeyword],
    excludedPlacements: () => AdWordsSelector[ExcludedPlacement],
    excludedTopics: () => AdWordsSelector[Topic],
    keywords: () => AdWordsSelector[DisplayKeyword],
    newAudienceBuilder: () => AudienceBuilder[Audience],
    newKeywordBuilder: () => DisplayKeywordBuilder[DisplayKeyword],
    newPlacementBuilder: () => PlacementBuilder[Placement],
    newTopicBuilder: () => TopicBuilder[Topic],
    placements: () => AdWordsSelector[Placement],
    topics: () => AdWordsSelector[Topic]
  ): CampaignDisplay = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), excludedAudiences = js.Any.fromFunction0(excludedAudiences), excludedKeywords = js.Any.fromFunction0(excludedKeywords), excludedPlacements = js.Any.fromFunction0(excludedPlacements), excludedTopics = js.Any.fromFunction0(excludedTopics), keywords = js.Any.fromFunction0(keywords), newAudienceBuilder = js.Any.fromFunction0(newAudienceBuilder), newKeywordBuilder = js.Any.fromFunction0(newKeywordBuilder), newPlacementBuilder = js.Any.fromFunction0(newPlacementBuilder), newTopicBuilder = js.Any.fromFunction0(newTopicBuilder), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics))
    __obj.asInstanceOf[CampaignDisplay]
  }
  @scala.inline
  implicit class CampaignDisplayOps[Self <: CampaignDisplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedAudiences(value: () => AdWordsSelector[ExcludedAudience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedAudiences")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedKeywords(value: () => AdWordsSelector[ExcludedDisplayKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedKeywords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedPlacements(value: () => AdWordsSelector[ExcludedPlacement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedPlacements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludedTopics(value: () => AdWordsSelector[Topic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedTopics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAudienceBuilder(value: () => AudienceBuilder[Audience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAudienceBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewKeywordBuilder(value: () => DisplayKeywordBuilder[DisplayKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newKeywordBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlacementBuilder(value: () => PlacementBuilder[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlacementBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTopicBuilder(value: () => TopicBuilder[Topic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTopicBuilder")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

