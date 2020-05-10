package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IMarkdownString
import typingsSlinky.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hover extends js.Object {
  /**
    * The contents of this hover.
    */
  var contents: js.Array[IMarkdownString] = js.native
  /**
    * The range to which this hover applies. When missing, the
    * editor will use the range at the current position or the
    * current position itself.
    */
  var range: js.UndefOr[IRange] = js.native
}

object Hover {
  @scala.inline
  def apply(contents: js.Array[IMarkdownString]): Hover = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  @scala.inline
  implicit class HoverOps[Self <: Hover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: js.Array[IMarkdownString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

