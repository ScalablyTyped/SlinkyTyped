package typingsSlinky.activexLibreoffice.com_.sun.star.report

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineDash
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XFixedLine extends XReportControlModel {
  
  /** This property contains the line color. */
  var LineColor: Color = js.native
  
  /** This property contains the dash of the line. */
  var LineDash: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineDash = js.native
  
  /** This property contains the type of the line. */
  var LineStyle: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineStyle = js.native
  
  /** This property contains the extent of transparency. */
  var LineTransparence: Double = js.native
  
  /** This property contains the width of the line in 1/100th mm. */
  var LineWidth: Double = js.native
  
  /**
    * specifies the orientation of the control.
    *
    * `; 0: horizontal; 1: vertical (default); `
    */
  var Orientation: Double = js.native
}
object XFixedLine {
  
  @scala.inline
  def apply(
    CharAutoKerning: Boolean,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
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
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharKerning: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharRelief: Double,
    CharRotation: Double,
    CharScaleWidth: Double,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    ConditionalPrintExpression: String,
    ControlBackground: Color,
    ControlBackgroundTransparent: Boolean,
    ControlBorder: Double,
    ControlBorderColor: Double,
    ControlTextEmphasis: Double,
    Count: Double,
    DataField: String,
    DetailFields: SafeArray[String],
    ElementType: `type`,
    FontDescriptor: FontDescriptor,
    FontDescriptorAsian: FontDescriptor,
    FontDescriptorComplex: FontDescriptor,
    Height: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    LineColor: Color,
    LineDash: LineDash,
    LineStyle: LineStyle,
    LineTransparence: Double,
    LineWidth: Double,
    MasterFields: SafeArray[String],
    Name: String,
    Orientation: Double,
    ParaAdjust: Double,
    Parent: XInterface,
    Position: Point,
    PositionX: Double,
    PositionY: Double,
    PrintRepeatedValues: Boolean,
    PrintWhenGroupChange: Boolean,
    PropertySetInfo: XPropertySetInfo,
    Section: XSection,
    ShapeType: String,
    Size: Size,
    UnvisitedCharStyleName: String,
    VerticalAlign: VerticalAlignment,
    VisitedCharStyleName: String,
    Width: Double,
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    createFormatCondition: () => XFormatCondition,
    dispose: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getParent: () => XInterface,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getShapeType: () => String,
    getSize: () => Size,
    hasElements: () => Boolean,
    insertByIndex: (Double, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    replaceByIndex: (Double, js.Any) => Unit,
    setParent: XInterface => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSize: Size => Unit
  ): XFixedLine = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], ConditionalPrintExpression = ConditionalPrintExpression.asInstanceOf[js.Any], ControlBackground = ControlBackground.asInstanceOf[js.Any], ControlBackgroundTransparent = ControlBackgroundTransparent.asInstanceOf[js.Any], ControlBorder = ControlBorder.asInstanceOf[js.Any], ControlBorderColor = ControlBorderColor.asInstanceOf[js.Any], ControlTextEmphasis = ControlTextEmphasis.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], DataField = DataField.asInstanceOf[js.Any], DetailFields = DetailFields.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontDescriptorAsian = FontDescriptorAsian.asInstanceOf[js.Any], FontDescriptorComplex = FontDescriptorComplex.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], MasterFields = MasterFields.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PrintRepeatedValues = PrintRepeatedValues.asInstanceOf[js.Any], PrintWhenGroupChange = PrintWhenGroupChange.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], VerticalAlign = VerticalAlign.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), createFormatCondition = js.Any.fromFunction0(createFormatCondition), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getParent = js.Any.fromFunction0(getParent), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setParent = js.Any.fromFunction1(setParent), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[XFixedLine]
  }
  
  @scala.inline
  implicit class XFixedLineOps[Self <: XFixedLine] (val x: Self) extends AnyVal {
    
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
    def setLineColor(value: Color): Self = this.set("LineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDash(value: LineDash): Self = this.set("LineDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle(value: LineStyle): Self = this.set("LineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineTransparence(value: Double): Self = this.set("LineTransparence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("LineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("Orientation", value.asInstanceOf[js.Any])
  }
}
