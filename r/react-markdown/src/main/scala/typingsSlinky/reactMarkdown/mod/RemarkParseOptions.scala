package typingsSlinky.reactMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarkParseOptions extends js.Object {
  var blocks: js.Array[String] = js.native
  var commonmark: Boolean = js.native
  var footnotes: Boolean = js.native
  var gfm: Boolean = js.native
  var pedantic: Boolean = js.native
}

object RemarkParseOptions {
  @scala.inline
  def apply(blocks: js.Array[String], commonmark: Boolean, footnotes: Boolean, gfm: Boolean, pedantic: Boolean): RemarkParseOptions = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], commonmark = commonmark.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], gfm = gfm.asInstanceOf[js.Any], pedantic = pedantic.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemarkParseOptions]
  }
  @scala.inline
  implicit class RemarkParseOptionsOps[Self <: RemarkParseOptions] (val x: Self) extends AnyVal {
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
    def withCommonmark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFootnotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGfm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPedantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pedantic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

