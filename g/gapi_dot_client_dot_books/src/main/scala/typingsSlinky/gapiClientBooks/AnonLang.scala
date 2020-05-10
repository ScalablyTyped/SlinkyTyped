package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLang extends js.Object {
  /** The language of the information url and description. */
  var lang: js.UndefOr[String] = js.native
  /** The URL for the preview image information. */
  var previewImageUrl: js.UndefOr[String] = js.native
  /** The description for this location. */
  var snippet: js.UndefOr[String] = js.native
  /** The URL for information for this location. Ex: wikipedia link. */
  var snippetUrl: js.UndefOr[String] = js.native
  /** The display title and localized canonical name to use when searching for this entity on Google search. */
  var title: js.UndefOr[String] = js.native
}

object AnonLang {
  @scala.inline
  def apply(): AnonLang = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLang]
  }
  @scala.inline
  implicit class AnonLangOps[Self <: AnonLang] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippetUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

