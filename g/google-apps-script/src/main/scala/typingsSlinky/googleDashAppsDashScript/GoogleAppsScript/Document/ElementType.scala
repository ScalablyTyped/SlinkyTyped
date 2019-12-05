package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElementType extends js.Object

/**
  * An enumeration of all the element types.
  *
  * Use the ElementType enumeration to check the type of a given element, for instance:
  *
  *     var firstChild = DocumentApp.getActiveDocument().getBody().getChild(0);
  *     if (firstChild.getType() == DocumentApp.ElementType.PARAGRAPH) {
  *       // It's a paragraph, apply a paragraph heading.
  *       firstChild.asParagraph().setHeading(DocumentApp.ParagraphHeading.HEADING1);
  *     }
  */
@JSGlobal("GoogleAppsScript.Document.ElementType")
@js.native
object ElementType extends js.Object {
  @js.native
  sealed trait BODY_SECTION extends ElementType
  
  @js.native
  sealed trait COMMENT_SECTION extends ElementType
  
  @js.native
  sealed trait DOCUMENT extends ElementType
  
  @js.native
  sealed trait EQUATION extends ElementType
  
  @js.native
  sealed trait EQUATION_FUNCTION extends ElementType
  
  @js.native
  sealed trait EQUATION_FUNCTION_ARGUMENT_SEPARATOR extends ElementType
  
  @js.native
  sealed trait EQUATION_SYMBOL extends ElementType
  
  @js.native
  sealed trait FOOTER_SECTION extends ElementType
  
  @js.native
  sealed trait FOOTNOTE extends ElementType
  
  @js.native
  sealed trait FOOTNOTE_SECTION extends ElementType
  
  @js.native
  sealed trait HEADER_SECTION extends ElementType
  
  @js.native
  sealed trait HORIZONTAL_RULE extends ElementType
  
  @js.native
  sealed trait INLINE_DRAWING extends ElementType
  
  @js.native
  sealed trait INLINE_IMAGE extends ElementType
  
  @js.native
  sealed trait LIST_ITEM extends ElementType
  
  @js.native
  sealed trait PAGE_BREAK extends ElementType
  
  @js.native
  sealed trait PARAGRAPH extends ElementType
  
  @js.native
  sealed trait TABLE extends ElementType
  
  @js.native
  sealed trait TABLE_CELL extends ElementType
  
  @js.native
  sealed trait TABLE_OF_CONTENTS extends ElementType
  
  @js.native
  sealed trait TABLE_ROW extends ElementType
  
  @js.native
  sealed trait TEXT extends ElementType
  
  @js.native
  sealed trait UNSUPPORTED extends ElementType
  
  /* 0 */ val BODY_SECTION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.BODY_SECTION with Double = js.native
  /* 1 */ val COMMENT_SECTION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.COMMENT_SECTION with Double = js.native
  /* 2 */ val DOCUMENT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.DOCUMENT with Double = js.native
  /* 3 */ val EQUATION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.EQUATION with Double = js.native
  /* 4 */ val EQUATION_FUNCTION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.EQUATION_FUNCTION with Double = js.native
  /* 5 */ val EQUATION_FUNCTION_ARGUMENT_SEPARATOR: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.EQUATION_FUNCTION_ARGUMENT_SEPARATOR with Double = js.native
  /* 6 */ val EQUATION_SYMBOL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.EQUATION_SYMBOL with Double = js.native
  /* 7 */ val FOOTER_SECTION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.FOOTER_SECTION with Double = js.native
  /* 8 */ val FOOTNOTE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.FOOTNOTE with Double = js.native
  /* 9 */ val FOOTNOTE_SECTION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.FOOTNOTE_SECTION with Double = js.native
  /* 10 */ val HEADER_SECTION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.HEADER_SECTION with Double = js.native
  /* 11 */ val HORIZONTAL_RULE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.HORIZONTAL_RULE with Double = js.native
  /* 12 */ val INLINE_DRAWING: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.INLINE_DRAWING with Double = js.native
  /* 13 */ val INLINE_IMAGE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.INLINE_IMAGE with Double = js.native
  /* 14 */ val LIST_ITEM: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.LIST_ITEM with Double = js.native
  /* 15 */ val PAGE_BREAK: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.PAGE_BREAK with Double = js.native
  /* 16 */ val PARAGRAPH: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.PARAGRAPH with Double = js.native
  /* 17 */ val TABLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TABLE with Double = js.native
  /* 18 */ val TABLE_CELL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TABLE_CELL with Double = js.native
  /* 19 */ val TABLE_OF_CONTENTS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TABLE_OF_CONTENTS with Double = js.native
  /* 20 */ val TABLE_ROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TABLE_ROW with Double = js.native
  /* 21 */ val TEXT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TEXT with Double = js.native
  /* 22 */ val UNSUPPORTED: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementType with Double] = js.native
}

