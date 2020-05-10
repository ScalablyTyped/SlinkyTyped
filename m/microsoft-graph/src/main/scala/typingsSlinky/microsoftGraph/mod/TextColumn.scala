package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextColumn extends js.Object {
  // Whether to allow multiple lines of text.
  var allowMultipleLines: js.UndefOr[Boolean] = js.native
  // Whether updates to this column should replace existing text, or append to it.
  var appendChangesToExistingText: js.UndefOr[Boolean] = js.native
  // The size of the text box.
  var linesForEditing: js.UndefOr[Double] = js.native
  // The maximum number of characters for the value.
  var maxLength: js.UndefOr[Double] = js.native
  // The type of text being stored. Must be one of plain or richText
  var textType: js.UndefOr[String] = js.native
}

object TextColumn {
  @scala.inline
  def apply(): TextColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColumn]
  }
  @scala.inline
  implicit class TextColumnOps[Self <: TextColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultipleLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleLines")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendChangesToExistingText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChangesToExistingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendChangesToExistingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChangesToExistingText")(js.undefined)
        ret
    }
    @scala.inline
    def withLinesForEditing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesForEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinesForEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesForEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTextType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textType")(js.undefined)
        ret
    }
  }
  
}

