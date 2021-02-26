package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableOrientation
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableSortDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.util.SortField
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a description of how a cell range is to be sorted.
  *
  * This service extends the {@link com.sun.star.table.TableSortDescriptor} service with spreadsheet specific properties.
  */
@js.native
trait SheetSortDescriptor extends TableSortDescriptor {
  
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: Boolean = js.native
  
  /** specifies if the sorted data should be copied to another position in the document. */
  var CopyOutputData: Boolean = js.native
  
  /** specifies if a user defined sorting list is used. */
  var IsUserListEnabled: Boolean = js.native
  
  /**
    * specifies the position where sorted data are to be copied.
    *
    * This property is only used, if {@link SheetSortDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: CellAddress = js.native
  
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used, if {@link SheetSortDescriptor.IsUserListEnabled} is `TRUE` .
    */
  var UserListIndex: Double = js.native
}
object SheetSortDescriptor {
  
  @scala.inline
  def apply(
    BindFormatsToContent: Boolean,
    CollatorAlgorithm: String,
    CollatorLocale: Locale,
    ContainsHeader: Boolean,
    CopyOutputData: Boolean,
    IsCaseSensitive: Boolean,
    IsUserListEnabled: Boolean,
    MaxFieldCount: Double,
    Orientation: TableOrientation,
    OutputPosition: CellAddress,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    SortColumns: Boolean,
    SortFields: SafeArray[SortField],
    UserListIndex: Double,
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
  ): SheetSortDescriptor = {
    val __obj = js.Dynamic.literal(BindFormatsToContent = BindFormatsToContent.asInstanceOf[js.Any], CollatorAlgorithm = CollatorAlgorithm.asInstanceOf[js.Any], CollatorLocale = CollatorLocale.asInstanceOf[js.Any], ContainsHeader = ContainsHeader.asInstanceOf[js.Any], CopyOutputData = CopyOutputData.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], IsUserListEnabled = IsUserListEnabled.asInstanceOf[js.Any], MaxFieldCount = MaxFieldCount.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OutputPosition = OutputPosition.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], SortColumns = SortColumns.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], UserListIndex = UserListIndex.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SheetSortDescriptor]
  }
  
  @scala.inline
  implicit class SheetSortDescriptorMutableBuilder[Self <: SheetSortDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindFormatsToContent(value: Boolean): Self = StObject.set(x, "BindFormatsToContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyOutputData(value: Boolean): Self = StObject.set(x, "CopyOutputData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserListEnabled(value: Boolean): Self = StObject.set(x, "IsUserListEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputPosition(value: CellAddress): Self = StObject.set(x, "OutputPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserListIndex(value: Double): Self = StObject.set(x, "UserListIndex", value.asInstanceOf[js.Any])
  }
}
