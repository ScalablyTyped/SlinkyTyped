package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XBitmap
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a numbering level as part of the Numbering Rules. */
@js.native
trait NumberingLevel extends js.Object {
  /** adjusts the numbering (HoriOrientation_LEFT/RIGHT/CENTER) */
  var Adjust: Double = js.native
  /** contains the symbol in the given font. This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.CHAR_SPECIAL} . */
  var BulletChar: String = js.native
  /** contains the color for the symbol. This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.CHAR_SPECIAL} . */
  var BulletColor: Color = js.native
  /** the font used to paint the bullet. */
  var BulletFont: FontDescriptor = js.native
  /** the name of the font for the symbol. This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.CHAR_SPECIAL} . */
  var BulletFontName: String = js.native
  /**
    * the ID of the symbol in the given font. This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.CHAR_SPECIAL} .
    * @deprecated Deprecated
    */
  var BulletId: Double = js.native
  /**
    * contains the size of the symbol relative to the high of the paragraph. This is only valid if the numbering type is {@link
    * com.sun.star.style.NumberingType.CHAR_SPECIAL} .
    */
  var BulletRelSize: Double = js.native
  /** Name of the character style that is used for the numbering symbol. */
  var CharStyleName: String = js.native
  /**
    * additional line indent for the first text line <p>
    *
    * Specifies the first line indent.
    *
    * Only of relevance, if PositionAndSpaceMode equals LABEL_ALIGNMENT.
    *
    * </p>
    * @@since OOo 3.0
    */
  var FirstLineIndent: Double = js.native
  /** specifies the offset between the beginning of the first line and the beginning of the following lines of the paragraph. */
  var FirstLineOffset: Double = js.native
  /** the bitmap containing the bullet. */
  var GraphicBitmap: XBitmap = js.native
  /** size of the graphic that is used as bullet. */
  var GraphicSize: Size = js.native
  /**
    * the URL of the graphic file that is used as the numbering symbol.
    *
    * This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.BITMAP} .
    */
  var GraphicURL: String = js.native
  /**
    * contains the name of the paragraph style that is interpreted as the header of this level. It is only contained in the levels of chapter numbering
    * rules.
    */
  var HeadingStyleName: String = js.native
  /**
    * indentation of the text lines <p>
    *
    * Specifies the indent of the text lines
    *
    * Only of relevance, if PositionAndSpaceMode equals LABEL_ALIGNMENT.
    *
    * </p>
    * @@since OOo 3.0
    */
  var IndentAt: Double = js.native
  /**
    * character following the list label <p>
    *
    * Specifies the character following the list label.
    *
    * For valid values see com::sun::star::text::LabelFollow.
    *
    * Only of relevance, if PositionAndSpaceMode equals LABEL_ALIGNMENT.
    *
    * </p>
    * @@since OOo 3.0
    */
  var LabelFollowedBy: Double = js.native
  /** specifies the left margin of the numbering */
  var LeftMargin: Double = js.native
  /**
    * list tab position <p>
    *
    * Specifies the position of the list tab stop - only non-negative
    *
    * values are allowed.
    *
    * Only of relevance, if PositionAndSpaceMode equals LABEL_ALIGNMENT
    *
    * and LabelFollowedBy equal LABELFOLLOW_LISTTAB
    *
    * </p>
    * @@since OOo 3.0
    */
  var ListtabStopPosition: Double = js.native
  /** specifies the type of numbering. */
  var NumberingType: Double = js.native
  /**
    * contains the name of the paragraph style that should use this numbering. This is ignored for chapter numbering rules, use HeadingStyleName.
    * @since LibreOffice 3.6
    */
  var ParagraphStyleName: String = js.native
  /** number of upper levels that are included in the current numbering symbol. */
  var ParentNumbering: Double = js.native
  /**
    * position and space mode <p>
    *
    * Specifies the position and space mode of the numbering level.
    *
    * For valid values see com::sun::star::text::PositionAndSpaceMode.
    *
    * If it equals LABEL_WIDTH_AND_POSITION, properties Adjust,
    *
    * LeftMargin, SymbolTextDistance and FirstLineOffset are used.
    *
    * If it equals LABEL_ALIGNMENT, properties Adjust, LabelFollowedBy,
    *
    * ListtabStopPosition, FirstLineIndent, IndentAt are used.
    *
    * </p>
    * @@since OOo 3.0
    */
  var PositionAndSpaceMode: Double = js.native
  /** the prefix of the numbering symbol. */
  var Prefix: String = js.native
  /**
    * specifies the start value for the numbering.
    *
    * This property is only valid if the numbering type is not {@link com.sun.star.style.NumberingType.BITMAP} or {@link
    * com.sun.star.style.NumberingType.CHAR_SPECIAL} .
    */
  var StartWith: Double = js.native
  /** the suffix of the numbering symbol. */
  var Suffix: String = js.native
  /** specifies the distance between the numbering symbol and the text of the paragraph. */
  var SymbolTextDistance: Double = js.native
  /**
    * contains the vertical orientation of a graphic.
    *
    * It is set using {@link com.sun.star.text.VertOrientation} .
    */
  var VertOrient: Double = js.native
}

