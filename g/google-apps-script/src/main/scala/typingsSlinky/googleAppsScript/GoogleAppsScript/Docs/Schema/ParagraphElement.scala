package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphElement extends js.Object {
  var autoText: js.UndefOr[AutoText] = js.native
  var columnBreak: js.UndefOr[ColumnBreak] = js.native
  var endIndex: js.UndefOr[Double] = js.native
  var equation: js.UndefOr[Equation] = js.native
  var footnoteReference: js.UndefOr[FootnoteReference] = js.native
  var horizontalRule: js.UndefOr[HorizontalRule] = js.native
  var inlineObjectElement: js.UndefOr[InlineObjectElement] = js.native
  var pageBreak: js.UndefOr[PageBreak] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var textRun: js.UndefOr[TextRun] = js.native
}

object ParagraphElement {
  @scala.inline
  def apply(): ParagraphElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphElement]
  }
  @scala.inline
  implicit class ParagraphElementOps[Self <: ParagraphElement] (val x: Self) extends AnyVal {
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
    def withColumnBreak(value: ColumnBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnBreak")(js.undefined)
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
    def withEquation(value: Equation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equation")(js.undefined)
        ret
    }
    @scala.inline
    def withFootnoteReference(value: FootnoteReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnoteReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFootnoteReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnoteReference")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalRule(value: HorizontalRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalRule")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineObjectElement(value: InlineObjectElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjectElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineObjectElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjectElement")(js.undefined)
        ret
    }
    @scala.inline
    def withPageBreak(value: PageBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreak")(js.undefined)
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

