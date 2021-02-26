package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the properties of a text table row.
  * @see com.sun.star.TextTable
  */
@js.native
trait TextTableRow extends XPropertySet {
  
  /** specifies the color of the background. */
  var BackColor: Color = js.native
  
  /** contains the name of the file filter of a background graphic. */
  var BackGraphicFilter: String = js.native
  
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: GraphicLocation = js.native
  
  /** contains the URL of a background graphic. */
  var BackGraphicURL: String = js.native
  
  /** If `TRUE` , the background color value in "BackColor" is not visible. */
  var BackTransparent: Boolean = js.native
  
  /** contains the height of the table row. */
  var Height: Double = js.native
  
  /** If the value of this property is `TRUE` , the height of the table row depends on the content of the table cells. */
  var IsAutoHeight: Boolean = js.native
  
  /**
    * If `TRUE` , the row is allowed to be split at page or column breaks.
    * @@since OOo 2.0
    */
  var IsSplitAllowed: Boolean = js.native
  
  /**
    * Grab bag of row properties, used as a string-any map for interop purposes.
    * @since LibreOffice 4.4  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var RowInteropGrabBag: SafeArray[PropertyValue] = js.native
  
  /** contains the description of the columns in the table row. */
  var TableColumnSeparators: SafeArray[TableColumnSeparator] = js.native
}
object TextTableRow {
  
  @scala.inline
  def apply(
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    Height: Double,
    IsAutoHeight: Boolean,
    IsSplitAllowed: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RowInteropGrabBag: SafeArray[PropertyValue],
    TableColumnSeparators: SafeArray[TableColumnSeparator],
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
  ): TextTableRow = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsAutoHeight = IsAutoHeight.asInstanceOf[js.Any], IsSplitAllowed = IsSplitAllowed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RowInteropGrabBag = RowInteropGrabBag.asInstanceOf[js.Any], TableColumnSeparators = TableColumnSeparators.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TextTableRow]
  }
  
  @scala.inline
  implicit class TextTableRowMutableBuilder[Self <: TextTableRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackColor(value: Color): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicFilter(value: String): Self = StObject.set(x, "BackGraphicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "BackGraphicLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicURL(value: String): Self = StObject.set(x, "BackGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackTransparent(value: Boolean): Self = StObject.set(x, "BackTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoHeight(value: Boolean): Self = StObject.set(x, "IsAutoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSplitAllowed(value: Boolean): Self = StObject.set(x, "IsSplitAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "RowInteropGrabBag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableColumnSeparators(value: SafeArray[TableColumnSeparator]): Self = StObject.set(x, "TableColumnSeparators", value.asInstanceOf[js.Any])
  }
}
