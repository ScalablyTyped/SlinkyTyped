package typingsSlinky.fluentLangneg.mod

import typingsSlinky.fluentLangneg.fluentLangnegStrings.filtering
import typingsSlinky.fluentLangneg.fluentLangnegStrings.lookup
import typingsSlinky.fluentLangneg.fluentLangnegStrings.matching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NegotiateLanguageOptions extends js.Object {
  var defaultLocale: js.UndefOr[String] = js.native
  var likelySubtags: js.UndefOr[StringMap] = js.native
  var strategy: js.UndefOr[filtering | matching | lookup] = js.native
}

object NegotiateLanguageOptions {
  @scala.inline
  def apply(): NegotiateLanguageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegotiateLanguageOptions]
  }
  @scala.inline
  implicit class NegotiateLanguageOptionsOps[Self <: NegotiateLanguageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withLikelySubtags(value: StringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likelySubtags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLikelySubtags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likelySubtags")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: filtering | matching | lookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
  }
  
}

