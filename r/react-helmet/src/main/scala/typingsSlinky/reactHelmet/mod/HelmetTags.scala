package typingsSlinky.reactHelmet.mod

import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.HTMLMetaElement
import org.scalajs.dom.raw.HTMLScriptElement
import org.scalajs.dom.raw.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelmetTags extends js.Object {
  var baseTag: js.Array[_] = js.native
  var linkTags: js.Array[HTMLLinkElement] = js.native
  var metaTags: js.Array[HTMLMetaElement] = js.native
  var noscriptTags: js.Array[_] = js.native
  var scriptTags: js.Array[HTMLScriptElement] = js.native
  var styleTags: js.Array[HTMLStyleElement] = js.native
}

object HelmetTags {
  @scala.inline
  def apply(
    baseTag: js.Array[_],
    linkTags: js.Array[HTMLLinkElement],
    metaTags: js.Array[HTMLMetaElement],
    noscriptTags: js.Array[_],
    scriptTags: js.Array[HTMLScriptElement],
    styleTags: js.Array[HTMLStyleElement]
  ): HelmetTags = {
    val __obj = js.Dynamic.literal(baseTag = baseTag.asInstanceOf[js.Any], linkTags = linkTags.asInstanceOf[js.Any], metaTags = metaTags.asInstanceOf[js.Any], noscriptTags = noscriptTags.asInstanceOf[js.Any], scriptTags = scriptTags.asInstanceOf[js.Any], styleTags = styleTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelmetTags]
  }
  @scala.inline
  implicit class HelmetTagsOps[Self <: HelmetTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseTag(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkTags(value: js.Array[HTMLLinkElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaTags(value: js.Array[HTMLMetaElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoscriptTags(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noscriptTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptTags(value: js.Array[HTMLScriptElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleTags(value: js.Array[HTMLStyleElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

