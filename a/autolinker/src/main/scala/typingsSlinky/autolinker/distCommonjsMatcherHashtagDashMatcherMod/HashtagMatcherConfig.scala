package typingsSlinky.autolinker.distCommonjsMatcherHashtagDashMatcherMod

import typingsSlinky.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
import typingsSlinky.autolinker.distCommonjsAutolinkerMod.HashtagServices
import typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagMatcherConfig extends MatcherConfig {
  var serviceName: HashtagServices
}

object HashtagMatcherConfig {
  @scala.inline
  def apply(serviceName: HashtagServices, tagBuilder: AnchorTagBuilder): HashtagMatcherConfig = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HashtagMatcherConfig]
  }
}

