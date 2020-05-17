package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * service that holds all cell properties of a text table cell in a text document.
  * @see com.sun.star.text.Cell
  */
@js.native
trait CellProperties
  extends XPropertySet
     with UserDefinedAttributesSupplier {
  /** contains the background color. */
  var BackColor: Color = js.native
  /** contains the name of the graphic filter of the background graphic. */
  var BackGraphicFilter: String = js.native
  /** determines the position of the background graphic. */
  var BackGraphicLocation: GraphicLocation = js.native
  /** contains the URL to the background graphic. */
  var BackGraphicURL: String = js.native
  /** determines whether the background is transparent. */
  var BackTransparent: Boolean = js.native
  /** contains the bottom border line. */
  var BottomBorder: BorderLine = js.native
  /** contains the distance of the bottom border. */
  var BottomBorderDistance: Double = js.native
  /** contains the cell name, see SwXTextTable::getCellByName for more information */
  var CellName: String = js.native
  /** determines whether the cell is write protected or not. */
  var IsProtected: Boolean = js.native
  /** contains the left border line. */
  var LeftBorder: BorderLine = js.native
  /** contains the distance of the left border. */
  var LeftBorderDistance: Double = js.native
  /** contains the number format. */
  var NumberFormat: Double = js.native
  /** contains the right border line. */
  var RightBorder: BorderLine = js.native
  /** contains the distance of the right border. */
  var RightBorderDistance: Double = js.native
  /** contains the text section the text table is contained in if there is any. */
  var TextSection: XTextSection = js.native
  /** contains the top border line. */
  var TopBorder: BorderLine = js.native
  /** contains the distance of the top border. */
  var TopBorderDistance: Double = js.native
  /**
    * the vertical orientation of the text inside of the table cells in this row.
    * @see VertOrientation
    */
  var VertOrient: Double = js.native
}

object CellProperties {
  @scala.inline
  def apply(
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    CellName: String,
    IsProtected: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    NumberFormat: Double,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    TextSection: XTextSection,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UserDefinedAttributes: XNameContainer,
    VertOrient: Double,
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
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], CellName = CellName.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], TextSection = TextSection.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VertOrient = VertOrient.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[CellProperties]
  }
  @scala.inline
  implicit class CellPropertiesOps[Self <: CellProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackGraphicFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackGraphicFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackGraphicLocation(value: GraphicLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackGraphicLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackGraphicURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackGraphicURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsProtected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightBorderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextSection(value: XTextSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopBorder(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopBorderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopBorderDistance")(value.asInstanceOf[js.Any])
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

