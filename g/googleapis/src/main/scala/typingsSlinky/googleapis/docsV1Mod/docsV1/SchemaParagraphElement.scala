package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ParagraphElement describes content within a Paragraph.
  */
@js.native
trait SchemaParagraphElement extends js.Object {
  /**
    * An auto text paragraph element.
    */
  var autoText: js.UndefOr[SchemaAutoText] = js.native
  /**
    * A column break paragraph element.
    */
  var columnBreak: js.UndefOr[SchemaColumnBreak] = js.native
  /**
    * The zero-base end index of this paragraph element, exclusive, in UTF-16
    * code units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * An equation paragraph element.
    */
  var equation: js.UndefOr[SchemaEquation] = js.native
  /**
    * A footnote reference paragraph element.
    */
  var footnoteReference: js.UndefOr[SchemaFootnoteReference] = js.native
  /**
    * A horizontal rule paragraph element.
    */
  var horizontalRule: js.UndefOr[SchemaHorizontalRule] = js.native
  /**
    * An inline object paragraph element.
    */
  var inlineObjectElement: js.UndefOr[SchemaInlineObjectElement] = js.native
  /**
    * A page break paragraph element.
    */
  var pageBreak: js.UndefOr[SchemaPageBreak] = js.native
  /**
    * The zero-based start index of this paragraph element, in UTF-16 code
    * units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * A text run paragraph element.
    */
  var textRun: js.UndefOr[SchemaTextRun] = js.native
}

object SchemaParagraphElement {
  @scala.inline
  def apply(): SchemaParagraphElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraphElement]
  }
  @scala.inline
  implicit class SchemaParagraphElementOps[Self <: SchemaParagraphElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoText(value: SchemaAutoText): Self = {
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
    def withColumnBreak(value: SchemaColumnBreak): Self = {
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
    def withEquation(value: SchemaEquation): Self = {
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
    def withFootnoteReference(value: SchemaFootnoteReference): Self = {
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
    def withHorizontalRule(value: SchemaHorizontalRule): Self = {
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
    def withInlineObjectElement(value: SchemaInlineObjectElement): Self = {
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
    def withPageBreak(value: SchemaPageBreak): Self = {
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
    def withTextRun(value: SchemaTextRun): Self = {
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

