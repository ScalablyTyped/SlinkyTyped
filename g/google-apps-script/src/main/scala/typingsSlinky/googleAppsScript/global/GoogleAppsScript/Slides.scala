package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slides {
  
  /**
    * The alignment position to apply.
    */
  @JSGlobal("GoogleAppsScript.Slides.AlignmentPosition")
  @js.native
  object AlignmentPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AlignmentPosition with Double
      ] = js.native
    
    /* 0 */ val CENTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AlignmentPosition.CENTER with Double = js.native
    
    /* 1 */ val HORIZONTAL_CENTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AlignmentPosition.HORIZONTAL_CENTER with Double = js.native
    
    /* 2 */ val VERTICAL_CENTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AlignmentPosition.VERTICAL_CENTER with Double = js.native
  }
  
  /**
    * The kinds of start and end forms with which linear geometry can be rendered.
    *
    * Some values are based on the "ST_LineEndType" simple type described in section 20.1.10.33 of
    * of "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ArrowStyle")
  @js.native
  object ArrowStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle with Double] = js.native
    
    /* 3 */ val FILL_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.FILL_ARROW with Double = js.native
    
    /* 4 */ val FILL_CIRCLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.FILL_CIRCLE with Double = js.native
    
    /* 6 */ val FILL_DIAMOND: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.FILL_DIAMOND with Double = js.native
    
    /* 5 */ val FILL_SQUARE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.FILL_SQUARE with Double = js.native
    
    /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.NONE with Double = js.native
    
    /* 7 */ val OPEN_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_ARROW with Double = js.native
    
    /* 8 */ val OPEN_CIRCLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_CIRCLE with Double = js.native
    
    /* 10 */ val OPEN_DIAMOND: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_DIAMOND with Double = js.native
    
    /* 9 */ val OPEN_SQUARE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_SQUARE with Double = js.native
    
    /* 2 */ val STEALTH_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.STEALTH_ARROW with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ArrowStyle.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The types of auto text.
    */
  @JSGlobal("GoogleAppsScript.Slides.AutoTextType")
  @js.native
  object AutoTextType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AutoTextType with Double] = js.native
    
    /* 1 */ val SLIDE_NUMBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AutoTextType.SLIDE_NUMBER with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AutoTextType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The table cell merge states.
    */
  @JSGlobal("GoogleAppsScript.Slides.CellMergeState")
  @js.native
  object CellMergeState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.CellMergeState with Double
      ] = js.native
    
    /* 1 */ val HEAD: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.CellMergeState.HEAD with Double = js.native
    
    /* 2 */ val MERGED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.CellMergeState.MERGED with Double = js.native
    
    /* 0 */ val NORMAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.CellMergeState.NORMAL with Double = js.native
  }
  
  /**
    * The content alignments for a Shape or TableCell. The supported alignments
    * correspond to predefined text anchoring types from the ECMA-376 standard.
    *
    * More information on those alignments can be found in the description of
    * the ST_TextAnchoringType simple type in section 20.1.10.59 of "Office Open XML File
    * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ContentAlignment")
  @js.native
  object ContentAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment with Double
      ] = js.native
    
    /* 3 */ val BOTTOM: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.BOTTOM with Double = js.native
    
    /* 2 */ val MIDDLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.MIDDLE with Double = js.native
    
    /* 1 */ val TOP: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.TOP with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The kinds of dashes with which linear geometry can be rendered. These values are based on the
    * "ST_PresetLineDashVal" simple type described in section 20.1.10.48 of "Office Open XML File
    * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.DashStyle")
  @js.native
  object DashStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.DashStyle with Double] = js.native
    
    /* 3 */ val DASH: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.DashStyle.DASH with Double = js.native
    
    /* 4 */ val DASH_DOT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.DashStyle.DASH_DOT with Double = js.native
    
    /* 2 */ val DOT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.DashStyle.DOT with Double = js.native
    
    /* 5 */ val LONG_DASH: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.DashStyle.LONG_DASH with Double = js.native
    
    /* 6 */ val LONG_DASH_DOT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.DashStyle.LONG_DASH_DOT with Double = js.native
    
    /* 1 */ val SOLID: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.DashStyle.SOLID with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.DashStyle.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The kinds of fill.
    */
  @JSGlobal("GoogleAppsScript.Slides.FillType")
  @js.native
  object FillType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.FillType with Double] = js.native
    
    /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.FillType.NONE with Double = js.native
    
    /* 2 */ val SOLID: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.FillType.SOLID with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.FillType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The line category.
    *
    * The exact LineType created is determined based on the category and how it's routed to
    * connect to other page elements.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineCategory")
  @js.native
  object LineCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineCategory with Double] = js.native
    
    /* 2 */ val BENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineCategory.BENT with Double = js.native
    
    /* 3 */ val CURVED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineCategory.CURVED with Double = js.native
    
    /* 1 */ val STRAIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineCategory.STRAIGHT with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineCategory.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The kinds of line fill.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineFillType")
  @js.native
  object LineFillType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineFillType with Double] = js.native
    
    /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineFillType.NONE with Double = js.native
    
    /* 2 */ val SOLID: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineFillType.SOLID with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineFillType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The line types.
    *
    * Derived from a subset of the values of the "ST_ShapeType" simple type in section 20.1.10.55 of
    * "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineType")
  @js.native
  object LineType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType with Double] = js.native
    
    /* 2 */ val BENT_CONNECTOR_2: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.BENT_CONNECTOR_2 with Double = js.native
    
    /* 3 */ val BENT_CONNECTOR_3: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.BENT_CONNECTOR_3 with Double = js.native
    
    /* 4 */ val BENT_CONNECTOR_4: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.BENT_CONNECTOR_4 with Double = js.native
    
    /* 5 */ val BENT_CONNECTOR_5: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.BENT_CONNECTOR_5 with Double = js.native
    
    /* 6 */ val CURVED_CONNECTOR_2: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.CURVED_CONNECTOR_2 with Double = js.native
    
    /* 7 */ val CURVED_CONNECTOR_3: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.CURVED_CONNECTOR_3 with Double = js.native
    
    /* 8 */ val CURVED_CONNECTOR_4: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.CURVED_CONNECTOR_4 with Double = js.native
    
    /* 9 */ val CURVED_CONNECTOR_5: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.CURVED_CONNECTOR_5 with Double = js.native
    
    /* 1 */ val STRAIGHT_CONNECTOR_1: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.STRAIGHT_CONNECTOR_1 with Double = js.native
    
    /* 10 */ val STRAIGHT_LINE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.STRAIGHT_LINE with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The types of a Link.
    */
  @JSGlobal("GoogleAppsScript.Slides.LinkType")
  @js.native
  object LinkType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LinkType with Double] = js.native
    
    /* 3 */ val SLIDE_ID: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LinkType.SLIDE_ID with Double = js.native
    
    /* 4 */ val SLIDE_INDEX: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LinkType.SLIDE_INDEX with Double = js.native
    
    /* 2 */ val SLIDE_POSITION: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LinkType.SLIDE_POSITION with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LinkType.UNSUPPORTED with Double = js.native
    
    /* 1 */ val URL: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LinkType.URL with Double = js.native
  }
  
  /**
    * Preset patterns of glyphs for lists in text.
    *
    * These presets use these glyphs:
    *
    * ARROW: An arrow, ➔, corresponding to a Unicode U+2794 code point
    *
    * ARROW3D: An arrow with 3D shading, ➢, corresponding to a Unicode U+27a2 code point
    *
    * CHECKBOX: A hollow square, ❏, corresponding to a Unicode U+274f code point
    *
    * CIRCLE: A hollow circle, ○, corresponding to a Unicode U+25cb code point
    *
    * DIAMOND: A solid diamond, ◆, corresponding to a Unicode U+25c6 code point
    *
    * `DIAMONDX: A diamond with an 'x', ❖, corresponding to a Unicode U+2756 code point
    *
    * HOLLOWDIAMOND: A hollow diamond, ◇, corresponding to a Unicode U+25c7 code point
    *
    * DISC: A solid circle, ●, corresponding to a Unicode U+25cf code point
    *
    * SQUARE: A solid square, ■, corresponding to a Unicode U+25a0 code point
    *
    * STAR: A star, ★, corresponding to a Unicode U+2605 code point
    *
    * ALPHA: A lowercase letter, like 'a', 'b', or 'c'.
    *
    * UPPERALPHA: An uppercase letter, like 'A', 'B', or 'C'.
    *
    * DIGIT: A number, like '1', '2', or '3'.
    *
    * ZERODIGIT: A number where single digit numbers are prefixed with a zero, like '01', '02',
    *       or '03'. Numbers with more than one digit are not prefixed a zero.
    *
    * ROMAN: A lowercase roman numeral, like 'i', 'ii', or 'iii'.
    *
    * UPPERROMAN: A uppercase roman numeral, like 'I', 'II', or 'III'.
    *
    * LEFTTRIANGLE: A triangle pointing left, ◄, corresponding to a Unicode U+25c4 code
    *       point
    */
  @JSGlobal("GoogleAppsScript.Slides.ListPreset")
  @js.native
  object ListPreset extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset with Double] = js.native
    
    /* 5 */ val ARROW3D_CIRCLE_SQUARE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.ARROW3D_CIRCLE_SQUARE with Double = js.native
    
    /* 3 */ val ARROW_DIAMOND_DISC: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.ARROW_DIAMOND_DISC with Double = js.native
    
    /* 2 */ val CHECKBOX: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.CHECKBOX with Double = js.native
    
    /* 1 */ val DIAMONDX_ARROW3D_SQUARE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIAMONDX_ARROW3D_SQUARE with Double = js.native
    
    /* 7 */ val DIAMONDX_HOLLOWDIAMOND_SQUARE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIAMONDX_HOLLOWDIAMOND_SQUARE with Double = js.native
    
    /* 8 */ val DIAMOND_CIRCLE_SQUARE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIAMOND_CIRCLE_SQUARE with Double = js.native
    
    /* 9 */ val DIGIT_ALPHA_ROMAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIGIT_ALPHA_ROMAN with Double = js.native
    
    /* 10 */ val DIGIT_ALPHA_ROMAN_PARENS: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIGIT_ALPHA_ROMAN_PARENS with Double = js.native
    
    /* 11 */ val DIGIT_NESTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DIGIT_NESTED with Double = js.native
    
    /* 0 */ val DISC_CIRCLE_SQUARE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.DISC_CIRCLE_SQUARE with Double = js.native
    
    /* 6 */ val LEFTTRIANGLE_DIAMOND_DISC: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.LEFTTRIANGLE_DIAMOND_DISC with Double = js.native
    
    /* 4 */ val STAR_CIRCLE_SQUARE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.STAR_CIRCLE_SQUARE with Double = js.native
    
    /* 12 */ val UPPERALPHA_ALPHA_ROMAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.UPPERALPHA_ALPHA_ROMAN with Double = js.native
    
    /* 13 */ val UPPERROMAN_UPPERALPHA_DIGIT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.UPPERROMAN_UPPERALPHA_DIGIT with Double = js.native
    
    /* 14 */ val ZERODIGIT_ALPHA_ROMAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ListPreset.ZERODIGIT_ALPHA_ROMAN with Double = js.native
  }
  
  /**
    * The kinds of page backgrounds.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageBackgroundType")
  @js.native
  object PageBackgroundType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType with Double
      ] = js.native
    
    /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType.NONE with Double = js.native
    
    /* 3 */ val PICTURE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType.PICTURE with Double = js.native
    
    /* 2 */ val SOLID: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType.SOLID with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageBackgroundType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The page element type.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageElementType")
  @js.native
  object PageElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType with Double
      ] = js.native
    
    /* 5 */ val GROUP: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType.GROUP with Double = js.native
    
    /* 2 */ val IMAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType.IMAGE with Double = js.native
    
    /* 6 */ val LINE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType.LINE with Double = js.native
    
    /* 1 */ val SHAPE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType.SHAPE with Double = js.native
    
    /* 8 */ val SHEETS_CHART: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType.SHEETS_CHART with Double = js.native
    
    /* 4 */ val TABLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType.TABLE with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType.UNSUPPORTED with Double = js.native
    
    /* 3 */ val VIDEO: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType.VIDEO with Double = js.native
    
    /* 7 */ val WORD_ART: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElementType.WORD_ART with Double = js.native
  }
  
  /**
    * The page types.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageType")
  @js.native
  object PageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageType with Double] = js.native
    
    /* 2 */ val LAYOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageType.LAYOUT with Double = js.native
    
    /* 3 */ val MASTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageType.MASTER with Double = js.native
    
    /* 1 */ val SLIDE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageType.SLIDE with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The types of text alignment for a paragraph.
    */
  @JSGlobal("GoogleAppsScript.Slides.ParagraphAlignment")
  @js.native
  object ParagraphAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment with Double
      ] = js.native
    
    /* 2 */ val CENTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.CENTER with Double = js.native
    
    /* 3 */ val END: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.END with Double = js.native
    
    /* 4 */ val JUSTIFIED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.JUSTIFIED with Double = js.native
    
    /* 1 */ val START: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.START with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The placeholder types. Many of these placeholder types correspond to placeholder IDs from the
    * ECMA-376 standard. More information on those shapes can be found in the description of the
    * "ST_PlaceholderType" type in section 19.7.10 of "Office Open XML File Formats - Fundamentals and
    * Markup Language Reference", part 1 of ECMA-376 5th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.PlaceholderType")
  @js.native
  object PlaceholderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType with Double
      ] = js.native
    
    /* 2 */ val BODY: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.BODY with Double = js.native
    
    /* 5 */ val CENTERED_TITLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.CENTERED_TITLE with Double = js.native
    
    /* 3 */ val CHART: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.CHART with Double = js.native
    
    /* 4 */ val CLIP_ART: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.CLIP_ART with Double = js.native
    
    /* 7 */ val DATE_AND_TIME: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.DATE_AND_TIME with Double = js.native
    
    /* 6 */ val DIAGRAM: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.DIAGRAM with Double = js.native
    
    /* 8 */ val FOOTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.FOOTER with Double = js.native
    
    /* 9 */ val HEADER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.HEADER with Double = js.native
    
    /* 10 */ val MEDIA: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.MEDIA with Double = js.native
    
    /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.NONE with Double = js.native
    
    /* 11 */ val OBJECT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.OBJECT with Double = js.native
    
    /* 12 */ val PICTURE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.PICTURE with Double = js.native
    
    /* 17 */ val SLIDE_IMAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.SLIDE_IMAGE with Double = js.native
    
    /* 13 */ val SLIDE_NUMBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.SLIDE_NUMBER with Double = js.native
    
    /* 14 */ val SUBTITLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.SUBTITLE with Double = js.native
    
    /* 15 */ val TABLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.TABLE with Double = js.native
    
    /* 16 */ val TITLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.TITLE with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PlaceholderType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * Predefined layouts. These are commonly found layouts in presentations. However, there is no
    * guarantee that these layouts are present in the current master as they could have been deleted or
    * not part of the used theme. Additionally, the placeholders on each layout may have been changed.
    */
  @JSGlobal("GoogleAppsScript.Slides.PredefinedLayout")
  @js.native
  object PredefinedLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout with Double
      ] = js.native
    
    /* 11 */ val BIG_NUMBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.BIG_NUMBER with Double = js.native
    
    /* 1 */ val BLANK: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.BLANK with Double = js.native
    
    /* 2 */ val CAPTION_ONLY: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.CAPTION_ONLY with Double = js.native
    
    /* 10 */ val MAIN_POINT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.MAIN_POINT with Double = js.native
    
    /* 9 */ val ONE_COLUMN_TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.ONE_COLUMN_TEXT with Double = js.native
    
    /* 7 */ val SECTION_HEADER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.SECTION_HEADER with Double = js.native
    
    /* 8 */ val SECTION_TITLE_AND_DESCRIPTION: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.SECTION_TITLE_AND_DESCRIPTION with Double = js.native
    
    /* 3 */ val TITLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.TITLE with Double = js.native
    
    /* 4 */ val TITLE_AND_BODY: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.TITLE_AND_BODY with Double = js.native
    
    /* 5 */ val TITLE_AND_TWO_COLUMNS: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.TITLE_AND_TWO_COLUMNS with Double = js.native
    
    /* 6 */ val TITLE_ONLY: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.TITLE_ONLY with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PredefinedLayout.UNSUPPORTED with Double = js.native
  }
  
  /**
    * Type of Selection.
    *
    * The SelectionType represents the most specific type of one or more objects that are
    * selected. As an example if one or more TableCell instances are selected in a Table, the selection type is SelectionType.TABLE_CELL. The TableCellRange can be
    * retrieved by using the Selection.getTableCellRange. The Table can be retrieved by
    * using the Selection.getPageElementRange and the Page can be retrieved from the
    * Selection.getCurrentPage.
    */
  @JSGlobal("GoogleAppsScript.Slides.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType with Double] = js.native
    
    /* 6 */ val CURRENT_PAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.CURRENT_PAGE with Double = js.native
    
    /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.NONE with Double = js.native
    
    /* 4 */ val PAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.PAGE with Double = js.native
    
    /* 5 */ val PAGE_ELEMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.PAGE_ELEMENT with Double = js.native
    
    /* 3 */ val TABLE_CELL: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.TABLE_CELL with Double = js.native
    
    /* 2 */ val TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.TEXT with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The shape types. Many of these shapes correspond to predefined shapes from the ECMA-376 standard.
    * More information on those shapes can be found in the description of the "ST_ShapeType" simple
    * type in section 20.1.10.55 of "Office Open XML File Formats - Fundamentals and Markup Language
    * Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType with Double] = js.native
    
    /* 5 */ val ARC: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ARC with Double = js.native
    
    /* 133 */ val ARROW_EAST: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ARROW_EAST with Double = js.native
    
    /* 135 */ val ARROW_NORTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ARROW_NORTH with Double = js.native
    
    /* 134 */ val ARROW_NORTH_EAST: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ARROW_NORTH_EAST with Double = js.native
    
    /* 6 */ val BENT_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BENT_ARROW with Double = js.native
    
    /* 7 */ val BENT_UP_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BENT_UP_ARROW with Double = js.native
    
    /* 8 */ val BEVEL: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BEVEL with Double = js.native
    
    /* 9 */ val BLOCK_ARC: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BLOCK_ARC with Double = js.native
    
    /* 10 */ val BRACE_PAIR: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BRACE_PAIR with Double = js.native
    
    /* 11 */ val BRACKET_PAIR: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.BRACKET_PAIR with Double = js.native
    
    /* 12 */ val CAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CAN with Double = js.native
    
    /* 13 */ val CHEVRON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CHEVRON with Double = js.native
    
    /* 14 */ val CHORD: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CHORD with Double = js.native
    
    /* 15 */ val CLOUD: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CLOUD with Double = js.native
    
    /* 141 */ val CLOUD_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CLOUD_CALLOUT with Double = js.native
    
    /* 16 */ val CORNER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CORNER with Double = js.native
    
    /* 17 */ val CUBE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CUBE with Double = js.native
    
    /* 18 */ val CURVED_DOWN_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CURVED_DOWN_ARROW with Double = js.native
    
    /* 19 */ val CURVED_LEFT_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CURVED_LEFT_ARROW with Double = js.native
    
    /* 20 */ val CURVED_RIGHT_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CURVED_RIGHT_ARROW with Double = js.native
    
    /* 21 */ val CURVED_UP_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CURVED_UP_ARROW with Double = js.native
    
    /* 142 */ val CUSTOM: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.CUSTOM with Double = js.native
    
    /* 22 */ val DECAGON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DECAGON with Double = js.native
    
    /* 23 */ val DIAGONAL_STRIPE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DIAGONAL_STRIPE with Double = js.native
    
    /* 24 */ val DIAMOND: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DIAMOND with Double = js.native
    
    /* 25 */ val DODECAGON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DODECAGON with Double = js.native
    
    /* 26 */ val DONUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DONUT with Double = js.native
    
    /* 27 */ val DOUBLE_WAVE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DOUBLE_WAVE with Double = js.native
    
    /* 28 */ val DOWN_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DOWN_ARROW with Double = js.native
    
    /* 29 */ val DOWN_ARROW_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.DOWN_ARROW_CALLOUT with Double = js.native
    
    /* 4 */ val ELLIPSE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ELLIPSE with Double = js.native
    
    /* 139 */ val ELLIPSE_RIBBON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ELLIPSE_RIBBON with Double = js.native
    
    /* 140 */ val ELLIPSE_RIBBON_2: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ELLIPSE_RIBBON_2 with Double = js.native
    
    /* 104 */ val FLOW_CHART_ALTERNATE_PROCESS: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_ALTERNATE_PROCESS with Double = js.native
    
    /* 105 */ val FLOW_CHART_COLLATE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_COLLATE with Double = js.native
    
    /* 106 */ val FLOW_CHART_CONNECTOR: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_CONNECTOR with Double = js.native
    
    /* 107 */ val FLOW_CHART_DECISION: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DECISION with Double = js.native
    
    /* 108 */ val FLOW_CHART_DELAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DELAY with Double = js.native
    
    /* 109 */ val FLOW_CHART_DISPLAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DISPLAY with Double = js.native
    
    /* 110 */ val FLOW_CHART_DOCUMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DOCUMENT with Double = js.native
    
    /* 111 */ val FLOW_CHART_EXTRACT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_EXTRACT with Double = js.native
    
    /* 112 */ val FLOW_CHART_INPUT_OUTPUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_INPUT_OUTPUT with Double = js.native
    
    /* 113 */ val FLOW_CHART_INTERNAL_STORAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_INTERNAL_STORAGE with Double = js.native
    
    /* 114 */ val FLOW_CHART_MAGNETIC_DISK: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MAGNETIC_DISK with Double = js.native
    
    /* 115 */ val FLOW_CHART_MAGNETIC_DRUM: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MAGNETIC_DRUM with Double = js.native
    
    /* 116 */ val FLOW_CHART_MAGNETIC_TAPE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MAGNETIC_TAPE with Double = js.native
    
    /* 117 */ val FLOW_CHART_MANUAL_INPUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MANUAL_INPUT with Double = js.native
    
    /* 118 */ val FLOW_CHART_MANUAL_OPERATION: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MANUAL_OPERATION with Double = js.native
    
    /* 119 */ val FLOW_CHART_MERGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MERGE with Double = js.native
    
    /* 120 */ val FLOW_CHART_MULTIDOCUMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MULTIDOCUMENT with Double = js.native
    
    /* 121 */ val FLOW_CHART_OFFLINE_STORAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_OFFLINE_STORAGE with Double = js.native
    
    /* 122 */ val FLOW_CHART_OFFPAGE_CONNECTOR: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_OFFPAGE_CONNECTOR with Double = js.native
    
    /* 123 */ val FLOW_CHART_ONLINE_STORAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_ONLINE_STORAGE with Double = js.native
    
    /* 124 */ val FLOW_CHART_OR: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_OR with Double = js.native
    
    /* 125 */ val FLOW_CHART_PREDEFINED_PROCESS: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PREDEFINED_PROCESS with Double = js.native
    
    /* 126 */ val FLOW_CHART_PREPARATION: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PREPARATION with Double = js.native
    
    /* 127 */ val FLOW_CHART_PROCESS: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PROCESS with Double = js.native
    
    /* 128 */ val FLOW_CHART_PUNCHED_CARD: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PUNCHED_CARD with Double = js.native
    
    /* 129 */ val FLOW_CHART_PUNCHED_TAPE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PUNCHED_TAPE with Double = js.native
    
    /* 130 */ val FLOW_CHART_SORT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_SORT with Double = js.native
    
    /* 131 */ val FLOW_CHART_SUMMING_JUNCTION: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_SUMMING_JUNCTION with Double = js.native
    
    /* 132 */ val FLOW_CHART_TERMINATOR: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_TERMINATOR with Double = js.native
    
    /* 30 */ val FOLDED_CORNER: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FOLDED_CORNER with Double = js.native
    
    /* 31 */ val FRAME: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.FRAME with Double = js.native
    
    /* 32 */ val HALF_FRAME: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HALF_FRAME with Double = js.native
    
    /* 33 */ val HEART: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HEART with Double = js.native
    
    /* 34 */ val HEPTAGON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HEPTAGON with Double = js.native
    
    /* 35 */ val HEXAGON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HEXAGON with Double = js.native
    
    /* 36 */ val HOME_PLATE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HOME_PLATE with Double = js.native
    
    /* 37 */ val HORIZONTAL_SCROLL: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.HORIZONTAL_SCROLL with Double = js.native
    
    /* 38 */ val IRREGULAR_SEAL_1: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.IRREGULAR_SEAL_1 with Double = js.native
    
    /* 39 */ val IRREGULAR_SEAL_2: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.IRREGULAR_SEAL_2 with Double = js.native
    
    /* 40 */ val LEFT_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_ARROW with Double = js.native
    
    /* 41 */ val LEFT_ARROW_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_ARROW_CALLOUT with Double = js.native
    
    /* 42 */ val LEFT_BRACE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_BRACE with Double = js.native
    
    /* 43 */ val LEFT_BRACKET: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_BRACKET with Double = js.native
    
    /* 44 */ val LEFT_RIGHT_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_RIGHT_ARROW with Double = js.native
    
    /* 45 */ val LEFT_RIGHT_ARROW_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_RIGHT_ARROW_CALLOUT with Double = js.native
    
    /* 46 */ val LEFT_RIGHT_UP_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_RIGHT_UP_ARROW with Double = js.native
    
    /* 47 */ val LEFT_UP_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LEFT_UP_ARROW with Double = js.native
    
    /* 48 */ val LIGHTNING_BOLT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.LIGHTNING_BOLT with Double = js.native
    
    /* 49 */ val MATH_DIVIDE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_DIVIDE with Double = js.native
    
    /* 50 */ val MATH_EQUAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_EQUAL with Double = js.native
    
    /* 51 */ val MATH_MINUS: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_MINUS with Double = js.native
    
    /* 52 */ val MATH_MULTIPLY: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_MULTIPLY with Double = js.native
    
    /* 53 */ val MATH_NOT_EQUAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_NOT_EQUAL with Double = js.native
    
    /* 54 */ val MATH_PLUS: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MATH_PLUS with Double = js.native
    
    /* 55 */ val MOON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.MOON with Double = js.native
    
    /* 57 */ val NOTCHED_RIGHT_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.NOTCHED_RIGHT_ARROW with Double = js.native
    
    /* 56 */ val NO_SMOKING: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.NO_SMOKING with Double = js.native
    
    /* 58 */ val OCTAGON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.OCTAGON with Double = js.native
    
    /* 59 */ val PARALLELOGRAM: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PARALLELOGRAM with Double = js.native
    
    /* 60 */ val PENTAGON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PENTAGON with Double = js.native
    
    /* 61 */ val PIE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PIE with Double = js.native
    
    /* 62 */ val PLAQUE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PLAQUE with Double = js.native
    
    /* 63 */ val PLUS: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.PLUS with Double = js.native
    
    /* 64 */ val QUAD_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.QUAD_ARROW with Double = js.native
    
    /* 65 */ val QUAD_ARROW_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.QUAD_ARROW_CALLOUT with Double = js.native
    
    /* 2 */ val RECTANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RECTANGLE with Double = js.native
    
    /* 66 */ val RIBBON: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIBBON with Double = js.native
    
    /* 67 */ val RIBBON_2: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIBBON_2 with Double = js.native
    
    /* 68 */ val RIGHT_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_ARROW with Double = js.native
    
    /* 69 */ val RIGHT_ARROW_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_ARROW_CALLOUT with Double = js.native
    
    /* 70 */ val RIGHT_BRACE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_BRACE with Double = js.native
    
    /* 71 */ val RIGHT_BRACKET: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_BRACKET with Double = js.native
    
    /* 75 */ val RIGHT_TRIANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.RIGHT_TRIANGLE with Double = js.native
    
    /* 72 */ val ROUND_1_RECTANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ROUND_1_RECTANGLE with Double = js.native
    
    /* 73 */ val ROUND_2_DIAGONAL_RECTANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ROUND_2_DIAGONAL_RECTANGLE with Double = js.native
    
    /* 74 */ val ROUND_2_SAME_RECTANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ROUND_2_SAME_RECTANGLE with Double = js.native
    
    /* 3 */ val ROUND_RECTANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.ROUND_RECTANGLE with Double = js.native
    
    /* 76 */ val SMILEY_FACE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SMILEY_FACE with Double = js.native
    
    /* 77 */ val SNIP_1_RECTANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SNIP_1_RECTANGLE with Double = js.native
    
    /* 78 */ val SNIP_2_DIAGONAL_RECTANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SNIP_2_DIAGONAL_RECTANGLE with Double = js.native
    
    /* 79 */ val SNIP_2_SAME_RECTANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SNIP_2_SAME_RECTANGLE with Double = js.native
    
    /* 80 */ val SNIP_ROUND_RECTANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SNIP_ROUND_RECTANGLE with Double = js.native
    
    /* 136 */ val SPEECH: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SPEECH with Double = js.native
    
    /* 137 */ val STARBURST: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STARBURST with Double = js.native
    
    /* 81 */ val STAR_10: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_10 with Double = js.native
    
    /* 82 */ val STAR_12: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_12 with Double = js.native
    
    /* 83 */ val STAR_16: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_16 with Double = js.native
    
    /* 84 */ val STAR_24: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_24 with Double = js.native
    
    /* 85 */ val STAR_32: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_32 with Double = js.native
    
    /* 86 */ val STAR_4: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_4 with Double = js.native
    
    /* 87 */ val STAR_5: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_5 with Double = js.native
    
    /* 88 */ val STAR_6: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_6 with Double = js.native
    
    /* 89 */ val STAR_7: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_7 with Double = js.native
    
    /* 90 */ val STAR_8: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STAR_8 with Double = js.native
    
    /* 91 */ val STRIPED_RIGHT_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.STRIPED_RIGHT_ARROW with Double = js.native
    
    /* 92 */ val SUN: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.SUN with Double = js.native
    
    /* 138 */ val TEARDROP: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.TEARDROP with Double = js.native
    
    /* 1 */ val TEXT_BOX: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.TEXT_BOX with Double = js.native
    
    /* 93 */ val TRAPEZOID: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.TRAPEZOID with Double = js.native
    
    /* 94 */ val TRIANGLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.TRIANGLE with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UNSUPPORTED with Double = js.native
    
    /* 95 */ val UP_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UP_ARROW with Double = js.native
    
    /* 96 */ val UP_ARROW_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UP_ARROW_CALLOUT with Double = js.native
    
    /* 97 */ val UP_DOWN_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UP_DOWN_ARROW with Double = js.native
    
    /* 98 */ val UTURN_ARROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.UTURN_ARROW with Double = js.native
    
    /* 99 */ val VERTICAL_SCROLL: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.VERTICAL_SCROLL with Double = js.native
    
    /* 100 */ val WAVE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.WAVE with Double = js.native
    
    /* 101 */ val WEDGE_ELLIPSE_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.WEDGE_ELLIPSE_CALLOUT with Double = js.native
    
    /* 102 */ val WEDGE_RECTANGLE_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.WEDGE_RECTANGLE_CALLOUT with Double = js.native
    
    /* 103 */ val WEDGE_ROUND_RECTANGLE_CALLOUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ShapeType.WEDGE_ROUND_RECTANGLE_CALLOUT with Double = js.native
  }
  
  /**
    * The Sheets chart's embed type.
    */
  @JSGlobal("GoogleAppsScript.Slides.SheetsChartEmbedType")
  @js.native
  object SheetsChartEmbedType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChartEmbedType with Double
      ] = js.native
    
    /* 1 */ val IMAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChartEmbedType.IMAGE with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChartEmbedType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The mode of links between slides.
    */
  @JSGlobal("GoogleAppsScript.Slides.SlideLinkingMode")
  @js.native
  object SlideLinkingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SlideLinkingMode with Double
      ] = js.native
    
    /* 1 */ val LINKED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SlideLinkingMode.LINKED with Double = js.native
    
    /* 2 */ val NOT_LINKED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SlideLinkingMode.NOT_LINKED with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SlideLinkingMode.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The relative position of a Slide.
    */
  @JSGlobal("GoogleAppsScript.Slides.SlidePosition")
  @js.native
  object SlidePosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SlidePosition with Double] = js.native
    
    /* 2 */ val FIRST_SLIDE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SlidePosition.FIRST_SLIDE with Double = js.native
    
    /* 3 */ val LAST_SLIDE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SlidePosition.LAST_SLIDE with Double = js.native
    
    /* 0 */ val NEXT_SLIDE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SlidePosition.NEXT_SLIDE with Double = js.native
    
    /* 1 */ val PREVIOUS_SLIDE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SlidePosition.PREVIOUS_SLIDE with Double = js.native
  }
  
  /**
    * The different modes for paragraph spacing.
    */
  @JSGlobal("GoogleAppsScript.Slides.SpacingMode")
  @js.native
  object SpacingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SpacingMode with Double] = js.native
    
    /* 2 */ val COLLAPSE_LISTS: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SpacingMode.COLLAPSE_LISTS with Double = js.native
    
    /* 1 */ val NEVER_COLLAPSE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SpacingMode.NEVER_COLLAPSE with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SpacingMode.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The text vertical offset from its normal position.
    */
  @JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
  @js.native
  object TextBaselineOffset extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset with Double
      ] = js.native
    
    /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset.NONE with Double = js.native
    
    /* 3 */ val SUBSCRIPT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset.SUBSCRIPT with Double = js.native
    
    /* 2 */ val SUPERSCRIPT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset.SUPERSCRIPT with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextBaselineOffset.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The directions text can flow in.
    */
  @JSGlobal("GoogleAppsScript.Slides.TextDirection")
  @js.native
  object TextDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextDirection with Double] = js.native
    
    /* 1 */ val LEFT_TO_RIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextDirection.LEFT_TO_RIGHT with Double = js.native
    
    /* 2 */ val RIGHT_TO_LEFT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextDirection.RIGHT_TO_LEFT with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextDirection.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The name of an entry in the page's color scheme.
    */
  @JSGlobal("GoogleAppsScript.Slides.ThemeColorType")
  @js.native
  object ThemeColorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType with Double
      ] = js.native
    
    /* 5 */ val ACCENT1: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT1 with Double = js.native
    
    /* 6 */ val ACCENT2: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT2 with Double = js.native
    
    /* 7 */ val ACCENT3: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT3 with Double = js.native
    
    /* 8 */ val ACCENT4: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT4 with Double = js.native
    
    /* 9 */ val ACCENT5: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT5 with Double = js.native
    
    /* 10 */ val ACCENT6: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.ACCENT6 with Double = js.native
    
    /* 1 */ val DARK1: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.DARK1 with Double = js.native
    
    /* 3 */ val DARK2: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.DARK2 with Double = js.native
    
    /* 12 */ val FOLLOWED_HYPERLINK: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.FOLLOWED_HYPERLINK with Double = js.native
    
    /* 11 */ val HYPERLINK: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.HYPERLINK with Double = js.native
    
    /* 2 */ val LIGHT1: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.LIGHT1 with Double = js.native
    
    /* 4 */ val LIGHT2: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.LIGHT2 with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ThemeColorType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * The video source types.
    */
  @JSGlobal("GoogleAppsScript.Slides.VideoSourceType")
  @js.native
  object VideoSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.VideoSourceType with Double
      ] = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.VideoSourceType.UNSUPPORTED with Double = js.native
    
    /* 1 */ val YOUTUBE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.VideoSourceType.YOUTUBE with Double = js.native
  }
}