object NumberingLevel {
  @scala.inline
  def apply(
    Adjust: Double,
    BulletChar: String,
    BulletColor: Color,
    BulletFont: FontDescriptor,
    BulletFontName: String,
    BulletId: Double,
    BulletRelSize: Double,
    CharStyleName: String,
    FirstLineIndent: Double,
    FirstLineOffset: Double,
    GraphicBitmap: XBitmap,
    GraphicSize: Size,
    GraphicURL: String,
    HeadingStyleName: String,
    IndentAt: Double,
    LabelFollowedBy: Double,
    LeftMargin: Double,
    ListtabStopPosition: Double,
    NumberingType: Double,
    ParagraphStyleName: String,
    ParentNumbering: Double,
    PositionAndSpaceMode: Double,
    Prefix: String,
    StartWith: Double,
    Suffix: String,
    SymbolTextDistance: Double,
    VertOrient: Double
  ): NumberingLevel = {
    val __obj = js.Dynamic.literal(Adjust = Adjust.asInstanceOf[js.Any], BulletChar = BulletChar.asInstanceOf[js.Any], BulletColor = BulletColor.asInstanceOf[js.Any], BulletFont = BulletFont.asInstanceOf[js.Any], BulletFontName = BulletFontName.asInstanceOf[js.Any], BulletId = BulletId.asInstanceOf[js.Any], BulletRelSize = BulletRelSize.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], FirstLineIndent = FirstLineIndent.asInstanceOf[js.Any], FirstLineOffset = FirstLineOffset.asInstanceOf[js.Any], GraphicBitmap = GraphicBitmap.asInstanceOf[js.Any], GraphicSize = GraphicSize.asInstanceOf[js.Any], GraphicURL = GraphicURL.asInstanceOf[js.Any], HeadingStyleName = HeadingStyleName.asInstanceOf[js.Any], IndentAt = IndentAt.asInstanceOf[js.Any], LabelFollowedBy = LabelFollowedBy.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], ListtabStopPosition = ListtabStopPosition.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], ParagraphStyleName = ParagraphStyleName.asInstanceOf[js.Any], ParentNumbering = ParentNumbering.asInstanceOf[js.Any], PositionAndSpaceMode = PositionAndSpaceMode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], StartWith = StartWith.asInstanceOf[js.Any], Suffix = Suffix.asInstanceOf[js.Any], SymbolTextDistance = SymbolTextDistance.asInstanceOf[js.Any], VertOrient = VertOrient.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberingLevel]
  }
  @scala.inline
  implicit class NumberingLevelOps[Self <: NumberingLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjust(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulletChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulletChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulletColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulletColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulletFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulletFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulletFontName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulletFontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulletId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulletRelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulletRelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharStyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLineIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstLineIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLineOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstLineOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphicBitmap(value: XBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphicBitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphicSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphicSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphicURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphicURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadingStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadingStyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndentAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelFollowedBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelFollowedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListtabStopPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListtabStopPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberingType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParagraphStyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNumbering(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentNumbering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionAndSpaceMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PositionAndSpaceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartWith(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolTextDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SymbolTextDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertOrient(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VertOrient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

