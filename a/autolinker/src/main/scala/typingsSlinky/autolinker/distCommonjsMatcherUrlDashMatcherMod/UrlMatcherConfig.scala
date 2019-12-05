package typingsSlinky.autolinker.distCommonjsMatcherUrlDashMatcherMod

import typingsSlinky.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
import typingsSlinky.autolinker.distCommonjsAutolinkerMod.StripPrefixConfigObj
import typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.MatcherConfig
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatcherConfig extends MatcherConfig {
  var decodePercentEncoding: Boolean
  var stripPrefix: Required[StripPrefixConfigObj]
  var stripTrailingSlash: Boolean
}

object UrlMatcherConfig {
  @scala.inline
  def apply(
    decodePercentEncoding: Boolean,
    stripPrefix: Required[StripPrefixConfigObj],
    stripTrailingSlash: Boolean,
    tagBuilder: AnchorTagBuilder
  ): UrlMatcherConfig = {
    val __obj = js.Dynamic.literal(decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlMatcherConfig]
  }
}

