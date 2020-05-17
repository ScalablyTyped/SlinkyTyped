package typingsSlinky.reactMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-markdown.react-markdown.RemarkParseOptions> */
@js.native
trait PartialRemarkParseOptions extends js.Object {
  var blocks: js.UndefOr[js.Array[String]] = js.native
  var commonmark: js.UndefOr[Boolean] = js.native
  var footnotes: js.UndefOr[Boolean] = js.native
  var gfm: js.UndefOr[Boolean] = js.native
  var pedantic: js.UndefOr[Boolean] = js.native
}

object PartialRemarkParseOptions {
  @scala.inline
  def apply(): PartialRemarkParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRemarkParseOptions]
  }
  @scala.inline
  implicit class PartialRemarkParseOptionsOps[Self <: PartialRemarkParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonmark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonmark")(js.undefined)
        ret
    }
    @scala.inline
    def withFootnotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFootnotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnotes")(js.undefined)
        ret
    }
    @scala.inline
    def withGfm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGfm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfm")(js.undefined)
        ret
    }
    @scala.inline
    def withPedantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pedantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPedantic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pedantic")(js.undefined)
        ret
    }
  }
  
}

