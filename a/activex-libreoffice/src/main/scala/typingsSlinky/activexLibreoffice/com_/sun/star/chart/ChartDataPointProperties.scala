package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Gradient
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XBitmap
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.BitmapMode
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.FillProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.FillStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Hatch
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineCap
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineDash
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineJoint
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.RectanglePoint
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine2
import typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.text.GraphicCrop
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies all the properties for the graphic object of a data point (e.g., a single bar in a bar chart).
  *
  * Text properties correlate to the data description of the data point. There is a similar service for a group of graphic elements called {@link
  * ChartDataRowProperties} for the properties of whole data rows.
  * @see ChartDataRowProperties
  */
@js.native
trait ChartDataPointProperties
  extends Chart3DBarProperties
     with FillProperties
     with LineProperties
     with CharacterProperties
     with UserDefinedAttributesSupplier {
  
  /**
    * specifies how the captions of data points are displayed.
    * @see ChartDataCaption
    */
  var DataCaption: Double = js.native
  
  /**
    * specifies a relative position for the data label
    * @see DataLabelPlacement
    */
  var LabelPlacement: Double = js.native
  
  /** specifies a string that is used to separate the parts of a data label (caption) */
  var LabelSeparator: String = js.native
  
  /** specifies a number format for the display of the value in the data label */
  var NumberFormat: Double = js.native
  
  /** specifies a number format for the display of the percentage value in the data label */
  var PercentageNumberFormat: Double = js.native
  
  /** the offset by which pie segments in a {@link PieDiagram} are dragged outside from the center. This value is given in percent of the radius. */
  var SegmentOffset: Double = js.native
  
  /**
    * In charts that support symbols, you can set this property to any valid URL that points to a graphic file. This graphic is then used as symbol for each
    * data point.
    *
    * When you query this value you get an internal URL of the embedded graphic.
    * @see ChartSymbolType
    */
  var SymbolBitmapURL: String = js.native
  
  /**
    * specifies the type of symbols if the current chart type supports the usage of symbols.
    * @see ChartSymbolType
    */
  var SymbolType: Double = js.native
  
  /**
    * specifies if the text of a data label (caption) must be wrapped
    * @since LibreOffice 5.1
    */
  var TextWordWrap: Boolean = js.native
}
object ChartDataPointProperties {
  
