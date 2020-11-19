package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Document")
@js.native
object Document extends js.Object {
  
  /**
    * An enumeration of the element attributes.
    *
    * Use attributes to compose custom styles. For example:
    *
    *     // Define a style with yellow background.
    *     var highlightStyle = {};
    *     highlightStyle[DocumentApp.Attribute.BACKGROUND_COLOR] = '#FFFF00';
    *     highlightStyle[DocumentApp.Attribute.BOLD] = true;
    *
    *     // Insert "Hello", highlighted.
    *     DocumentApp.getActiveDocument().editAsText()
    *       .insertText(0, 'Hello\n')
    *       .setAttributes(0, 4, highlightStyle);
    */
  @js.native
  object Attribute extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute with Double] = js.native
    
    /* 0 */ val BACKGROUND_COLOR: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.BACKGROUND_COLOR with Double = js.native
    
    /* 1 */ val BOLD: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.BOLD with Double = js.native
    
    /* 2 */ val BORDER_COLOR: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.BORDER_COLOR with Double = js.native
    
    /* 3 */ val BORDER_WIDTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.BORDER_WIDTH with Double = js.native
    
    /* 4 */ val CODE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.CODE with Double = js.native
    
    /* 5 */ val FONT_FAMILY: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.FONT_FAMILY with Double = js.native
    
    /* 6 */ val FONT_SIZE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.FONT_SIZE with Double = js.native
    
    /* 7 */ val FOREGROUND_COLOR: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.FOREGROUND_COLOR with Double = js.native
    
    /* 15 */ val GLYPH_TYPE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.GLYPH_TYPE with Double = js.native
    
    /* 8 */ val HEADING: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.HEADING with Double = js.native
    
    /* 9 */ val HEIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.HEIGHT with Double = js.native
    
    /* 10 */ val HORIZONTAL_ALIGNMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.HORIZONTAL_ALIGNMENT with Double = js.native
    
    /* 11 */ val INDENT_END: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.INDENT_END with Double = js.native
    
    /* 12 */ val INDENT_FIRST_LINE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.INDENT_FIRST_LINE with Double = js.native
    
    /* 13 */ val INDENT_START: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.INDENT_START with Double = js.native
    
    /* 14 */ val ITALIC: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.ITALIC with Double = js.native
    
    /* 16 */ val LEFT_TO_RIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.LEFT_TO_RIGHT with Double = js.native
    
    /* 17 */ val LINE_SPACING: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.LINE_SPACING with Double = js.native
    
    /* 18 */ val LINK_URL: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.LINK_URL with Double = js.native
    
    /* 19 */ val LIST_ID: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.LIST_ID with Double = js.native
    
    /* 20 */ val MARGIN_BOTTOM: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.MARGIN_BOTTOM with Double = js.native
    
    /* 21 */ val MARGIN_LEFT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.MARGIN_LEFT with Double = js.native
    
    /* 22 */ val MARGIN_RIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.MARGIN_RIGHT with Double = js.native
    
    /* 23 */ val MARGIN_TOP: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.MARGIN_TOP with Double = js.native
    
    /* 25 */ val MINIMUM_HEIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.MINIMUM_HEIGHT with Double = js.native
    
    /* 24 */ val NESTING_LEVEL: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.NESTING_LEVEL with Double = js.native
    
    /* 26 */ val PADDING_BOTTOM: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.PADDING_BOTTOM with Double = js.native
    
    /* 27 */ val PADDING_LEFT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.PADDING_LEFT with Double = js.native
    
    /* 28 */ val PADDING_RIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.PADDING_RIGHT with Double = js.native
    
    /* 29 */ val PADDING_TOP: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.PADDING_TOP with Double = js.native
    
    /* 30 */ val PAGE_HEIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.PAGE_HEIGHT with Double = js.native
    
    /* 31 */ val PAGE_WIDTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.PAGE_WIDTH with Double = js.native
    
    /* 32 */ val SPACING_AFTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.SPACING_AFTER with Double = js.native
    
    /* 33 */ val SPACING_BEFORE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.SPACING_BEFORE with Double = js.native
    
    /* 34 */ val STRIKETHROUGH: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.STRIKETHROUGH with Double = js.native
    
    /* 35 */ val UNDERLINE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.UNDERLINE with Double = js.native
    
    /* 36 */ val VERTICAL_ALIGNMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.VERTICAL_ALIGNMENT with Double = js.native
    
    /* 37 */ val WIDTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Attribute.WIDTH with Double = js.native
  }
  
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
  @js.native
  object ElementType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType with Double] = js.native
    
    /* 0 */ val BODY_SECTION: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.BODY_SECTION with Double = js.native
    
    /* 1 */ val COMMENT_SECTION: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.COMMENT_SECTION with Double = js.native
    
    /* 2 */ val DOCUMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.DOCUMENT with Double = js.native
    
    /* 3 */ val EQUATION: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.EQUATION with Double = js.native
    
    /* 4 */ val EQUATION_FUNCTION: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.EQUATION_FUNCTION with Double = js.native
    
    /* 5 */ val EQUATION_FUNCTION_ARGUMENT_SEPARATOR: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.EQUATION_FUNCTION_ARGUMENT_SEPARATOR with Double = js.native
    
    /* 6 */ val EQUATION_SYMBOL: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.EQUATION_SYMBOL with Double = js.native
    
    /* 7 */ val FOOTER_SECTION: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.FOOTER_SECTION with Double = js.native
    
    /* 8 */ val FOOTNOTE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.FOOTNOTE with Double = js.native
    
    /* 9 */ val FOOTNOTE_SECTION: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.FOOTNOTE_SECTION with Double = js.native
    
    /* 10 */ val HEADER_SECTION: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.HEADER_SECTION with Double = js.native
    
    /* 11 */ val HORIZONTAL_RULE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.HORIZONTAL_RULE with Double = js.native
    
    /* 12 */ val INLINE_DRAWING: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.INLINE_DRAWING with Double = js.native
    
    /* 13 */ val INLINE_IMAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.INLINE_IMAGE with Double = js.native
    
    /* 14 */ val LIST_ITEM: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.LIST_ITEM with Double = js.native
    
    /* 15 */ val PAGE_BREAK: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.PAGE_BREAK with Double = js.native
    
    /* 16 */ val PARAGRAPH: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.PARAGRAPH with Double = js.native
    
    /* 17 */ val TABLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.TABLE with Double = js.native
    
    /* 18 */ val TABLE_CELL: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.TABLE_CELL with Double = js.native
    
    /* 19 */ val TABLE_OF_CONTENTS: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.TABLE_OF_CONTENTS with Double = js.native
    
    /* 20 */ val TABLE_ROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.TABLE_ROW with Double = js.native
    
    /* 21 */ val TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.TEXT with Double = js.native
    
    /* 22 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ElementType.UNSUPPORTED with Double = js.native
  }
  
  /**
    *
    * Deprecated. The methods getFontFamily() and setFontFamily(String) now use string
    *     names for fonts instead of this enum. Although this enum is deprecated, it will remain
    *     available for compatibility with older scripts.
    * An enumeration of the supported fonts.
    *
    * Use the FontFamily enumeration to set the font for a range of text, element or
    * document.
    *
    *     var body = DocumentApp.getActiveDocument().getBody();
    *
    *     // Insert a paragraph at the start of the document.
    *     body.insertParagraph(0, "Hello, Apps Script!");
    *
    *     // Set the document font to Calibri.
    *     body.editAsText().setFontFamily(DocumentApp.FontFamily.CALIBRI);
    *
    *     // Set the first paragraph font to Arial.
    *     body.getParagraphs()[0].setFontFamily(DocumentApp.FontFamily.ARIAL);
    *
    *     // Set "Apps Script" to Comic Sans MS.
    *     var text = 'Apps Script';
    *     var a = body.getText().indexOf(text);
    *     var b = a + text.length - 1;
    *     body.editAsText().setFontFamily(a, b, DocumentApp.FontFamily.COMIC_SANS_MS);
    */
  @js.native
  object FontFamily extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily with Double] = js.native
    
    /* 0 */ val AMARANTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.AMARANTH with Double = js.native
    
    /* 1 */ val ARIAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.ARIAL with Double = js.native
    
    /* 2 */ val ARIAL_BLACK: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.ARIAL_BLACK with Double = js.native
    
    /* 3 */ val ARIAL_NARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.ARIAL_NARROW with Double = js.native
    
    /* 4 */ val ARVO: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.ARVO with Double = js.native
    
    /* 5 */ val CALIBRI: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.CALIBRI with Double = js.native
    
    /* 6 */ val CAMBRIA: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.CAMBRIA with Double = js.native
    
    /* 7 */ val COMIC_SANS_MS: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.COMIC_SANS_MS with Double = js.native
    
    /* 8 */ val CONSOLAS: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.CONSOLAS with Double = js.native
    
    /* 9 */ val CORSIVA: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.CORSIVA with Double = js.native
    
    /* 10 */ val COURIER_NEW: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.COURIER_NEW with Double = js.native
    
    /* 11 */ val DANCING_SCRIPT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.DANCING_SCRIPT with Double = js.native
    
    /* 12 */ val DROID_SANS: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.DROID_SANS with Double = js.native
    
    /* 13 */ val DROID_SERIF: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.DROID_SERIF with Double = js.native
    
    /* 14 */ val GARAMOND: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.GARAMOND with Double = js.native
    
    /* 15 */ val GEORGIA: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.GEORGIA with Double = js.native
    
    /* 16 */ val GLORIA_HALLELUJAH: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.GLORIA_HALLELUJAH with Double = js.native
    
    /* 17 */ val GREAT_VIBES: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.GREAT_VIBES with Double = js.native
    
    /* 18 */ val LOBSTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.LOBSTER with Double = js.native
    
    /* 19 */ val MERRIWEATHER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.MERRIWEATHER with Double = js.native
    
    /* 20 */ val PACIFICO: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.PACIFICO with Double = js.native
    
    /* 21 */ val PHILOSOPHER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.PHILOSOPHER with Double = js.native
    
    /* 22 */ val POIRET_ONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.POIRET_ONE with Double = js.native
    
    /* 23 */ val QUATTROCENTO: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.QUATTROCENTO with Double = js.native
    
    /* 24 */ val ROBOTO: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.ROBOTO with Double = js.native
    
    /* 25 */ val SHADOWS_INTO_LIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.SHADOWS_INTO_LIGHT with Double = js.native
    
    /* 26 */ val SYNCOPATE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.SYNCOPATE with Double = js.native
    
    /* 27 */ val TAHOMA: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.TAHOMA with Double = js.native
    
    /* 28 */ val TIMES_NEW_ROMAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.TIMES_NEW_ROMAN with Double = js.native
    
    /* 29 */ val TREBUCHET_MS: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.TREBUCHET_MS with Double = js.native
    
    /* 30 */ val UBUNTU: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.UBUNTU with Double = js.native
    
    /* 31 */ val VERDANA: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.FontFamily.VERDANA with Double = js.native
  }
  
  /**
    * An enumeration of the supported glyph types.
    *
    * Use the GlyphType enumeration to set the bullet type for list items.
    *
    *     var body = DocumentApp.getActiveDocument().getBody();
    *
    *     // Insert at list item, with the default nesting level of zero.
    *      body.appendListItem("Item 1");
    *
    *      // Append a second list item, with a nesting level of one, indented one inch.
    *      // The two items will have different bullet glyphs.
    *      body.appendListItem("Item 2").setNestingLevel(1).setIndentStart(72)
    *          .setGlyphType(DocumentApp.GlyphType.SQUARE_BULLET);
    */
  @js.native
  object GlyphType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Document.GlyphType with Double] = js.native
    
    /* 0 */ val BULLET: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.GlyphType.BULLET with Double = js.native
    
    /* 1 */ val HOLLOW_BULLET: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.GlyphType.HOLLOW_BULLET with Double = js.native
    
    /* 5 */ val LATIN_LOWER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.GlyphType.LATIN_LOWER with Double = js.native
    
    /* 4 */ val LATIN_UPPER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.GlyphType.LATIN_UPPER with Double = js.native
    
    /* 3 */ val NUMBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.GlyphType.NUMBER with Double = js.native
    
    /* 7 */ val ROMAN_LOWER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.GlyphType.ROMAN_LOWER with Double = js.native
    
    /* 6 */ val ROMAN_UPPER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.GlyphType.ROMAN_UPPER with Double = js.native
    
    /* 2 */ val SQUARE_BULLET: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.GlyphType.SQUARE_BULLET with Double = js.native
  }
  
  /**
    * An enumeration of the supported horizontal alignment types.
    *
    * Use the HorizontalAlignment enumeration to manipulate the alignment of Paragraph contents.
    *
    *     var body = DocumentApp.getActiveDocument().getBody();
    *
    *     // Insert a paragraph and a table at the start of document.
    *     var par1 = body.insertParagraph(0, "Center");
    *     var table = body.insertTable(1, [['Left', 'Right']]);
    *     var par2 = table.getCell(0, 0).getChild(0).asParagraph();
    *     var par3 = table.getCell(0, 0).getChild(0).asParagraph();
    *
    *     // Center align the first paragraph.
    *     par1.setAlignment(DocumentApp.HorizontalAlignment.CENTER);
    *
    *     // Left align the first cell.
    *     par2.setAlignment(DocumentApp.HorizontalAlignment.LEFT);
    *
    *     // Right align the second cell.
    *     par3.setAlignment(DocumentApp.HorizontalAlignment.RIGHT);
    */
  @js.native
  object HorizontalAlignment extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment with Double
      ] = js.native
    
    /* 1 */ val CENTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment.CENTER with Double = js.native
    
    /* 3 */ val JUSTIFY: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment.JUSTIFY with Double = js.native
    
    /* 0 */ val LEFT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment.LEFT with Double = js.native
    
    /* 2 */ val RIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment.RIGHT with Double = js.native
  }
  
  /**
    * An enumeration of the standard paragraph headings.
    *
    * Use the ParagraphHeading enumeration to configure the heading style for ParagraphElement.
    *
    *     var body = DocumentApp.getActiveDocument().getBody();
    *
    *     // Append a paragraph, with heading 1.
    *     var par1 = body.appendParagraph("Title");
    *     par1.setHeading(DocumentApp.ParagraphHeading.HEADING1);
    *
    *     // Append a paragraph, with heading 2.
    *     var par2 = body.appendParagraph("SubTitle");
    *     par2.setHeading(DocumentApp.ParagraphHeading.HEADING2);
    *
    *     // Append a paragraph, with normal heading.
    *     var par3 = body.appendParagraph("Text");
    *     par3.setHeading(DocumentApp.ParagraphHeading.NORMAL);
    */
  @js.native
  object ParagraphHeading extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading with Double
      ] = js.native
    
    /* 1 */ val HEADING1: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING1 with Double = js.native
    
    /* 2 */ val HEADING2: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING2 with Double = js.native
    
    /* 3 */ val HEADING3: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING3 with Double = js.native
    
    /* 4 */ val HEADING4: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING4 with Double = js.native
    
    /* 5 */ val HEADING5: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING5 with Double = js.native
    
    /* 6 */ val HEADING6: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING6 with Double = js.native
    
    /* 0 */ val NORMAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.NORMAL with Double = js.native
    
    /* 8 */ val SUBTITLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.SUBTITLE with Double = js.native
    
    /* 7 */ val TITLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.TITLE with Double = js.native
  }
  
  /**
    * An enumeration that specifies how to lay out a PositionedImage in relation to surrounding
    * text.
    */
  @js.native
  object PositionedLayout extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Document.PositionedLayout with Double
      ] = js.native
    
    /* 0 */ val ABOVE_TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.ABOVE_TEXT with Double = js.native
    
    /* 1 */ val BREAK_BOTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.BREAK_BOTH with Double = js.native
    
    /* 2 */ val BREAK_LEFT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.BREAK_LEFT with Double = js.native
    
    /* 3 */ val BREAK_RIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.BREAK_RIGHT with Double = js.native
    
    /* 4 */ val WRAP_TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.WRAP_TEXT with Double = js.native
  }
  
  /**
    * An enumeration of the type of text alignments.
    *
    *     // Make the first character in the first paragraph be superscript.
    *     var text = DocumentApp.getActiveDocument().getBody().getParagraphs()[0].editAsText();
    *     text.setTextAlignment(0, 0, DocumentApp.TextAlignment.SUPERSCRIPT);
    */
  @js.native
  object TextAlignment extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Document.TextAlignment with Double
      ] = js.native
    
    /* 0 */ val NORMAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.TextAlignment.NORMAL with Double = js.native
    
    /* 2 */ val SUBSCRIPT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.TextAlignment.SUBSCRIPT with Double = js.native
    
    /* 1 */ val SUPERSCRIPT: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.TextAlignment.SUPERSCRIPT with Double = js.native
  }
  
  /**
    * An enumeration of the supported vertical alignment types.
    *
    * Use the VerticalAlignment enumeration to set the vertical alignment of table cells.
    *
    *     var body = DocumentApp.getActiveDocument().getBody();
    *
    *     // Append table containing two cells.
    *     var table = body.appendTable([['Top', 'Center', 'Bottom']]);
    *
    *     // Align the first cell's contents to the top.
    *     table.getCell(0, 0).setVerticalAlignment(DocumentApp.VerticalAlignment.TOP);
    *
    *     // Align the second cell's contents to the center.
    *     table.getCell(0, 1).setVerticalAlignment(DocumentApp.VerticalAlignment.CENTER);
    *
    *     // Align the third cell's contents to the bottom.
    *     table.getCell(0, 2).setVerticalAlignment(DocumentApp.VerticalAlignment.BOTTOM);
    */
  @js.native
  object VerticalAlignment extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Document.VerticalAlignment with Double
      ] = js.native
    
    /* 0 */ val BOTTOM: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.VerticalAlignment.BOTTOM with Double = js.native
    
    /* 1 */ val CENTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.VerticalAlignment.CENTER with Double = js.native
    
    /* 2 */ val TOP: typingsSlinky.googleAppsScript.GoogleAppsScript.Document.VerticalAlignment.TOP with Double = js.native
  }
}
