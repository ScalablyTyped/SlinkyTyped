package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a sheet link.
  *
  * A sheet link contains the source data of linked sheets, i.e. the URL and sheet name of the external document.
  *
  * To create a linked sheet, the sheet which will be used as linked sheet has to exist already. The method {@link XSheetLinkable.link()} creates a {@link
  * SheetLink} object in the document's {@link SheetLinks} collection and links the sheet to the specified external sheet.
  */
@js.native
trait SheetLink
  extends XNamed
     with XRefreshable
     with XPropertySet {
  
  /** specifies the name of the filter needed to load the source document. */
  var Filter: String = js.native
  
  /** specifies the filter options needed to load the source document. */
  var FilterOptions: String = js.native
  
  /** specifies the URL of the source document. */
  var Url: String = js.native
}
object SheetLink {
  
  @scala.inline
  def apply(
    Filter: String,
    FilterOptions: String,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    Url: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRefreshListener: XRefreshListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): SheetLink = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], FilterOptions = FilterOptions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SheetLink]
  }
  
  @scala.inline
  implicit class SheetLinkMutableBuilder[Self <: SheetLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOptions(value: String): Self = StObject.set(x, "FilterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
