package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine2
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellContentType
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellHoriJustify
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellOrientation
import typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder2
import typingsSlinky.activexLibreoffice.com_.sun.star.table.XCell
import typingsSlinky.activexLibreoffice.com_.sun.star.util.CellProtection
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a singe cell within a text table.
  * @see com.sun.star.text.TextTable
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.table.CellProperties because var conflicts: BottomBorder, LeftBorder, NumberFormat, RightBorder, TopBorder, UserDefinedAttributes. Inlined AsianVerticalMode, BottomBorder2, CellBackColor, CellInteropGrabBag, CellProtection, CellStyle, DiagonalBLTR, DiagonalBLTR2, DiagonalTLBR, DiagonalTLBR2, HoriJustify, IsCellBackgroundTransparent, IsTextWrapped, LeftBorder2, Orientation, ParaIndent, RightBorder2, RotateAngle, RotateReference, ShadowFormat, ShrinkToFit, TableBorder, TableBorder2, TopBorder2, VertJustify */ @js.native
trait Cell
  extends CellProperties
     with XCell
     with XText {
  
  /**
    * selects Asian character orientation in vertical orientation.
    *
    * If the {@link CellProperties.Orientation} property is CellOrientation::STACKED, in Asian mode only Asian characters are printed in horizontal
    * orientation instead of all characters. For other values of {@link CellProperties.Orientation} , this value is not used.
    */
  var AsianVerticalMode: Boolean = js.native
  
  /**
    * contains a description of the bottom border line of each cell. Preferred over {@link BorderLine}{@link BottomBorder} .
    * @since LibreOffice 3.6
    */
  var BottomBorder2: BorderLine2 = js.native
  
  /** contains the cell background color. */
  var CellBackColor: Color = js.native
  
  /**
    * Grab bag of cell properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var CellInteropGrabBag: SafeArray[PropertyValue] = js.native
  
  /**
    * contains a description of the cell protection.
    *
    * {@link Cell} protection is active only if the sheet is protected.
    */
  var CellProtection: typingsSlinky.activexLibreoffice.com_.sun.star.util.CellProtection = js.native
  
  /** contains the name of the style of the cell. */
  var CellStyle: String = js.native
  
  /** contains a description of the bottom left to top right diagonal line of each cell. */
  var DiagonalBLTR: BorderLine = js.native
  
  /**
    * contains a description of the bottom left to top right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalBLTR} .
    * @since LibreOffice 3.6
    */
  var DiagonalBLTR2: BorderLine2 = js.native
  
  /** contains a description of the top left to bottom right diagonal line of each cell. */
  var DiagonalTLBR: BorderLine = js.native
  
  /**
    * contains a description of the top left to bottom right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalTLBR} .
    * @since LibreOffice 3.6
    */
  var DiagonalTLBR2: BorderLine2 = js.native
  
  /** contains the horizontal alignment of the cell contents. */
  var HoriJustify: CellHoriJustify = js.native
  
  /**
    * is `TRUE` , if the cell background is transparent.
    *
    * In this case the {@link CellProperties.CellBackColor} value is not used.
    */
  var IsCellBackgroundTransparent: Boolean = js.native
  
  /** is `TRUE` , if text in the cells will be wrapped automatically at the right border. */
  var IsTextWrapped: Boolean = js.native
  
  /**
    * contains a description of the left border line of each cell. Preferred over {@link BorderLine}{@link LeftBorder} .
    * @since LibreOffice 3.6
    */
  var LeftBorder2: BorderLine2 = js.native
  
  /**
    * contains the orientation of the cell contents.
    *
    * If the {@link CellProperties.RotateAngle} property is non-zero, this value is not used.
    */
  var Orientation: CellOrientation = js.native
  
  /** defines the indentation of the cell contents (in 1/100 mm). */
  var ParaIndent: Double = js.native
  
  /**
    * contains a description of the right border line of each cell. Preferred over {@link BorderLine}{@link RightBorder} .
    * @since LibreOffice 3.6
    */
  var RightBorder2: BorderLine2 = js.native
  
  /** defines how much the content of cells is rotated (in 1/100 degrees). */
  var RotateAngle: Double = js.native
  
  /**
    * defines at which edge rotated cells are aligned.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var RotateReference: Double = js.native
  
  /** contains a description of the shadow. */
  var ShadowFormat: typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat = js.native
  
  /** is `TRUE` , if the cell content will be shrunk to fit in the cell. */
  var ShrinkToFit: Boolean = js.native
  
  /**
    * contains a description of the cell or cell range border.
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    */
  var TableBorder: typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder = js.native
  
  /**
    * contains a description of the cell or cell range border. Preferred over {@link TableBorder}{@link TableBorder} .
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    * @since LibreOffice 3.6
    */
  var TableBorder2: typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder2 = js.native
  
  /**
    * contains a description of the top border line of each cell. Preferred over {@link BorderLine}{@link TopBorder} .
    * @since LibreOffice 3.6
    */
  var TopBorder2: BorderLine2 = js.native
  
  /**
    * contains the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: Double = js.native
}
object Cell {
  
  @scala.inline
  def apply(
    AsianVerticalMode: Boolean,
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BottomBorder: BorderLine,
    BottomBorder2: BorderLine2,
    BottomBorderDistance: Double,
    CellBackColor: Color,
    CellInteropGrabBag: SafeArray[PropertyValue],
    CellName: String,
    CellProtection: CellProtection,
    CellStyle: String,
    DiagonalBLTR: BorderLine,
    DiagonalBLTR2: BorderLine2,
    DiagonalTLBR: BorderLine,
    DiagonalTLBR2: BorderLine2,
    End: XTextRange,
    Error: Double,
    Formula: String,
    HoriJustify: CellHoriJustify,
    IsCellBackgroundTransparent: Boolean,
    IsProtected: Boolean,
    IsTextWrapped: Boolean,
    LeftBorder: BorderLine,
    LeftBorder2: BorderLine2,
    LeftBorderDistance: Double,
    NumberFormat: Double,
    Orientation: CellOrientation,
    ParaIndent: Double,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorder2: BorderLine2,
    RightBorderDistance: Double,
    RotateAngle: Double,
    RotateReference: Double,
    ShadowFormat: ShadowFormat,
    ShrinkToFit: Boolean,
    Start: XTextRange,
    String: String,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TextSection: XTextSection,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    TopBorderDistance: Double,
    Type: CellContentType,
    UserDefinedAttributes: XNameContainer,
    Value: Double,
    VertJustify: Double,
    VertOrient: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
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
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeTextContent: XTextContent => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setFormula: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setString: String => Unit,
    setValue: Double => Unit
  ): Cell = {
    val __obj = js.Dynamic.literal(AsianVerticalMode = AsianVerticalMode.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorder2 = BottomBorder2.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], CellBackColor = CellBackColor.asInstanceOf[js.Any], CellInteropGrabBag = CellInteropGrabBag.asInstanceOf[js.Any], CellName = CellName.asInstanceOf[js.Any], CellProtection = CellProtection.asInstanceOf[js.Any], CellStyle = CellStyle.asInstanceOf[js.Any], DiagonalBLTR = DiagonalBLTR.asInstanceOf[js.Any], DiagonalBLTR2 = DiagonalBLTR2.asInstanceOf[js.Any], DiagonalTLBR = DiagonalTLBR.asInstanceOf[js.Any], DiagonalTLBR2 = DiagonalTLBR2.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], HoriJustify = HoriJustify.asInstanceOf[js.Any], IsCellBackgroundTransparent = IsCellBackgroundTransparent.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], IsTextWrapped = IsTextWrapped.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorder2 = LeftBorder2.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ParaIndent = ParaIndent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorder2 = RightBorder2.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotateReference = RotateReference.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShrinkToFit = ShrinkToFit.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableBorder2 = TableBorder2.asInstanceOf[js.Any], TextSection = TextSection.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorder2 = TopBorder2.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VertJustify = VertJustify.asInstanceOf[js.Any], VertOrient = VertOrient.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFormula = js.Any.fromFunction1(setFormula), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setString = js.Any.fromFunction1(setString), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit class CellMutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsianVerticalMode(value: Boolean): Self = StObject.set(x, "AsianVerticalMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBorder2(value: BorderLine2): Self = StObject.set(x, "BottomBorder2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellBackColor(value: Color): Self = StObject.set(x, "CellBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "CellInteropGrabBag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellProtection(value: CellProtection): Self = StObject.set(x, "CellProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStyle(value: String): Self = StObject.set(x, "CellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalBLTR(value: BorderLine): Self = StObject.set(x, "DiagonalBLTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalBLTR2(value: BorderLine2): Self = StObject.set(x, "DiagonalBLTR2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalTLBR(value: BorderLine): Self = StObject.set(x, "DiagonalTLBR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalTLBR2(value: BorderLine2): Self = StObject.set(x, "DiagonalTLBR2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoriJustify(value: CellHoriJustify): Self = StObject.set(x, "HoriJustify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCellBackgroundTransparent(value: Boolean): Self = StObject.set(x, "IsCellBackgroundTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTextWrapped(value: Boolean): Self = StObject.set(x, "IsTextWrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBorder2(value: BorderLine2): Self = StObject.set(x, "LeftBorder2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: CellOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIndent(value: Double): Self = StObject.set(x, "ParaIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBorder2(value: BorderLine2): Self = StObject.set(x, "RightBorder2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateAngle(value: Double): Self = StObject.set(x, "RotateAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateReference(value: Double): Self = StObject.set(x, "RotateReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowFormat(value: ShadowFormat): Self = StObject.set(x, "ShadowFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = StObject.set(x, "ShrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBorder(value: TableBorder): Self = StObject.set(x, "TableBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBorder2(value: TableBorder2): Self = StObject.set(x, "TableBorder2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBorder2(value: BorderLine2): Self = StObject.set(x, "TopBorder2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertJustify(value: Double): Self = StObject.set(x, "VertJustify", value.asInstanceOf[js.Any])
  }
}
