package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellRichTextValue extends CellValue {
  var richText: js.Array[RichText] = js.native
}

object CellRichTextValue {
  @scala.inline
  def apply(richText: js.Array[RichText]): CellRichTextValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRichTextValue]
  }
  @scala.inline
  implicit class CellRichTextValueOps[Self <: CellRichTextValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRichText(value: js.Array[RichText]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

