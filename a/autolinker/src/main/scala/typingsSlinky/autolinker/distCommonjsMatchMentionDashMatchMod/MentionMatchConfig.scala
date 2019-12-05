package typingsSlinky.autolinker.distCommonjsMatchMentionDashMatchMod

import typingsSlinky.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
import typingsSlinky.autolinker.distCommonjsAutolinkerMod.MentionServices
import typingsSlinky.autolinker.distCommonjsMatchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionMatchConfig extends MatchConfig {
  var mention: String
  var serviceName: MentionServices
}

object MentionMatchConfig {
  @scala.inline
  def apply(
    matchedText: String,
    mention: String,
    offset: Double,
    serviceName: MentionServices,
    tagBuilder: AnchorTagBuilder
  ): MentionMatchConfig = {
    val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], mention = mention.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MentionMatchConfig]
  }
}

