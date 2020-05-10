package typingsSlinky.autolinker.urlMatcherMod

import typingsSlinky.autolinker.RequiredStripPrefixConfig
import typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typingsSlinky.autolinker.matcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMatcherConfig extends MatcherConfig {
  var decodePercentEncoding: Boolean = js.native
  var stripPrefix: RequiredStripPrefixConfig = js.native
  var stripTrailingSlash: Boolean = js.native
}

object UrlMatcherConfig {
  @scala.inline
  def apply(
    decodePercentEncoding: Boolean,
    stripPrefix: RequiredStripPrefixConfig,
    stripTrailingSlash: Boolean,
    tagBuilder: AnchorTagBuilder
  ): UrlMatcherConfig = {
    val __obj = js.Dynamic.literal(decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMatcherConfig]
  }
  @scala.inline
  implicit class UrlMatcherConfigOps[Self <: UrlMatcherConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecodePercentEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodePercentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStripPrefix(value: RequiredStripPrefixConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStripTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

