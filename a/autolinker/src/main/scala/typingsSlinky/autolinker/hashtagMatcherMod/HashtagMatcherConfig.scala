package typingsSlinky.autolinker.hashtagMatcherMod

import typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typingsSlinky.autolinker.autolinkerMod.HashtagServices
import typingsSlinky.autolinker.matcherMatcherMod.MatcherConfig
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

