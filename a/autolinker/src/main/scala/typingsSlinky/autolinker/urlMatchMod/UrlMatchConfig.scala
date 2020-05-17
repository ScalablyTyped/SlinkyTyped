package typingsSlinky.autolinker.urlMatchMod

import typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typingsSlinky.autolinker.anon.RequiredStripPrefixConfig
import typingsSlinky.autolinker.autolinkerMod.UrlMatchTypeOptions
import typingsSlinky.autolinker.matchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMatchConfig extends MatchConfig {
  var decodePercentEncoding: Boolean = js.native
  var protocolRelativeMatch: Boolean = js.native
  var protocolUrlMatch: Boolean = js.native
  var stripPrefix: RequiredStripPrefixConfig = js.native
  var stripTrailingSlash: Boolean = js.native
  var url: String = js.native
  var urlMatchType: UrlMatchTypeOptions = js.native
}

object UrlMatchConfig {
  @scala.inline
  def apply(
    decodePercentEncoding: Boolean,
    matchedText: String,
    offset: Double,
    protocolRelativeMatch: Boolean,
    protocolUrlMatch: Boolean,
    stripPrefix: RequiredStripPrefixConfig,
    stripTrailingSlash: Boolean,
    tagBuilder: AnchorTagBuilder,
    url: String,
    urlMatchType: UrlMatchTypeOptions
  ): UrlMatchConfig = {
    val __obj = js.Dynamic.literal(decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], protocolRelativeMatch = protocolRelativeMatch.asInstanceOf[js.Any], protocolUrlMatch = protocolUrlMatch.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlMatchType = urlMatchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMatchConfig]
  }
  @scala.inline
  implicit class UrlMatchConfigOps[Self <: UrlMatchConfig] (val x: Self) extends AnyVal {
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
    def withProtocolRelativeMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolRelativeMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolUrlMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolUrlMatch")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlMatchType(value: UrlMatchTypeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMatchType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

