package typingsSlinky.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing an embedded drawing. An InlineDrawing can be contained within a
  * ListItem or Paragraph, unless the ListItem or Paragraph is within
  * a FootnoteSection. An InlineDrawing cannot itself contain any other element. For
  * more information on document structure, see the guide to extending Google Docs.
  */
@js.native
trait InlineDrawing extends Element {
  def getAltDescription(): String = js.native
  def getAltTitle(): String = js.native
  def setAltDescription(description: String): InlineDrawing = js.native
  def setAltTitle(title: String): InlineDrawing = js.native
}

object InlineDrawing {
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
    getAltDescription: () => String,
    getAltTitle: () => String,
    getAttributes: () => js.Any,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => Boolean,
    merge: () => Element,
    removeFromParent: () => Element,
    setAltDescription: String => InlineDrawing,
    setAltTitle: String => InlineDrawing,
    setAttributes: js.Any => Element
  ): InlineDrawing = {
    val __obj = js.Dynamic.literal(asBody = js.Any.fromFunction0(asBody), asEquation = js.Any.fromFunction0(asEquation), asEquationFunction = js.Any.fromFunction0(asEquationFunction), asEquationFunctionArgumentSeparator = js.Any.fromFunction0(asEquationFunctionArgumentSeparator), asEquationSymbol = js.Any.fromFunction0(asEquationSymbol), asFooterSection = js.Any.fromFunction0(asFooterSection), asFootnote = js.Any.fromFunction0(asFootnote), asFootnoteSection = js.Any.fromFunction0(asFootnoteSection), asHeaderSection = js.Any.fromFunction0(asHeaderSection), asHorizontalRule = js.Any.fromFunction0(asHorizontalRule), asInlineDrawing = js.Any.fromFunction0(asInlineDrawing), asInlineImage = js.Any.fromFunction0(asInlineImage), asListItem = js.Any.fromFunction0(asListItem), asPageBreak = js.Any.fromFunction0(asPageBreak), asParagraph = js.Any.fromFunction0(asParagraph), asTable = js.Any.fromFunction0(asTable), asTableCell = js.Any.fromFunction0(asTableCell), asTableOfContents = js.Any.fromFunction0(asTableOfContents), asTableRow = js.Any.fromFunction0(asTableRow), asText = js.Any.fromFunction0(asText), copy = js.Any.fromFunction0(copy), getAltDescription = js.Any.fromFunction0(getAltDescription), getAltTitle = js.Any.fromFunction0(getAltTitle), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[InlineDrawing]
  }
  @scala.inline
  implicit class InlineDrawingOps[Self <: InlineDrawing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAltDescription(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAltDescription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAltTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAltTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAltDescription(value: String => InlineDrawing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAltDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAltTitle(value: String => InlineDrawing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAltTitle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