  @scala.inline
  def apply(
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
    CharFontFamily: Double,
    CharFontName: String,
    CharFontPitch: Double,
    CharFontStyleName: String,
    CharFontType: Double,
    CharHeight: Double,
    CharHidden: Boolean,
    CharHighlight: Color,
    CharInteropGrabBag: SafeArray[PropertyValue],
    CharKeepTogether: Boolean,
    CharKerning: Double,
    CharLeftBorder: BorderLine2,
    CharLeftBorderDistance: Double,
    CharLocale: Locale,
    CharNoHyphenation: Boolean,
    CharNoLineBreak: Boolean,
    CharPosture: FontSlant,
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
    CharWordMode: Boolean,
    DataCaption: Double,
    FillBackground: Boolean,
    FillBitmap: XBitmap,
    FillBitmapLogicalSize: Boolean,
    FillBitmapMode: BitmapMode,
    FillBitmapName: String,
    FillBitmapOffsetX: Double,
    FillBitmapOffsetY: Double,
    FillBitmapPositionOffsetX: Double,
    FillBitmapPositionOffsetY: Double,
    FillBitmapRectanglePoint: RectanglePoint,
    FillBitmapSizeX: Double,
    FillBitmapSizeY: Double,
    FillBitmapStretch: Boolean,
    FillBitmapTile: Boolean,
    FillBitmapURL: String,
    FillColor: Color,
    FillGradient: Gradient,
    FillGradientName: String,
    FillHatch: Hatch,
    FillHatchName: String,
    FillStyle: FillStyle,
    FillTransparence: Double,
    FillTransparenceGradient: Gradient,
    FillTransparenceGradientName: String,
    GraphicCrop: GraphicCrop,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    LabelPlacement: Double,
    LabelSeparator: String,
    LineCap: LineCap,
    LineColor: Color,
    LineDash: LineDash,
    LineDashName: String,
    LineEnd: PolyPolygonBezierCoords,
    LineEndCenter: Boolean,
    LineEndName: String,
    LineEndWidth: Double,
    LineJoint: LineJoint,
    LineStart: PolyPolygonBezierCoords,
    LineStartCenter: Boolean,
    LineStartName: String,
    LineStartWidth: Double,
    LineStyle: LineStyle,
    LineTransparence: Double,
    LineWidth: Double,
    NumberFormat: Double,
    PercentageNumberFormat: Double,
    PropertySetInfo: XPropertySetInfo,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    SegmentOffset: Double,
    SolidType: Double,
    SymbolBitmapURL: String,
    SymbolType: Double,
    TextUserDefinedAttributes: XNameContainer,
    TextWordWrap: Boolean,
    UnvisitedCharStyleName: String,
    UserDefinedAttributes: XNameContainer,
    VisitedCharStyleName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ChartDataPointProperties = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], DataCaption = DataCaption.asInstanceOf[js.Any], FillBackground = FillBackground.asInstanceOf[js.Any], FillBitmap = FillBitmap.asInstanceOf[js.Any], FillBitmapLogicalSize = FillBitmapLogicalSize.asInstanceOf[js.Any], FillBitmapMode = FillBitmapMode.asInstanceOf[js.Any], FillBitmapName = FillBitmapName.asInstanceOf[js.Any], FillBitmapOffsetX = FillBitmapOffsetX.asInstanceOf[js.Any], FillBitmapOffsetY = FillBitmapOffsetY.asInstanceOf[js.Any], FillBitmapPositionOffsetX = FillBitmapPositionOffsetX.asInstanceOf[js.Any], FillBitmapPositionOffsetY = FillBitmapPositionOffsetY.asInstanceOf[js.Any], FillBitmapRectanglePoint = FillBitmapRectanglePoint.asInstanceOf[js.Any], FillBitmapSizeX = FillBitmapSizeX.asInstanceOf[js.Any], FillBitmapSizeY = FillBitmapSizeY.asInstanceOf[js.Any], FillBitmapStretch = FillBitmapStretch.asInstanceOf[js.Any], FillBitmapTile = FillBitmapTile.asInstanceOf[js.Any], FillBitmapURL = FillBitmapURL.asInstanceOf[js.Any], FillColor = FillColor.asInstanceOf[js.Any], FillGradient = FillGradient.asInstanceOf[js.Any], FillGradientName = FillGradientName.asInstanceOf[js.Any], FillHatch = FillHatch.asInstanceOf[js.Any], FillHatchName = FillHatchName.asInstanceOf[js.Any], FillStyle = FillStyle.asInstanceOf[js.Any], FillTransparence = FillTransparence.asInstanceOf[js.Any], FillTransparenceGradient = FillTransparenceGradient.asInstanceOf[js.Any], FillTransparenceGradientName = FillTransparenceGradientName.asInstanceOf[js.Any], GraphicCrop = GraphicCrop.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], LabelPlacement = LabelPlacement.asInstanceOf[js.Any], LabelSeparator = LabelSeparator.asInstanceOf[js.Any], LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], PercentageNumberFormat = PercentageNumberFormat.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], SegmentOffset = SegmentOffset.asInstanceOf[js.Any], SolidType = SolidType.asInstanceOf[js.Any], SymbolBitmapURL = SymbolBitmapURL.asInstanceOf[js.Any], SymbolType = SymbolType.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TextWordWrap = TextWordWrap.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ChartDataPointProperties]
  }
  
  @scala.inline
  implicit class ChartDataPointPropertiesOps[Self <: ChartDataPointProperties] (val x: Self) extends AnyVal {
    
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
    def setDataCaption(value: Double): Self = this.set("DataCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPlacement(value: Double): Self = this.set("LabelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSeparator(value: String): Self = this.set("LabelSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: Double): Self = this.set("NumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageNumberFormat(value: Double): Self = this.set("PercentageNumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentOffset(value: Double): Self = this.set("SegmentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolBitmapURL(value: String): Self = this.set("SymbolBitmapURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolType(value: Double): Self = this.set("SymbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextWordWrap(value: Boolean): Self = this.set("TextWordWrap", value.asInstanceOf[js.Any])
  }
}
