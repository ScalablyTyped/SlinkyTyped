package typingsSlinky.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic element. Document contents are
  * represented as elements. For example, ListItem, Paragraph, and Table are
  * elements and inherit all of the methods defined by Element, such as getType().
  * Implementing classes
  *
  * NameBrief description
  *
  * BodyAn element representing a document body.
  *
  * ContainerElementA generic element that may contain other elements.
  *
  * EquationAn element representing a mathematical expression.
  *
  * EquationFunctionAn element representing a function in a mathematical Equation.
  *
  * EquationFunctionArgumentSeparatorAn element representing a function separator in a mathematical Equation.
  *
  * EquationSymbolAn element representing a symbol in a mathematical Equation.
  *
  * FooterSectionAn element representing a footer section.
  *
  * FootnoteAn element representing a footnote.
  *
  * FootnoteSectionAn element representing a footnote section.
  *
  * HeaderSectionAn element representing a header section.
  *
  * HorizontalRuleAn element representing an horizontal rule.
  *
  * InlineDrawingAn element representing an embedded drawing.
  *
  * InlineImageAn element representing an embedded image.
  *
  * ListItemAn element representing a list item.
  *
  * PageBreakAn element representing a page break.
  *
  * ParagraphAn element representing a paragraph.
  *
  * TableAn element representing a table.
  *
  * TableCellAn element representing a table cell.
  *
  * TableOfContentsAn element containing a table of contents.
  *
  * TableRowAn element representing a table row.
  *
  * TextAn element representing a rich text region.
  *
  * UnsupportedElementAn element representing a region that is unknown or cannot be affected by a script, such as a
  * page number.
  */
@js.native
trait Element extends js.Object {
  def asBody(): Body = js.native
  def asEquation(): Equation = js.native
  def asEquationFunction(): EquationFunction = js.native
  def asEquationFunctionArgumentSeparator(): EquationFunctionArgumentSeparator = js.native
  def asEquationSymbol(): EquationSymbol = js.native
  def asFooterSection(): FooterSection = js.native
  def asFootnote(): Footnote = js.native
  def asFootnoteSection(): FootnoteSection = js.native
  def asHeaderSection(): HeaderSection = js.native
  def asHorizontalRule(): HorizontalRule = js.native
  def asInlineDrawing(): InlineDrawing = js.native
  def asInlineImage(): InlineImage = js.native
  def asListItem(): ListItem = js.native
  def asPageBreak(): PageBreak = js.native
  def asParagraph(): Paragraph = js.native
  def asTable(): Table = js.native
  def asTableCell(): TableCell = js.native
  def asTableOfContents(): TableOfContents = js.native
  def asTableRow(): TableRow = js.native
  def asText(): Text = js.native
  def copy(): Element = js.native
  def getAttributes(): js.Any = js.native
  def getNextSibling(): Element = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getType(): ElementType = js.native
  def isAtDocumentEnd(): Boolean = js.native
  def merge(): Element = js.native
  def removeFromParent(): Element = js.native
  def setAttributes(attributes: js.Any): Element = js.native
}

object Element {
  @scala.inline
  def apply(
    asBody: () => Body,
    asEquation: () => Equation,
    asEquationFunction: () => EquationFunction,
    asEquationFunctionArgumentSeparator: () => EquationFunctionArgumentSeparator,
    asEquationSymbol: () => EquationSymbol,
    asFooterSection: () => FooterSection,
    asFootnote: () => Footnote,
    asFootnoteSection: () => FootnoteSection,
    asHeaderSection: () => HeaderSection,
    asHorizontalRule: () => HorizontalRule,
    asInlineDrawing: () => InlineDrawing,
    asInlineImage: () => InlineImage,
    asListItem: () => ListItem,
    asPageBreak: () => PageBreak,
    asParagraph: () => Paragraph,
    asTable: () => Table,
    asTableCell: () => TableCell,
    asTableOfContents: () => TableOfContents,
    asTableRow: () => TableRow,
    asText: () => Text,
    copy: () => Element,
    getAttributes: () => js.Any,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => Boolean,
    merge: () => Element,
    removeFromParent: () => Element,
    setAttributes: js.Any => Element
  ): Element = {
    val __obj = js.Dynamic.literal(asBody = js.Any.fromFunction0(asBody), asEquation = js.Any.fromFunction0(asEquation), asEquationFunction = js.Any.fromFunction0(asEquationFunction), asEquationFunctionArgumentSeparator = js.Any.fromFunction0(asEquationFunctionArgumentSeparator), asEquationSymbol = js.Any.fromFunction0(asEquationSymbol), asFooterSection = js.Any.fromFunction0(asFooterSection), asFootnote = js.Any.fromFunction0(asFootnote), asFootnoteSection = js.Any.fromFunction0(asFootnoteSection), asHeaderSection = js.Any.fromFunction0(asHeaderSection), asHorizontalRule = js.Any.fromFunction0(asHorizontalRule), asInlineDrawing = js.Any.fromFunction0(asInlineDrawing), asInlineImage = js.Any.fromFunction0(asInlineImage), asListItem = js.Any.fromFunction0(asListItem), asPageBreak = js.Any.fromFunction0(asPageBreak), asParagraph = js.Any.fromFunction0(asParagraph), asTable = js.Any.fromFunction0(asTable), asTableCell = js.Any.fromFunction0(asTableCell), asTableOfContents = js.Any.fromFunction0(asTableOfContents), asTableRow = js.Any.fromFunction0(asTableRow), asText = js.Any.fromFunction0(asText), copy = js.Any.fromFunction0(copy), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsBody(value: () => Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBody")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsEquation(value: () => Equation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asEquation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsEquationFunction(value: () => EquationFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asEquationFunction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsEquationFunctionArgumentSeparator(value: () => EquationFunctionArgumentSeparator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asEquationFunctionArgumentSeparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsEquationSymbol(value: () => EquationSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asEquationSymbol")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsFooterSection(value: () => FooterSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asFooterSection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsFootnote(value: () => Footnote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asFootnote")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsFootnoteSection(value: () => FootnoteSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asFootnoteSection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsHeaderSection(value: () => HeaderSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asHeaderSection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsHorizontalRule(value: () => HorizontalRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asHorizontalRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsInlineDrawing(value: () => InlineDrawing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asInlineDrawing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsInlineImage(value: () => InlineImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asInlineImage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsListItem(value: () => ListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asListItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsPageBreak(value: () => PageBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asPageBreak")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsParagraph(value: () => Paragraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asParagraph")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsTable(value: () => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsTableCell(value: () => TableCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTableCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsTableOfContents(value: () => TableOfContents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTableOfContents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsTableRow(value: () => TableRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTableRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsText(value: () => Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopy(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttributes(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNextSibling(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => ContainerElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreviousSibling(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => ElementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAtDocumentEnd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAtDocumentEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMerge(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveFromParent(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFromParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAttributes(value: js.Any => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

