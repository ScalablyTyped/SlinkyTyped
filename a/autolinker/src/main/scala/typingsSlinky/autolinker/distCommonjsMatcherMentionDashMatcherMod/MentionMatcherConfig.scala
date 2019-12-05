package typingsSlinky.autolinker.distCommonjsMatcherMentionDashMatcherMod

import typingsSlinky.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
import typingsSlinky.autolinker.distCommonjsAutolinkerMod.MentionServices
import typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionMatcherConfig extends MatcherConfig {
  var serviceName: MentionServices
}

object MentionMatcherConfig {
  @scala.inline
  def apply(serviceName: MentionServices, tagBuilder: AnchorTagBuilder): MentionMatcherConfig = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MentionMatcherConfig]
  }
}

