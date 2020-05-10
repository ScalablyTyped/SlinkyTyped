package typingsSlinky.reactHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelmetData extends js.Object {
  var base: HelmetDatum = js.native
  var bodyAttributes: HelmetHTMLBodyDatum = js.native
  var htmlAttributes: HelmetHTMLElementDatum = js.native
  var link: HelmetDatum = js.native
  var meta: HelmetDatum = js.native
  var noscript: HelmetDatum = js.native
  var script: HelmetDatum = js.native
  var style: HelmetDatum = js.native
  var title: HelmetDatum = js.native
  var titleAttributes: HelmetDatum = js.native
}

object HelmetData {
  @scala.inline
  def apply(
    base: HelmetDatum,
    bodyAttributes: HelmetHTMLBodyDatum,
    htmlAttributes: HelmetHTMLElementDatum,
    link: HelmetDatum,
    meta: HelmetDatum,
    noscript: HelmetDatum,
    script: HelmetDatum,
    style: HelmetDatum,
    title: HelmetDatum,
    titleAttributes: HelmetDatum
  ): HelmetData = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], bodyAttributes = bodyAttributes.asInstanceOf[js.Any], htmlAttributes = htmlAttributes.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleAttributes = titleAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelmetData]
  }
  @scala.inline
  implicit class HelmetDataOps[Self <: HelmetData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: HelmetDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyAttributes(value: HelmetHTMLBodyDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlAttributes(value: HelmetHTMLElementDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: HelmetDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: HelmetDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoscript(value: HelmetDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: HelmetDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: HelmetDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: HelmetDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleAttributes(value: HelmetDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

