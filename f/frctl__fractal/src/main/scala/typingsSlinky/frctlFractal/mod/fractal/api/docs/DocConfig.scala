package typingsSlinky.frctlFractal.mod.fractal.api.docs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.frctlFractal.mod.fractal.core.StatusInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocConfig extends js.Object {
  var default: js.UndefOr[DocDefaultConfig] = js.native
  @JSName("default.context")
  var defaultDotcontext: js.UndefOr[js.Any] = js.native
  @JSName("default.prefix")
  var defaultDotprefix: js.UndefOr[String] = js.native
  @JSName("default.status")
  var defaultDotstatus: js.UndefOr[String] = js.native
  var ext: js.UndefOr[String] = js.native
  var indexLabel: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var markdown: js.UndefOr[Boolean | DocMarkdownConfig] = js.native
  @JSName("markdown.breaks")
  var markdownDotbreaks: js.UndefOr[Boolean] = js.native
  @JSName("markdown.gfm")
  var markdownDotgfm: js.UndefOr[Boolean] = js.native
  @JSName("markdown.pedantic")
  var markdownDotpedantic: js.UndefOr[Boolean] = js.native
  @JSName("markdown.sanitize")
  var markdownDotsanitize: js.UndefOr[Boolean] = js.native
  @JSName("markdown.smartLists")
  var markdownDotsmartLists: js.UndefOr[Boolean] = js.native
  @JSName("markdown.smartypants")
  var markdownDotsmartypants: js.UndefOr[Boolean] = js.native
  @JSName("markdown.tables")
  var markdownDottables: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.native
  var title: js.UndefOr[String] = js.native
}

object DocConfig {
  @scala.inline
  def apply(): DocConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocConfig]
  }
  @scala.inline
  implicit class DocConfigOps[Self <: DocConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: DocDefaultConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotcontext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDotcontext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.context")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotprefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDotprefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotstatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDotstatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.status")(js.undefined)
        ret
    }
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkdown(value: Boolean | DocMarkdownConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkdownDotbreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkdownDotbreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.breaks")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkdownDotgfm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.gfm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkdownDotgfm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.gfm")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkdownDotpedantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.pedantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkdownDotpedantic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.pedantic")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkdownDotsanitize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.sanitize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkdownDotsanitize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.sanitize")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkdownDotsmartLists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.smartLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkdownDotsmartLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.smartLists")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkdownDotsmartypants(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.smartypants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkdownDotsmartypants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.smartypants")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkdownDottables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkdownDottables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown.tables")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withStatuses(value: StringDictionary[StatusInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(js.undefined)
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

