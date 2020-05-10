package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextElement extends js.Object {
  var autoText: js.UndefOr[AutoText] = js.native
  var endIndex: js.UndefOr[Double] = js.native
  var paragraphMarker: js.UndefOr[ParagraphMarker] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var textRun: js.UndefOr[TextRun] = js.native
}

object TextElement {
  @scala.inline
  def apply(): TextElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextElement]
  }
  @scala.inline
  implicit class TextElementOps[Self <: TextElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoText(value: AutoText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoText")(js.undefined)
        ret
    }
    @scala.inline
    def withEndIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphMarker(value: ParagraphMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRun(value: TextRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRun")(js.undefined)
        ret
    }
  }
  
}

