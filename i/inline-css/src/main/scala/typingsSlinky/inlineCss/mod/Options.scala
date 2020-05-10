package typingsSlinky.inlineCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var applyLinkTags: js.UndefOr[Boolean] = js.native
  var applyStyleTags: js.UndefOr[Boolean] = js.native
  var applyTableAttributes: js.UndefOr[Boolean] = js.native
  var applyWidthAttributes: js.UndefOr[Boolean] = js.native
  var extraCss: js.UndefOr[String] = js.native
  var preserveMediaQueries: js.UndefOr[Boolean] = js.native
  var removeHtmlSelectors: js.UndefOr[Boolean] = js.native
  var removeLinkTags: js.UndefOr[Boolean] = js.native
  var removeStyleTags: js.UndefOr[Boolean] = js.native
  var url: String = js.native
}

object Options {
  @scala.inline
  def apply(url: String): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyLinkTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLinkTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyLinkTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLinkTags")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyStyleTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyleTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyStyleTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyleTags")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyTableAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTableAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyTableAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTableAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyWidthAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyWidthAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyWidthAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyWidthAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraCss")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveMediaQueries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveMediaQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveMediaQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveMediaQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveHtmlSelectors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHtmlSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveHtmlSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHtmlSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveLinkTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLinkTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveLinkTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLinkTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveStyleTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStyleTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveStyleTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStyleTags")(js.undefined)
        ret
    }
  }
  
}

