package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.util.CellProtection
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the properties of a table cell.
  * @see com.sun.star.table.Cell
  * @see com.sun.star.table.CellRange
  */
@js.native
trait CellProperties extends XPropertySet {
  /**
    * selects Asian character orientation in vertical orientation.
    *
    * If the {@link CellProperties.Orientation} property is CellOrientation::STACKED, in Asian mode only Asian characters are printed in horizontal
    * orientation instead of all characters. For other values of {@link CellProperties.Orientation} , this value is not used.
    */
  var AsianVerticalMode: Boolean = js.native
  /** contains a description of the bottom border line of each cell. */
  var BottomBorder: BorderLine = js.native
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
  /** contains a description of the left border line of each cell. */
  var LeftBorder: BorderLine = js.native
  /**
    * contains a description of the left border line of each cell. Preferred over {@link BorderLine}{@link LeftBorder} .
    * @since LibreOffice 3.6
    */
  var LeftBorder2: BorderLine2 = js.native
  /**
    * contains the index of the number format that is used in the cells.
    *
    * The proper value can be determined by using the {@link com.sun.star.util.NumberFormatter} interface of the document.
    */
  var NumberFormat: Double = js.native
  /**
    * contains the orientation of the cell contents.
    *
    * If the {@link CellProperties.RotateAngle} property is non-zero, this value is not used.
    */
  var Orientation: CellOrientation = js.native
  /** defines the indentation of the cell contents (in 1/100 mm). */
  var ParaIndent: Double = js.native
  /** contains a description of the right border line of each cell. */
  var RightBorder: BorderLine = js.native
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
  /** contains a description of the top border line of each cell. */
  var TopBorder: BorderLine = js.native
  /**
    * contains a description of the top border line of each cell. Preferred over {@link BorderLine}{@link TopBorder} .
    * @since LibreOffice 3.6
    */
  var TopBorder2: BorderLine2 = js.native
  /**
    * stores additional attributes.
    *
    * This property is used i.e. by the XML filters to load and restore unknown attributes.
    */
  var UserDefinedAttributes: XNameContainer = js.native
  /**
    * contains the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: Double = js.native
}

object CellProperties {
  @scala.inline
  def apply(
    AsianVerticalMode: Boolean,
    BottomBorder: BorderLine,
    BottomBorder2: BorderLine2,
    CellBackColor: Color,
    CellInteropGrabBag: SafeArray[PropertyValue],
    CellProtection: CellProtection,
    CellStyle: String,
    DiagonalBLTR: BorderLine,
    DiagonalBLTR2: BorderLine2,
    DiagonalTLBR: BorderLine,
    DiagonalTLBR2: BorderLine2,
    HoriJustify: CellHoriJustify,
    IsCellBackgroundTransparent: Boolean,
    IsTextWrapped: Boolean,
    LeftBorder: BorderLine,
    LeftBorder2: BorderLine2,
    NumberFormat: Double,
    Orientation: CellOrientation,
    ParaIndent: Double,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorder2: BorderLine2,
    RotateAngle: Double,
    RotateReference: Double,
    ShadowFormat: ShadowFormat,
    ShrinkToFit: Boolean,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    UserDefinedAttributes: XNameContainer,
    VertJustify: Double,
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
  ): CellProperties = {
    val __obj = js.Dynamic.literal(AsianVerticalMode = AsianVerticalMode.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorder2 = BottomBorder2.asInstanceOf[js.Any], CellBackColor = CellBackColor.asInstanceOf[js.Any], CellInteropGrabBag = CellInteropGrabBag.asInstanceOf[js.Any], CellProtection = CellProtection.asInstanceOf[js.Any], CellStyle = CellStyle.asInstanceOf[js.Any], DiagonalBLTR = DiagonalBLTR.asInstanceOf[js.Any], DiagonalBLTR2 = DiagonalBLTR2.asInstanceOf[js.Any], DiagonalTLBR = DiagonalTLBR.asInstanceOf[js.Any], DiagonalTLBR2 = DiagonalTLBR2.asInstanceOf[js.Any], HoriJustify = HoriJustify.asInstanceOf[js.Any], IsCellBackgroundTransparent = IsCellBackgroundTransparent.asInstanceOf[js.Any], IsTextWrapped = IsTextWrapped.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorder2 = LeftBorder2.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ParaIndent = ParaIndent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorder2 = RightBorder2.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotateReference = RotateReference.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShrinkToFit = ShrinkToFit.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableBorder2 = TableBorder2.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorder2 = TopBorder2.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VertJustify = VertJustify.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[CellProperties]
  }
  @scala.inline
  implicit class CellPropertiesOps[Self <: CellProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsianVerticalMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsianVerticalMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomBorder2(value: BorderLine2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomBorder2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellBackColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellBackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellInteropGrabBag(value: SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellInteropGrabBag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellProtection(value: CellProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagonalBLTR(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiagonalBLTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagonalBLTR2(value: BorderLine2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiagonalBLTR2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagonalTLBR(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiagonalTLBR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagonalTLBR2(value: BorderLine2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiagonalTLBR2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoriJustify(value: CellHoriJustify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoriJustify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCellBackgroundTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCellBackgroundTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTextWrapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTextWrapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftBorder2(value: BorderLine2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftBorder2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: CellOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParaIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParaIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightBorder2(value: BorderLine2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightBorder2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotateAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateReference(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotateReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowFormat(value: ShadowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShrinkToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShrinkToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableBorder(value: TableBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableBorder2(value: TableBorder2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBorder2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopBorder2(value: BorderLine2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopBorder2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDefinedAttributes(value: XNameContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefinedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertJustify(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VertJustify")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

