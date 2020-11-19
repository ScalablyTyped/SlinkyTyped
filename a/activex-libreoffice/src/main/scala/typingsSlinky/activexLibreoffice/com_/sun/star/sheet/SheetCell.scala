package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XTolerantMultiPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XActionLockable
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.style.BreakType
import typingsSlinky.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.style.CharacterPropertiesAsian
import typingsSlinky.activexLibreoffice.com_.sun.star.style.CharacterPropertiesComplex
import typingsSlinky.activexLibreoffice.com_.sun.star.style.DropCapFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsSlinky.activexLibreoffice.com_.sun.star.style.LineSpacing
import typingsSlinky.activexLibreoffice.com_.sun.star.style.ParagraphAdjust
import typingsSlinky.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesAsian
import typingsSlinky.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesComplex
import typingsSlinky.activexLibreoffice.com_.sun.star.style.TabStop
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine2
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellContentType
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellHoriJustify
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellOrientation
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder2
import typingsSlinky.activexLibreoffice.com_.sun.star.table.XCell
import typingsSlinky.activexLibreoffice.com_.sun.star.table.XColumnRowRange
import typingsSlinky.activexLibreoffice.com_.sun.star.text.Text
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XText
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XTextContent
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XTextCursor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XTextFieldsSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XTextRange
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.CellProtection
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XIndent
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XReplaceDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XReplaceable
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XSearchDescriptor
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a single addressable cell in a spreadsheet document. */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.activexLibreoffice.com_.sun.star.style.ParagraphProperties because var conflicts: BottomBorder, LeftBorder, RightBorder, TopBorder. Inlined BorderDistance, BottomBorderDistance, BreakType, DropCapCharStyleName, DropCapFormat, DropCapWholeWord, LeftBorderDistance, ListId, NumberingIsNumber, NumberingLevel, NumberingRules, NumberingStartValue, NumberingStyleName, OutlineLevel, PageDescName, PageNumberOffset, PageStyleName, ParaAdjust, ParaBackColor, ParaBackGraphicFilter, ParaBackGraphicLocation, ParaBackGraphicURL, ParaBackTransparent, ParaBottomMargin, ParaContextMargin, ParaExpandSingleWord, ParaFirstLineIndent, ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars, ParaInteropGrabBag, ParaIsAutoFirstLineIndent, ParaIsConnectBorder, ParaIsHyphenation, ParaIsNumberingRestart, ParaKeepTogether, ParaLastLineAdjust, ParaLeftMargin, ParaLineNumberCount, ParaLineNumberStartValue, ParaLineSpacing, ParaOrphans, ParaRegisterModeActive, ParaRightMargin, ParaShadowFormat, ParaSplit, ParaStyleName, ParaTabStops, ParaTopMargin, ParaUserDefinedAttributes, ParaVertAlignment, ParaWidows, RightBorderDistance, TopBorderDistance */ @js.native
trait SheetCell
  extends Text
     with CellProperties
     with XCell
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with ParagraphPropertiesAsian
     with ParagraphPropertiesComplex
     with XCellRangesQuery
     with XFormulaQuery
     with XActionLockable
     with XReplaceable
     with XIndent
     with XColumnRowRange
     with XCellAddressable
     with XSheetAnnotationAnchor
     with XTextFieldsSupplier
     with XTolerantMultiPropertySet
     with XModifyBroadcaster {
  
  /** Returns the absolute address of the range as string, e.g. "$Sheet1.$B$2". */
  var AbsoluteName: String = js.native
  
  /** contains the distance from the border to the object. */
  var BorderDistance: Double = js.native
  
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: Double = js.native
  
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: typingsSlinky.activexLibreoffice.com_.sun.star.style.BreakType = js.native
  
  /**
    * contains the conditional formatting settings for this cell.
    *
    * After a conditional format has been changed it has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  var ConditionalFormat: XSheetConditionalEntries = js.native
  
  /**
    * contains the conditional formatting settings for this cell, using localized formulas.
    *
    * After a conditional format has been changed it has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  var ConditionalFormatLocal: XSheetConditionalEntries = js.native
  
  /** specifies the character style name for drop caps. */
  var DropCapCharStyleName: String = js.native
  
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: typingsSlinky.activexLibreoffice.com_.sun.star.style.DropCapFormat = js.native
  
  /** specifies if the property **DropCapFormat** is applied to the whole first word. */
  var DropCapWholeWord: Boolean = js.native
  
  /**
    * contains the formula string with localized function names.
    *
    * This property can also be used to set a new localized formula.
    */
  var FormulaLocal: String = js.native
  
  /**
    * contains the result type of a formula.
    * @see com.sun.star.sheet.FormulaResult
    */
  var FormulaResultType: Double = js.native
  
  /** contains the distance from the left border to the object. */
  var LeftBorderDistance: Double = js.native
  
  /** specifies the id of the list to which the paragraph belongs */
  var ListId: String = js.native
  
  /**
    * returns `FALSE` if the paragraph is part of a numbering, but has no numbering label.
    *
    * A paragraph is part of a numbering, if a style for a numbering is set - see NumberingStyleName.
    *
    * If the paragraph is not part of a numbering the property is void.
    */
  var NumberingIsNumber: Boolean = js.native
  
  /** specifies the numbering level of the paragraph. */
  var NumberingLevel: Double = js.native
  
  /** contains the numbering rules applied to this paragraph. */
  var NumberingRules: XIndexReplace = js.native
  
  /** specifies the start value for numbering if a new numbering starts at this paragraph. */
  var NumberingStartValue: Double = js.native
  
  /**
    * specifies the name of the style for the numbering.
    *
    * The name must be one of the names which are available via {@link XStyleFamiliesSupplier} .
    */
  var NumberingStyleName: String = js.native
  
  /**
    * specifies the outline level to which the paragraph belongs
    * @since OOo 3.1  Value 0 indicates that the paragraph belongs to the body text.  Values [1..10] indicates that the paragraph belongs to the corresponding
    */
  var OutlineLevel: Double = js.native
  
  /**
    * If this property is set, it creates a page break before the paragraph it belongs to and assigns the value as the name of the new page style sheet to
    * use.
    */
  var PageDescName: String = js.native
  
  /** If a page break property is set at a paragraph, this property contains the new value for the page number. */
  var PageNumberOffset: Double = js.native
  
  /** contains the name of the current page style. */
  var PageStyleName: String = js.native
  
  /** determines the adjustment of a paragraph. */
  var ParaAdjust: ParagraphAdjust = js.native
  
  /** contains the paragraph background color. */
  var ParaBackColor: Color = js.native
  
  /** contains the name of the graphic filter for the background graphic of a paragraph. */
  var ParaBackGraphicFilter: String = js.native
  
  /**
    * contains the value for the position of a background graphic.
    * @see com.sun.star.style.GraphicLocation
    */
  var ParaBackGraphicLocation: GraphicLocation = js.native
  
  /** contains the value of a link for the background graphic of a paragraph. */
  var ParaBackGraphicURL: String = js.native
  
  /** This value is `TRUE` if the paragraph background color is set to transparent. */
  var ParaBackTransparent: Boolean = js.native
  
  /**
    * determines the bottom margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraphor the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaBottomMargin: Double = js.native
  
  /**
    * determines if contextual spacing is used.
    * @since LibreOffice 3.6  If true, the top and bottom margins of the paragraph should not be applied when the previous and next paragraphs have the same style.
    */
  var ParaContextMargin: Boolean = js.native
  
  /**
    * determines if single words are stretched.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} and {@link ParagraphProperties.ParaLastLineAdjust} are also valid.
    */
  var ParaExpandSingleWord: Boolean = js.native
  
  /** specifies the indent for the first line. */
  var ParaFirstLineIndent: Double = js.native
  
  /** specifies the maximum number of consecutive hyphens. */
  var ParaHyphenationMaxHyphens: Double = js.native
  
  /** specifies the maximum number of characters to remain before the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxLeadingChars: Double = js.native
  
  /** specifies the maximum number of characters to remain after the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxTrailingChars: Double = js.native
  
  /**
    * Grab bag of paragraph properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var ParaInteropGrabBag: SafeArray[PropertyValue] = js.native
  
  /** determines if the first line should be indented automatically. */
  var ParaIsAutoFirstLineIndent: Boolean = js.native
  
  /**
    * the property determines if borders set at a paragraph are merged with the next paragraph.
    *
    * Borders are only merged if they are identical.
    */
  var ParaIsConnectBorder: Boolean = js.native
  
  /** specifies if automatic hyphenation is applied. */
  var ParaIsHyphenation: Boolean = js.native
  
  /** determines if the numbering rules restart, counting at the current paragraph. */
  var ParaIsNumberingRestart: Boolean = js.native
  
  /**
    * Setting this property to `TRUE` prevents page or column breaks between this and the following paragraph.
    *
    * This feature is useful for preventing title paragraphs to be the last line on a page or column.
    */
  var ParaKeepTogether: Boolean = js.native
  
  /**
    * determines the adjustment of the last line.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} is set to ParagraphAdjust::BLOCK.
    */
  var ParaLastLineAdjust: Double = js.native
  
  /** determines the left margin of the paragraph in 100th mm. */
  var ParaLeftMargin: Double = js.native
  
  /** determines if the paragraph is included in the line numbering. */
  var ParaLineNumberCount: Boolean = js.native
  
  /** contains the start value for the line numbering. */
  var ParaLineNumberStartValue: Double = js.native
  
  /** contains the type of the line spacing of a paragraph. */
  var ParaLineSpacing: LineSpacing = js.native
  
  /** specifies the minimum number of lines of the paragraph that have to be at bottom of a page if the paragraph is spread over more than one page. */
  var ParaOrphans: Double = js.native
  
  /**
    * determines if the register mode is applied to a paragraph.
    *
    * Remark: Register mode is only used if the register mode property of the page style is switched on.
    */
  var ParaRegisterModeActive: Boolean = js.native
  
  /** determines the right margin of the paragraph in 100th mm. */
  var ParaRightMargin: Double = js.native
  
  /**
    * determines the type, color, and size of the shadow.
    * @see com.sun.star.table.ShadowFormat
    */
  var ParaShadowFormat: ShadowFormat = js.native
  
  /** Setting this property to `FALSE` prevents the paragraph from getting split into two pages or columns. */
  var ParaSplit: Boolean = js.native
  
  /** contains the name of the current paragraph style. */
  var ParaStyleName: String = js.native
  
  /** specifies the positions and kinds of the tab stops within this paragraph. */
  var ParaTabStops: SafeArray[TabStop] = js.native
  
  /**
    * determines the top margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraph.or the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaTopMargin: Double = js.native
  
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var ParaUserDefinedAttributes: XNameContainer = js.native
  
  /**
    * specifies the vertical alignment of a paragraph.
    * @see com.sun.star.text.ParagraphVertAlign
    */
  var ParaVertAlignment: Double = js.native
  
  /** specifies the minimum number of lines of the paragraph that have to be at top of a page if the paragraph is spread over more than one page. */
  var ParaWidows: Double = js.native
  
  /**
    * contains the position of this cell in the sheet (in 1/100 mm).
    *
    * This property contains the absolute position in the whole sheet, not the position in the visible area.
    */
  var Position: Point = js.native
  
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: Double = js.native
  
  /** contains the size of this cell (in 1/100 mm). */
  var Size: typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size = js.native
  
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: Double = js.native
  
  /**
    * contains the data validation settings for this cell.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var Validation: XPropertySet = js.native
  
  /**
    * contains the data validation settings for this cell, using localized formulas.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var ValidationLocal: XPropertySet = js.native
}
object SheetCell {
  
  @scala.inline
  def apply(
    AbsoluteName: String,
    AsianVerticalMode: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorder2: BorderLine2,
    BottomBorderDistance: Double,
    BreakType: BreakType,
    CellBackColor: Color,
    CellInteropGrabBag: SafeArray[PropertyValue],
    CellProtection: CellProtection,
    CellStyle: String,
    CharAutoKerning: Boolean,
    CharBackColor: Color,
    CharBackTransparent: Boolean,
    CharBorderDistance: Double,
    CharBottomBorder: BorderLine2,
    CharBottomBorderDistance: Double,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
    CharCrossedOut: Boolean,
    CharEmphasis: Double,
    CharEscapement: Double,
    CharEscapementHeight: Double,
    CharFlash: Boolean,
    CharFontCharSet: Double,
    CharFontCharSetAsian: Double,
    CharFontCharSetComplex: Double,
    CharFontFamily: Double,
    CharFontFamilyAsian: Double,
    CharFontFamilyComplex: Double,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: Double,
    CharFontPitchAsian: Double,
    CharFontPitchComplex: Double,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharFontType: Double,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharHighlight: Color,
    CharInteropGrabBag: SafeArray[PropertyValue],
    CharKeepTogether: Boolean,
    CharKerning: Double,
    CharLeftBorder: BorderLine2,
    CharLeftBorderDistance: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharNoHyphenation: Boolean,
    CharNoLineBreak: Boolean,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharRelief: Double,
    CharRightBorder: BorderLine2,
    CharRightBorderDistance: Double,
    CharRotation: Double,
    CharRotationIsFitToLine: Boolean,
    CharScaleWidth: Double,
    CharShadingValue: Double,
    CharShadowFormat: ShadowFormat,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharStyleName: String,
    CharStyleNames: SafeArray[String],
    CharTopBorder: BorderLine2,
    CharTopBorderDistance: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharUnderlineHasColor: Boolean,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    ConditionalFormat: XSheetConditionalEntries,
    ConditionalFormatLocal: XSheetConditionalEntries,
    DiagonalBLTR: BorderLine,
    DiagonalBLTR2: BorderLine2,
    DiagonalTLBR: BorderLine,
    DiagonalTLBR2: BorderLine2,
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    ElementType: `type`,
    End: XTextRange,
    EndRedline: PropertyValues,
    Error: Double,
    Formula: String,
    FormulaLocal: String,
    FormulaResultType: Double,
    HoriJustify: CellHoriJustify,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    IsCellBackgroundTransparent: Boolean,
    IsTextWrapped: Boolean,
    LeftBorder: BorderLine,
    LeftBorder2: BorderLine2,
    LeftBorderDistance: Double,
    ListId: String,
    NumberFormat: Double,
    NumberingIsNumber: Boolean,
    NumberingLevel: Double,
    NumberingRules: XIndexReplace,
    NumberingStartValue: Double,
    NumberingStyleName: String,
    Orientation: CellOrientation,
    OutlineLevel: Double,
    PageDescName: String,
    PageNumberOffset: Double,
    PageStyleName: String,
    ParaAdjust: ParagraphAdjust,
    ParaBackColor: Color,
    ParaBackGraphicFilter: String,
    ParaBackGraphicLocation: GraphicLocation,
    ParaBackGraphicURL: String,
    ParaBackTransparent: Boolean,
    ParaBottomMargin: Double,
    ParaContextMargin: Boolean,
    ParaExpandSingleWord: Boolean,
    ParaFirstLineIndent: Double,
    ParaHyphenationMaxHyphens: Double,
    ParaHyphenationMaxLeadingChars: Double,
    ParaHyphenationMaxTrailingChars: Double,
    ParaIndent: Double,
    ParaInteropGrabBag: SafeArray[PropertyValue],
    ParaIsAutoFirstLineIndent: Boolean,
    ParaIsCharacterDistance: Boolean,
    ParaIsConnectBorder: Boolean,
    ParaIsForbiddenRules: Boolean,
    ParaIsHangingPunctuation: Boolean,
    ParaIsHyphenation: Boolean,
    ParaIsNumberingRestart: Boolean,
    ParaKeepTogether: Boolean,
    ParaLastLineAdjust: Double,
    ParaLeftMargin: Double,
    ParaLineNumberCount: Boolean,
    ParaLineNumberStartValue: Double,
    ParaLineSpacing: LineSpacing,
    ParaOrphans: Double,
    ParaRegisterModeActive: Boolean,
    ParaRightMargin: Double,
    ParaShadowFormat: ShadowFormat,
    ParaSplit: Boolean,
    ParaStyleName: String,
    ParaTabStops: SafeArray[TabStop],
    ParaTopMargin: Double,
    ParaUserDefinedAttributes: XNameContainer,
    ParaVertAlignment: Double,
    ParaWidows: Double,
    Position: Point,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorder2: BorderLine2,
    RightBorderDistance: Double,
    RotateAngle: Double,
    RotateReference: Double,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    ShadowFormat: ShadowFormat,
    ShrinkToFit: Boolean,
    Size: Size,
    Start: XTextRange,
    StartRedline: PropertyValues,
    String: String,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TextUserDefinedAttributes: XNameContainer,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    TopBorderDistance: Double,
    Type: CellContentType,
    UnvisitedCharStyleName: String,
    UserDefinedAttributes: XNameContainer,
    Validation: XPropertySet,
    ValidationLocal: XPropertySet,
    Value: Double,
    VertJustify: Double,
    VisitedCharStyleName: String,
    WritingMode: Double,
    XCellAddressable: XCellAddressable,
    XColumnRowRange: XColumnRowRange,
    XModifyBroadcaster: XModifyBroadcaster,
    XSheetAnnotationAnchor: XSheetAnnotationAnchor,
    XTextFieldsSupplier: XTextFieldsSupplier,
    XTolerantMultiPropertySet: XTolerantMultiPropertySet,
    acquire: () => Unit,
    addActionLock: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    compareRegionEnds: (XTextRange, XTextRange) => Double,
    compareRegionStarts: (XTextRange, XTextRange) => Double,
    createEnumeration: () => XEnumeration,
    createReplaceDescriptor: () => XReplaceDescriptor,
    createSearchDescriptor: () => XSearchDescriptor,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    decrementIndent: () => Unit,
    findAll: XSearchDescriptor => XIndexAccess,
    findFirst: XSearchDescriptor => XInterface,
    findNext: (XInterface, XSearchDescriptor) => XInterface,
    getElementType: () => `type`,
    getEnd: () => XTextRange,
    getError: () => Double,
    getFormula: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    getType: () => CellContentType,
    getValue: () => Double,
    hasElements: () => Boolean,
    incrementIndent: () => Unit,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    insertTextContentAfter: (XTextContent, XTextContent) => Unit,
    insertTextContentBefore: (XTextContent, XTextContent) => Unit,
    isActionLocked: () => Boolean,
    moveTextRange: (XTextRange, Double) => Unit,
    queryColumnDifferences: CellAddress => XSheetCellRanges,
    queryContentCells: Double => XSheetCellRanges,
    queryDependents: Boolean => XSheetCellRanges,
    queryEmptyCells: () => XSheetCellRanges,
    queryFormulaCells: Double => XSheetCellRanges,
    queryInterface: `type` => js.Any,
    queryIntersection: CellRangeAddress => XSheetCellRanges,
    queryPrecedents: Boolean => XSheetCellRanges,
    queryRowDifferences: CellAddress => XSheetCellRanges,
    queryVisibleCells: () => XSheetCellRanges,
    release: () => Unit,
    removeActionLock: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeTextContent: XTextContent => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    replaceAll: XSearchDescriptor => Double,
    resetActionLocks: () => Double,
    setActionLocks: Double => Unit,
    setFormula: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setString: String => Unit,
    setValue: Double => Unit
  ): SheetCell = {
    val __obj = js.Dynamic.literal(AbsoluteName = AbsoluteName.asInstanceOf[js.Any], AsianVerticalMode = AsianVerticalMode.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorder2 = BottomBorder2.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], CellBackColor = CellBackColor.asInstanceOf[js.Any], CellInteropGrabBag = CellInteropGrabBag.asInstanceOf[js.Any], CellProtection = CellProtection.asInstanceOf[js.Any], CellStyle = CellStyle.asInstanceOf[js.Any], CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], ConditionalFormat = ConditionalFormat.asInstanceOf[js.Any], ConditionalFormatLocal = ConditionalFormatLocal.asInstanceOf[js.Any], DiagonalBLTR = DiagonalBLTR.asInstanceOf[js.Any], DiagonalBLTR2 = DiagonalBLTR2.asInstanceOf[js.Any], DiagonalTLBR = DiagonalTLBR.asInstanceOf[js.Any], DiagonalTLBR2 = DiagonalTLBR2.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndRedline = EndRedline.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], FormulaLocal = FormulaLocal.asInstanceOf[js.Any], FormulaResultType = FormulaResultType.asInstanceOf[js.Any], HoriJustify = HoriJustify.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], IsCellBackgroundTransparent = IsCellBackgroundTransparent.asInstanceOf[js.Any], IsTextWrapped = IsTextWrapped.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorder2 = LeftBorder2.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaIndent = ParaIndent.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsCharacterDistance = ParaIsCharacterDistance.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsForbiddenRules = ParaIsForbiddenRules.asInstanceOf[js.Any], ParaIsHangingPunctuation = ParaIsHangingPunctuation.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorder2 = RightBorder2.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotateReference = RotateReference.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShrinkToFit = ShrinkToFit.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], StartRedline = StartRedline.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableBorder2 = TableBorder2.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorder2 = TopBorder2.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Validation = Validation.asInstanceOf[js.Any], ValidationLocal = ValidationLocal.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VertJustify = VertJustify.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionLock = js.Any.fromFunction0(addActionLock), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), compareRegionEnds = js.Any.fromFunction2(compareRegionEnds), compareRegionStarts = js.Any.fromFunction2(compareRegionStarts), createEnumeration = js.Any.fromFunction0(createEnumeration), createReplaceDescriptor = js.Any.fromFunction0(createReplaceDescriptor), createSearchDescriptor = js.Any.fromFunction0(createSearchDescriptor), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), decrementIndent = js.Any.fromFunction0(decrementIndent), findAll = js.Any.fromFunction1(findAll), findFirst = js.Any.fromFunction1(findFirst), findNext = js.Any.fromFunction2(findNext), getElementType = js.Any.fromFunction0(getElementType), getEnd = js.Any.fromFunction0(getEnd), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), hasElements = js.Any.fromFunction0(hasElements), incrementIndent = js.Any.fromFunction0(incrementIndent), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), insertTextContentAfter = js.Any.fromFunction2(insertTextContentAfter), insertTextContentBefore = js.Any.fromFunction2(insertTextContentBefore), isActionLocked = js.Any.fromFunction0(isActionLocked), moveTextRange = js.Any.fromFunction2(moveTextRange), queryColumnDifferences = js.Any.fromFunction1(queryColumnDifferences), queryContentCells = js.Any.fromFunction1(queryContentCells), queryDependents = js.Any.fromFunction1(queryDependents), queryEmptyCells = js.Any.fromFunction0(queryEmptyCells), queryFormulaCells = js.Any.fromFunction1(queryFormulaCells), queryInterface = js.Any.fromFunction1(queryInterface), queryIntersection = js.Any.fromFunction1(queryIntersection), queryPrecedents = js.Any.fromFunction1(queryPrecedents), queryRowDifferences = js.Any.fromFunction1(queryRowDifferences), queryVisibleCells = js.Any.fromFunction0(queryVisibleCells), release = js.Any.fromFunction0(release), removeActionLock = js.Any.fromFunction0(removeActionLock), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceAll = js.Any.fromFunction1(replaceAll), resetActionLocks = js.Any.fromFunction0(resetActionLocks), setActionLocks = js.Any.fromFunction1(setActionLocks), setFormula = js.Any.fromFunction1(setFormula), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setString = js.Any.fromFunction1(setString), setValue = js.Any.fromFunction1(setValue))
    js.Dynamic.global.Object.assign(__obj, XCellAddressable)
    js.Dynamic.global.Object.assign(__obj, XColumnRowRange)
    js.Dynamic.global.Object.assign(__obj, XModifyBroadcaster)
    js.Dynamic.global.Object.assign(__obj, XSheetAnnotationAnchor)
    js.Dynamic.global.Object.assign(__obj, XTextFieldsSupplier)
    js.Dynamic.global.Object.assign(__obj, XTolerantMultiPropertySet)
    __obj.asInstanceOf[SheetCell]
  }
  
  @scala.inline
  implicit class SheetCellOps[Self <: SheetCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbsoluteName(value: String): Self = this.set("AbsoluteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDistance(value: Double): Self = this.set("BorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBorderDistance(value: Double): Self = this.set("BottomBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakType(value: BreakType): Self = this.set("BreakType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalFormat(value: XSheetConditionalEntries): Self = this.set("ConditionalFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalFormatLocal(value: XSheetConditionalEntries): Self = this.set("ConditionalFormatLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropCapCharStyleName(value: String): Self = this.set("DropCapCharStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropCapFormat(value: DropCapFormat): Self = this.set("DropCapFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropCapWholeWord(value: Boolean): Self = this.set("DropCapWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaLocal(value: String): Self = this.set("FormulaLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaResultType(value: Double): Self = this.set("FormulaResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBorderDistance(value: Double): Self = this.set("LeftBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListId(value: String): Self = this.set("ListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingIsNumber(value: Boolean): Self = this.set("NumberingIsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingLevel(value: Double): Self = this.set("NumberingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingRules(value: XIndexReplace): Self = this.set("NumberingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingStartValue(value: Double): Self = this.set("NumberingStartValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingStyleName(value: String): Self = this.set("NumberingStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevel(value: Double): Self = this.set("OutlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDescName(value: String): Self = this.set("PageDescName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberOffset(value: Double): Self = this.set("PageNumberOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStyleName(value: String): Self = this.set("PageStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaAdjust(value: ParagraphAdjust): Self = this.set("ParaAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackColor(value: Color): Self = this.set("ParaBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackGraphicFilter(value: String): Self = this.set("ParaBackGraphicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackGraphicLocation(value: GraphicLocation): Self = this.set("ParaBackGraphicLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackGraphicURL(value: String): Self = this.set("ParaBackGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackTransparent(value: Boolean): Self = this.set("ParaBackTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBottomMargin(value: Double): Self = this.set("ParaBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaContextMargin(value: Boolean): Self = this.set("ParaContextMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaExpandSingleWord(value: Boolean): Self = this.set("ParaExpandSingleWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaFirstLineIndent(value: Double): Self = this.set("ParaFirstLineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaHyphenationMaxHyphens(value: Double): Self = this.set("ParaHyphenationMaxHyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaHyphenationMaxLeadingChars(value: Double): Self = this.set("ParaHyphenationMaxLeadingChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaHyphenationMaxTrailingChars(value: Double): Self = this.set("ParaHyphenationMaxTrailingChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaInteropGrabBag(value: SafeArray[PropertyValue]): Self = this.set("ParaInteropGrabBag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsAutoFirstLineIndent(value: Boolean): Self = this.set("ParaIsAutoFirstLineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsConnectBorder(value: Boolean): Self = this.set("ParaIsConnectBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsHyphenation(value: Boolean): Self = this.set("ParaIsHyphenation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsNumberingRestart(value: Boolean): Self = this.set("ParaIsNumberingRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaKeepTogether(value: Boolean): Self = this.set("ParaKeepTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLastLineAdjust(value: Double): Self = this.set("ParaLastLineAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLeftMargin(value: Double): Self = this.set("ParaLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLineNumberCount(value: Boolean): Self = this.set("ParaLineNumberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLineNumberStartValue(value: Double): Self = this.set("ParaLineNumberStartValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLineSpacing(value: LineSpacing): Self = this.set("ParaLineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaOrphans(value: Double): Self = this.set("ParaOrphans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaRegisterModeActive(value: Boolean): Self = this.set("ParaRegisterModeActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaRightMargin(value: Double): Self = this.set("ParaRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaShadowFormat(value: ShadowFormat): Self = this.set("ParaShadowFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaSplit(value: Boolean): Self = this.set("ParaSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleName(value: String): Self = this.set("ParaStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaTabStops(value: SafeArray[TabStop]): Self = this.set("ParaTabStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaTopMargin(value: Double): Self = this.set("ParaTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaUserDefinedAttributes(value: XNameContainer): Self = this.set("ParaUserDefinedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaVertAlignment(value: Double): Self = this.set("ParaVertAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaWidows(value: Double): Self = this.set("ParaWidows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBorderDistance(value: Double): Self = this.set("RightBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBorderDistance(value: Double): Self = this.set("TopBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidation(value: XPropertySet): Self = this.set("Validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationLocal(value: XPropertySet): Self = this.set("ValidationLocal", value.asInstanceOf[js.Any])
  }
}
