package typingsSlinky.markdownItAnchor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorOptions extends js.Object {
  var callback: js.UndefOr[
    js.Function2[/* token */ typingsSlinky.markdownIt.tokenMod.^, /* anchor_info */ AnchorInfo, Unit]
  ] = js.native
  var level: js.UndefOr[Double] = js.native
  var permalink: js.UndefOr[Boolean] = js.native
  var permalinkBefore: js.UndefOr[Boolean] = js.native
  var permalinkClass: js.UndefOr[String] = js.native
  var permalinkHref: js.UndefOr[js.Function1[/* slug */ String, String]] = js.native
  var permalinkSymbol: js.UndefOr[String] = js.native
  var renderPermalink: js.UndefOr[
    js.Function4[
      /* slug */ String, 
      /* opts */ this.type, 
      /* state */ typingsSlinky.markdownIt.parserCoreMod.^, 
      /* idx */ Double, 
      Unit
    ]
  ] = js.native
  var slugify: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
}

object AnchorOptions {
  @scala.inline
  def apply(): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorOptions]
  }
  @scala.inline
  implicit class AnchorOptionsOps[Self <: AnchorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: (/* token */ typingsSlinky.markdownIt.tokenMod.^, /* anchor_info */ AnchorInfo) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withPermalink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermalink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalink")(js.undefined)
        ret
    }
    @scala.inline
    def withPermalinkBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalinkBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermalinkBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalinkBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withPermalinkClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalinkClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermalinkClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalinkClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPermalinkHref(value: /* slug */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalinkHref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPermalinkHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalinkHref")(js.undefined)
        ret
    }
    @scala.inline
    def withPermalinkSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalinkSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermalinkSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalinkSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPermalink(
      value: (/* slug */ String, AnchorOptions, /* state */ typingsSlinky.markdownIt.parserCoreMod.^, /* idx */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPermalink")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRenderPermalink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPermalink")(js.undefined)
        ret
    }
    @scala.inline
    def withSlugify(value: /* str */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slugify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSlugify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slugify")(js.undefined)
        ret
    }
  }
  
}

