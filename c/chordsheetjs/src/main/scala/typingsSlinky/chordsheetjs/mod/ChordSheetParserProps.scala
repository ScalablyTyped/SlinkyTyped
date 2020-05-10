package typingsSlinky.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChordSheetParserProps extends js.Object {
  var preserveWhitespace: Boolean = js.native
}

object ChordSheetParserProps {
  @scala.inline
  def apply(preserveWhitespace: Boolean): ChordSheetParserProps = {
    val __obj = js.Dynamic.literal(preserveWhitespace = preserveWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChordSheetParserProps]
  }
  @scala.inline
  implicit class ChordSheetParserPropsOps[Self <: ChordSheetParserProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreserveWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

