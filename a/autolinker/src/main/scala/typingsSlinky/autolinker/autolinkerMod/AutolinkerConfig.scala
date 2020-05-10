package typingsSlinky.autolinker.autolinkerMod

import typingsSlinky.autolinker.matchMatchMod.Match
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutolinkerConfig extends js.Object {
  var className: js.UndefOr[String] = js.native
  var context: js.UndefOr[js.Any] = js.native
  var decodePercentEncoding: js.UndefOr[Boolean] = js.native
  var email: js.UndefOr[Boolean] = js.native
  var hashtag: js.UndefOr[HashtagConfig] = js.native
  var mention: js.UndefOr[MentionConfig] = js.native
  var newWindow: js.UndefOr[Boolean] = js.native
  var phone: js.UndefOr[Boolean] = js.native
  var replaceFn: js.UndefOr[ReplaceFn | Null] = js.native
  var stripPrefix: js.UndefOr[StripPrefixConfig] = js.native
  var stripTrailingSlash: js.UndefOr[Boolean] = js.native
  var truncate: js.UndefOr[TruncateConfig] = js.native
  var urls: js.UndefOr[UrlsConfig] = js.native
}

object AutolinkerConfig {
  @scala.inline
  def apply(): AutolinkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutolinkerConfig]
  }
  @scala.inline
  implicit class AutolinkerConfigOps[Self <: AutolinkerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodePercentEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodePercentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodePercentEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodePercentEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtag(value: HashtagConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.undefined)
        ret
    }
    @scala.inline
    def withMention(value: MentionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(js.undefined)
        ret
    }
    @scala.inline
    def withNewWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceFn(value: /* match */ Match => ReplaceFnReturn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReplaceFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceFn")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceFnNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceFn")(null)
        ret
    }
    @scala.inline
    def withStripPrefix(value: StripPrefixConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStripTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripTrailingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncate(value: TruncateConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: UrlsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
  }
  
}

